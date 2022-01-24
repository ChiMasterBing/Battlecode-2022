package dlinbotbot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.RobotController;

public abstract class Robot {
    abstract void run() throws GameActionException, IOException;
    protected static final Random rng = new Random(6147);

    /** Array containing all the possible movement directions. */
    protected static final List<Direction> directions = Arrays.asList(
            Direction.NORTH,
            Direction.NORTHEAST,
            Direction.EAST,
            Direction.SOUTHEAST,
            Direction.SOUTH,
            Direction.SOUTHWEST,
            Direction.WEST,
            Direction.NORTHWEST
    );

    protected RobotController rc;
}
