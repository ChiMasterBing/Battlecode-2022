package JesseC;

import battlecode.common.RobotController;
import battlecode.common.RobotInfo;

import java.util.Comparator;

public class RobotInfoComparator implements Comparator<RobotInfo>{
    public int compare(RobotInfo a, RobotInfo b){
        return a.getHealth() - b.getHealth();
    }
}
