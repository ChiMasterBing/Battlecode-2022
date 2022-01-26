package Pathfinding;

import battlecode.common.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
public class Soldier extends Robot {
	int turnCount = 0;
    final Random rng = new Random(6147);
	boolean init = true;
    MapLocation target, me, tempTarget, repair, archonTarget;
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
		tempTarget = null;
		attacked = false;
        RobotInfo[] enemies = rc.senseNearbyRobots(radius, opponent);
        Arrays.sort(enemies, new RobotInfoComparator());
        int realE = 0;
        for (int ptr=0; ptr<enemies.length;ptr++) {
            MapLocation cur = enemies[ptr].location;
            while (rc.canAttack(cur)){
            	attacked = true;
            	if (enemies[ptr].type == RobotType.ARCHON && enemies[ptr].health <= 3) {
            		System.out.println("I BE BALLIN!");
                	int current = rc.readSharedArray(8);
        			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
        			String message = "0010" + currentBits.substring(4, 16);
        	        rc.writeSharedArray(8, Integer.parseInt(message, 2));
        	        target = null;
        	        init0000();
            	}
            	else if (enemies[ptr].type == RobotType.SOLDIER) {
            		combat = true;
            		tempTarget = enemies[ptr].location;
            	}
                rc.attack(cur);
            }
            ptr++;
        }
    	if (task.equals("00010000") && !real) {
    		init0000();
    	}
    	RobotInfo[] enemies2 = rc.senseNearbyRobots(20 , opponent);
    	RobotInfo[] friendly = rc.senseNearbyRobots(20, opponent.opponent());
    	boolean nearby = false;
    	for (int i=0; i<enemies2.length; i++) {
    		if (enemies2[i].type == RobotType.ARCHON) {
    			real = true;
        		realE++;
        		archonTarget = enemies2[i].getLocation();
        		int current = rc.readSharedArray(8);
    			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
    			String message = "0011" + Utility.numToBit6(archonTarget.x) + Utility.numToBit6(archonTarget.y);
    	        if (message != currentBits) {
    	        	rc.writeSharedArray(8, Integer.parseInt(message, 2));
    	        }
    	    }
    		else if (enemies2[i].type == RobotType.SOLDIER) {
    			tempTarget = enemies2[i].location;
    			nearby = true;
    		}
    		else if (enemies2[i].type == RobotType.MINER) {
    			tempTarget = enemies2[i].location;
    			attacked = false;
    		}
    	}
    	if (realE == 0) {
        	real = false;
        }
    	if (rc.getHealth() <= 15 || repairing) {
			repair();
			return;
		}
    	if (tempTarget != null) {
    		target = tempTarget;
    	}
    	else {
    		target = archonTarget;
    	}
    	
        Direction cur = rc.getLocation().directionTo(target);
        Direction cdir;
        if (attacked || !assess(friendly, enemies2)) { //
        	cur = rc.getLocation().directionTo(target).opposite();
		}
		else {
			cur = rc.getLocation().directionTo(target);
		}
        switch(cur){
            case NORTH:
                cdir= BFSNorth.gbda(rc, target, dir.opposite());
                break;
            case EAST:
                cdir= BFSEast.gbda(rc, target, dir.opposite());
                break;
            case WEST:
                cdir= BFSWest.gbda(rc, target, dir.opposite());
                break;
            case SOUTH:
                cdir= BFSSouth.gbda(rc, target, dir.opposite());
                break;
            case NORTHEAST:
                cdir= BFSNorthEast.gbda(rc, target, dir.opposite());
                break;
            case NORTHWEST:
                cdir= BFSNorthWest.gbda(rc, target, dir.opposite());
                break;
            case SOUTHEAST:
                cdir= BFSSouthEast.gbda(rc, target, dir.opposite());
                break;
            default:
                cdir= BFSSouthWest.gbda(rc, target, dir.opposite());
                break;
        }
        
        if(cdir!=null&&rc.canMove(cdir)) {
        	rc.move(cdir);
            dir = cdir;
        }
        
