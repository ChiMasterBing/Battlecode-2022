package Pathfinding;

import battlecode.common.*;

public class Builder {
	static boolean init = true;
	static MapLocation aloc = null;
	static MapLocation targ = null;//target
	static Direction pd = null;//pathfinding dir
	static Direction dir = Direction.CENTER;
	static boolean settled = false;
	static int wait = 0;
	public static void run(RobotController rc) throws GameActionException {
		// TODO Auto-generated method stub
		//if you have enough miner + soldier and lead is neough and no danger, build
		// if anomaly and sense better loc, go there and end
		if(settled){
			AnomalyScheduleEntry[] anom = rc.getAnomalySchedule();
			for(AnomalyScheduleEntry i: anom){
				if(i.anomalyType==AnomalyType.VORTEX&&i.roundNumber+11==currentRound){
					rc.move(pd);
					settled = false;
					wait = 11;
					targ = null;
				}
			}
			return;
		}
		if(init){
			init = false;
			aloc = rc.getLocation();
			int my = rc.getMapHeight()/2;
			int mx = rc.getMapWidth()/2;
			int cx = aloc.x;
			int cy = aloc.y;
			if(cx<mx&&cy<my){
				pd = Direction.SOUTHWEST;
			}else if(cx>mx&&cy<my){
				pd = Direction.SOUTHEAST;
			}else if(cx<mx&&cy>my) {
				pd = Direction.NORTHWEST;
			}else if(cx>mx&&cy>my) {
				pd = Direction.NORTHEAST;
			}else if(cx<mx&&cy==my){
				pd = Direction.WEST;
			}else if(cx>mx&&cy==my){
				pd = Direction.EAST;
			}else if(cx==mx&&cy>my){
				pd = Direction.NORTH;
			}else{
				pd = Direction.SOUTH;
			}
		}
		if(wait>1){
			wait--;
			return;
		}
		Direction cdir;
		if(wait==0) {
			switch (pd) {
				case NORTH:
					targ = BFSNorth.lowest(rc);
					break;
				case EAST:
					targ = BFSEast.lowest(rc);
					break;
				case WEST:
					targ = BFSWest.lowest(rc);
					break;
				case SOUTH:
					targ = BFSSouth.lowest(rc);
					break;
				case NORTHEAST:
					targ = BFSNorthEast.lowest(rc);
					break;
				case NORTHWEST:
					targ = BFSNorthWest.lowest(rc);
					break;
				case SOUTHEAST:
					targ = BFSSouthEast.lowest(rc);
					break;
				case SOUTHWEST:
					targ = BFSSouthWest.lowest(rc);
					break;
				default:
					break;
			}
		}else{
			if(targ==null) {
				targ = BFSBuilder.smallestInRange(rc);
			}
		}
		Direction cur = rc.getLocation().directionTo(targ);
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
			case SOUTHWEST:
				cdir=BFSSouthWest.gbda(rc, targ, dir.opposite());
				break;
			default:
				cdir = Direction.CENTER;
				break;
		}

		if(cdir!=Direction.CENTER) {
			if (cdir != null && rc.canMove(cdir)) {
				//System.out.println(dir);
				rc.move(cdir);
				dir = cdir;
			}
		}else {
			if (!danger && enoughLead && enoughSold) {
				//find the least rubble dir
				rc.move(pd);
				Direction bestdir = BFSBuilder.getBestDir(rc);//best place to place tower
				settled = true;
			}
		}


		//pathfind
	}
}
