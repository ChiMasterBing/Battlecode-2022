package Pathfinding;

import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class Builder {

	public static void run(RobotController rc) throws GameActionException {
		// TODO Auto-generated method stub
		//if you have enough miner + soldier and lead is neough and no danger, build

		
		
		
		
		//pathfind
		MapLocation dir = null;
		rc.move(BFSBuilder.getBestDir(rc, new MapLocation(0, 0)));
	}
	static class Node implements Comparable<Node>{
		public int dist;
		public MapLocation loc;
		public Node(int d, MapLocation l) {
			dist = d;
			loc = l;
		}
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return dist-o.dist;
		}
	}
}
