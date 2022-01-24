package Pathfinding;

import battlecode.common.*;

public class Laboratory {
	static boolean init = true;
	static MapLocation lastlocation = null;
	public static void run(RobotController rc) throws GameActionException {
		// TODO Auto-generated method stub
		boolean works = false;
		for(int dy = -1; dy<=1; dy++){
			for(int dx = -1; dx<=1; dx++){
				if(rc.senseRobotAtLocation(new MapLocation(dx+rc.getLocation().x, dy+rc.getLocation().y)).getType()== RobotType.BUILDER){
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
			if(rc.canTransmute()) {
				rc.transmute();
			}
		}
	}
}
