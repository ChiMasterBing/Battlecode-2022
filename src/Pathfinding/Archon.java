package Pathfinding;
import java.util.Random;
import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;
import battlecode.common.RobotInfo;
import battlecode.common.RobotType;
public class Archon extends Robot{
    int turnCount = 0;
    final Random rng = new Random(6147);
    final Direction[] directions = {
            Direction.NORTH,
            Direction.NORTHEAST,
            Direction.EAST,
            Direction.SOUTHEAST,
            Direction.SOUTH,
            Direction.SOUTHWEST,
            Direction.WEST,
            Direction.NORTHWEST,
    };
    boolean init = true;
    int createdMiners = 0;
    zone[][] masterArray;
    MapLocation[] enemyArchons;
    RobotController rc;
    int lastTurnHp = 1000;
    public Archon(RobotController rc) throws GameActionException {
        this.rc = rc;
    }
    public void run() throws GameActionException {
        if (init) {
            masterArray = new zone[rc.getMapHeight()/4][rc.getMapWidth()/4];
            for (int i=0; i<masterArray.length; i++) {
                for (int j=0; j<masterArray[0].length; j++) {
                    masterArray[i][j] = new zone(i*4, j*4); //will have to be edited later for correct scaling
                }
            }
            init = false;
        }
        if (createdMiners < 5) {
            for (int i=0; i<directions.length; i++) {
                Direction dir = directions[i];
                if (rc.canBuildRobot(RobotType.MINER, dir)) {
                    rc.buildRobot(RobotType.MINER, dir);
                    createdMiners++;
                    break;
                }
            }
        }
    }
}


