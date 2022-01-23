package Pathfinding;
import java.util.Random;

import battlecode.common.*;

public class Archon{
    int turnCount = 0;
    final Random rng = new Random(6147);
    static final Direction[] directions = {
            Direction.NORTH,
            Direction.NORTHEAST,
            Direction.EAST,
            Direction.SOUTHEAST,
            Direction.SOUTH,
            Direction.SOUTHWEST,
            Direction.WEST,
            Direction.NORTHWEST,
    };
    static boolean init = true;
    static zone[][] masterArray;
    MapLocation[] enemyArchons;
    RobotController rc;
    int lastTurnHp = 1000;
    static int sz = 0;
    static boolean emer = false;
    static int ms = 0;
    static int st = 0;
    static boolean greedy = false;
    static int cnt = 0;
    public static void run(RobotController rc) throws GameActionException {
        if (init) {
            masterArray = new zone[rc.getMapHeight()/4][rc.getMapWidth()/4];
            for (int i=0; i<masterArray.length; i++) {
                for (int j=0; j<masterArray[0].length; j++) {
                    masterArray[i][j] = new zone(i*4, j*4); //will have to be edited later for correct scaling
                }
            }
            sz = rc.getMapHeight()*rc.getMapWidth();
            init = false;
        }
        //get the troops in vicinity
        RobotInfo[] troops =rc.senseNearbyRobots();
//        int ourindex = 0;
//        int enemyindex = 0;
//        int enemytroops = 0;
//        for(RobotInfo i : troops){
//            if(i.team==rc.getTeam()){
//                if(i.type==RobotType.MINER){
//                    ourindex++;
//                }else if(i.type==RobotType.SOLDIER){
//                    ourindex+=2;
//                }else if(i.type==RobotType.WATCHTOWER){
//                    ourindex+=4;
//                }else if(i.type==RobotType.SAGE){
//                    ourindex+=3;
//                }
//            }else{
//                if(i.type==RobotType.MINER){
//                    enemyindex++;
//                }else if(i.type==RobotType.SOLDIER){
//                    enemyindex+=2;
//                }else if(i.type==RobotType.WATCHTOWER){
//                    enemyindex+=4;
//                }else if(i.type==RobotType.SAGE){
//                    enemyindex+=3;
//                }
//            }
//        }
//        if(enemyindex>0) {
//            enemyindex++;
//        }
//        if(enemyindex>ourindex){//EMERGENCY SPAWN TROOPS
//            //spawn troops
//
//            if(enemyindex>ourindex){
//                emer = true;
//                //write in shared array
//            }
//            return;
//        }
//        if (emer) {
//            emer = false;
//            //write in shared array
//        }
        Direction dir = Ripbytecode.rip(rc); //moves to less rubble
        if(dir!=Direction.CENTER) {
            if (rc.getMode() != RobotMode.PORTABLE && rc.canTransform()) {
                rc.transform();
            }
            if(rc.getMovementCooldownTurns()==0&&!rc.canMove(dir)){//should never happen
                rc.resign();
            }
            if(rc.canMove(dir)){
                rc.move(dir);
            }
        }else{
            if(rc.getMode()!=RobotMode.TURRET&&rc.canTransform()){
                rc.transform();
            }
        }
//        int ms = Comms.getMiners();//comm every 2
//        int ss = Comms.getSoldiers();//comm every 4
//        int sg = Comms.getSages();//comm every 2
//        int current = rc.readSharedArray(0);
//        String currentBits = String.format("%16s", Integer.toBinaryString(current)).replace(" ", "0");
//        char[] bitArray = currentBits.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for (int i=0; i < bitArray.length; i++) {
//            bitArray[0] = '1';
//            sb.append(bitArray[i]);
//        }
//        rc.writeSharedArray(0, Integer.parseInt(sb.toString(), 2));
        int build = 0;
        RobotType typ = null;
        dir = Ripbytecode.leastRubbleDir(rc);
        if (2*rc.getArchonCount()*ms < sz/180) {//start out with sz/180 miners
            if (rc.getActionCooldownTurns()==0) {
                build = RobotType.MINER.buildCostLead;
                typ = RobotType.MINER;
            }
        }else{
            if (rc.getActionCooldownTurns()==0) {
                System.out.println("FFFFFFFFFFFFFFFFf");
                if (cnt % 4 == 0) {
                    build = RobotType.MINER.buildCostLead;
                    typ = RobotType.MINER;
                }else{
                    build = RobotType.SOLDIER.buildCostLead;
                    typ = RobotType.SOLDIER;
                }
            }
        }
        if(build>0) {
            if (build * rc.getArchonCount() > rc.getTeamLeadAmount(rc.getTeam())) {
                if (greedy) {
                    greedy = false;
                    if (typ == RobotType.MINER) {
                        ms++;
                    }
                    cnt++;
                    System.out.println("GREEEEEEEEEEDY");
                    System.out.println(typ);
                    System.out.println(dir);
                    rc.buildRobot(typ, dir);
                }else{
                    greedy = true;
                }
            } else {
                if (typ == RobotType.MINER) {
                    ms++;
                }
                System.out.println("HERE?????????????");
                System.out.println(dir);
                System.out.println(typ);
                rc.buildRobot(typ, dir);
                cnt++;
            }
        }
//        if(rc.getTeamLeadAmount(rc.getTeam())>160){
//
//        }else if(){// if no builder in range and no fighters and need healing or rly need health
//
//        }else if(){
//
//        }
    }
}


