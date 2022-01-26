package Pathfinding;

import battlecode.common.*;


public class Sage {
	static final int WAITWHENGETTHERE = -5;
	static final int AVGPATHRUBBLE = 30;
	static Direction dir=Direction.CENTER;
	static boolean init = true;
	static MapLocation startloc;
	static int prevEnemies = 0;
	static int dx = 0;
	static int dy = 0;
	public static void run(RobotController rc) throws GameActionException {
		// TODO Auto-generated method stub
		//check if escape mode

		if (init) {
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
		RobotInfo[] arr = rc.senseNearbyRobots();
		int enemies = 0;
		for(RobotInfo i: arr){
			if(i.getTeam()==rc.getTeam().opponent()) {
				enemies++;
				if (i.getType() == RobotType.ARCHON) {
					int earchonloc = i.getLocation().y << 6 | i.getLocation().x;
					rc.writeSharedArray(8, (earchonloc << 4) | 0b0011);
				}
			}
		}
		int allinfo = rc.readSharedArray(8)>>4;
		int x = allinfo&0b111111;
		int y = allinfo>>6;
		x = 1;
		y= 43;
		MapLocation backup = new MapLocation(x, y);
//		if(x==0&&y==0){
//			rc.writeSharedArray(8, 0b111111110011);
//			allinfo = rc.readSharedArray(8)>>4;
//			x = allinfo&0b111111;
//			y = allinfo>>6;
//		}
		SageBFS.init(rc);//inits the locs
		MapLocation targ = null;
		if(prevEnemies>0){
			prevEnemies--;
		}
		int turnsleft = rc.getActionCooldownTurns()/10;
		if(rc.getActionCooldownTurns()>50&&rc.getHealth()<50) {//might wanan change this
			if (rc.getLocation().distanceSquaredTo(startloc) > 5) {
				targ = startloc;
			}
			rc.setIndicatorString("HEALING"+String.valueOf(dx)+" "+String.valueOf(dy)+"wTF IS IT?"+String.valueOf(rc.getActionCooldownTurns()));
		}
		else if (turnsleft>0&&(20-prevEnemies<=turnsleft||turnsleft>=Math.max(Math.abs(backup.x-rc.getLocation().x), Math.abs(backup.y-rc.getLocation().y))+WAITWHENGETTHERE)) {
			rc.setIndicatorString("hding"+String.valueOf(dx)+" "+String.valueOf(dy)+"wTF IS IT?"+String.valueOf(rc.getActionCooldownTurns()));
			if (enemies > 0) {
				dx = 0;
				dy = 0;
				prevEnemies = 20;
			}
			for (RobotInfo i : arr) {
				int dist = i.getLocation().distanceSquaredTo(rc.getLocation());
				Direction dirtoSold = i.getLocation().directionTo(rc.getLocation());
				if (i.getTeam() == rc.getTeam() && i.getType() == RobotType.SOLDIER) {//ehhhh u dont wanna always move towards sage, jsut dont
					if (enemies > 0) {
						//large switch staement here
						switch (dirtoSold) {//rip one move, but issok
							case NORTH:
								dy++;
								break;
							case EAST:
								dx++;
								break;
							case WEST:
								dx--;
								break;
							case SOUTH:
								dy--;
								break;
							case NORTHEAST:
								dx++;
								dy++;
								break;
							case NORTHWEST:
								dx--;
								dy++;
								break;
							case SOUTHEAST:
								dy--;
								dx++;
								break;
							default:
								dy--;
								dx--;
								break;
						}
					}
				} else if (i.getTeam() == rc.getTeam().opponent() && i.getType() == RobotType.SOLDIER) {
					if (dist > 20) {
						//large switch statement to decide dx and dy
						switch (dirtoSold) {//rip one move, but issok
							case NORTH:
								dy--;
								break;
							case EAST:
								dx--;
								break;
							case WEST:
								dx++;
								break;
							case SOUTH:
								dy++;
								break;
							case NORTHEAST:
								dx--;
								dy--;
								break;
							case NORTHWEST:
								dx++;
								dy--;
								break;
							case SOUTHEAST:
								dy++;
								dx--;
								break;
							default:
								dy++;
								dx++;
								break;
						}
					}
				}
			}
			if(enemies==0&&prevEnemies==0){//!! isnt this the same as what wil happen next?
				targ = SageBFS.lowest(100);
			}
			if(dx>0&&dy>0){
				rc.move(Direction.NORTHEAST);
			}
			if(dx>0&&dy<0){
				rc.move(Direction.SOUTHEAST);
			}
			if(dx<0&&dy>0){
				rc.move(Direction.NORTHWEST);
			}
			if(dx<0&&dy<0){
				rc.move(Direction.SOUTHWEST);
			}

//			targ = SageBFS.lowest();//finds the lowest rubble and stays
		} else {
			targ = new MapLocation(x, y);
			if(targ==null){
				System.out.println("NO TARGET");
				rc.resign();
			}
			System.out.println(targ.toString());
			if (rc.getActionCooldownTurns() == 0) {
				int ab = 0;//attack building anom
				int at = 0;//attack troop anom
				int n = 0;//normal attack
				int apm = 0;
				RobotInfo st = null;//special troop that can be attack if move
				MapLocation norm = null; // normal attack location
				Direction sdir = null; //special direction to move
				int lvl = 0; //what should normall attack given multiple choices
				for (RobotInfo i : arr) {
					if(i.getTeam()==rc.getTeam().opponent()){
						Direction mdir = SageBFS.sdir(i.getLocation());
						if (rc.canAttack(i.getLocation())) {
							int benefits = 0;
							RobotType typ = i.getType();
							if (typ == RobotType.SAGE) {
								apm+=45;
								benefits = 30;
							} else if (typ == RobotType.SOLDIER) {
								apm+=3;
								benefits = 20;
							} else if (typ == RobotType.ARCHON) {
								apm+=70;
								benefits = 500;
							} else if (typ == RobotType.BUILDER) {
								benefits = 8;
							} else if (typ == RobotType.MINER) {
								benefits = 10;
							} else if (typ == RobotType.WATCHTOWER) {
								apm+=4;
								benefits = 100;
							} else {
								apm+=45;
								benefits = 200;
							}
							if (i.getHealth() < 45) {
								int kil = i.getHealth() + benefits;
								if (kil > n) {
									n = kil;
									norm = i.getLocation();
								}
							} else {
								if (benefits > lvl && n < 45) {
									lvl = benefits;
									n = 45;
									norm = i.getLocation();
								}
							}
							if (i.getType().isBuilding()) {
								int dmg = i.getType().health / 10;
								if (dmg > i.getHealth()) {
									dmg = i.getHealth();
									at += benefits;//constant
								}
								ab += dmg;
							} else {//troops
								int dmg = (int) (i.getType().health * 0.22);
								if (dmg > i.getHealth()) {
									dmg = i.getHealth();
									at += benefits;
								}
								at += dmg;
							}
						} else if (mdir != null) {//if you move u can attack specially
							if (st == null) {
								sdir = mdir;
								st = i;
							} else if (st.getType().health < i.getType().health) {
								st = i;
								sdir = mdir;
							}
						}
					}

				}
				boolean shouldattack = true;
				if(3*apm<rc.getHealth()){
					if(apm!=0) {
						targ = SageBFS.lowest(((rc.getHealth() / apm) / 10)+1);
					}else{
						targ = SageBFS.lowest(100);
					}
					//System.out.println(rc.getHealth()/apm);
					shouldattack = false;
					if(targ.equals(rc.getLocation())){
						targ = backup;
						shouldattack = true;
					}
				}
				if(shouldattack) {
					if (at > 40 && at > n && at > ab) {
						rc.envision(AnomalyType.CHARGE);
					} else if (ab > 40 && ab > at && ab > n) {
						rc.envision(AnomalyType.FURY);
					} else if (n > 40) {
						rc.attack(norm);
					} else {//matack
						if (sdir != null && rc.canMove(sdir)) {
							dir = sdir;
							rc.move(sdir);
							if (st.getType() == RobotType.ARCHON) {
								rc.envision(AnomalyType.FURY);
							} else {
								rc.attack(st.getLocation());
							}
						}
					}
				}
			}
			rc.setIndicatorString("ATTACKING"+String.valueOf(dx)+" "+String.valueOf(dy)+targ+"wTF IS IT?"+String.valueOf(rc.getActionCooldownTurns()));

		}

//		if(rc.getActionCooldownTurns()>1000){
//			rc.resign();
//		}
//		goto archon
		if(targ!=null) {
			Direction cur = rc.getLocation().directionTo(targ);
			Direction cdir;
			switch (cur) {//rip one move, but issok
				case NORTH:
					cdir = SageBFS.BFSNorth(targ, dir.opposite());
					break;
				case EAST:
					cdir = SageBFS.BFSEast(targ, dir.opposite());
					break;
				case WEST:
					cdir = SageBFS.BFSWest(targ, dir.opposite());
					break;
				case SOUTH:
					cdir = SageBFS.BFSSouth(targ, dir.opposite());
					break;
				case NORTHEAST:
					cdir = SageBFS.BFSNorthEast(targ, dir.opposite());
					break;
				case NORTHWEST:
					cdir = SageBFS.BFSNorthWest(targ, dir.opposite());
					break;
				case SOUTHEAST:
					cdir = SageBFS.BFSSouthEast(targ, dir.opposite());
					break;
				default:
					cdir = SageBFS.BFSSouthWest(targ, dir.opposite());
					break;
			}
			if(cdir!=null){
				if (rc.canMove(cdir)) {
					dir = cdir;
					rc.move(cdir);
				}
			}
		}
		//rc.setIndicatorString(targ.toString());
		//CODEGEN  IS BAD CHECK YOUR IF STAMEMENTS
//		rc.setIndicatorString(targ.toString());
//		System.out.println(targ);
//		System.out.println(dir.opposite());
//		System.out.println(cur);
//		System.out.println("HEREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEee");
//		if(cdir==null){
//			System.out.println(rc.getLocation());
//			System.out.println("GETS TO");
//			System.out.println(targ);
//			System.out.println(dir.opposite());
//			System.out.println("NO MOVEMENT DIR");
//			rc.resign();
//			System.out.println(cur);
//			if(rc.getRoundNum()>200){
//				rc.resign();
//			}
//			return;
////			System.out.println(targ);
////			rc.resign();
//		}
	}
	static void Suicide(){

	}
}
