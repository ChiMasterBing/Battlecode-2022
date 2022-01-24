package JesseC;

import battlecode.common.*;
import java.util.*;

public class Soldier {
    public static void run(RobotController rc) throws GameActionException {
        Direction dir = BFSBuilder.getBestDir(rc, new MapLocation(0, 0));
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
    public static MapLocation findLeastRubble(RobotController rc, Direction dir) throws GameActionException {
        MapLocation adj[][] = new MapLocation[3][3];
        for(int dx = -1; dx <= 1; dx++){
            for(int dy = -1; dy <= 1; dy++){
                MapLocation cur = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
                if(rc.canSenseLocation(cur)) {
                    adj[dx + 1][dy + 1] = cur;
                } else {
                    adj[dx + 1][dy + 1] = new MapLocation(-1, -1);
                }
            }
        }

        int rubble = Integer.MAX_VALUE; MapLocation res = rc.getLocation();
        if(dir == Direction.NORTH){
            for(int dx = -1; dx <= 1; dx++){
                for(int dy = 0; dy <= 1; dy++){
                    if(rc.canSenseLocation(adj[dx + 1][dy + 1]) && rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
                        res = adj[dx + 1][dy + 1];
                    }
                }
            }
        } else if(dir == Direction.EAST){
            for(int dx = 0; dx <= 1; dx++){
                for(int dy = -1; dy <= 1; dy++){
                    if(rc.canSenseLocation(adj[dx + 1][dy + 1]) && rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
                        res = adj[dx + 1][dy + 1];
                    }
                }
            }
        } else if(dir == Direction.SOUTH){
            for(int dx = -1; dx <= 1; dx++){
                for(int dy = -1; dy <= 0; dy++){
                    if(rc.canSenseLocation(adj[dx + 1][dy + 1]) && rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
                        res = adj[dx + 1][dy + 1];
                    }
                }
            }
        } else if(dir == Direction.WEST){
            for(int dx = -1; dx <= 0; dx++){
                for(int dy = -1; dy <= 1; dy++){
                    if(rc.canSenseLocation(adj[dx + 1][dy + 1]) && rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
                        res = adj[dx + 1][dy + 1];
                    }
                }
            }
        } else if(dir == Direction.NORTHEAST){
            for(int dx = 0; dx <= 1; dx++){
                for(int dy = 0; dy <= 1; dy++){
                    if(rc.canSenseLocation(adj[dx + 1][dy + 1]) && rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
                        res = adj[dx + 1][dy + 1];
                    }
                }
            }
        } else if(dir == Direction.NORTHWEST){
            for(int dx = -1; dx <= 0; dx++){
                for(int dy = 0; dy <= 1; dy++){
                    if(rc.canSenseLocation(adj[dx + 1][dy + 1]) && rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
                        res = adj[dx + 1][dy + 1];
                    }
                }
            }
        } else if(dir == Direction.SOUTHEAST){
            for(int dx = 0; dx <= 1; dx++){
                for(int dy = -1; dy <= 0; dy++){
                    if(rc.canSenseLocation(adj[dx + 1][dy + 1]) && rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
                        res = adj[dx + 1][dy + 1];
                    }
                }
            }
        } else if(dir == Direction.SOUTHWEST){
            for(int dx = -1; dx <= 0; dx++){
                for(int dy = -1; dy <= 0; dy++){
                    if(rc.canSenseLocation(adj[dx + 1][dy + 1]) && rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
                        res = adj[dx + 1][dy + 1];
                    }
                }
            }
        }
        return res;
    }
}
