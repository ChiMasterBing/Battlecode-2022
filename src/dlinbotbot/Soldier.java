package dlinbotbot;
import java.util.*;
import battlecode.common.*;

public class Soldier extends Robot {

    boolean init = true;
    List<MapLocation> targets = new ArrayList<>();
    Team opponent;
    int currentTarget = 0;
    int attackTurn = 0;
    MapLocation me;
    int side;
    Direction followingDir;

    static Direction dir = Direction.CENTER;

    MapLocation homeArchonLocation;

    SoldierRole role;
    public Soldier(RobotController rc) {
        this.rc = rc;
    }

    void run() throws GameActionException {
        if (init) {
            opponent = rc.getTeam().opponent();
            attackTurn = rc.readSharedArray(1) + 250;
            side = ((rc.readSharedArray(0) - 1) / 3) % 6;
            init = false;

            RobotInfo[] robots = rc.senseNearbyRobots(20);

            int teamBots = 0, oppBots = 0;
            for (RobotInfo r : robots) {
                if (r.getType() != RobotType.SOLDIER)
                    continue;

                if (r.getTeam() == r.getTeam())
                    teamBots++;
                else
                    oppBots++;
            }

            if (oppBots / 2 >= teamBots || teamBots < 5) {
                role = SoldierRole.Defense;
                Direction archonDir = null;
                RobotInfo[] ris = rc.senseNearbyRobots(-1, rc.getTeam());
                for (RobotInfo ri : ris) {
                    if (ri.getType() != RobotType.ARCHON)
                        continue;

                    homeArchonLocation = ri.getLocation();
                    archonDir = rc.getLocation().directionTo(homeArchonLocation);
                    followingDir = archonDir;
                    break;
                }

                Direction res = archonDir.opposite();
                switch (rng.nextInt(3)) {
                    case 0:
                        res = res.rotateLeft();
                    case 1:
                        res = res.rotateRight();
                }

                while (rc.canMove(res))
                    rc.move(res);

            } else {
                role = SoldierRole.Offense;
                targets.add(new MapLocation(rc.readSharedArray(2), rc.readSharedArray(3)));
            }
        }

        if (role == SoldierRole.Offense) {
            if (targets.get(currentTarget) != null) {
                if (rc.canAttack(targets.get(currentTarget))) {
                    do {
                        rc.attack(targets.get(currentTarget));
                    } while (rc.canAttack(targets.get(currentTarget)));

                    if (rc.canSenseRobotAtLocation(rc.getLocation()) && rc.senseRobotAtLocation(targets.get(currentTarget)) == null) {
                        rc.writeSharedArray(2, 0);
                        rc.writeSharedArray(3, 0);
                    }
                } else {
                    if (rc.canSenseRobotAtLocation(targets.get(currentTarget)) && rc.senseRobotAtLocation(targets.get(currentTarget)) == null) {
                        // Robot isn't there L
                        targets.remove(currentTarget);
                        targets.add(new MapLocation(rc.readSharedArray(2), rc.readSharedArray(3)));
                    }

                    if (rc.getRobotCount() > 75) {
                        MapLocation targ = targets.get(0);
                        Direction cur = rc.getLocation().directionTo(targ);
                        rc.setIndicatorString(dir.opposite().toString());
                        Direction cdir;

                        switch (cur) {
                            case NORTH:
                                cdir = BFSNorth.gbda(rc, targ, dir.opposite());
                                break;
                            case EAST:
                                cdir = BFSEast.gbda(rc, targ, dir.opposite());
                                break;
                            case WEST:
                                cdir = BFSWest.gbda(rc, targ, dir.opposite());
                                break;
                            case SOUTH:
                                cdir = BFSSouth.gbda(rc, targ, dir.opposite());
                                break;
                            case NORTHEAST:
                                cdir = BFSNorthEast.gbda(rc, targ, dir.opposite());
                                break;
                            case NORTHWEST:
                                cdir = BFSNorthWest.gbda(rc, targ, dir.opposite());
                                break;
                            case SOUTHEAST:
                                cdir = BFSSouthEast.gbda(rc, targ, dir.opposite());
                                break;
                            default:
                                cdir = BFSSouthWest.gbda(rc, targ, dir.opposite());
                                break;
                        }
                        if (cdir != null && rc.canMove(cdir)) {
                            rc.move(cdir);
                            dir = cdir;
                        }
                    }
                }
            } else {
                RobotInfo[] ris;
                do {
                    ris = rc.senseNearbyRobots(RobotType.SOLDIER.actionRadiusSquared, opponent);

                    Direction res = directions.get(((directions.indexOf(followingDir) + 8 + rng.nextInt(5) - 3) % 8));
                    if (rc.canMove(res)) {
                        rc.move(res);
                    } else if (!rc.onTheMap(rc.getLocation().add(res))) {
                        followingDir = followingDir.rotateLeft();
                    }

                } while (ris.length == 0);
            }
        }

        me = rc.getLocation();

        int radius = rc.getType().actionRadiusSquared;
        Team opponent = rc.getTeam().opponent();
        RobotInfo[] enemies = rc.senseNearbyRobots(radius, opponent);
        Arrays.sort(enemies, new RobotInfoComparator(me));

        int bytecodeNum = Clock.getBytecodeNum();
        for (RobotInfo e : enemies) {
            MapLocation cur = e.getLocation();
            targets.add(e.getLocation());
            while (rc.canAttack(cur)) {
                rc.attack(cur);
            }

            // Onto the next turn
            if (Clock.getBytecodeNum() < bytecodeNum)
                return;
        }
    }
}
class RobotInfoComparator implements Comparator<RobotInfo>{
    MapLocation l;

    public RobotInfoComparator(MapLocation l) {
        this.l = l;
    }

    public int compare(RobotInfo a, RobotInfo b){
        int healths = a.getHealth() - b.getHealth();
        if (healths == 0) {
            return l.distanceSquaredTo(a.getLocation()) - l.distanceSquaredTo(b.getLocation());
        } else {
            return healths;
        }
    }
}

enum SoldierRole {
    Defense,
    Offense
}
