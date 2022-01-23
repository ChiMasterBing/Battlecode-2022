package Pathfinding;

import battlecode.common.RobotInfo;

import java.util.*;
import battlecode.common.*;

public class Comms {
    static final int[] locationsX = {-2, -1, 0, 1, 2, //this is for droids only
            -3, -2, -1, 0, 1, 2, 3,
            -4, -3, -2, -1, 0, 1, 2, 3, 4,
            -4, -3, -2, -1, 0, 1, 2, 3, 4,
            -4, -3, -2, -1, 0, 1, 2, 3, 4,
            -4, -3, -2, -1, 0, 1, 2, 3, 4,
            -4, -3, -2, -1, 0, 1, 2, 3, 4,
            -3, -2, -1, 0, 1, 2, 3,
            -2, -1, 0, 1, 2,};
    static final int[] locationsY = {4, 4, 4, 4, 4,
            3, 3, 3, 3, 3, 3, 3,
            2, 2, 2, 2, 2, 2, 2, 2, 2,
            1, 1, 1, 1, 1, 1, 1, 1, 1,
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            -1,-1,-1,-1,-1,-1,-1,-1,-1,
            -2,-2,-2,-2,-2,-2,-2,-2,-2,
            -3,-3,-3,-3,-3,-3,-3,
            -4,-4,-4,-4,-4};
    static Information scan(RobotController rc, int type) throws GameActionException {
        //0 lead
        //1 enemy
        //2 friendly
        //3 ALL LMAOOOO RIP BYTECODEDEEE
        MapLocation me = rc.getLocation();
        int height = rc.getMapHeight();
        int width = rc.getMapWidth();
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
        }
        else {
            return null;
        }
    }
    static String encode(Information info) { //to conserve bytecode, you may want to process this yourself and store the values when doing it for later use
        int answer = 0;
        if (info.enemy != null) {
            int maxThreat = 0;
            for (int i=0; i<info.enemy.length; i++) {
                int tempThreat = 0;
                if (info.enemy[i].getType() == RobotType.MINER || info.enemy[i].getType() == RobotType.BUILDER) {
                    tempThreat = 1;
                }
                else if (info.enemy[i].getType() == RobotType.SOLDIER) {
                    tempThreat = 2;
                }
                else if (info.enemy[i].getType() == RobotType.WATCHTOWER || info.enemy[i].getType() == RobotType.LABORATORY) {
                    tempThreat = 3;
                }
                else if (info.enemy[i].getType() == RobotType.SAGE) {
                    tempThreat = 4;
                }
                else if (info.enemy[i].getType() == RobotType.ARCHON) {
                    tempThreat = 5;
                }
                if (tempThreat > maxThreat) {
                    maxThreat = tempThreat;
                }
            }
            answer = maxThreat+2;
        }
        if (info.lead != 0) {
            if (info.lead >= 300) {
                answer = 2;
            }
            else {
                answer = 1;
            }
        }
        //idk if this conserves bytecode, but I decided to hardcode the conversion of base 10 to base 2
        if (answer == 0) {
            return "0000";
        }
        else if (answer == 1) {
            return "0001";
        }
        else if (answer == 2) {
            return "0010";
        }
        else if (answer == 3) {
            return "0011";
        }
        else if (answer == 4) {
            return "0100";
        }
        else if (answer == 5) {
            return "0101";
        }
        else if (answer == 6) {
            return "0110";
        }
        else if (answer == 7) {
            return "0111";
        }
        return "0000"; //this should never happen
    }
    static void write(String message, RobotController rc) throws GameActionException {
        MapLocation me = rc.getLocation();
        int zx = me.x/4, zy = me.y/4;
        int bitIndex = zx*60+zy*4;
        int arrayIndex = 64-(bitIndex/16)-1;
        bitIndex = bitIndex%4;
        //System.out.println(arrayIndex);
        int current = rc.readSharedArray(arrayIndex);
        String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
        char[] bitArray = currentBits.toCharArray();
        for (int i=bitIndex; i<bitIndex+4; i++) {
            bitArray[i] = message.charAt(i-bitIndex);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < bitArray.length; i++) {
            sb.append(bitArray[i]);
        }
        rc.writeSharedArray(arrayIndex, Integer.parseInt(sb.toString(), 2));
    }
    static MapLocation getZonePosition(int ArrayIndex, int index) {
        return new MapLocation(((63-ArrayIndex) * 4)/15, ((63-ArrayIndex) * 4 + index/4)%15);
    }
    static String getIndex(RobotController rc, int ArrayIndex) throws GameActionException {
        int val = rc.readSharedArray(ArrayIndex);
        String currentBits = String.format("%16s", Integer.toBinaryString(val)).replace(" ", "0");
        return currentBits;
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

//public class Comms {
//    static int emer = 1;
//    static int mbits = 4;//dont change
//    static int sbits = 4;//two soldiers sage
//    static int sgbits = 4;//one sage per miner
//    static int typebits = 1;
//
//    static int ebits = 3;//send wandring troops there
//    static int lbits = 1;//send miners here
////
////    static int getMiners(){//should have 1 per 4x4 zone
////
////    }
////    static int getSoldiers(){
////
////    }
////    static int getSages(){
////
////    }
////    static int encode(){
////
////    }
//    class Information {
//        public Information() {
//            lead = 0;
//            enemy = null;
//            friendly = null;
//        }
//        int lead;
//        RobotInfo[] enemy;
//        RobotInfo[] friendly;
//    }
//
//}
