package JohnnyPoint1;
import java.util.Random;
import battlecode.common.*;
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
   public void run() throws GameActionException {
      me = rc.getLocation();
      if (init) {
         self = new zone[rc.getMapHeight()][rc.getMapWidth()];
         for (int i=0; i<self.length; i++) {
            for (int j=0; j<self[0].length; j++) {
               self[i][j] = new zone(i, j); //will have to be edited later for correct scaling
            }
         }
         rc.writeSharedArray(me.x/4+4, 0);
         init = false;
      }
      int displaceX = me.x%4, displaceY = me.y%4;
      int totalLead = 0, totalEnemyStatus = 0, totalRubble = 0;
      for (int dx = -displaceX; dx < 4-displaceX; dx++) {
         for (int dy = -displaceY; dy < 4-displaceY; dy++) {
            MapLocation senseLocation = new MapLocation(me.x + dx, me.y + dy);
            if (rc.canSenseLocation(senseLocation)) {
               int lead = rc.senseLead(senseLocation);
               int gold = rc.senseGold(senseLocation);
               int rubble = rc.senseRubble(senseLocation);
               int enemyStatus = 0;
               self[me.x+dx][me.y+dy].updateLead(lead);
               self[me.x+dx][me.y+dy].updateEnemyStatus(enemyStatus);
               totalLead += lead;
            }
         }
      }
      MapLocation center = new MapLocation(me.x-displaceX+2, me.y-displaceY+2);
      RobotInfo[] info = rc.senseNearbyRobots(center, 4, rc.getTeam().opponent());
      for (int i=0; i<info.length; i++) {
         if (info[i].getType() == RobotType.MINER || info[i].getType() == RobotType.BUILDER) {
            totalEnemyStatus = Math.max(totalEnemyStatus, 1);
         }
      }
        
      int index = me.x+4;
      String message = makeMessage(totalLead, totalEnemyStatus, totalRubble);
      for (int i=index; i<index+4; i++) {
         if (rc.readSharedArray(index) == 0) {
            rc.writeSharedArray(index, Integer.parseInt(message, 2));
            break;
         }
      }
      for (int dx = -1; dx <= 1; dx++) {
         for (int dy = -1; dy <= 1; dy++) {
            MapLocation mineLocation = new MapLocation(me.x + dx, me.y + dy);
            if (rc.canSenseLocation(mineLocation)) {
               int lead = rc.senseLead(mineLocation); 
               int minedCount = 0;
               while (rc.canMineLead(mineLocation) && lead-minedCount > 1) {
                  rc.mineLead(mineLocation);
                  minedCount++;
               }
               self[mineLocation.x][mineLocation.y].updateLead(lead-minedCount);
            }
         }
      }
   
        // Also try to move randomly.
      Direction dir = directions[rng.nextInt(directions.length)];
      if (rc.canMove(dir)) {
         rc.move(dir);
            //System.out.println("I moved!");
      }
      turnCount++;
   }
   String makeMessage(int lead, int enemy, int rubble) {
      char[] message = new char[16];
      for (int i=0; i<16; i++) {
         message[i] = '0';
      }
      int zoneX = me.x/4, zoneY = me.y/4;
      String encodeY = Integer.toBinaryString(zoneY);
        
      int count = 3, tempCount = encodeY.length()-1;
      while (count >= 0) {
         if (tempCount >= 0) {
            message[count+4] = encodeY.charAt(tempCount);
         }
         count--;
         tempCount--;
      }
      message[0] = '1';
      String encodeLead = processLead(lead);
      message[11] = encodeLead.charAt(0);
      message[12] = encodeLead.charAt(1);
      return charToString(message);
   }
   String processLead(int lead) {
      if (lead < 500) {
         return "00";
      }
      else if (lead >= 500 && lead < 1500) {
         return "01";
      }
      else if (lead >= 1500 && lead < 5000) {
         return "10";
      }
      else {
         return "11";
      }
   }
   String charToString(char[] s) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length; i++) {
         sb.append(s[i]);
      }
      return sb.toString();
   }
}
