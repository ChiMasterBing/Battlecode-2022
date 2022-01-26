package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

import java.util.ArrayList;
import java.util.Arrays;
public class Utility {
	static boolean isInZone(int zoneX, int zoneY, MapLocation me) {
		if (me.x >= zoneX*4 && me.x <= zoneX*4+4 && me.y >= zoneY*4 && me.y <= zoneY*4+4) {
			return true;
		}
		return false;
	}
	static MapLocation zonePosToMapPos(MapLocation temp) {
		return new MapLocation(temp.x*5, temp.y*5);
	}
	static int distance(MapLocation a, MapLocation b) {
		return (int)Math.sqrt( (a.x-b.x) * (a.x-b.x) + (a.y-b.y) * (a.y-b.y));
	}
	static String numToBit(int num) {
		return String.format("%4s", Integer.toBinaryString(num)).replace(" ", "0");
	}
	static int bitToNum(String bit) {
		return Integer.parseInt(bit, 2);
	}
	static String numToBit8(int num) {
		return String.format("%8s", Integer.toBinaryString(num)).replace(" ", "0");
	}
	static String numToBit6(int num) {
		return String.format("%6s", Integer.toBinaryString(num)).replace(" ", "0");
	}
	static MapLocation findLeastRubble(RobotController rc, Direction dir) throws GameActionException {
        MapLocation adj[][] = new MapLocation[3][3];
        for(int dx = -1; dx <= 1; dx++){
            for(int dy = -1; dy <= 1; dy++){
                adj[dx + 1][dy + 1] = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
            }
        }
        // There might be an index out of bounds or smth lol
        int rubble = 0; MapLocation res = rc.getLocation();
        if(dir == Direction.NORTH){
            for(int dx = 0; dx <= 1; dx++){
                for(int dy = -1; dy <= 1; dy++){
                	if (rc.canSenseLocation(adj[dx + 1][dy + 1])) {
	                    if(rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
	                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
	                        res = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
	                    }
                	}
                }
            }
        } else if(dir == Direction.EAST){
            for(int dx = -1; dx <= 1; dx++){
                for(int dy = 0; dy <= 1; dy++){
                	if (rc.canSenseLocation(adj[dx + 1][dy + 1])) {
	                    if(rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
	                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
	                        res = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
	                    }
                	}
                }
            }
        } else if(dir == Direction.SOUTH){
            for(int dx = -1; dx <= 0; dx++){
                for(int dy = -1; dy <= 1; dy++){
                	if (rc.canSenseLocation(adj[dx + 1][dy + 1])) {
	                    if(rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
	                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
	                        res = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
	                    }
                	}
                }
            }
        } else if(dir == Direction.WEST){
            for(int dx = -1; dx <= 1; dx++){
                for(int dy = -1; dy <= 0; dy++){
                	if (rc.canSenseLocation(adj[dx + 1][dy + 1])) {
	                    if(rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
	                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
	                        res = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
	                    }
                	}
                }
            }
        } else if(dir == Direction.NORTHEAST){
            for(int dx = 0; dx <= 1; dx++){
                for(int dy = 0; dy <= 1; dy++){
                	if (rc.canSenseLocation(adj[dx + 1][dy + 1])) {
	                    if(rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
	                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
	                        res = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
	                    }
                	}
                }
            }
        } else if(dir == Direction.NORTHWEST){
            for(int dx = 0; dx <= 1; dx++){
                for(int dy = -1; dy <= 0; dy++){
                	if (rc.canSenseLocation(adj[dx + 1][dy + 1])) {
	                    if(rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
	                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
	                        res = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
	                    }
                	}
                }
            }
        } else if(dir == Direction.SOUTHEAST){
            for(int dx = -1; dx <= 0; dx++){
                for(int dy = 0; dy <= 1; dy++){
                	if (rc.canSenseLocation(adj[dx + 1][dy + 1])) {
	                    if(rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
	                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
	                        res = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
	                    }
                	}
                }
            }
        } else if(dir == Direction.SOUTHWEST){
            for(int dx = -1; dx <= 0; dx++){
                for(int dy = -1; dy <= 0; dy++){
                	if (rc.canSenseLocation(adj[dx + 1][dy + 1])) {
	                    if(rc.senseRubble(adj[dx + 1][dy + 1]) < rubble){
	                        rubble = rc.senseRubble(adj[dx + 1][dy + 1]);
	                        res = new MapLocation(rc.getLocation().x + dx, rc.getLocation().y + dy);
	                    }
                	}
                }
            }
        }
        return rc.getLocation(); // Should it ever reach this point?
    }
	static ArrayList<MapLocation> leastRubbleAround(RobotController rc, MapLocation me) throws GameActionException {
		int[] dx = {1, 1, 1, 0, 0, -1,-1, -1};
		int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
		MLR[] arr = new MLR[8];
		for (int i=0; i<8; i++) {
			MapLocation loc = new MapLocation(me.x+dx[i], me.y+dy[i]);
			MLR temp = new MLR(rc.senseRubble(loc), loc);
			arr[i] = temp;
		}
		Arrays.sort(arr);
		ArrayList<MapLocation> answer = new ArrayList<MapLocation>();
		for (int i=0; i<arr.length; i++) {
			answer.add(arr[i].ML);
		}
		return answer;
	}
}
class MLR implements Comparable<MLR> {
	MapLocation ML;
	int r;
	public MLR(int rubble, MapLocation ml) {
		ML = ml;
		r = rubble;
	}
	public int compareTo(MLR m) {
		if (m.r < r) {
			return 1;
		}
		else if (m.r > r) {
			return -1;
		}
		else {
			return 0;
		}
	}
}