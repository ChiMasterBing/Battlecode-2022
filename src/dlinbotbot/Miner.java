package dlinbotbot;
import java.util.Random;

import battlecode.common.*;

public class Miner extends Robot {
    boolean init = true;
    zone[][] self; //each miner keeps 1x1 instead of 4x4
    MapLocation homeArchonLocation;
    MapLocation lastZoneInfoLocation;
    Direction followingDir;

    MapLocation targetLeadZone;
    public Miner(RobotController rc) throws GameActionException {
        this.rc = rc;
    }

    static Direction dir = Direction.CENTER;
    public void run() throws GameActionException {
        if (init) {
            lastZoneInfoLocation = rc.getLocation();
            Information i = Comms.scan(rc, 0);
            Comms.write(Comms.encode(i), rc);

            Direction archonDir = null;
            RobotInfo[] ris = rc.senseNearbyRobots(-1, rc.getTeam());
            for (RobotInfo ri : ris) {
                if (ri.getType() != RobotType.ARCHON)
                    continue;

                homeArchonLocation = ri.getLocation();
                archonDir = rc.getLocation().directionTo(homeArchonLocation);
                followingDir = archonDir;
                break;
            }

            Direction res = directions.get(((directions.indexOf(archonDir) + 4 + rng.nextInt(3) - 1) % 8));

            while (rc.canMove(res))
                rc.move(res);

            init = false;
        }

        MapLocation[] locations = rc.senseNearbyLocationsWithLead(RobotType.MINER.actionRadiusSquared);
        for (MapLocation l : locations) {
            while (rc.canMineLead(l))
                rc.mineLead(l);
        }

        Direction archonDir = rc.getLocation().directionTo(homeArchonLocation);
        while (rc.senseNearbyLocationsWithLead(RobotType.MINER.actionRadiusSquared).length == 0) {
            Direction res = directions.get(((directions.indexOf(followingDir) + 8 + rng.nextInt(5) - 3) % 8));
            if (rc.canMove(res)) {
                rc.move(res);

                if (lastZoneInfoLocation.distanceSquaredTo(rc.getLocation()) >= 20) {
                    Information i = Comms.scan(rc, 0);
                    Comms.write(Comms.encode(i), rc);
                }
            } else if (!rc.onTheMap(rc.getLocation().add(res))) {
                followingDir = followingDir.rotateLeft();
            }
        }
    }
}

enum MinerRoles {
    Explorer,
    Miner
}