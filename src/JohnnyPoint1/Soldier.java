package JohnnyPoint1;
import java.util.Random;
import battlecode.common.*;
public class Soldier extends Robot {
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
   zone[][] masterArray;
   MapLocation[] targets;
   RobotController rc;
   Team opponent;
   int currentTarget = 0;
   int attackTurn = 0;
   MapLocation me;
   int side;
   public Soldier(RobotController rc) {
      this.rc = rc;
   
   }
   void run() throws GameActionException {
      if (init) {
         opponent = rc.getTeam().opponent();
         targets = new MapLocation[10];
         targets[0] = new MapLocation(rc.readSharedArray(2), rc.readSharedArray(3));
         attackTurn = rc.readSharedArray(1)+250;
         side = ((rc.readSharedArray(0)-1)/3)%6;
         init = false;
      }
      me = rc.getLocation();
      int radius = rc.getType().actionRadiusSquared;
      opponent = rc.getTeam().opponent();
      RobotInfo[] enemies = rc.senseNearbyRobots(radius, opponent);
      if (enemies.length > 0) {
         MapLocation toAttack = enemies[0].location;
         if (rc.canAttack(toAttack)) {
            rc.attack(toAttack);
         }
      }
      int currentTurn = rc.readSharedArray(1);
      if (currentTurn >= attackTurn) {
         int xMove = 0, yMove = 0;
         if (me.x < targets[currentTarget].x) {
            xMove++;
         }
         else if (me.x > targets[currentTarget].x) {
            xMove--;
         }
         if (me.y < targets[currentTarget].y) {
            yMove++;
         }
         else if (me.y > targets[currentTarget].y) {
            yMove--;
         }
           
         Direction dir = Direction.CENTER;
         for (int i=0; i<directions.length; i++) {
            if (directions[i].getDeltaX() == xMove && directions[i].getDeltaY() == yMove) {
               dir = directions[i];
            }
         }
         if (rc.canMove(dir)) {
            rc.move(dir);
         }
      }
      else {
         if (side == 0) {
            if (rc.canMove(Direction.NORTHWEST)) {
               rc.move(Direction.NORTHWEST);
            }
            else if (rc.canMove(Direction.NORTH)) {
               rc.move(Direction.NORTH);
            }
            else if (rc.canMove(Direction.WEST)) {
               rc.move(Direction.WEST);
            }
            else {
               Direction dir = directions[rng.nextInt(directions.length)];
               if (rc.canMove(dir)) {
                  rc.move(dir);
               }
            }
         }
         else if (side == 1) {
            if (rc.canMove(Direction.SOUTHEAST)) {
               rc.move(Direction.SOUTHEAST);
            }
            else if (rc.canMove(Direction.SOUTH)) {
               rc.move(Direction.SOUTH);
            }
            else if (rc.canMove(Direction.EAST)) {
               rc.move(Direction.EAST);
            }
            else {
               Direction dir = directions[rng.nextInt(directions.length)];
               if (rc.canMove(dir)) {
                  rc.move(dir);
               }
            }
         	
         }
         else {
            Direction dir = directions[rng.nextInt(directions.length)];
            if (rc.canMove(dir)) {
               rc.move(dir);
            }
         }
      }
      turnCount++;
   }
}
