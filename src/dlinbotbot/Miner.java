package dlinbotbot;

import battlecode.common.*;
import dlinbotbot.bfs.*;

import java.util.Arrays;

public class Miner extends Robot {
    boolean init = true;
    CommInformation[][] info;
    int[][] rubbleMap;

    MapLocation lastZoneInfoLocation;

    int roundInfoLastUpdated;

    MapLocation targetLoc;

    MinerRoles role = MinerRoles.Miner;

    AnomalyScheduleEntry[] anomalySchedule;
    int nextAnomalyIndex = 0;

    boolean[] symmetry = {true, true, true};

    int[] dX = {-2, -2, -2, -2, -2, -1, -1, -1,  0, 0, 0,  1, 1, 1,  2,  2, 2, 2, 2};
    int[] dY = {-2, -1,  0,  1,  2, -1,  0,  1, -1, 0, 1, -1, 0, 1, -2, -1, 0, 1, 2};

    public Miner(RobotController rc) throws GameActionException {
        this.rc = rc;
        lastZoneInfoLocation = rc.getLocation();
        Comms.encodeAndWrite(Comms.scan(rc, CommConstants.SCAN_ENEMY | CommConstants.SCAN_LEAD), rc);

        info = Comms.readAllZones(rc);
        roundInfoLastUpdated = rc.getRoundNum();

        // TODO: BFS from closest to me

        CommInformation targ = null;

        int numUnknown = 0;
        for (int y = 0; y < info.length; y++) {
            for (int x = 0; x < info[0].length; x++) {
                if (info[y][x].getDangerLevel() == CommConstants.UNKNOWN) {
                    numUnknown++;
                    targ = info[y][x];
                }
            }
        }

        if (numUnknown > 10) {
            role = MinerRoles.Explorer;
        } else {
            role = MinerRoles.Miner;
            boolean found = false;
            for (int y = 0; y < info.length; y++) {
                for (int x = 0; x < info[0].length; x++) {
                    if (info[y][x].hasLead()) {
                        targ = info[y][x];
                        found = true;
                        break;
                    }
                }
                if (found)
                    break;
            }
        }

        if (targ != null) {
            targetLoc = new MapLocation(targ.getZoneX() * Comms.ZONE_WIDTH + Comms.ZONE_HEIGHT / 2,
                    targ.getZoneY() * Comms.ZONE_HEIGHT + Comms.ZONE_HEIGHT / 2);
        }

        if (role == MinerRoles.Explorer && rc.getRoundNum() < 5)
            targetLoc = new MapLocation(rc.getMapWidth() / 2, rc.getMapHeight() / 2);

        anomalySchedule = rc.getAnomalySchedule();
        nextAnomalyIndex = 0;

        rubbleMap = new int[rc.getMapHeight()][rc.getMapWidth()];
    }

