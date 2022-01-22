package JesseC;

import battlecode.common.*;
import java.util.*;

public class Soldier {
    public static void run(RobotController rc) throws GameActionException {
        Direction dir = BFSBuilder.getBestDir(rc, new MapLocation(24, 24));
        if (rc.canMove(dir)) {
            rc.move(dir);
            System.out.println("I moved!");
        }
        int radius = rc.getType().actionRadiusSquared;
        Team opponent = rc.getTeam().opponent();
        RobotInfo[] enemies = rc.senseNearbyRobots(radius, opponent);
        boolean foundArchon = false;
        RobotInfo attack = enemies[0];
        for(RobotInfo r: enemies){
            if(!foundArchon && r.getType() == RobotType.ARCHON) {
                attack = r;
                foundArchon = true;
            } else if(foundArchon && r.getType() == RobotType.ARCHON){
                if(attack.getHealth() > r.getHealth()){
                    attack = r;
                }
            } else if(!foundArchon){
                if(attack.getHealth() > r.getHealth()){
                    attack = r;
                }
            }
        }
        MapLocation cur = attack.location;
        if (rc.canAttack(cur)){
            rc.attack(cur);
        }
    }
}