    	if (!attacked && tempTarget != null) {
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
    			String message = "0001" + currentBits.substring(4, 16);
    	        rc.writeSharedArray(8, Integer.parseInt(message, 2));
    	        target = null;
    	        init0000();
        	}
        }
        turnCount++;
	}
	boolean assess(RobotInfo[] friendly, RobotInfo[] enemies) {
		int fTotal = 0, eSTotal = 0, eVTotal = 0;
		for (int i=0; i<friendly.length; i++) {
			if (friendly[i].type == RobotType.ARCHON) {
				fTotal += 10;
			}
			else if (friendly[i].type == RobotType.SOLDIER) {
				fTotal += 2;
			}
			else if (friendly[i].type == RobotType.SAGE) {
				fTotal += 4;
			}
		}
		for (int i=0; i<enemies.length; i++) {
			if (enemies[i].type == RobotType.ARCHON) {
				eVTotal += 5;
			}
			else if (enemies[i].type == RobotType.SOLDIER) {
				eSTotal += 2;
			}
			else if (enemies[i].type == RobotType.SAGE) {
				eVTotal += 4;
			}
		}
		if (fTotal > (eSTotal+eVTotal/2)) {
			return true;
		}
		if (eSTotal <= 2 && eVTotal > 0 && eVTotal <= 5) {
			return true;
		}
		return false;
	}
	void repair() throws GameActionException {
		if (!setRepair) {
			int closestDist = Integer.MAX_VALUE;
			int leastOccupancy = Integer.MAX_VALUE;
			int repairIndex = -1;
			for (int i=4; i<(4+rc.getArchonCount()); i++) {
				String s = Comms.getIndex(rc, i);
				int occupancy = Integer.parseInt(s.substring(12, 16));
				if (Math.abs(leastOccupancy-occupancy) <= 2) {
					int aX = Utility.bitToNum(s.substring(0, 4))*4, aY = Utility.bitToNum(s.substring(4, 8))*4;
					MapLocation aPos = new MapLocation(aX, aY);
					int dist = Utility.distance(me, aPos);
					if (dist < closestDist) {
						closestDist = dist;
						leastOccupancy = occupancy;
						repair = aPos;
					}
				}
				else if (occupancy < leastOccupancy) {
					int aX = Utility.bitToNum(s.substring(0, 4))*4, aY = Utility.bitToNum(s.substring(4, 8))*4;
					MapLocation aPos = new MapLocation(aX, aY);
					int dist = Utility.distance(me, aPos);
					closestDist = dist;
					leastOccupancy = occupancy;
					repair = aPos;
					repairIndex = i;
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
                cdir= BFSNorth.gbda(rc, repair, dir.opposite());
                break;
            case EAST:
                cdir= BFSEast.gbda(rc, repair, dir.opposite());
                break;
            case WEST:
                cdir= BFSWest.gbda(rc, repair, dir.opposite());
                break;
            case SOUTH:
                cdir= BFSSouth.gbda(rc, repair, dir.opposite());
                break;
            case NORTHEAST:
                cdir= BFSNorthEast.gbda(rc, repair, dir.opposite());
                break;
            case NORTHWEST:
                cdir= BFSNorthWest.gbda(rc, repair, dir.opposite());
                break;
            case SOUTHEAST:
                cdir= BFSSouthEast.gbda(rc, repair, dir.opposite());
                break;
            default:
                cdir= BFSSouthWest.gbda(rc, repair, dir.opposite());
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
		
		RobotInfo[] nearby = rc.senseNearbyRobots(20, opponent.opponent());
		String myArchon = "";
		for (int i=0; i<nearby.length; i++) {
			if (nearby[i].type == RobotType.ARCHON) {
				if (Utility.distance(nearby[i].location, rc.getLocation()) < closeArchon) {
					closeArchon = Utility.distance(nearby[i].location, rc.getLocation());
					myArchon = Utility.numToBit8(nearby[i].ID);
				}
			}
		}
		for (int i=0; i<rc.getArchonCount(); i++) {
			String s = Comms.getIndex(rc, i);
			if (s.substring(0, 8).equals(myArchon)) {
				task = s.substring(8);
				break;
			}
		}
		
		switch (task) {
			case "00010000": init0000(); break;
			default: init0000(); break;
		}
	}
	void init0000() throws GameActionException {
		String s = Comms.getIndex(rc, 8);
		int tX = Utility.bitToNum(s.substring(4, 10)), tY = Utility.bitToNum(s.substring(10, 16));
		MapLocation tPos = new MapLocation(tX, tY);
		archonTarget = tPos;
	}
}
class RobotInfoComparator implements Comparator<RobotInfo> {
    public int compare(RobotInfo a, RobotInfo b){
        return a.getHealth() - b.getHealth();
    }
}
