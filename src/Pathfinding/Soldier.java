package DanielProto;
import java.util.*;
import battlecode.common.*;

public class Soldier extends Robot {
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
    zone[][] masterArray;
    MapLocation[] targets;
    RobotController rc;
    Team opponent;
    int currentTarget = 0;
    int attackTurn = 0;
    MapLocation me;
    int side;
    public Soldier(RobotController rc) {
        this.rc = rc;

    }
    void run() throws GameActionException {
        if (init) {
            opponent = rc.getTeam().opponent();
            targets = new MapLocation[10];
            targets[0] = new MapLocation(rc.readSharedArray(2), rc.readSharedArray(3));
            attackTurn = rc.readSharedArray(1)+250;
            side = ((rc.readSharedArray(0)-1)/3)%6;
            init = false;
        }
        me = rc.getLocation();
        
        int radius = rc.getType().actionRadiusSquared;
        Team opponent = rc.getTeam().opponent();
        RobotInfo[] enemies = rc.senseNearbyRobots(radius, opponent);
        Arrays.sort(enemies, new RobotInfoComparator());
        int ptr = 0;
        while(ptr < enemies.length){
            MapLocation cur = enemies[ptr].location;
            while (rc.canAttack(cur)){
                rc.attack(cur);
            }
            ptr++;
        }
        
        int currentTurn = rc.readSharedArray(1);
//        if (currentTurn >= attackTurn) {
//            int xMove = 0, yMove = 0;
                        
            Direction dir =BFSBuilder.getBestDir(rc, new MapLocation(0, 0));
            if (rc.canMove(dir)) {
                rc.move(dir);
            }
                else {
            if (side == 0) {
                if (rc.canMove(Direction.NORTHWEST)) {
                    rc.move(Direction.NORTHWEST);
                }
                else if (rc.canMove(Direction.NORTH)) {
                    rc.move(Direction.NORTH);
                }
                else if (rc.canMove(Direction.WEST)) {
                    rc.move(Direction.WEST);
                }
                else {
                    dir = directions[rng.nextInt(directions.length)];
                    if (rc.canMove(dir)) {
                        rc.move(dir);
                    }
                }
            }
            else if (side == 1) {
                if (rc.canMove(Direction.SOUTHEAST)) {
                    rc.move(Direction.SOUTHEAST);
                }
                else if (rc.canMove(Direction.SOUTH)) {
                    rc.move(Direction.SOUTH);
                }
                else if (rc.canMove(Direction.EAST)) {
                    rc.move(Direction.EAST);
                }
                else {
                    dir = directions[rng.nextInt(directions.length)];
                    if (rc.canMove(dir)) {
                        rc.move(dir);
                    }
                }
                
            }
            else {
                dir = directions[rng.nextInt(directions.length)];
                if (rc.canMove(dir)) {
                    rc.move(dir);
                }
            }
        }
        turnCount++;
    }
}
class RobotInfoComparator implements Comparator<RobotInfo>{
    public int compare(RobotInfo a, RobotInfo b){
        return a.getHealth() - b.getHealth();
    }
}
