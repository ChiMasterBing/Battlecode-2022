package baller;
import java.util.*;
import java.util.Random;
import battlecode.common.*;
public class Miner extends Robot{
    final Random rng = new Random(6147);
    final Direction[] directions = {
        Direction.NORTH,
        Direction.NORTHEAST,
        Direction.EAST,
        Direction.SOUTHEAST,
        Direction.SOUTH,
        Direction.SOUTHWEST,
        Direction.WEST,
        Direction.NORTHWEST,
    };
    int turnCount = 0;
    int bestLead = 0;
    String task;
    RobotController rc;
    boolean arrived = false;
    MapLocation me, target, nextTarget;
    boolean init = true;
    Direction dir = Direction.CENTER;
	public Miner(RobotController rc) throws GameActionException {
		this.rc = rc;
	}
	public void run() throws GameActionException {
		if (arrived) {
			rc.setIndicatorString("daniel cracked");
		}
		
		me = rc.getLocation();
		if (init) {
			init();
			init = false;
		}
		if (!arrived) {
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
	        
	        if (Utility.distance(target, me) <= 1) {    	
	        	arrived = true;
	        }
	        
	        Information info = Comms.scan(rc, 3);
	        Comms.write(Comms.encode(info), rc, me);
	        if (info.lead > bestLead) {
	        	bestLead = info.lead;
	        	nextTarget = me;
	        }
	        
	        return;
		}
		else { 	
			if (task.equals("00000011") || task.equals("00000100") || task.equals("00000101") || task.equals("00000110")) {
				if (nextTarget != null) {
					arrived = false;
					target = nextTarget;
					task = "00000010";
				}
			}
			else if (task.equals("00000010")) {
				MapLocation[] leadDep = rc.senseNearbyLocationsWithLead(2);
				rc.setIndicatorString(String.valueOf(leadDep.length));
				if (leadDep.length == 0) { //note to self, improve this
					MapLocation[] leadDep2 = rc.senseNearbyLocationsWithLead();
					if (leadDep2.length > 0) {
						Direction dir = BFSBuilder.getBestDir(rc, leadDep2[0]);
						if (rc.canMove(dir)) {
							rc.move(dir);
						}
					}
					else {
						init0010();
						arrived = false;
					}
				}
				else if (leadDep.length > 0) {
					for (int i=0; i<leadDep.length; i++) {        
						MapLocation mineLocation = leadDep[i];
				        if (rc.canSenseLocation(mineLocation)) {
				           int lead = rc.senseLead(mineLocation); 
				           int minedCount = 0;
				           while (rc.canMineLead(mineLocation) && lead-minedCount > 1) {
				              rc.mineLead(mineLocation);
				              minedCount++;
				           }
				           //self[mineLocation.x][mineLocation.y].updateLead(lead-minedCount);
				        }
					}    
					int availableLead = 0, rubble = 0;
					int value = -1;
					int chosenX = 0, chosenY = 0;
					for (int dx = -1; dx <= 1; dx++) {
				        for (int dy = -1; dy <= 1; dy++) {
				        	availableLead = 0;
				        	boolean invalid = false;
				        	for (int ddx = -1; ddx <= 1; ddx++) {
						        for (int ddy = -1; ddy <= 1; ddy++) {
						        	MapLocation senseLocation = new MapLocation(me.x+dx+ddx,me.y+dy+ddy);
						        	if (rc.canSenseLocation(senseLocation)) {
						        		availableLead += rc.senseLead(senseLocation);
						        	}
						        	if (ddx == 0 && ddy == 0 && !rc.canSenseLocation(senseLocation)) {
						        		invalid = true;
						        	}
						        }
				        	}
				        	if (invalid) {
				        		continue;
				        	}
				        	rubble = rc.senseRubble(me);
				        	int tempValue;
				        	if (dx == 0 && dy == 0 && availableLead > 30) {
				        		tempValue = (int)(leadPerTurn(rubble)*20);
				        	}
				        	else {
				        		tempValue = Math.min((int)(leadPerTurn(rubble)*20), availableLead);
				        	}
				        	if (dx == 0 && dy == 0 && tempValue >= value) {
				        		value = tempValue;
				        		chosenX = dx;
				        		chosenY = dy;
				        	}
				        	else if (tempValue > value) {
				        		value = tempValue;
				        		chosenX = dx;
				        		chosenY = dy;
				        	}
				        }
					}
					for (int i=0; i<directions.length; i++) {
						if (chosenX == directions[i].getDeltaX() && chosenY == directions[i].getDeltaY()) {
							if (rc.canMove(directions[i])) {
								rc.move(directions[i]);
							}
						}
					}
				}
			}
		}
		//rc.setIndicatorString(task);
        turnCount++;
	}
	void init() throws GameActionException {
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
		//System.out.println(closeArchon);
		//System.out.println(task);
		rc.setIndicatorString(task);
		switch (task) {
			case "00000010": init0010(); break;
			case "00000011": initScout(Direction.NORTH); break;
			case "00000100": initScout(Direction.EAST); break;
			case "00000101": initScout(Direction.SOUTH); break;
			case "00000110": initScout(Direction.WEST); break;
			default: rc.disintegrate(); break;
		}
	}
	void initScout(Direction dir) {
		if (dir == Direction.NORTH) {
			target = new MapLocation(me.x, rc.getMapHeight()-1);
		}
		else if (dir == Direction.EAST) {
			target = new MapLocation(rc.getMapWidth()-1, me.y);
		}
		else if (dir == Direction.SOUTH) {
			target = new MapLocation(me.x, 0);
		}
		else  {
			target = new MapLocation(0, me.y);
		}
	}
	void init0010() throws GameActionException {
		int minDist = Integer.MAX_VALUE;
		for (int i=63; i>=8; i--) {
			String s = Comms.getIndex(rc, i);
			for (int j=0; j<4; j++) {
				String bytes = "";
				for (int k=0; k<4; k++) {
					bytes += s.charAt(j*4+k);
				}
				if (bytes.equals("0001") || bytes.equals("0002")) {
					MapLocation tempTarget = Utility.zonePosToMapPos(Comms.getZonePosition(i, j*4));
					int dist = Utility.distance(tempTarget, me);
					if (dist < minDist) {
						minDist = dist;
						target = tempTarget;
					}
				}
			}
		}
		//System.out.println(target.x + " " + target.y);
	}
	double leadPerTurn(int rubble) {
		return (50)/(10+rubble);
	}
}