    static Direction dir = Direction.CENTER;
    public void run() throws GameActionException {
//        rc.setIndicatorString(Arrays.toString(symmetry));
        if (nextAnomalyIndex < anomalySchedule.length) {
            AnomalyScheduleEntry an = anomalySchedule[nextAnomalyIndex];
            if (an.roundNumber <= rc.getRoundNum()) {
                if (an.anomalyType == AnomalyType.VORTEX) {
                    syncSymmetry();
                    if (symmetry[CommConstants.HORIZONTAL] && !symmetry[CommConstants.VERTICAL] && !symmetry[CommConstants.ROTATIONAL]) {
                        flipMapVertically();
                    } else if (!symmetry[CommConstants.HORIZONTAL] && symmetry[CommConstants.VERTICAL] && !symmetry[CommConstants.ROTATIONAL]) {
                        flipMapHorizontally();
                    } else {
//                        boolean horPos = true, verPos = true, rotPos = true;
//                        if (rc.getMapWidth() != rc.getMapHeight())
//                            rotPos = false;
//
//                        MapLocation me = rc.getLocation();
//                        for (int i = 0; i < 9; i++) {
//
//                            int x = me.x + dX[i], y = me.y + dY[i];
//                            MapLocation newLocation = me.translate(dX[i], dY[i]);
//                            if (!rc.onTheMap(newLocation))
//                                continue;
//                            rubbleMap[y][x] = rc.senseRubble(newLocation);
//                            if (rubbleMap[y][x] == 0)
//                                rubbleMap[y][x] = -1;
//
//                            if (horPos && rubbleMap[y][x] == rubbleMap[y][rc.getMapWidth() - x - 1]) {
//                                horPos = false;
//                                if (!rotPos && !verPos)
//                                    break;
//                            }
//
//                            if (verPos && rubbleMap[y][x] == rubbleMap[rc.getMapHeight() - y - 1][x]) {
//                                verPos = false;
//                                if (!rotPos && !horPos)
//                                    break;
//                            }
//
//                            if (rotPos && rubbleMap[y][x] == rubbleMap[rc.getMapHeight() - 1 - x][y]) {
//                                rotPos = false;
//                                if (!horPos && !verPos)
//                                    break;
//                            }
//                        }
//
//                        if ((horPos ? 1 : 0) + (verPos ? 1 : 0) + (rotPos ? 1 : 0) == 1) {
//                            if (horPos) {
//                                flipMapHorizontally();
//                                if (Comms.isSymmetryPossible(rc, CommConstants.VERTICAL))
//                                    Comms.toggleSymmetryPossible(rc, CommConstants.VERTICAL);
//                                System.out.println("The map flipped horizontally");
//                            } else if (verPos) {
//                                flipMapVertically();
//                                if (Comms.isSymmetryPossible(rc, CommConstants.HORIZONTAL))
//                                    Comms.toggleSymmetryPossible(rc, CommConstants.HORIZONTAL);
//                                System.out.println("The map flipped vertically");
//                            } else {
//                                rotateMap();
//                                if (Comms.isSymmetryPossible(rc, CommConstants.VERTICAL))
//                                    Comms.toggleSymmetryPossible(rc, CommConstants.VERTICAL);
//                                if (Comms.isSymmetryPossible(rc, CommConstants.HORIZONTAL))
//                                    Comms.toggleSymmetryPossible(rc, CommConstants.HORIZONTAL);
//                                System.out.println("The map rotated");
//                            }
//                        } else {
                            // Can't figure out anomaly rotation; wipe rubbleMap
                            for (int y = 0, maxY = rc.getMapHeight(); y < maxY; y++) {
                                for (int x = 0, maxX = rc.getMapWidth(); x < maxX; x++) {
                                    rubbleMap[y][x] = 0;
                                }
                            }
//                        }
                    }
                }

                nextAnomalyIndex++;
            }
        }

        MapLocation me = rc.getLocation();

        syncSymmetry();
        for (int i = 0; i < dX.length; i++) {
            checkSymmetry(me.translate(dX[i], dY[i]));
        }


        info = Comms.readAllZones(rc);
        roundInfoLastUpdated = rc.getRoundNum();

        lastZoneInfoLocation = rc.getLocation();
        Comms.encodeAndWrite(Comms.scan(rc, CommConstants.SCAN_ENEMY | CommConstants.SCAN_LEAD), rc);

        boolean reachedTarget = targetLoc != null && targetLoc.isAdjacentTo(rc.getLocation());

        if (targetLoc != null && !reachedTarget) {
            Direction cur = rc.getLocation().directionTo(targetLoc);
            Direction cdir;

            switch (cur) {
                case NORTH:
                    cdir = BFSNorth.gbda(rc, targetLoc, dir.opposite());
                    break;
                case EAST:
                    cdir = BFSEast.gbda(rc, targetLoc, dir.opposite());
                    break;
                case WEST:
                    cdir = BFSWest.gbda(rc, targetLoc, dir.opposite());
                    break;
                case SOUTH:
                    cdir = BFSSouth.gbda(rc, targetLoc, dir.opposite());
                    break;
                case NORTHEAST:
                    cdir = BFSNorthEast.gbda(rc, targetLoc, dir.opposite());
                    break;
                case NORTHWEST:
                    cdir = BFSNorthWest.gbda(rc, targetLoc, dir.opposite());
                    break;
                case SOUTHEAST:
                    cdir = BFSSouthEast.gbda(rc, targetLoc, dir.opposite());
                    break;
                default:
                    cdir = BFSSouthWest.gbda(rc, targetLoc, dir.opposite());
                    break;
            }
            if (cdir != null && rc.canMove(cdir)) {
                rc.move(cdir);
                dir = cdir;
            }
        }

        MapLocation[] locations = rc.senseNearbyLocationsWithLead(rc.getType().actionRadiusSquared);

        if (role == MinerRoles.Explorer && targetLoc != null &&
                info[targetLoc.y / Comms.ZONE_HEIGHT][targetLoc.x / Comms.ZONE_WIDTH].getDangerLevel() != CommConstants.UNKNOWN)
            targetLoc = null;

        if (locations.length != 0) {
            for (MapLocation location : locations) {
                while (rc.canMineLead(location)) {
                    rc.mineLead(location);
                    Direction dirTo = rc.getLocation().directionTo(location);
                    if (rc.canMove(dirTo))
                        rc.move(dirTo);
                }
            }
        } else if (targetLoc == null || reachedTarget) {
            if (role == MinerRoles.Miner) {

                CommInformation lead = null;

                for (int y = 0; y < info.length; y++) {
                    for (int x = 0; x < info[0].length; x++) {
                        if (info[y][x].hasLead()) {
                            lead = info[y][x];
                            break;
                        }
                    }
                }

                if (lead != null)
                    targetLoc = new MapLocation(lead.getZoneX() * Comms.ZONE_WIDTH + Comms.ZONE_WIDTH / 2,
                            lead.getZoneY() * Comms.ZONE_HEIGHT + Comms.ZONE_HEIGHT / 2);
                else
                    this.role = MinerRoles.Explorer;
            } else {

                CommInformation unknown = findZoneUnknown();

                if (unknown != null)
                    targetLoc = new MapLocation(unknown.getZoneX() * Comms.ZONE_WIDTH + Comms.ZONE_WIDTH / 2,
                            unknown.getZoneY() * Comms.ZONE_HEIGHT + Comms.ZONE_HEIGHT / 2);
                else
                    this.role = MinerRoles.Miner;
            }
        }
    }

