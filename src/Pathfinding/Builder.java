package Pathfinding;

import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

import java.io.IOException;

public class Builder extends Robot {

	RobotController rc;

	public Builder(RobotController rc) {
		this.rc = rc;
	}

	@Override
	void run() throws GameActionException, IOException {
		// TODO Auto-generated method stub
		//attack




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
