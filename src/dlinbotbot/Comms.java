package dlinbotbot;

import battlecode.common.*;

public class Comms {

    // To scan multiple things, bitwise-OR two CommConstants.SCAN together
    // ex. scan(rc, SCAN_LEAD | SCAN_ENEMY)
    static Information scan(RobotController rc, int type) throws GameActionException {
        Information answer = new Information();
        if ((type & CommConstants.SCAN_LEAD) != 0) {
            int totalLead = 0; //get total lead
            MapLocation[] temp = rc.senseNearbyLocationsWithLead();
            int i = 0, size = temp.length;
            while (i < size) {
                totalLead += rc.senseLead(temp[i]);
                i++;
            }
            answer.lead = totalLead;
        }

        if ((type & CommConstants.SCAN_ENEMY) != 0) {
            Team opponent = rc.getTeam().opponent();
            answer.enemy = rc.senseNearbyRobots(-1, opponent);
        }

        if ((type & CommConstants.SCAN_FRIENDLY) != 0) {
            Team self = rc.getTeam();
            answer.friendly = rc.senseNearbyRobots(-1, self);
        }

        return answer;
    }

    static int encode(Information info) {
        // bit 1 - lead level
        // bits 2 to 4 - danger levels
        int wt = 0, sg = 0, sl = 0, mn = 0;
        int enc = CommConstants.VERY_LOW;
        boolean found = false;
        if (info == null)
            return CommConstants.UNKNOWN;

        if (info.enemy == null)
            return CommConstants.UNKNOWN | (info.lead != 0 ? CommConstants.HAS_LEAD : CommConstants.NO_LEAD);

        for (RobotInfo e : info.enemy) {
            switch (e.getType()) {
                case ARCHON:
                    enc = CommConstants.ARCHON;
                    found = true;
                    break;
                case LABORATORY:
                    enc = CommConstants.LABORATORY;
                    found = true;
                    break;
                case WATCHTOWER:
                    wt++;
                    break;
                case SAGE:
                    sg++;
                    break;
                case SOLDIER:
                    sl++;
                    break;
                case MINER:
                    mn++;
                    break;
            }

            if (found)
                break;
        }

        if (!found) {
            int dangerLevel = 4 * wt + 3 * sg + 2 * sl + mn;
            if (dangerLevel > 10)
                enc = CommConstants.CRITICAL;
            else if (dangerLevel > 5)
                enc = CommConstants.HIGH;
            else if (dangerLevel > 2)
                enc = CommConstants.MEDIUM;
            else if (dangerLevel > 0)
                enc = CommConstants.LOW;
        }

        return enc | (info.lead != 0 ? CommConstants.HAS_LEAD : CommConstants.NO_LEAD);
    }

    public static final int ZONE_WIDTH = 5;
    public static final int ZONE_HEIGHT = 5;

    static void write(int zoneX, int zoneY, int message, RobotController rc) throws GameActionException {
        int encLocation = zoneX * 12 + zoneY; // 12 is max number of zones per strip (MAP_WIDTH / ZONE_HEIGHT)

        // We're encoding 4 pieces of information per zone
        int arrayIndex = encLocation / 4;
        int bitIndex = 4 * (encLocation % 4);

        int curVal = (rc.readSharedArray(arrayIndex) | (0b1111 << bitIndex)) ^ ((0b1111 ^ message) << bitIndex);

        rc.writeSharedArray(arrayIndex, curVal);
    }

    static void write(int message, RobotController rc) throws GameActionException {
        MapLocation me = rc.getLocation();
        int zx = me.x / ZONE_WIDTH, zy = me.y / ZONE_HEIGHT; // 5 is zone size
        write(zx, zy, message, rc);
    }

    static void encodeAndWrite(Information info, RobotController rc) throws GameActionException {
        write(encode(info), rc);
    }

    static CommInformation read(int zoneX, int zoneY, RobotController rc) throws GameActionException {
        int encLocation = zoneX * 12 + zoneY; // 12 is max number of zones per strip (MAP_WIDTH / ZONE_HEIGHT)

        // We're encoding 4 pieces of information per zone
        int arrayIndex = encLocation / 4;
        int bitIndex = 4 * (encLocation % 4);

        int val = (rc.readSharedArray(arrayIndex) >> bitIndex) & 0b1111;

        boolean hasLead = val >> 3 > 0;
        int dangerLevel = val & 0b111;

        return new CommInformation(zoneX, zoneY, dangerLevel, hasLead);
    }

    static CommInformation[][] readAllZones(RobotController rc) throws GameActionException {
        int width = rc.getMapWidth() / ZONE_WIDTH, height = rc.getMapHeight() / ZONE_HEIGHT;
        CommInformation[][] info = new CommInformation[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                info[y][x] = read(x, y, rc);
            }
        }

        return info;
    }

    private static final int SYMMETRY_INDEX = 63;
    static boolean isSymmetryPossible(RobotController rc, int type) throws GameActionException {
        return (rc.readSharedArray(SYMMETRY_INDEX) & (0b1 << type)) == 0;
    }

    // Try to use as few writes as possible per turn; this is ok
    // for now since nothing else uses index 63, but I'll create a
    // better function once we start storing more things
    static void toggleSymmetryPossible(RobotController rc, int type) throws GameActionException {
        int val = rc.readSharedArray(SYMMETRY_INDEX);
        rc.writeSharedArray(SYMMETRY_INDEX, val ^ (0b1 << type));
    }
}

class Information {
    public Information() {
        lead = 0;
        enemy = null;
        friendly = null;
    }

    int lead;
    RobotInfo[] enemy;
    RobotInfo[] friendly;
}

class CommInformation {
    private int zoneX, zoneY;
    private int dangerLevel;
    private boolean lead;

    public int getZoneX() {
        return zoneX;
    }

    public void setZoneX(int zoneX) {
        this.zoneX = zoneX;
    }

    public int getZoneY() {
        return zoneY;
    }

    public void setZoneY(int zoneY) {
        this.zoneY = zoneY;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public boolean hasLead() {
        return lead;
    }

    public void setHasLead(boolean hasLead) {
        this.lead = hasLead;
    }

    public CommInformation(int zoneX, int zoneY, int dangerLevel, boolean hasLead) {
        this.zoneX = zoneX;
        this.zoneY = zoneY;
        this.dangerLevel = dangerLevel;
        this.lead = hasLead;
    }
}