    private CommInformation findZoneUnknown() {
        for (int y = 0; y < info.length; y++) {
            for (int x = 0; x < info[0].length; x++) {
                if (info[y][x].getDangerLevel() == CommConstants.UNKNOWN) {
                    return info[y][x];
                }
            }
        }
        return null;
    }

    private void syncSymmetry() throws GameActionException {
        for (int i = 0; i < 3; i++) {
            symmetry[i] = Comms.isSymmetryPossible(rc, i);
        }
    }

    private void checkSymmetry(MapLocation me) throws GameActionException {
        if (!rc.onTheMap(me))
            return;

        int rubble = rc.senseRubble(me);
        if (rubble == 0) // 0 means we don't know, -1 means 0
            rubble = -1;

        if (rubbleMap[me.y][me.x] == 0) {
            rubbleMap[me.y][me.x] = rubble;
        } else if (rubbleMap[me.y][me.x] != rubble) {
            // Anomaly hath done stuff to cringe it up
//            System.out.println("something has happened to the map: " + rubbleMap[me.y][me.x]);
        }

        if (symmetry[CommConstants.HORIZONTAL]) {
            if (rubbleMap[rubbleMap[0].length - me.y - 1][me.x] != 0 &&
                    rubble != rubbleMap[rubbleMap[0].length - me.y - 1][me.x]) {
                Comms.toggleSymmetryPossible(rc, CommConstants.HORIZONTAL);
            }
        }

        if (symmetry[CommConstants.VERTICAL]) {
            if (rubbleMap[rubbleMap[0].length - me.y - 1][me.x] != 0 &&
                    rubble != rubbleMap[rubbleMap[0].length - me.y - 1][me.x]) {
                Comms.toggleSymmetryPossible(rc, CommConstants.VERTICAL);
            }
        }

        if (symmetry[CommConstants.ROTATIONAL]) {
            if (rubbleMap[rubbleMap[0].length - me.y - 1][rubbleMap.length - me.x - 1] != 0 &&
                    rubble != rubbleMap[rubbleMap[0].length - me.y - 1][rubbleMap.length - me.x - 1]) {
                Comms.toggleSymmetryPossible(rc, CommConstants.ROTATIONAL);
            }
        }
    }

    private void flipMapVertically() {
        for (int y = 0, maxY = rc.getMapHeight() / 2; y < maxY; y++) {
            int[] arr = rubbleMap[y];
            rubbleMap[y] = rubbleMap[rc.getMapHeight() - 1 - y];
            rubbleMap[rc.getMapHeight() - 1 - y] = arr;
        }
    }

    private void flipMapHorizontally() {
        for (int y = 0, maxY = rc.getMapHeight(); y < maxY; y++) {
            for (int x = 0, maxX = rc.getMapWidth() / 2; x < maxX; x++) {
                int corresponding = rc.getMapWidth() - 1 - x;
                int i = rubbleMap[y][x];
                rubbleMap[y][x] = rubbleMap[y][corresponding];
                rubbleMap[y][corresponding] = i;
            }
        }
    }

    private void rotateMap() {
        int size = rc.getMapHeight();
        for (int y = 0, maxY = size / 2; y < maxY; y++) {
            for (int x = y, maxX = size - y - 1; x < maxX; x++) {
                int temp = rubbleMap[y][x];
                rubbleMap[y][x] = rubbleMap[size - 1 - x][y];
                rubbleMap[size - 1 - x][y] = rubbleMap[size - 1 - y][size - 1 - x];
                rubbleMap[size - 1 - y][size - 1 - x] = rubbleMap[x][size - 1 - y];
                rubbleMap[x][size - 1 - y] = temp;
            }
        }
    }
}

enum MinerRoles {
    Explorer,
    Miner
}

class MinerInfo {
    int rubble;

    public int getRubble() {
        return rubble;
    }

    public void setRubble(int rubble) {
        this.rubble = rubble;
    }

    MinerInfo(int rubble) {
        this.rubble = rubble;
    }
}