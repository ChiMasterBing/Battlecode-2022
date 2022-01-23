package baller;
import java.util.Random;
import java.util.*;
import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;
import battlecode.common.RobotInfo;
import battlecode.common.RobotType;
public class Archon extends Robot{
	int turnCount = 0;
	int archonCount, mapWidth, mapHeight, remain;
	int curTar = 0;
    int myID, myIndex;
	boolean init = true;
	String prefix;
    ArrayList<MapLocation> spawnZones, possibleArchon, myArchon;
    RobotController rc;
	public Archon(RobotController rc) throws GameActionException {
		this.rc = rc;
	}
	public void run() throws GameActionException {
		if (init) {
			init = false;
			init();
		}
		if (turnCount == 2) {
			calculateArchons();
		}
		if (turnCount > 1 && scouted < 4) {
			scout();
		}
		if (scouted >= 4) {
			attack();
		}
		
		String s = Comms.getIndex(rc, 7);
		if (myIndex == 0) {
			if (s.substring(4, 8).equals("0001")) {
				nextTarget();
			}
			else if (s.substring(4, 8).equals("0010")) {
				remain--;
				nextTarget();
			}
			else if (s.substring(4, 8).equals("0011")) {
				if (active) {
					curTar--;
					active = false;
				}
				int current = rc.readSharedArray(7);
				String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
				String message = currentBits.substring(0, 4) + "0000" + s.substring(8, 16);
		        rc.writeSharedArray(7, Integer.parseInt(message, 2));
			}
		}
		//implement defensive procedures && efficient lead farming
		
		
		rc.setIndicatorString(String.valueOf(myIndex));
		turnCount++;
	}
	int scouted = 0;
	boolean active = false;
	void nextTarget() throws GameActionException {
		curTar++;
		if (myIndex == 0 && curTar < possibleArchon.size()) {
			int current = rc.readSharedArray(7);
			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
			String message = currentBits.substring(0, 4) + "0000" + Utility.numToBit(possibleArchon.get(curTar).x/4) + Utility.numToBit(possibleArchon.get(curTar).y/4);
	        rc.writeSharedArray(7, Integer.parseInt(message, 2));
	        active = true;
		}
		
	}
	void attack() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = Utility.getDirection(me, spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.SOLDIER, dir)) {
				int output;
				output = Integer.parseInt(prefix + "00010000", 2);
				rc.writeSharedArray(myIndex, output);
				rc.buildRobot(RobotType.SOLDIER, dir);
				break;
			}
		}
	}
	void calculateArchons() throws GameActionException {
		myArchon = new ArrayList<MapLocation>();
		possibleArchon = new ArrayList<MapLocation>();
		for (int i=0; i<rc.getArchonCount(); i++) {
			String s = Comms.getIndex(rc, i);
			int aX = Utility.bitToNum(s.substring(0, 4))*4, aY = Utility.bitToNum(s.substring(4, 8))*4;
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
			int current = rc.readSharedArray(7);
			String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
			String message = currentBits.substring(0, 8) + Utility.numToBit(possibleArchon.get(0).x/4) + Utility.numToBit(possibleArchon.get(0).y/4);
	        rc.writeSharedArray(7, Integer.parseInt(message, 2));
		}
	}
	void scout() throws GameActionException {
		MapLocation me = rc.getLocation();
		for (int i=0; i<8; i++) {
			Direction dir = Utility.getDirection(me, spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.MINER, dir)) {
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
				rc.buildRobot(RobotType.MINER, dir);
				break;
			}
		}
	}
	void init() throws GameActionException {
		MapLocation me = rc.getLocation();
		archonCount = rc.getArchonCount();
		remain = archonCount;
		mapWidth = rc.getMapWidth();
		mapHeight = rc.getMapHeight();
		myID = rc.getID();
		for (int i=0; i<4; i++) {
			//System.out.println(rc.readSharedArray(i) + " " + i);
			if (rc.readSharedArray(i) != 0) {
				continue;
			}
			else {
				prefix = Utility.numToBit(me.x/4) + Utility.numToBit(me.y/4);
				int output = Integer.parseInt(prefix + "00000001", 2);
				rc.writeSharedArray(i, output);
				myIndex = i;
				break;
			}
		}
		MapLocation[] temp = rc.senseNearbyLocationsWithLead();
		for (int i=0; i<temp.length; i++) { //find guaranteed lead
			Comms.write("0001", rc, temp[i]);
		}
		spawnZones = new ArrayList<MapLocation>();
		ArrayList<Integer> tempRubble = new ArrayList<Integer>();
		int[] dx = {1, 1, 1, 0, 0, -1,-1, -1};
		int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
		for (int i=0; i<8; i++) { //least rubble areas for spawning new robots
			MapLocation loc = new MapLocation(me.x+dx[i], me.y+dy[i]);
			if (spawnZones.size() == 0) {
				tempRubble.add(rc.senseRubble(loc));
				spawnZones.add(loc);
			}
			else {
				int rub = rc.senseRubble(loc);
				int pos = 0;
				while (pos<tempRubble.size() && rub > tempRubble.get(pos)) {
					pos++;
				}
				tempRubble.add(pos, rub);
				spawnZones.add(pos, loc);
			}
		}
		for (int i=0; i<8; i++) {
			Direction dir = Utility.getDirection(me, spawnZones.get(i));
			if (rc.canBuildRobot(RobotType.MINER, dir)) {
				System.out.println("ok boomer " + myIndex);
				rc.buildRobot(RobotType.MINER, dir);
				int output = Integer.parseInt(prefix + "00000010", 2);
				rc.writeSharedArray(myIndex, output);
				break;
			}
		}
	}
}
