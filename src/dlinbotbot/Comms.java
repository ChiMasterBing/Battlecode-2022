package dlinbotbot;
import java.util.*;
import battlecode.common.*;

public class Comms {

	static Information scan(RobotController rc, int type) throws GameActionException {
		//0 lead
		//1 enemy
		//2 friendly
		//3 ALL LMAOOOO RIP BYTECODEDEEE
		//4 lead + enemy
		if (type == 0) {
			int totalLead = 0; //get total lead
			MapLocation[] temp = rc.senseNearbyLocationsWithLead();
			int i = 0, size = temp.length;
			while (i < size) {
				totalLead += rc.senseLead(temp[i]);
				i++;
			}
			Information answer = new Information();
			answer.lead = totalLead;
			return answer;
		}
		else if (type == 1) { //get enemy troops
			Information answer = new Information();
			int radius = rc.getType().actionRadiusSquared;
			Team opponent = rc.getTeam().opponent();
			answer.enemy = rc.senseNearbyRobots(radius, opponent);
			return answer;
		}
		else if (type == 2) { //get friendly troops
			Information answer = new Information();
			int radius = rc.getType().actionRadiusSquared;
			Team self = rc.getTeam();
			answer.friendly = rc.senseNearbyRobots(radius, self);
			return answer;
		}
		else if (type == 3) { //all types
			Information answer = new Information();
			int totalLead = 0; //get total lead
			MapLocation[] temp = rc.senseNearbyLocationsWithLead();
			int i = 0, size = temp.length;
			while (i < size) {
				totalLead += rc.senseLead(temp[i]);
				i++;
			}
			int radius = rc.getType().actionRadiusSquared;
			Team self = rc.getTeam();
			answer.enemy = rc.senseNearbyRobots(radius, self.opponent());
			answer.friendly = rc.senseNearbyRobots(radius, self);
			answer.lead = totalLead;
			return answer;
		} else {
			Information answer = new Information();
			int totalLead = 0; //get total lead
			MapLocation[] temp = rc.senseNearbyLocationsWithLead();
			int i = 0, size = temp.length;
			while (i < size) {
				totalLead += rc.senseLead(temp[i]);
				i++;
			}
			int radius = rc.getType().actionRadiusSquared;
			Team self = rc.getTeam();
			answer.enemy = rc.senseNearbyRobots(radius, self.opponent());
			answer.lead = totalLead;
			return answer;
		}
	}
	static int encode(Information info) { //to conserve bytecode, you may want to process this yourself and store the values when doing it for later use
		// bit 1 - lead level
		// bits 2 to 4 - danger levels
		int wt = 0, sg = 0, sl = 0, mn = 0;
		int enc = 0b001;
		boolean found = false;
		if (info != null) {
			for (RobotInfo e : info.enemy) {
				switch (e.getType()) {
					case ARCHON:
						enc = 0b111;
						found = true;
						break;
					case LABORATORY:
						enc = 0b110;
						found = true;
						break;
					case WATCHTOWER:
						wt++;
						break;
					case SAGE:
						sg++;
						break;
					case SOLDIER:
						sl++;
						break;
					case MINER:
						mn++;
						break;
				}

				if (found)
					break;
			}

			if (!found) {
				int dangerLevel = 4 * wt + 3 * sg + 2 * sl + mn;
				if (dangerLevel > 10)
					enc = 0b101;
				else if (dangerLevel > 5)
					enc = 0b100;
				else if (dangerLevel > 2)
					enc = 0b011;
			}

			if (info.lead != 0)
				enc |= 0b1000;
			return enc;
		}

		return 0;
	}

	public static final int ZONE_WIDTH = 5;
	public static final int ZONE_HEIGHT = 5;

	static void write(int message, RobotController rc) throws GameActionException {
		MapLocation me = rc.getLocation();
		int zx = Math.max(0, me.x - 1) / ZONE_WIDTH, zy = Math.max(0, me.y - 1) / ZONE_HEIGHT; // 5 is zone size
		int encLocation = zx * 12 + zy; // 12 is max number of zones per strip (MAP_WIDTH / ZONE_HEIGHT)

		// We're encoding 4 pieces of information per zone
		int arrayIndex = encLocation / 4;
		int bitIndex = 4 * (encLocation % 4);

		int curVal = (rc.readSharedArray(arrayIndex) | (0b1111 << bitIndex)) & (message << bitIndex);

		rc.writeSharedArray(arrayIndex, curVal);
	}

	static void encodeAndWrite(Information info, RobotController rc) throws GameActionException {
		write(encode(info), rc);
	}

	static MapLocation getZonePosition(int ArrayIndex, int index) {
		return new MapLocation(((63-ArrayIndex) * 4)/15, ((63-ArrayIndex) * 4 + index/4)%15);
	}
}
class Information {
	public Information() {
		lead = 0;
		enemy = null;
		friendly = null;
	}
	int lead;
	RobotInfo[] enemy;
	RobotInfo[] friendly;
}
