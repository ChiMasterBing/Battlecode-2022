package DanielProto;
import java.util.Random;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;
public class Miner extends Robot{
    int turnCount = 0;
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
    boolean init = true;
    zone[][] self; //each miner keeps 1x1 instead of 4x4
    RobotController rc;
    MapLocation me;
    public Miner(RobotController rc) throws GameActionException {
        this.rc = rc;
    }
    boolean arrived = false, scan = false;
    int[][] area;
    int cnt=0;
    public void run() throws GameActionException {
    	cnt++;
    	if(cnt>500) {
    		rc.resign();
    	}
        Direction dir =BFSBuilder.getBestDir(rc, new MapLocation(0, 0));
        rc.setIndicatorString(dir.toString());
        if(dir!=null&&rc.canMove(dir)) {
        	//System.out.println(dir);
        	rc.move(dir);
        }
        return;
//        if (init) {
//            self = new zone[rc.getMapHeight()][rc.getMapWidth()];//4x4
//            for (int i=0; i<self.length; i++) {
//                for (int j=0; j<self[0].length; j++) {
//                    self[i][j] = new zone(i, j); //will have to be edited later for correct scaling
//                }
//            }
//            init = false;
//        }
//        //Pathfind to zone
//        int areaX, areaY;
//        arrived = true;
//        if (arrived) { 
//            int availableLead = 0, rubble = 0;
//            int value = -1;
//            int chosenX = 0, chosenY = 0;
//            for (int dx = -1; dx <= 1; dx++) {
//                for (int dy = -1; dy <= 1; dy++) {
//                    availableLead = 0;
//                    boolean invalid = false;
//                    for (int ddx = -1; ddx <= 1; ddx++) {
//                        for (int ddy = -1; ddy <= 1; ddy++) {
//                            MapLocation senseLocation = new MapLocation(me.x+dx+ddx,me.y+dy+ddy);
//                            if (rc.canSenseLocation(senseLocation)) {
//                                availableLead += rc.senseLead(senseLocation);
//                            }
//                            if (ddx == 0 && ddy == 0 && !rc.canSenseLocation(senseLocation)) {
//                                invalid = true;
//                            }
//                        }
//                    }
//                    if (invalid) {
//                        continue;
//                    }
//                    rubble = rc.senseRubble(me);
//                    int tempValue;
//                    if (dx == 0 && dy == 0 && availableLead > 30) {
//                        tempValue = (int)(leadPerTurn(rubble)*20);
//                        
//                    }
//                    else {
//                        tempValue = Math.min((int)(leadPerTurn(rubble)*20), availableLead);
//                    }
//                    if (dx == 0 && dy == 0 && tempValue >= value) {
//                        value = tempValue;
//                        chosenX = dx;
//                        chosenY = dy;
//                    }
//                    else if (tempValue > value) {
//                        value = tempValue;
//                        chosenX = dx;
//                        chosenY = dy;
//                    }
//                }
//            }
//            for (int i=0; i<directions.length; i++) {
//                if (chosenX == directions[i].getDeltaX() && chosenY == directions[i].getDeltaY()) {
//                    if (rc.canMove(directions[i])) {
//                        rc.move(directions[i]);
//                    }
//                }
//            }
//            for (int dx = -1; dx <= 1; dx++) {
//                for (int dy = -1; dy <= 1; dy++) {
//                    MapLocation mineLocation = new MapLocation(me.x + dx, me.y + dy);
//                    if (rc.canSenseLocation(mineLocation)) {
//                       int lead = rc.senseLead(mineLocation); 
//                       int minedCount = 0;
//                       while (rc.canMineLead(mineLocation) && lead-minedCount > 1) {
//                          rc.mineLead(mineLocation);
//                          minedCount++;
//                       }
//                       self[mineLocation.x][mineLocation.y].updateLead(lead-minedCount);
//                    }
//                }
//            }
//        }
//        
//        turnCount++;
    }
    double leadPerTurn(int rubble) {
        return (50)/(10+rubble);
    }
}
