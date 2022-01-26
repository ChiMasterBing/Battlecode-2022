package Pathfinding;

 import java.util.Random;

import java.util.*;

 import battlecode.common.*;

public class Archon extends Robot{
	int turnCount = 0, soldCount = 0;
	int archonCount, mapWidth, mapHeight, remain;
	int curTar = 0, repairTar = -1;
	int myID, myIndex, myHealth;
	boolean init = true, builtRobot = false;
	String prefix;
	ArrayList<MapLocation> spawnZones, possibleArchon, myArchon;
	MapLocation home;
	RobotController rc;
	//fix danger
	public Archon(RobotController rc) throws GameActionException {
		this.rc = rc;
	}
	public void run() throws GameActionException {
		turnCount = rc.getRoundNum();
		if(rc.getRoundNum()>2000){
			rc.resign();
		}
		builtRobot = false;
		if (init) {
			init = false;
			init();
		}
		verbose();

		if (turnCount >= 2) {
			check();
		}
		if (turnCount == 2) {
			calculateArchons();
		}
		checkRubble();

		RobotInfo[] enemy = rc.senseNearbyRobots(34, rc.getTeam().opponent());
		int bad = 0;
		for (int i=0; i<enemy.length; i++) {
			if (enemy[i].type != RobotType.MINER && enemy[i].type != RobotType.BUILDER) {
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
		if (turnCount > 1 && scouted < 4 && !panic) {
			if(rc.getTeam()== Team.A) {
				System.out.println("HERE???????");
			}
			scout();
		}
		if (turnCount == 20 && myIndex == 0) {
			for (int i=12; i<16; i++) {
				rc.writeSharedArray(i, 0);
			}
		}
		if (scouted >= 4 || panic) {
			int danger = 0;
			for (int i=4; i<archonCount+4; i++) {
				String s = Comms.getIndex(rc, i);
				if (s.substring(8, 12).equals("0001")) {
					if (i != myIndex+4) {
						danger++;
					}
				}
			}
			if (danger == 0) {
				if (soldCount < 100 || panic) {
					attack();
				}
				else {
					wanderingMiner();
				}
			}
		}
		String s = Comms.getIndex(rc, 8);
		if (myIndex == 0) {
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
					rc.writeSharedArray(8, Integer.parseInt(message, 2));
				}
			}

		}
		//implement defensive procedures && efficient lead farming
		if (!builtRobot) {
			repair();
		}
		turnCount++;
	}
	int scouted = 0;
	boolean active = false;
	char lastTurn[];
	boolean panic = false;
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
	void checkRubble() throws GameActionException {
		MapLocation me = rc.getLocation();
		int myRubble = rc.senseRubble(me);
		MapLocation[] locs = rc.getAllLocationsWithinRadiusSquared(me, 34);
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
		}
	}
	void repair() throws GameActionException {
		int occupancy = 0;
		boolean repaired = false;
		RobotInfo[] friendly = rc.senseNearbyRobots(-1, rc.getTeam());
		for (int i=0; i<friendly.length; i++) {
			if ((friendly[i].type == RobotType.SAGE||friendly[i].type == RobotType.SOLDIER) && friendly[i].getHealth() < 45) {
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
			boolean sage = false;
			for (int i=0; i<friendly.length; i++) {
				if (rc.canRepair(friendly[i].location) && friendly[i].type == RobotType.SAGE) {
					if (friendly[i].getHealth() < minHealth && friendly[i].getHealth() <= 50) {
						//rc.repair(friendly[i].location);
						repairTar = friendly[i].getID();
						repaired = true;
						sage = true;
						minHealth = friendly[i].getHealth();
					}
				}
//				else if(!sage&&rc.canRepair(friendly[i].location) && friendly[i].type == RobotType.SOLDIER){
//					repairTar = friendly[i].getID();
//					repaired = true;
//					minHealth = friendly[i].getHealth();
//
//				}
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
	void attack() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.SAGE, dir)) {
				int output;
				output = Integer.parseInt(prefix + "00010000", 2);
				rc.writeSharedArray(myIndex, output);
				rc.buildRobot(RobotType.SAGE, dir);
				builtRobot = true;
				soldCount++;
				break;
			}
//			else if (rc.canBuildRobot(RobotType.SOLDIER, dir)) {
//				int output;
//				output = Integer.parseInt(prefix + "00010000", 2);
//				rc.writeSharedArray(myIndex, output);
//				rc.buildRobot(RobotType.SOLDIER, dir);
//				builtRobot = true;
//				soldCount++;
//				break;
//			}
		}
	}
	void wanderingMiner() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.MINER, dir)) {
				int output;
				output = Integer.parseInt(prefix + "00000111", 2);
				rc.writeSharedArray(myIndex, output);
				//rc.buildRobot(RobotType.MINER, dir);
				builtRobot = true;
				soldCount = 0;
				break;
			}
		}
	}
	void calculateArchons() throws GameActionException {
		myArchon = new ArrayList<MapLocation>();
		possibleArchon = new ArrayList<MapLocation>();
		for (int i=12; i<rc.getArchonCount()+12; i++) {
			String s = Comms.getIndex(rc, i);
			int aX = Utility.bitToNum(s.substring(0, 8)), aY = Utility.bitToNum(s.substring(8, 16));
			MapLocation aPos = new MapLocation(aX, aY);
			myArchon.add(aPos);

			possibleArchon.add(new MapLocation(mapWidth - aX, mapHeight - aY));
			possibleArchon.add(new MapLocation(aX, mapHeight - aY));
			possibleArchon.add(new MapLocation(mapWidth - aX, aY));
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
				if(rc.getTeam()==Team.A) {
					System.out.println(dir);
				}
				int output;
				if (scouted == 0) {
					output = Integer.parseInt(prefix + "00000011", 2);
				}
				else if (scouted == 1) {
					output = Integer.parseInt(prefix + "00000100", 2);
				}
				else if (scouted == 2){
					output = Integer.parseInt(prefix + "00000101", 2);
				}
				else {
					output = Integer.parseInt(prefix + "00000110", 2);
				}
				rc.writeSharedArray(myIndex, output);
				scouted++;
				//rc.buildRobot(RobotType.MINER, dir);
				builtRobot = true;
				break;
			}
		}
	}
	void init() throws GameActionException {
		if(rc.getRoundNum()>10){
			System.out.println("INIT probelm");
			rc.resign();
		}
		MapLocation me = rc.getLocation();
		home = me;
		archonCount = rc.getArchonCount();
		remain = archonCount;
		mapWidth = rc.getMapWidth();
		mapHeight = rc.getMapHeight();
		myID = rc.getID();
		myHealth = rc.getHealth();
		lastTurn = new char[archonCount];
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
		MapLocation[] temp = rc.senseNearbyLocationsWithLead();
		for (int i=0; i<temp.length; i++) { //find guaranteed lead
			Comms.write(CommConstants.HAS_LEAD, rc);
		}

		spawnZones = Utility.leastRubbleAround(rc, me);

		for (int i=0; i<8; i++) {
			Direction dir = me.directionTo(spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.BUILDER, dir)) {
				System.out.println("ok boomer " + myIndex);
				rc.buildRobot(RobotType.BUILDER, dir);
				int output = Integer.parseInt(prefix + "00000010", 2);
				rc.writeSharedArray(myIndex, output);
				break;
			}
		}

		String exactCoord = Utility.numToBit8(me.x) + Utility.numToBit8(me.y);
		rc.writeSharedArray(myIndex+12, Integer.parseInt(exactCoord, 2));
		String nonExactCoord = Utility.numToBit(me.x/4) + Utility.numToBit(me.y/4);
		rc.writeSharedArray(myIndex+4, Integer.parseInt(nonExactCoord + "00000000", 2));
	}
}
