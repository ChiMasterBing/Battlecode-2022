package Pathfinding;
import java.util.*;
import battlecode.common.*;

public class Soldier {
    /*
    movement:
    Spawned:
    - leave as quickly as possible
    - leave labs as quickly as possible

    if sense fellow sage almost out of reach, stop moving so that sage catches up
    if enemy sensed and not going on mission
     - enter adjacent zones and go to zones with 0
     -
    attack:

     */
    static int turnCount = 0;
    static final Random rng = new Random(6147);
    static final Direction[] directions = {
        Direction.NORTH,
        Direction.NORTHEAST,
        Direction.EAST,
        Direction.SOUTHEAST,
        Direction.SOUTH,
        Direction.SOUTHWEST,
        Direction.WEST,
        Direction.NORTHWEST,
    };
    static boolean init = true;
    zone[][] masterArray;
    static MapLocation[] targets;
    static Team opponent;
//    int currentTarget = 0;
    static int attackTurn = 0;
    static MapLocation me;
    static int side;
    static Direction dir = Direction.CENTER;
    static void run(RobotController rc) throws GameActionException {
//        if (init) {
//            opponent = rc.getTeam().opponent();
//            targets = new MapLocation[10];
//            targets[0] = new MapLocation(rc.readSharedArray(2), rc.readSharedArray(3));
//            attackTurn = rc.readSharedArray(1)+250;
//            side = ((rc.readSharedArray(0)-1)/3)%6;
//            init = false;
//        }
//        me = rc.getLocation();
        int radius = rc.getType().actionRadiusSquared;
        Team opponent = rc.getTeam().opponent();
        RobotInfo[] enemies = rc.senseNearbyRobots(radius, opponent);
        int ptr = 0;
        int at = 0;
        int h = Integer.MAX_VALUE;
        MapLocation cmin = null;
        while(ptr < enemies.length){

            if(enemies[ptr].getType()==RobotType.SAGE||enemies[ptr].getType()==RobotType.SOLDIER||enemies[ptr].getType()==RobotType.WATCHTOWER){
                if(at==0||h<enemies[ptr].health){
                    h = enemies[ptr].health;
                    at = 1;
                    cmin = enemies[ptr].location;
                }
            }else{
                if(h<enemies[ptr].health){
                    h = enemies[ptr].health;
                    cmin = enemies[ptr].location;
                }
            }
            ptr++;
        }
        if(cmin!=null&&rc.canAttack(cmin)){
            rc.attack(cmin);
        }
//        int currentTurn = rc.readSharedArray(1);
//        if (currentTurn >= attackTurn) {
//            int xMove = 0, yMove = 0;
        MapLocation targ = new MapLocation(rc.getMapWidth()/2, rc.getMapHeight()/2);
        Direction cur = rc.getLocation().directionTo(targ);
        rc.setIndicatorString(dir.opposite().toString());
        Direction cdir;

        switch(cur){
            case NORTH:
                cdir=BFSNorth.gbda(rc, targ, dir.opposite());
                break;
            case EAST:
                cdir=BFSEast.gbda(rc, targ, dir.opposite());
                break;
            case WEST:
                cdir=BFSWest.gbda(rc, targ, dir.opposite());
                break;
            case SOUTH:
                cdir=BFSSouth.gbda(rc, targ, dir.opposite());
                break;
            case NORTHEAST:
                cdir=BFSNorthEast.gbda(rc, targ, dir.opposite());
                break;
            case NORTHWEST:
                cdir=BFSNorthWest.gbda(rc, targ, dir.opposite());
                break;
            case SOUTHEAST:
                cdir=BFSSouthEast.gbda(rc, targ, dir.opposite());
                break;
            default:
                cdir=BFSSouthWest.gbda(rc, targ, dir.opposite());
                break;
        }
        //rc.setIndicatorString(dir.toString());
        if(cdir!=null&&rc.canMove(cdir)) {
            //System.out.println(dir);
            rc.move(cdir);
            dir = cdir;
        }
        return;

    }
}
