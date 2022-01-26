package baller;
import java.util.Random;

import java.util.*;
import battlecode.common.*;
public class Archon extends Robot{
	int turnCount = 0, soldCount = 0, mineCount = 0;
	int archonCount, mapWidth, mapHeight, remain;
	int curTar = 0, repairTar = -1;
	int criticalValue = 0;
    int myID, myIndex, myHealth, myMiners;
    int wond = 0;
	boolean init = true, builtRobot = false;
	String prefix;
    ArrayList<MapLocation> spawnZones, possibleArchon, myArchon;
    MapLocation home;
    RobotController rc;
    int needed = 2;
    boolean strategy = false;
    boolean builderSpawned = false;
	public Archon(RobotController rc) throws GameActionException {
		this.rc = rc;
	}
	public void run() throws GameActionException {
		builtRobot = false;
		if (init) {
			init = false;
			init();
		}
		verbose();
		MapLocation me = rc.getLocation();
		String nonExactCoord = Utility.numToBit(me.x/4) + Utility.numToBit(me.y/4);
		rc.writeSharedArray(myIndex+4, Integer.parseInt(nonExactCoord + "00000000", 2));
		
		if (rc.readSharedArray(14) < mineCount) {
			needed += mineCount - rc.readSharedArray(14);
			mineCount = rc.readSharedArray(14);
		}
		else {
			mineCount = rc.readSharedArray(14);
		}
		
		
		
		if (turnCount >= 2) {
			check();
		}
		if (turnCount == 2) {
			checkRubble(34);
			calculateArchons();
		}
		if (myMiners < ((mapWidth*mapHeight)/180)/archonCount && !panic) {
			wanderingMiner();
		}
	
		RobotInfo[] enemy = rc.senseNearbyRobots(34, rc.getTeam().opponent());
		int bad = 0;
		for (int i=0; i<enemy.length; i++) {
			if (enemy[i].type != RobotType.BUILDER) {
				bad++;
			}
		}
		if (bad > 0 && bad < 20) {	
			myHealth = rc.getHealth();
			panic = true;
			panic(0);
		}
		else {
			panic(1);
			panic = false;
		}
		
		if (myIndex == 0) {
			processTargetting();
		}
		if (aggroActive) {
			aggro();
		}
		
		
		
		if (!foundTarget) {
			checkRubble(34);
			if (home.x != rc.getLocation().x && home.y != rc.getLocation().y) {
				move();
			}
			else {
				if (mode) {
					if (rc.canTransform()) {
						rc.transform();
						spawnZones = Utility.leastRubbleAround(rc, rc.getLocation());
						mode = false;
					}
				}
			}
		}

		if (turnCount == 20 && myIndex == 0) {
			for (int i=12; i<16; i++) {
				rc.writeSharedArray(i, 0);
			}
		}
		
		if (strategy) {
			int danger = 0, danger2 = 0;
			for (int i=4; i<archonCount+4; i++) {
				String s = Comms.getIndex(rc, i);
				if (s.substring(8, 12).equals("0001")) {
					if (i != myIndex+4) {
						danger++;
					}
					danger2++;
				}
			}
			if (danger == 0 || (danger2 >= 2 && myIndex == 0)) {
				if (soldCount < 3 || panic) {
					attack();
				}
				else {
					if (needed > 0) {
						wanderingMiner();
						needed--;
					}
					else {
						sweep();
					}
				}
			}
		}
		else {
			if (rc.getTeamLeadAmount(rc.getTeam()) > 100) {
				if (myIndex == 0) {
					if (!builderSpawned || rc.getTeamLeadAmount(rc.getTeam()) > 500) {
						for (int i=0; i<spawnZones.size(); i++) {
							Direction dir = me.directionTo(spawnZones.get(i));
							if (rc.canBuildRobot(RobotType.BUILDER, dir)) {
								rc.buildRobot(RobotType.BUILDER, dir);
								builtRobot = true;
								builderSpawned = true;
								break;
							}
						}
					}
				}
			}
			if (builderSpawned) {
				if (soldCount < 3 || panic) {
					attack();
				}
				else {
					if (needed > 0) {
						wanderingMiner();
						needed--;
					}
					else {
						sweep();
					}
				}
			}
		}
		if (!builtRobot) {
			repair();
		}
		turnCount++;
	}
	int scouted = 0;
	boolean active = false;
	char lastTurn[];
	boolean panic = false;
	String attPrefix = "0000";
	void wanderingMiner() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.MINER, dir)) {
				int output;
				output = Integer.parseInt(prefix + "00000111", 2);
				rc.writeSharedArray(myIndex, output);
				rc.buildRobot(RobotType.MINER, dir);
				builtRobot = true;
				soldCount = 0;
				myMiners++;
				break;
			}
		}
	}
	void sweep() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.MINER, dir)) {
				int output;
				output = Integer.parseInt(prefix + "00001000", 2);
				rc.writeSharedArray(myIndex, output);
				rc.buildRobot(RobotType.MINER, dir);
				builtRobot = true;
				soldCount = 0;
				myMiners++;
				break;
			}
		}
	}
	void processTargetting() throws GameActionException {
		String sc = Comms.getIndex(rc, 9);
		int soldCount = Integer.parseInt(sc.substring(4, 16), 2);
		
		if (soldCount >= criticalValue) {
			attPrefix = "1000";
		}
		
		String s = Comms.getIndex(rc, 8);
		if (s.substring(0, 4).equals("0001")) {
			nextTarget();
		}
		else if (s.substring(0, 4).equals("0010")) {
			remain--;
			nextTarget();
		}
		else if (s.substring(0, 4).equals("0011")) {
			//System.out.println("override " + turnCount);
			if (active) {
				curTar--;
				active = false;
				int current = rc.readSharedArray(8);
				String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
				String message = "0000" + s.substring(4, 16);
		        //rc.writeSharedArray(8, Integer.parseInt(message, 2));
			}
		}
	}
	boolean foundTarget = false, arrived = false, stopped = false, set = false;
	void aggro() throws GameActionException {
		String s = Comms.getIndex(rc, 8);
		if (s.substring(0, 4).equals("0011") && !arrived) {
			foundTarget = true;
			home = new MapLocation(Utility.bitToNum(s.substring(4, 10)), Utility.bitToNum(s.substring(10, 16)));
			RobotInfo[] friendly = rc.senseNearbyRobots(34, rc.getTeam());
			RobotInfo[] enemies = rc.senseNearbyRobots(34, rc.getTeam().opponent());
			if (enemies.length > 0) {
				stopped = true;
				checkRubble(3);
			}
			else {
				stopped = false;
			}
			if (Utility.distance(home, rc.getLocation()) < 8) {
				arrived = true;
			}
			if (!arrived && !stopped) {
				move();
			}
		}
		if (!s.substring(0, 4).equals("0011")) {
			arrived = false;
			foundTarget = false;
			set = false;
		}
		if (arrived || stopped) {
			checkRubble(3);
			if (home.x != rc.getLocation().x && home.y != rc.getLocation().y && !set) {
				move();
			}
			else {
				set = true;
				if (mode) {
					if (rc.canTransform()) {
						rc.transform();
						spawnZones = Utility.leastRubbleAround(rc, rc.getLocation());
						mode = false;
					}
				}
			}
			if (rc.getMode() == RobotMode.TURRET) {
				if (soldCount < 5) {
					rc.setIndicatorString("ballin");
					attack();
				}
				else {
					sweep(); 
				}
			}
		}
	}
	void attack() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			rc.setIndicatorString(String.valueOf(rc.isActionReady()));
			if (rc.canBuildRobot(RobotType.SAGE, dir)) {
				int output;
				output = Integer.parseInt(prefix + "00010000", 2);
				rc.writeSharedArray(myIndex, output);
				rc.buildRobot(RobotType.SAGE, dir);
				builtRobot = true;
				soldCount++;
				break;
			}
			if (strategy || rc.getTeamLeadAmount(rc.getTeam()) > 181) {
				if (rc.canBuildRobot(RobotType.SOLDIER, dir)) {
					rc.buildRobot(RobotType.SOLDIER, dir);
					int output;
					output = Integer.parseInt(prefix + "00010000", 2);
					rc.writeSharedArray(myIndex, output);
					builtRobot = true;
					soldCount++;
					break;
				}
			}
		}
	}
	boolean assess(RobotInfo[] friendly, RobotInfo[] enemies) {
		int fTotal = 2, eSTotal = 0, eVTotal = 0;
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
	void panic(int par) throws GameActionException {
		if (par == 0) {
			String s = Comms.getIndex(rc, myIndex+4);
			//RobotInfo[] enemies = rc.senseNearbyRobots(34, rc.getTeam().opponent());
			String message = s.substring(0, 8) + "0001" + s.substring(12, 16);
			rc.writeSharedArray(myIndex+4, Integer.parseInt(message, 2));
		}
		else {
			String s = Comms.getIndex(rc, myIndex+4);
			//RobotInfo[] enemies = rc.senseNearbyRobots(34, rc.getTeam().opponent());
			String message = s.substring(0, 8) + "0000" + s.substring(12, 16);
			rc.writeSharedArray(myIndex+4, Integer.parseInt(message, 2));
		}
	}
	void check() throws GameActionException {
		String s = Comms.getIndex(rc, 9);
		for (int i=0; i<lastTurn.length; i++) {
			char temp = s.charAt(i);
			if (lastTurn[i] == temp && rc.getArchonCount() != archonCount) { //death
				System.out.println("death :(");
				archonCount = rc.getArchonCount();
				if (myIndex > i) {
					myIndex--;
				}
			}
			lastTurn[i] = s.charAt(i);
		}
	}
	void verbose() throws GameActionException {
		String s = Comms.getIndex(rc, 9);
		char nextChar;
		if (s.charAt(myIndex) == '0') {
			nextChar = '1';
		}
		else {
			nextChar = '0';
		}
		StringBuilder string = new StringBuilder(s);
        string.setCharAt(myIndex, nextChar);
        rc.writeSharedArray(9, Integer.parseInt(string.toString(), 2));
	}
	void checkRubble(int radius) throws GameActionException {
		MapLocation me = rc.getLocation();
		int myRubble = rc.senseRubble(me);
		MapLocation[] locs = rc.getAllLocationsWithinRadiusSquared(me, radius);
		for (int i=0; i<locs.length; i++) {
			int tempRubble = rc.senseRubble(locs[i]) + Utility.distance(locs[i],me)/2;
			if (tempRubble < myRubble) {
				myRubble = tempRubble;
				home = locs[i];
			}
		}
	}
	boolean mode = false;
	Direction dir = Direction.CENTER;
	void move() throws GameActionException {
		if (!mode) {
			if (rc.canTransform()) {
				rc.transform();
				mode = true;
			}
			prefix = Utility.numToBit(home.x/4) + Utility.numToBit(home.y/4);
			int output = Integer.parseInt(prefix + "00000001", 2);
			rc.writeSharedArray(myIndex, output);
		}
		else {
			Direction cur = rc.getLocation().directionTo(home);
	        Direction cdir;
	        switch(cur){
	            case NORTH:
	                cdir=BFSNorth.gbda(rc, home, dir.opposite());
	                break;
	            case EAST:
	                cdir=BFSEast.gbda(rc, home, dir.opposite());
	                break;
	            case WEST:
	                cdir=BFSWest.gbda(rc, home, dir.opposite());
	                break;
	            case SOUTH:
	                cdir=BFSSouth.gbda(rc, home, dir.opposite());
	                break;
	            case NORTHEAST:
	                cdir=BFSNorthEast.gbda(rc, home, dir.opposite());
	                break;
	            case NORTHWEST:
	                cdir=BFSNorthWest.gbda(rc, home, dir.opposite());
	                break;
	            case SOUTHEAST:
	                cdir=BFSSouthEast.gbda(rc, home, dir.opposite());
	                break;
	            default:
	                cdir=BFSSouthWest.gbda(rc, home, dir.opposite());
	                break;
	        }
	        if(cdir!=null&&rc.canMove(cdir)) {
	        	rc.move(cdir);
	            dir = cdir;
	        }
	        MapLocation me = rc.getLocation();
	        String nonExactCoord = Utility.numToBit(me.x/4) + Utility.numToBit(me.y/4);
			rc.writeSharedArray(myIndex+4, Integer.parseInt(nonExactCoord + "00000000", 2));
		}
	}
	void repair() throws GameActionException {
		int occupancy = 0;
		boolean repaired = false;
		RobotInfo[] friendly = rc.senseNearbyRobots(20, rc.getTeam());
		for (int i=0; i<friendly.length; i++) {
			if (friendly[i].type == RobotType.SOLDIER && friendly[i].getHealth() < 45) {
				occupancy++;
			}
		}
		if (repairTar != -1) {
			for (int i=0; i<friendly.length; i++) {
				if (friendly[i].getID() == repairTar) {
					while (rc.canRepair(friendly[i].location)) {
						rc.repair(friendly[i].location);
						repaired = true;
					}
				}
			}
			if (!repaired) {
				repairTar = -1;
			}
			else {
				return;
			}
		}
		if (repairTar == -1) {
			int minHealth = Integer.MAX_VALUE;
			for (int i=0; i<friendly.length; i++) {
				if (rc.canRepair(friendly[i].location) && friendly[i].type == RobotType.SOLDIER) {
					if (friendly[i].getHealth() < minHealth && friendly[i].getHealth() <= 47) {
						//rc.repair(friendly[i].location);
						repairTar = friendly[i].getID();
						repaired = true;
						minHealth = friendly[i].getHealth();
					}
				}
			}
		}
		String s = Comms.getIndex(rc, myIndex+4);
		String bits = s.substring(0, 12) + Utility.numToBit(Math.min(15, occupancy));
		rc.writeSharedArray(myIndex+4, Integer.parseInt(bits, 2));
	}
	void nextTarget() throws GameActionException {
		curTar++;
		if (curTar >= possibleArchon.size()) {
			curTar = 0;
		}
		//System.out.println(possibleArchon.get(curTar) + " " + curTar);
		if (myIndex == 0 && curTar < possibleArchon.size()) {
			int current = rc.readSharedArray(8);
			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
			String message = "0000" + Utility.numToBit6(possibleArchon.get(curTar).x) + Utility.numToBit6(possibleArchon.get(curTar).y);
	        rc.writeSharedArray(8, Integer.parseInt(message, 2));
	        active = true;
		}
		
	}
	boolean aggroActive = false;
	void calculateArchons() throws GameActionException {
		myArchon = new ArrayList<MapLocation>();
		possibleArchon = new ArrayList<MapLocation>();
		int totalDistance = 0;
		for (int i=12; i<rc.getArchonCount()+12; i++) {
			String s = Comms.getIndex(rc, i);
			int aX = Utility.bitToNum(s.substring(0, 8)), aY = Utility.bitToNum(s.substring(8, 16));
			MapLocation aPos = new MapLocation(aX, aY);
			myArchon.add(aPos);
			totalDistance += Utility.distance(rc.getLocation(), aPos);
	
			possibleArchon.add(new MapLocation(mapWidth - aX, mapHeight - aY));
			possibleArchon.add(new MapLocation(aX, mapHeight - aY));
			possibleArchon.add(new MapLocation(mapWidth - aX, aY));
		}
		if (totalDistance < 10) {
			aggroActive = true;
		}
		for (int i=0; i<possibleArchon.size(); i++) {
			for (int j=i+1; j<possibleArchon.size(); j++) {
				if (possibleArchon.get(i).x == possibleArchon.get(j).x && possibleArchon.get(i).y == possibleArchon.get(j).y) {
					possibleArchon.remove(j);
					j--;
				}
			}
		}
		if (myIndex == 0) {
			int current = rc.readSharedArray(8);
			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
			String message = currentBits.substring(0, 4) + Utility.numToBit6(possibleArchon.get(0).x) + Utility.numToBit6(possibleArchon.get(0).y);
	        rc.writeSharedArray(8, Integer.parseInt(message, 2));
	        active = true;
		}
	
	}
	void scout() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.MINER, dir)) {
				int output = Integer.parseInt(prefix + "00000011", 2);
				rc.writeSharedArray(myIndex, output);
				scouted++;
				rc.buildRobot(RobotType.MINER, dir);
				builtRobot = true;
				myMiners++;
				break;
			}
		}
	}
	void beginMine() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.MINER, dir)) {
				int output = Integer.parseInt(prefix + "00000010", 2);
				rc.writeSharedArray(myIndex, output);
				rc.buildRobot(RobotType.MINER, dir);
				builtRobot = true;
				break;
			}
		}
	}
	void mine() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.MINER, dir)) {
				int output = Integer.parseInt(prefix + "00000010", 2);
				rc.writeSharedArray(myIndex, output);
				rc.buildRobot(RobotType.MINER, dir);
				builtRobot = true;
				myMiners++;
				break;
			}
		}
	}
	void init() throws GameActionException {
		MapLocation me = rc.getLocation();
		home = me;
		archonCount = rc.getArchonCount();
		remain = archonCount;
		mapWidth = rc.getMapWidth();
		mapHeight = rc.getMapHeight();
		myID = rc.getID();
		myHealth = rc.getHealth();
		myMiners = 0;
		lastTurn = new char[archonCount];
		criticalValue = (mapWidth*mapHeight)/30;
		
        Comms.encodeAndWrite(Comms.scan(rc, CommConstants.SCAN_ENEMY | CommConstants.SCAN_LEAD), rc);
		
		for (int i=0; i<4; i++) {
			//System.out.println(rc.readSharedArray(i) + " " + i);
			if (rc.readSharedArray(i) != 0) {
				continue;
			}
			else {
				prefix = Utility.numToBit8(myID);
				int output = Integer.parseInt(prefix + "00000001", 2);
				rc.writeSharedArray(i, output);
				myIndex = i;
				break;
			}
		}
		/*
		MapLocation[] temp = rc.senseNearbyLocationsWithLead();
		for (int i=0; i<temp.length; i++) { //find guaranteed lead
			Comms.write("0001", rc, temp[i]);
		}
		*/
		spawnZones = Utility.leastRubbleAround(rc, me);
		
		beginMine();
		
		String exactCoord = Utility.numToBit8(me.x) + Utility.numToBit8(me.y);
		rc.writeSharedArray(myIndex+12, Integer.parseInt(exactCoord, 2));
		String nonExactCoord = Utility.numToBit(me.x/4) + Utility.numToBit(me.y/4);
		rc.writeSharedArray(myIndex+4, Integer.parseInt(nonExactCoord + "00000000", 2));
	}
}
