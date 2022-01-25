package dlinbotbot;
import java.util.LinkedList;
import java.util.Queue;

import battlecode.common.*;
import dlinbotbot.bfs.*;

public class Miner extends Robot {
    boolean init = true;
    CommInformation info[][];
    MapLocation homeArchonLocation;
    MapLocation lastZoneInfoLocation;
    Direction followingDir;

    int roundInfoLastUpdated;

    MapLocation targetLoc;

    MinerRoles role = MinerRoles.Miner;

    public Miner(RobotController rc) {
        this.rc = rc;
    }

    static Direction dir = Direction.CENTER;
    public void run() throws GameActionException {
        rc.setIndicatorString(role == MinerRoles.Miner ? "MINER" : "EXPLORER");
        if (init) {
            lastZoneInfoLocation = rc.getLocation();
            Comms.encodeAndWrite(Comms.scan(rc, CommConstants.SCAN_ENEMY | CommConstants.SCAN_LEAD), rc);

            info = Comms.readAllZones(rc);
            roundInfoLastUpdated = rc.getRoundNum();

            // TODO: BFS from closest to me

            CommInformation targ = null;

            int numUnknown = 0;
            for (int y = 0; y < info.length; y++) {
                for (int x = 0; x < info[0].length; x++) {
                    if (info[y][x].getDangerLevel() == CommConstants.UNKNOWN) {
                        numUnknown++;
                        targ = info[y][x];
                    }
                }
            }

            if (numUnknown > 10) {
                role = MinerRoles.Explorer;
            } else {
                role = MinerRoles.Miner;
                boolean found = false;
                for (int y = 0; y < info.length; y++) {
                    for (int x = 0; x < info[0].length; x++) {
                        if (info[y][x].hasLead()) {
                            targ = info[y][x];
                            found = true;
                            break;
                        }
                    }
                    if (found)
                        break;
                }
            }

            if (targ != null) {
                targetLoc = new MapLocation(targ.getZoneX() * Comms.ZONE_WIDTH + Comms.ZONE_HEIGHT / 2,
                        targ.getZoneY() * Comms.ZONE_HEIGHT + Comms.ZONE_HEIGHT / 2);
            }

            init = false;
        } else {
            info = Comms.readAllZones(rc);
            roundInfoLastUpdated = rc.getRoundNum();
        }

        lastZoneInfoLocation = rc.getLocation();
        Comms.encodeAndWrite(Comms.scan(rc, CommConstants.SCAN_ENEMY | CommConstants.SCAN_LEAD), rc);

        boolean reachedTarget = targetLoc != null && targetLoc.isAdjacentTo(rc.getLocation());

        if (targetLoc != null && !reachedTarget) {
            Direction cur = rc.getLocation().directionTo(targetLoc);
            Direction cdir;

            switch (cur) {
                case NORTH:
                    cdir = BFSNorth.gbda(rc, targetLoc, dir.opposite());
                    break;
                case EAST:
                    cdir = BFSEast.gbda(rc, targetLoc, dir.opposite());
                    break;
                case WEST:
                    cdir = BFSWest.gbda(rc, targetLoc, dir.opposite());
                    break;
                case SOUTH:
                    cdir = BFSSouth.gbda(rc, targetLoc, dir.opposite());
                    break;
                case NORTHEAST:
                    cdir = BFSNorthEast.gbda(rc, targetLoc, dir.opposite());
                    break;
                case NORTHWEST:
                    cdir = BFSNorthWest.gbda(rc, targetLoc, dir.opposite());
                    break;
                case SOUTHEAST:
                    cdir = BFSSouthEast.gbda(rc, targetLoc, dir.opposite());
                    break;
                default:
                    cdir = BFSSouthWest.gbda(rc, targetLoc, dir.opposite());
                    break;
            }
            if (cdir != null && rc.canMove(cdir)) {
                rc.move(cdir);
                dir = cdir;
            }
        }

        MapLocation[] locations = rc.senseNearbyLocationsWithLead(rc.getType().actionRadiusSquared);

        if (role == MinerRoles.Explorer && targetLoc != null &&
                info[targetLoc.x / Comms.ZONE_HEIGHT][targetLoc.x / Comms.ZONE_WIDTH].getDangerLevel() != CommConstants.UNKNOWN)
            targetLoc = null;

        if (locations.length != 0) {
            for (MapLocation location : locations) {
                while (rc.canMineLead(location)) {
                    rc.mineLead(location);
                    Direction dirTo = rc.getLocation().directionTo(location);
                    if (rc.canMove(dirTo))
                        rc.move(dirTo);
                }
            }
        } else if (targetLoc == null || reachedTarget) {
            if (role == MinerRoles.Miner) {

                CommInformation lead = null;

                for (int y = 0; y < info.length; y++) {
                    for (int x = 0; x < info[0].length; x++) {
                        if (info[y][x].hasLead()) {
                            lead = info[y][x];
                            break;
                        }
                    }
                }

                if (lead != null)
                    targetLoc = new MapLocation(lead.getZoneX() * Comms.ZONE_WIDTH + Comms.ZONE_WIDTH / 2,
                            lead.getZoneY() * Comms.ZONE_HEIGHT + Comms.ZONE_HEIGHT / 2);
                else
                    this.role = MinerRoles.Explorer;
            } else {

                CommInformation unknown = findZoneUnknown();

                if (unknown != null)
                    targetLoc = new MapLocation(unknown.getZoneX() * Comms.ZONE_WIDTH + Comms.ZONE_WIDTH / 2,
                            unknown.getZoneY() * Comms.ZONE_HEIGHT + Comms.ZONE_HEIGHT / 2);
                else
                    this.role = MinerRoles.Miner;
            }
        }
    }

    private CommInformation findZoneUnknown() {
        for (int y = 0; y < info.length; y++) {
            for (int x = 0; x < info[0].length; x++) {
                if (info[y][x].getDangerLevel() == CommConstants.UNKNOWN) {
                    return info[y][x];
                }
            }
        }
        return null;
    }
}

enum MinerRoles {
    Explorer,
    Miner
}