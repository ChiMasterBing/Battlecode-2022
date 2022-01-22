package JesseC;

import battlecode.common.*;

public class Archon {

    public static int x1, x2, x3, y1, y2, y3;

    public static void run(RobotController rc) throws GameActionException {
        Direction dir = rc.getLocation().directionTo(findAllPossibleEnemyArchons(rc)[RobotPlayer.turnCount % 3]);
        int x = rc.getLocation().x, y = rc.getLocation().y;
        x1 = rc.getMapWidth() - x; y1 = y;
        x2 = x; y2 = rc.getMapHeight() - y;
        x3 = rc.getMapWidth() - x; y3 = rc.getMapHeight() - y;
            if (rc.canBuildRobot(RobotType.SOLDIER, dir)) {
                rc.setIndicatorString("Trying to build a soldier");
                rc.buildRobot(RobotType.SOLDIER, dir);
            } else {
                rc.setIndicatorString("Trying to build a soldier");
                rc.buildRobot(RobotType.MINER, dir);
            }
    }

    public static MapLocation[] findAllPossibleEnemyArchons(RobotController rc) throws GameActionException {
        MapLocation[] possible = new MapLocation[3];
        int x = rc.getLocation().x, y = rc.getLocation().y;
        possible[0] = new MapLocation(rc.getMapWidth() - x, y);
        x1 = rc.getMapWidth() - x; y1 = y;
        possible[1] = new MapLocation(x, rc.getMapHeight() - y);
        x2 = x; y2 = rc.getMapHeight() - y;
        possible[2] = new MapLocation(rc.getMapWidth() - x, rc.getMapHeight() - y);
        x3 = rc.getMapWidth() - x; y3 = rc.getMapHeight() - y;
        return possible;
    }
}