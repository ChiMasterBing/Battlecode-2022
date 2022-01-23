package dlinbotbot;
import battlecode.common.*;
import java.util.Random;

/**
 * RobotPlayer is the class that describes your main robot strategy.
 * The run() method inside this class is like your main function: this is what we'll call once your robot
 * is created!
 */
public strictfp class RobotPlayer {

    /**
     * We will use this variable to count the number of turns this robot has been alive.
     * You can use static variables like this to save any information you want. Keep in mind that even though
     * these variables are static, in Battlecode they aren't actually shared between your robots.
     */
    static int turnCount = 0;

    /**
     * run() is the method that is called when a robot is instantiated in the Battlecode world.
     * It is like the main function for your robot. If this method returns, the robot dies!
     *
     * @param rc  The RobotController object. You use it to perform actions from this robot, and to get
     *            information on its current status. Essentially your portal to interacting with the world.
     **/
    @SuppressWarnings("unused")
    public static void run(RobotController rc) throws GameActionException {

        // Hello world! Standard output is very useful for debugging.
        // Everything you say here will be directly viewable in your terminal when you run a match!
        System.out.println("I'm a " + rc.getType() + " and I just got created! I have health " + rc.getHealth());

        // You can also use indicators to save debug notes in replays.
        rc.setIndicatorString("Hello world!");
        Robot thisRobot = null;
        switch (rc.getType()) {
	        case ARCHON:
	        	thisRobot = new Archon(rc);
	        	break;
	        case MINER:
	        	thisRobot = new Miner(rc);
	        	break;
	        case SOLDIER:
	        	thisRobot = new Soldier(rc);
	        	break;
	        case LABORATORY:
                thisRobot = new Laboratory(rc);
                break;
	        case WATCHTOWER:
                thisRobot = new WatchTower(rc);
                break;
	        case BUILDER:
                thisRobot = new Builder(rc);
                break;
	        case SAGE:
                thisRobot = new Sage(rc);
                break;
        }
        
        while (true) {
            turnCount += 1;  // We have now been alive for one more turn!
            //System.out.println("Age: " + turnCount + "; Location: " + rc.getLocation());
            
            // Try/catch blocks stop unhandled exceptions, which cause your robot to explode.
            try {
                thisRobot.run();
            } catch (Exception e) {
                System.out.println(rc.getType() + " Exception");
                e.printStackTrace();

            } finally {
                // Signify we've done everything we want to do, thereby ending our turn.
                // This will make our code wait until the next turn, and then perform this loop again.
            	
                Clock.yield();
            }
        }
    }
}
