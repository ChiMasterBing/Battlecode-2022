package baller;
import java.util.*;
import battlecode.common.*;
public class Utility {
	static Direction getDirection(MapLocation me, MapLocation tar) {
		int dx = tar.x-me.x;
		int dy = tar.y-me.y;
		if (dx > 0 && dy > 0) {
			return Direction.NORTHEAST;
		}
		else if (dx > 0 && dy == 0) {
			return Direction.NORTH;
		}
		else if (dx > 0 && dy < 0) {
			return Direction.NORTHWEST;
		}
		else if (dx == 0 && dy > 0) {
			return Direction.EAST;
		}
		else if (dx == 0 && dy == 0) {
			return Direction.CENTER;
		}
		else if (dx == 0 && dy < 0) {
			return Direction.WEST;
		}
		else if (dx < 0 && dy > 0) {
			return Direction.SOUTHEAST;
		}
		else if (dx < 0 && dy == 0) {
			return Direction.SOUTH;
		}
		else if (dx < 0 && dy < 0) {
			return Direction.SOUTHWEST;
		}
		return Direction.CENTER;
	}
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
	static void move(RobotController rc, Direction dir, MapLocation target) throws GameActionException {
		Direction cur = rc.getLocation().directionTo(target);
        rc.setIndicatorString(dir.opposite().toString());
        Direction cdir;

        switch(cur){
            case NORTH:
                cdir=BFSNorth.gbda(rc, target, dir.opposite());
                break;
            case EAST:
                cdir=BFSEast.gbda(rc, target, dir.opposite());
                break;
            case WEST:
                cdir=BFSWest.gbda(rc, target, dir.opposite());
                break;
            case SOUTH:
                cdir=BFSSouth.gbda(rc, target, dir.opposite());
                break;
            case NORTHEAST:
                cdir=BFSNorthEast.gbda(rc, target, dir.opposite());
                break;
            case NORTHWEST:
                cdir=BFSNorthWest.gbda(rc, target, dir.opposite());
                break;
            case SOUTHEAST:
                cdir=BFSSouthEast.gbda(rc, target, dir.opposite());
                break;
            default:
                cdir=BFSSouthWest.gbda(rc, target, dir.opposite());
                break;
        }
        if(cdir!=null&&rc.canMove(cdir)) {
        	rc.move(cdir);
            dir = cdir;
        }
	}
}
