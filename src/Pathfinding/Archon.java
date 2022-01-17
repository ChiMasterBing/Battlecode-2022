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
            //Calculate Enemy archon position
            enemyArchons = new MapLocation[rc.getArchonCount()];
            MapLocation me = rc.getLocation();
            int enemyX, enemyY;
            enemyX = rc.getMapWidth()-me.x-1;
            enemyY = rc.getMapHeight()-me.y-1;
            enemyArchons[0] = new MapLocation(enemyX, enemyY);
            rc.writeSharedArray(2, enemyX);
            rc.writeSharedArray(3, enemyY);
            init = false;
        }
        if (turnCount % 250 == 0) {
            rc.writeSharedArray(1, turnCount);
        }
        rc.writeSharedArray(0, turnCount);
        if (createdMiners < 3) {
            for (int i=0; i<directions.length; i++) {
                Direction dir = directions[i];
                if (rc.canBuildRobot(RobotType.MINER, dir)) {
                    rc.buildRobot(RobotType.MINER, dir);
                    createdMiners++;
                    break;
                }
            }
        }
        
        boolean newMiner = false;
        while (createdMiners < 10) {
            newMiner = false;
            Direction dir;
            for (int i=0; i<directions.length; i++) {
                dir = directions[i];
                if (rc.canBuildRobot(RobotType.MINER, dir)) {
                    rc.buildRobot(RobotType.MINER, dir);
                    createdMiners++;
                    newMiner = true;
                }
                
            }
            if (!newMiner) {
                break;
            }
        }
        
        int hp = rc.getHealth();
        if (hp != lastTurnHp) {
            Direction dir;
            for (int i=0; i<directions.length; i++) {
                dir = directions[i];
                if (rc.canBuildRobot(RobotType.SOLDIER, dir)) {
                    rc.buildRobot(RobotType.SOLDIER, dir);
                    break;
                }
            }
            RobotInfo[] info = rc.senseNearbyRobots(20, rc.getTeam());
            for (int i=0; i<info.length; i++) {
                if (rc.canRepair(info[i].getLocation())) {
                    rc.repair(info[i].getLocation());
                }
            }
        }
        
        if (turnCount%25 == 0) {
            Direction dir;
            for (int i=0; i<directions.length; i++) {
                dir = directions[i];
                if (rc.canBuildRobot(RobotType.MINER, dir)) {
                    rc.buildRobot(RobotType.MINER, dir);
                    break;
                }
            }
        }
        if (turnCount%3 == 0) {
            Direction dir;
            for (int i=0; i<directions.length; i++) {
                dir = directions[i];
                if (rc.canBuildRobot(RobotType.SOLDIER, dir)) {
                    rc.buildRobot(RobotType.SOLDIER, dir);
                    break;
                }
                
            }
        }
        
        lastTurnHp = hp;
        turnCount++;
    }
}
