package Pathfinding;

import battlecode.common.*;

import java.util.Map;

import java.io.IOException;

public class Sage {

	static Direction dir;
	static boolean init = true;
	static MapLocation startloc;
	public static void run(RobotController rc) throws GameActionException {
		// TODO Auto-generated method stub
		//check if escape mode

		if(init){
			init = false;
			startloc = rc.getLocation();
		}

		//otherwise:
		//if you can matack
		//matack

		//follow

		//if still can attack and in radius
		//attack


		// if etroops in radius
		//signal to fall back if not attacking
		RobotInfo[] arr = rc.senseNearbyRobots(34, rc.getTeam().opponent());
		MapLocation targ = new MapLocation();
		if (rc.getActionCooldownTurns()>5) {
			if(arr.length>0) {
				//run towards freinds
			}else{
				targ = SageBFS.lowest(rc);
			}
		}else{
			if(rc.getActionCooldownTurns()==0){
				int ab = 0;//attack building anom
				int at = 0;//attack troop anom
				int n = 0;//normal attack
				RobotInfo st = null;//special troop that can be attack if move
				MapLocation norm = null; // normal attack location
				Direction sdir = null; //special direction to move
				int lvl = 0; //what should normall attack given multiple choices
				for(RobotInfo i: arr){
					Direction mdir = BFSSage.sdir(i.getLocation());
					if(rc.canAttack(i.getLocation())){
						int benefits = 0;
						RobotType typ = i.getType();
						if(typ==RobotType.SAGE){
							benefits = 30;
						}else if(typ==RobotType.SOLDIER){
							benefits = 20;
						}else if(typ==RobotType.ARCHON){
							benefits = 500;
						}else if(typ==RobotType.BUILDER){
							benefits = 8;
						}else if(typ==RobotType.MINER){
							benefits = 10;
						}else if(typ==RobotType.WATCHTOWER){
							benefits = 100;
						}else{
							benefits = 200;
						}
						if(i.getHealth()<45){
							int kil = i.getHealth()+benefits;
							if(kil>n){
								n = kil;
								norm = i.getLocation();
							}
						}else{
							if(benefits>lvl&&n<45){
								lvl = benefits;
								n = 45;
								norm = i.getLocation();
							}
						}
						if(i.getType().isBuilding()) {
							int dmg = i.getType().health / 10;
							if(dmg>i.getHealth()){
								dmg = i.getHealth();
								at+=benefits;//constant
							}
							ab += dmg;
						}else{//troops
							int dmg = (int)(i.getType().health*0.22);
							if(dmg>i.getHealth()){
								dmg = i.getHealth();
								at+=benefits;
							}
							at+=dmg;
						}
					}else if(mdir!=null){//if you move u can attack specially
						if(st==null){
							sdir = mdir;
							st = i;
						}else if(st.getType().health<i.getType().health){
							st = i;
							sdir = mdir;
						}
					}
				}
				if(at>40&&at>n&&at>ab){
					rc.envision(AnomalyType.CHARGE);
				}else if(ab>40&&ab>at&&ab>n){
					rc.envision(AnomalyType.FURY);
				}else if(n>40){
					rc.attack(norm);
				}else {//matack
					if(sdir!=null&&rc.canMove(sdir)){
						rc.move(sdir);
						if(st.getType()==RobotType.ARCHON){
							rc.envision(AnomalyType.FURY);
						}else{
							rc.attack(st.getLocation());
						}
					}
				}

			}

		}

		if(rc.getHealth()<20&&targ.distanceSquaredTo(startloc)>5){
			targ = startloc;
		}
		Direction cur = rc.getLocation().directionTo(targ);
		Direction cdir;

		switch(cur){//rip one move, but issok
			case NORTH:
				cdir=BFSNorth.gbda(rc, targ, dir.opposite());
				break;
			case EAST:
				cdir=BFSEast.gbda(rc, targ, dir.opposite());
				break;
			case WEST:
				cdir=BFSWest.gbda(rc, targ, dir.opposite());
				break;
			case SOUTH:
				cdir=BFSSouth.gbda(rc, targ, dir.opposite());
				break;
			case NORTHEAST:
				cdir=BFSNorthEast.gbda(rc, targ, dir.opposite());
				break;
			case NORTHWEST:
				cdir=BFSNorthWest.gbda(rc, targ, dir.opposite());
				break;
			case SOUTHEAST:
				cdir=BFSSouthEast.gbda(rc, targ, dir.opposite());
				break;
			default:
				cdir=BFSSouthWest.gbda(rc, targ, dir.opposite());
				break;
		}
		if(rc.canMove(cdir)){
			rc.move(cdir);
		}
}
