package dlinbotbot;
import java.util.Random;

import battlecode.common.*;

public class Archon extends Robot {
    int turnCount = 0;
    CommInformation[][] masterArray;
    int lastTurnHp = 1000;

    public Archon(RobotController rc) {
        this.rc = rc;
    }

    public void run() throws GameActionException {
        masterArray = Comms.readAllZones(rc);

        int hp = rc.getHealth();
        if (hp != lastTurnHp) {
            Direction dir;
            for (int i=0; i<directions.size(); i++) {
                dir = directions.get(i);
                if (rc.canBuildRobot(RobotType.SOLDIER, dir)) {
//                    rc.buildRobot(RobotType.SOLDIER, dir);
                    break;
                }
            }
            RobotInfo[] info = rc.senseNearbyRobots(20, rc.getTeam());
            for (int i=0; i<info.length; i++) {
                if (rc.canRepair(info[i].getLocation())) {
                    rc.repair(info[i].getLocation());
                }
            }
        }

        if (turnCount%30 == 0 && turnCount < 1700) {
            Direction dir;
            for (int i=0; i<directions.size(); i++) {
                dir = directions.get(i);
                if (rc.canBuildRobot(RobotType.MINER, dir)) {
                    rc.buildRobot(RobotType.MINER, dir);
                    break;
                }

            }
        }

        if (turnCount < 1900) {
            Direction dir;
            for (int i=0; i<directions.size(); i++) {
                dir = directions.get(i);
                if (rc.canBuildRobot(RobotType.SOLDIER, dir)) {
//                    rc.buildRobot(RobotType.SOLDIER, dir);
                    break;
                }

            }
        }

        if (turnCount == 1998) {
        }
//        String s = "";
//        for (int i=0; i<masterArray.length; i++) {
//            for (int j=0; j<masterArray[0].length; j++) {
//                s += masterArray[i][j].getDangerLevel() + " ";
//            }
//            s += "\n";
//        }
//        System.out.println(s);
        lastTurnHp = hp;
        turnCount++;
    }
}


