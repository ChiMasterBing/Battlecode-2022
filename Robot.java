package DanielProto;

import java.io.IOException;

import battlecode.common.GameActionException;
public abstract class Robot {
    abstract void run() throws GameActionException, IOException;
}
