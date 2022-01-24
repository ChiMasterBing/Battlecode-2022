package baller;
import java.util.*;
import battlecode.common.*;
public class Soldier extends Robot {
	int turnCount = 0;
    final Random rng = new Random(6147);
	boolean init = true;
    MapLocation target, me, tempTarget, repair;
    boolean real = false, combat = false, attacked = false, setRepair = false, repairing = false;
    RobotController rc;
    Team opponent;
    int radius;
    String task;
    Direction dir = Direction.CENTER;
	public Soldier(RobotController rc) {
		this.rc = rc;
	}
	void run() throws GameActionException {
		if (target != null) {
			rc.setIndicatorString(target.toString());
		}
		me = rc.getLocation();
		if (init) {
			init = false;
			init();
		}
		
		attacked = false;
        RobotInfo[] enemies = rc.senseNearbyRobots(radius, opponent);
        Arrays.sort(enemies, new RobotInfoComparator());
        int ptr = 0, realE = 0, att = 0;
        while(ptr < enemies.length){
            MapLocation cur = enemies[ptr].location;
            while (rc.canAttack(cur)){
            	attacked = true;
            	boolean attArchon = false;
            	if (enemies[ptr].type == RobotType.ARCHON) {
            		attArchon = true;
            	}
            	else if (enemies[ptr].type == RobotType.SOLDIER) {
            		combat = true;
            		tempTarget = enemies[ptr].location;
            	}
                rc.attack(cur);
                if (attArchon && !rc.canSenseRobotAtLocation(cur)) {
                	System.out.println("I BE BALLIN!");
                	int current = rc.readSharedArray(8);
        			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
        			String message = currentBits.substring(0, 4) + "0010" + currentBits.substring(8, 16);
        	        rc.writeSharedArray(8, Integer.parseInt(message, 2));
        	        target = null;
        	        init0000();
                }
            }
            ptr++;
        }
    	if (task.equals("00010000") && !real) {
    		init0000();
    		if (target == null) {
    			return;
    		}
    	}
    	RobotInfo[] enemies2 = rc.senseNearbyRobots(20 , opponent);
    	int soldierCount = 0;
    	for (int i=0; i<enemies2.length; i++) {
    		if (enemies2[i].type == RobotType.ARCHON) {
    			real = true;
        		realE++;
        		target = enemies2[i].getLocation();
        		int current = rc.readSharedArray(8);
    			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
    			String message = currentBits.substring(0, 4) + "0011" + Utility.numToBit(target.x/4) + Utility.numToBit(target.y/4);
    	        if (message != currentBits) {
    	        	//System.out.println("override!!! " + rc.getRoundNum());
    	        	//System.out.println(message);
    	        	//System.out.println(currentBits);
    	        	rc.writeSharedArray(8, Integer.parseInt(message, 2));
    	        }
    	    }
    		else if (enemies2[i].type == RobotType.SOLDIER) {
    			combat = true;
    			soldierCount++;
    			tempTarget = enemies2[i].location;
    		}
    		else if (enemies2[i].type == RobotType.MINER) {
    			combat = true;
    			soldierCount++;
    			tempTarget = enemies2[i].location;
    			attacked = false;
    		}
    	}
    	if (soldierCount == 0) {
    		combat = false;
    	}
    	if (realE == 0) {
        	real = false;
        }
    	if (rc.getHealth() <= 12 || repairing) {
			repair();
			return;
		}
    	if (combat) {
    		Direction cur;
    		if (attacked) {
    			cur = rc.getLocation().directionTo(tempTarget).opposite();
    		}
    		else {
    			cur = rc.getLocation().directionTo(tempTarget);
    		}
    		
	        Direction cdir;
	        switch(cur){ //improve by writing code that determines ONLY the moves rn, greedy
	            case NORTH:
	                cdir=BFSNorth.gbda(rc, tempTarget, dir.opposite());
	                break;
	            case EAST:
	                cdir=BFSEast.gbda(rc, tempTarget, dir.opposite());
	                break;
	            case WEST:
	                cdir=BFSWest.gbda(rc, tempTarget, dir.opposite());
	                break;
	            case SOUTH:
	                cdir=BFSSouth.gbda(rc, tempTarget, dir.opposite());
	                break;
	            case NORTHEAST:
	                cdir=BFSNorthEast.gbda(rc, tempTarget, dir.opposite());
	                break;
	            case NORTHWEST:
	                cdir=BFSNorthWest.gbda(rc, tempTarget, dir.opposite());
	                break;
	            case SOUTHEAST:
	                cdir=BFSSouthEast.gbda(rc, tempTarget, dir.opposite());
	                break;
	            default:
	                cdir=BFSSouthWest.gbda(rc, tempTarget, dir.opposite());
	                break;
	        }
	        if(cdir!=null&&rc.canMove(cdir)) {
	        	rc.move(cdir);
	            dir = cdir;
	        }
    	}
    	else if (!combat) {
	        Direction cur = rc.getLocation().directionTo(target);
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
        
    	if (!attacked && combat) {
    		RobotInfo[] enemies3 = rc.senseNearbyRobots(radius, opponent);
    		Arrays.sort(enemies3, new RobotInfoComparator());
    		for (int i=0; i<enemies3.length; i++) {
    			if (rc.canAttack(enemies3[i].location)) {
    				rc.attack(enemies3[i].location);
    				break;
    			}
    		}
    	}
    	
    	
        me = rc.getLocation();
        if (Utility.distance(target, me) == 0) {    	
        	enemies = rc.senseNearbyRobots(radius, opponent);
        	int archo = 0;
        	for (int i=0; i<enemies.length; i++) {
        		if (enemies[i].type == RobotType.ARCHON) {
        			archo++;
        		}
        	}
        	if (archo == 0) {
        		
        		int current = rc.readSharedArray(8);
    			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
    			String message = currentBits.substring(0, 4) + "0001" + currentBits.substring(8, 16);
    	        rc.writeSharedArray(8, Integer.parseInt(message, 2));
    	        target = null;
    	        init0000();
        	}
        }
        turnCount++;
	}
	
	void repair() throws GameActionException {
		if (!setRepair) {
			int closestDist = Integer.MAX_VALUE;
			int leastOccupancy = Integer.MAX_VALUE;
			for (int i=4; i<(4+rc.getArchonCount()); i++) {
				String s = Comms.getIndex(rc, i);
				int occupancy = Integer.parseInt(s.substring(12, 16));
				if (Math.abs(leastOccupancy-occupancy) <= 2) {
					String s2 = Comms.getIndex(rc, i-4);
					int aX = Utility.bitToNum(s2.substring(0, 4))*4, aY = Utility.bitToNum(s2.substring(4, 8))*4;
					MapLocation aPos = new MapLocation(aX, aY);
					int dist = Utility.distance(me, aPos);
					if (dist < closestDist) {
						closestDist = dist;
						leastOccupancy = occupancy;
						repair = aPos;
					}
				}
				else if (occupancy < leastOccupancy) {
					String s2 = Comms.getIndex(rc, i-4);
					int aX = Utility.bitToNum(s2.substring(0, 4))*4, aY = Utility.bitToNum(s2.substring(4, 8))*4;
					MapLocation aPos = new MapLocation(aX, aY);
					int dist = Utility.distance(me, aPos);
					closestDist = dist;
					leastOccupancy = occupancy;
					repair = aPos;
				}

			}
			setRepair = true;
			repairing = true;
		}
		//System.out.println(repair);
		Direction cur = rc.getLocation().directionTo(repair);
        Direction cdir;
        switch(cur){
            case NORTH:
                cdir=BFSNorth.gbda(rc, repair, dir.opposite());
                break;
            case EAST:
                cdir=BFSEast.gbda(rc, repair, dir.opposite());
                break;
            case WEST:
                cdir=BFSWest.gbda(rc, repair, dir.opposite());
                break;
            case SOUTH:
                cdir=BFSSouth.gbda(rc, repair, dir.opposite());
                break;
            case NORTHEAST:
                cdir=BFSNorthEast.gbda(rc, repair, dir.opposite());
                break;
            case NORTHWEST:
                cdir=BFSNorthWest.gbda(rc, repair, dir.opposite());
                break;
            case SOUTHEAST:
                cdir=BFSSouthEast.gbda(rc, repair, dir.opposite());
                break;
            default:
                cdir=BFSSouthWest.gbda(rc, repair, dir.opposite());
                break;
        }
        if(cdir!=null&&rc.canMove(cdir)) {
        	rc.move(cdir);
            dir = cdir;
        }
        
        if (Utility.distance(me, repair) <= 3) {
        	RobotInfo[] friendly = rc.senseNearbyRobots(20, opponent.opponent());
        	boolean correct = false;
        	for (int i=0; i<friendly.length; i++) {
        		if (friendly[i].type == RobotType.ARCHON) {
        			repair = friendly[i].location;
        			correct = true;
        			break;
        		}
        	}
        	if (!correct) {
        		setRepair = false;
        	}
        }
        if (rc.getHealth() > 45) {
        	repairing = false;
        	setRepair = false;
        }
		
	}
	void init() throws GameActionException {
		opponent = rc.getTeam().opponent();
		radius = rc.getType().actionRadiusSquared;
		int closeArchon = Integer.MAX_VALUE;
		task = "";
		for (int i=0; i<rc.getArchonCount(); i++) {
			String s = Comms.getIndex(rc, i);
			int aX = Utility.bitToNum(s.substring(0, 4))*4, aY = Utility.bitToNum(s.substring(4, 8))*4;
			MapLocation aPos = new MapLocation(aX, aY);
			int dist = Utility.distance(me, aPos);
			if (dist < closeArchon) {
				closeArchon = dist;
				task = s.substring(8);
			}
		}
		
		switch (task) {
			case "00010000": init0000(); break;
			default: rc.disintegrate(); break;
		}
	}
	void init0000() throws GameActionException {
		String s = Comms.getIndex(rc, 8);
		int tX = Utility.bitToNum(s.substring(8, 12))*4, tY = Utility.bitToNum(s.substring(12, 16))*4;
		MapLocation tPos = new MapLocation(tX, tY);
		target = tPos;
	}
}
class RobotInfoComparator implements Comparator<RobotInfo> {
    public int compare(RobotInfo a, RobotInfo b){
        return a.getHealth() - b.getHealth();
    }
}
