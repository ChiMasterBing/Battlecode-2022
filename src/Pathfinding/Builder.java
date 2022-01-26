package Pathfinding;

import battlecode.common.*;

import java.util.Objects;

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
		RobotInfo[] arr = rc.senseNearbyRobots();
		int smallhealth = Integer.MAX_VALUE;
		MapLocation loc =null;
		rc.setIndicatorString("WTF");
		for (RobotInfo i : arr) {
			if (i.getTeam()==rc.getTeam()&&i.getType().isBuilding()&&i.getHealth()<smallhealth&&i.getHealth()<i.getType().health) {
				smallhealth = i.getHealth();
				loc = i.getLocation();
			}
		}
		if(loc!=null&&rc.canRepair(loc)){
//			System.out.println("REPAIRE");
//			rc.resign();
			rc.repair(loc);
		}
		if(settled){
			AnomalyScheduleEntry[] anom = rc.getAnomalySchedule();
			for(AnomalyScheduleEntry i: anom){
				if(i.anomalyType==AnomalyType.VORTEX&&i.roundNumber+21==rc.getRoundNum()){
					rc.move(pd);
					dir = pd;
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
			System.out.println("MM");
//			rc.resign();
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
			// !!WHAT IS THIS LINE?
			rc.resign();
			if(targ==null) {
				targ = BFSBuilder.smallestInRange(rc);
			}
		}
//		if(rc.getRoundNum()>300){
//			rc.resign();
//		}
//		System.out.println();
//		MapLocation eee = new MapLocation(30, 19);
//		if(Objects.equals(rc.getLocation(), eee)){
//			System.out.println(pd);
//			System.out.println(targ);
//			rc.resign();
//		}
//		rc.setIndicatorString(targ.toString());
		Direction cur = pd;//this avoids infiante loops
		if(cur==null){
			cur=Direction.CENTER;
		}
		if(targ==null){
			System.out.println(pd);
			rc.resign();
		}
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
		//rc.setIndicatorString(cdir.toString());
		if(targ==null){
			System.out.println(rc.getLocation());
			System.out.println(dir);
			System.out.println(pd);
			System.out.println(cdir);
			//System.out.println(targ.toString());
			//rc.resign();
			rc.resign();
		}
		//rc.setIndicatorString(targ.toString());
//		rc.resign();
		if(cdir!=Direction.CENTER&&cdir!=null) {
			//rc.setIndicatorString(targ.toString());
//			rc.resign();
			if (cdir != null && rc.canMove(cdir)) {
				//System.out.println(dir);
				rc.move(cdir);
				dir = cdir;
			}else{
				if(rc.getMovementCooldownTurns()==0) {
					System.out.println("HEEEE");
					rc.resign();
				}
			}
		}else {
			//rc.setIndicatorString("BALLER");
//			rc.resign();
			int anum = rc.getArchonCount();
			boolean underattck = false;
			for(int i = 0; i<anum; i++){
				if (((rc.readSharedArray(i)>>11)&1)==1) {// !!w8 CHEDCK THIS
					underattck = true;
					break;
				}
			}
			if(underattck){// !! just for test
				underattck = false;
			}
			//rc.resign();
			int numsoldiers = rc.readSharedArray(9)>>4;
			if (!underattck) {//dw abut soldiers for nwo
				//find the least rubble dir

				if(rc.getActionCooldownTurns()==0&&rc.getTeamLeadAmount(rc.getTeam())>180){
					Direction bestdir = BFSBuilder.getBestDir(rc);//best place to move
					if(rc.canMove(bestdir)) {
						rc.move(bestdir);
						dir = bestdir.opposite();
						bestdir = BFSBuilder.getBestDir(rc);//best place to place tower
						if(rc.canBuildRobot(RobotType.LABORATORY, bestdir)) {
							settled = true;
							rc.buildRobot(RobotType.LABORATORY, bestdir);
						}
					}

				}
			}
		}


		//pathfind
	}
}
