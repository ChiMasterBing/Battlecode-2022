package Pathfinding;

import battlecode.common.*;

public class Laboratory {
	static boolean init = true;
	static MapLocation lastlocation = null;
	public static void run(RobotController rc) throws GameActionException {
		rc.setIndicatorString(String.valueOf(rc.getRoundNum()));
		// TODO Auto-generated method stub
		boolean works = false;
		for(int dy = -1; dy<=1; dy++){
			for(int dx = -1; dx<=1; dx++){
				MapLocation cur = new MapLocation(dx+rc.getLocation().x, dy+rc.getLocation().y);
				RobotInfo adjacentrob = null;
				if(rc.onTheMap(cur)){
					adjacentrob = rc.senseRobotAtLocation(cur);
				}
				if(adjacentrob!=null&&adjacentrob.getType()== RobotType.BUILDER){
					lastlocation = new MapLocation(dx+rc.getLocation().x, dy+rc.getLocation().y);
					works = true;
				}
			}
		}
		if(!works){
			if(rc.getMode()==RobotMode.PORTABLE) {
				Direction bestdir = rc.getLocation().directionTo(lastlocation);
				rc.move(bestdir);
			}else{
				if(rc.canTransform()){
					rc.transform();
				}
			}
		}else{
			if(rc.getRoundNum()%3<1&&rc.canTransmute()) {
				rc.transmute();
			}
		}
	}
}
