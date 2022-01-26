package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class BFSNorthEast {
    static MapLocation l112;
    static int c112;
    static int r112;
    static Direction d112;

    static MapLocation l97;
    static int c97;
    static int r97;
    static Direction d97;

    static MapLocation l113;
    static int c113;
    static int r113;
    static Direction d113;

    static MapLocation l128;
    static int c128;
    static int r128;
    static Direction d128;

    static MapLocation l98;
    static int c98;
    static int r98;
    static Direction d98;

    static MapLocation l96;
    static int c96;
    static int r96;
    static Direction d96;

    static MapLocation l82;
    static int c82;
    static int r82;
    static Direction d82;

    static MapLocation l83;
    static int c83;
    static int r83;
    static Direction d83;

    static MapLocation l81;
    static int c81;
    static int r81;
    static Direction d81;

    static MapLocation l114;
    static int c114;
    static int r114;
    static Direction d114;

    static MapLocation l129;
    static int c129;
    static int r129;
    static Direction d129;

    static MapLocation l99;
    static int c99;
    static int r99;
    static Direction d99;

    static MapLocation l144;
    static int c144;
    static int r144;
    static Direction d144;

    static MapLocation l84;
    static int c84;
    static int r84;
    static Direction d84;

    static MapLocation l80;
    static int c80;
    static int r80;
    static Direction d80;

    static MapLocation l67;
    static int c67;
    static int r67;
    static Direction d67;

    static MapLocation l68;
    static int c68;
    static int r68;
    static Direction d68;

    static MapLocation l66;
    static int c66;
    static int r66;
    static Direction d66;

    static MapLocation l69;
    static int c69;
    static int r69;
    static Direction d69;

    static MapLocation l65;
    static int c65;
    static int r65;
    static Direction d65;

    static MapLocation l115;
    static int c115;
    static int r115;
    static Direction d115;

    static MapLocation l130;
    static int c130;
    static int r130;
    static Direction d130;

    static MapLocation l100;
    static int c100;
    static int r100;
    static Direction d100;

    static MapLocation l145;
    static int c145;
    static int r145;
    static Direction d145;

    static MapLocation l85;
    static int c85;
    static int r85;
    static Direction d85;

    static MapLocation l160;
    static int c160;
    static int r160;
    static Direction d160;

    static MapLocation l70;
    static int c70;
    static int r70;
    static Direction d70;

    static MapLocation l64;
    static int c64;
    static int r64;
    static Direction d64;

    static MapLocation l52;
    static int c52;
    static int r52;
    static Direction d52;

    static MapLocation l53;
    static int c53;
    static int r53;
    static Direction d53;

    static MapLocation l51;
    static int c51;
    static int r51;
    static Direction d51;

    static MapLocation l54;
    static int c54;
    static int r54;
    static Direction d54;

    static MapLocation l50;
    static int c50;
    static int r50;
    static Direction d50;

    static MapLocation l116;
    static int c116;
    static int r116;
    static Direction d116;

    static MapLocation l131;
    static int c131;
    static int r131;
    static Direction d131;

    static MapLocation l101;
    static int c101;
    static int r101;
    static Direction d101;

    static MapLocation l146;
    static int c146;
    static int r146;
    static Direction d146;

    static MapLocation l86;
    static int c86;
    static int r86;
    static Direction d86;

    static Direction ans;
    static MapLocation lowest(RobotController rc) throws GameActionException {
        l112 = rc.getLocation();
        int cmin = Integer.MAX_VALUE;
        MapLocation ret = null;
        if(rc.senseRubble(l112)<cmin){
            cmin=rc.senseRubble(l112);
            ret=l112;
        }

        l97 = l112.add(Direction.NORTH);
        if(rc.onTheMap(l97)&&!rc.isLocationOccupied(l97)&&rc.senseRubble(l97)<cmin){
            cmin=rc.senseRubble(l97);
            ret=l97;
        }

        l113 = l112.add(Direction.EAST);
        if(rc.onTheMap(l113)&&!rc.isLocationOccupied(l113)&&rc.senseRubble(l113)<cmin){
            cmin=rc.senseRubble(l113);
            ret=l113;
        }

        l128 = l112.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l128)&&!rc.isLocationOccupied(l128)&&rc.senseRubble(l128)<cmin){
            cmin=rc.senseRubble(l128);
            ret=l128;
        }

        l98 = l112.add(Direction.NORTHEAST);
        if(rc.onTheMap(l98)&&!rc.isLocationOccupied(l98)&&rc.senseRubble(l98)<cmin){
            cmin=rc.senseRubble(l98);
            ret=l98;
        }

        l96 = l112.add(Direction.NORTHWEST);
        if(rc.onTheMap(l96)&&!rc.isLocationOccupied(l96)&&rc.senseRubble(l96)<cmin){
            cmin=rc.senseRubble(l96);
            ret=l96;
        }

        l82 = l97.add(Direction.NORTH);
        if(rc.onTheMap(l82)&&!rc.isLocationOccupied(l82)&&rc.senseRubble(l82)<cmin){
            cmin=rc.senseRubble(l82);
            ret=l82;
        }

        l83 = l97.add(Direction.NORTHEAST);
        if(rc.onTheMap(l83)&&!rc.isLocationOccupied(l83)&&rc.senseRubble(l83)<cmin){
            cmin=rc.senseRubble(l83);
            ret=l83;
        }

        l81 = l97.add(Direction.NORTHWEST);
        if(rc.onTheMap(l81)&&!rc.isLocationOccupied(l81)&&rc.senseRubble(l81)<cmin){
            cmin=rc.senseRubble(l81);
            ret=l81;
        }

        l114 = l113.add(Direction.EAST);
        if(rc.onTheMap(l114)&&!rc.isLocationOccupied(l114)&&rc.senseRubble(l114)<cmin){
            cmin=rc.senseRubble(l114);
            ret=l114;
        }

        l129 = l113.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l129)&&!rc.isLocationOccupied(l129)&&rc.senseRubble(l129)<cmin){
            cmin=rc.senseRubble(l129);
            ret=l129;
        }

        l99 = l113.add(Direction.NORTHEAST);
        if(rc.onTheMap(l99)&&!rc.isLocationOccupied(l99)&&rc.senseRubble(l99)<cmin){
            cmin=rc.senseRubble(l99);
            ret=l99;
        }

        l144 = l128.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l144)&&!rc.isLocationOccupied(l144)&&rc.senseRubble(l144)<cmin){
            cmin=rc.senseRubble(l144);
            ret=l144;
        }

        l84 = l98.add(Direction.NORTHEAST);
        if(rc.onTheMap(l84)&&!rc.isLocationOccupied(l84)&&rc.senseRubble(l84)<cmin){
            cmin=rc.senseRubble(l84);
            ret=l84;
        }

        l80 = l96.add(Direction.NORTHWEST);
        if(rc.onTheMap(l80)&&!rc.isLocationOccupied(l80)&&rc.senseRubble(l80)<cmin){
            cmin=rc.senseRubble(l80);
            ret=l80;
        }

        l67 = l82.add(Direction.NORTH);
        if(rc.onTheMap(l67)&&!rc.isLocationOccupied(l67)&&rc.senseRubble(l67)<cmin){
            cmin=rc.senseRubble(l67);
            ret=l67;
        }

        l68 = l82.add(Direction.NORTHEAST);
        if(rc.onTheMap(l68)&&!rc.isLocationOccupied(l68)&&rc.senseRubble(l68)<cmin){
            cmin=rc.senseRubble(l68);
            ret=l68;
        }

        l66 = l82.add(Direction.NORTHWEST);
        if(rc.onTheMap(l66)&&!rc.isLocationOccupied(l66)&&rc.senseRubble(l66)<cmin){
            cmin=rc.senseRubble(l66);
            ret=l66;
        }

        l69 = l83.add(Direction.NORTHEAST);
        if(rc.onTheMap(l69)&&!rc.isLocationOccupied(l69)&&rc.senseRubble(l69)<cmin){
            cmin=rc.senseRubble(l69);
            ret=l69;
        }

        l65 = l81.add(Direction.NORTHWEST);
        if(rc.onTheMap(l65)&&!rc.isLocationOccupied(l65)&&rc.senseRubble(l65)<cmin){
            cmin=rc.senseRubble(l65);
            ret=l65;
        }

        l115 = l114.add(Direction.EAST);
        if(rc.onTheMap(l115)&&!rc.isLocationOccupied(l115)&&rc.senseRubble(l115)<cmin){
            cmin=rc.senseRubble(l115);
            ret=l115;
        }

        l130 = l114.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l130)&&!rc.isLocationOccupied(l130)&&rc.senseRubble(l130)<cmin){
            cmin=rc.senseRubble(l130);
            ret=l130;
        }

        l100 = l114.add(Direction.NORTHEAST);
        if(rc.onTheMap(l100)&&!rc.isLocationOccupied(l100)&&rc.senseRubble(l100)<cmin){
            cmin=rc.senseRubble(l100);
            ret=l100;
        }

        l145 = l129.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l145)&&!rc.isLocationOccupied(l145)&&rc.senseRubble(l145)<cmin){
            cmin=rc.senseRubble(l145);
            ret=l145;
        }

        l85 = l99.add(Direction.NORTHEAST);
        if(rc.onTheMap(l85)&&!rc.isLocationOccupied(l85)&&rc.senseRubble(l85)<cmin){
            cmin=rc.senseRubble(l85);
            ret=l85;
        }

        l160 = l144.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l160)&&!rc.isLocationOccupied(l160)&&rc.senseRubble(l160)<cmin){
            cmin=rc.senseRubble(l160);
            ret=l160;
        }

        l70 = l84.add(Direction.NORTHEAST);
        if(rc.onTheMap(l70)&&!rc.isLocationOccupied(l70)&&rc.senseRubble(l70)<cmin){
            cmin=rc.senseRubble(l70);
            ret=l70;
        }

        l64 = l80.add(Direction.NORTHWEST);
        if(rc.onTheMap(l64)&&!rc.isLocationOccupied(l64)&&rc.senseRubble(l64)<cmin){
            cmin=rc.senseRubble(l64);
            ret=l64;
        }

        l52 = l67.add(Direction.NORTH);
        if(rc.onTheMap(l52)&&!rc.isLocationOccupied(l52)&&rc.senseRubble(l52)<cmin){
            cmin=rc.senseRubble(l52);
            ret=l52;
        }

        l53 = l67.add(Direction.NORTHEAST);
        if(rc.onTheMap(l53)&&!rc.isLocationOccupied(l53)&&rc.senseRubble(l53)<cmin){
            cmin=rc.senseRubble(l53);
            ret=l53;
        }

        l51 = l67.add(Direction.NORTHWEST);
        if(rc.onTheMap(l51)&&!rc.isLocationOccupied(l51)&&rc.senseRubble(l51)<cmin){
            cmin=rc.senseRubble(l51);
            ret=l51;
        }

        l54 = l68.add(Direction.NORTHEAST);
        if(rc.onTheMap(l54)&&!rc.isLocationOccupied(l54)&&rc.senseRubble(l54)<cmin){
            cmin=rc.senseRubble(l54);
            ret=l54;
        }

        l50 = l66.add(Direction.NORTHWEST);
        if(rc.onTheMap(l50)&&!rc.isLocationOccupied(l50)&&rc.senseRubble(l50)<cmin){
            cmin=rc.senseRubble(l50);
            ret=l50;
        }

        l116 = l115.add(Direction.EAST);
        if(rc.onTheMap(l116)&&!rc.isLocationOccupied(l116)&&rc.senseRubble(l116)<cmin){
            cmin=rc.senseRubble(l116);
            ret=l116;
        }

        l131 = l115.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l131)&&!rc.isLocationOccupied(l131)&&rc.senseRubble(l131)<cmin){
            cmin=rc.senseRubble(l131);
            ret=l131;
        }

        l101 = l115.add(Direction.NORTHEAST);
        if(rc.onTheMap(l101)&&!rc.isLocationOccupied(l101)&&rc.senseRubble(l101)<cmin){
            cmin=rc.senseRubble(l101);
            ret=l101;
        }

        l146 = l130.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l146)&&!rc.isLocationOccupied(l146)&&rc.senseRubble(l146)<cmin){
            cmin=rc.senseRubble(l146);
            ret=l146;
        }

        l86 = l100.add(Direction.NORTHEAST);
        if(rc.onTheMap(l86)&&!rc.isLocationOccupied(l86)&&rc.senseRubble(l86)<cmin){
            cmin=rc.senseRubble(l86);
            ret=l86;
        }
        return ret;
    }
    static Direction gbda(RobotController rc, MapLocation target, Direction prev) throws GameActionException {//get best dir -all
        ans = null;
        l112 = rc.getLocation();
        c112 = 0;

        l97 = l112.add(Direction.NORTH);
        c97 = 10000000;
        d97 = null;

        l113 = l112.add(Direction.EAST);
        c113 = 10000000;
        d113 = null;

        l128 = l112.add(Direction.SOUTHEAST);
        c128 = 10000000;
        d128 = null;

        l98 = l112.add(Direction.NORTHEAST);
        c98 = 10000000;
        d98 = null;

        l96 = l112.add(Direction.NORTHWEST);
        c96 = 10000000;
        d96 = null;

        l82 = l97.add(Direction.NORTH);
        c82 = 10000000;
        d82 = null;

        l83 = l97.add(Direction.NORTHEAST);
        c83 = 10000000;
        d83 = null;

        l81 = l97.add(Direction.NORTHWEST);
        c81 = 10000000;
        d81 = null;

        l114 = l113.add(Direction.EAST);
        c114 = 10000000;
        d114 = null;

        l129 = l113.add(Direction.SOUTHEAST);
        c129 = 10000000;
        d129 = null;

        l99 = l113.add(Direction.NORTHEAST);
        c99 = 10000000;
        d99 = null;

        l144 = l128.add(Direction.SOUTHEAST);
        c144 = 10000000;
        d144 = null;

        l84 = l98.add(Direction.NORTHEAST);
        c84 = 10000000;
        d84 = null;

        l80 = l96.add(Direction.NORTHWEST);
        c80 = 10000000;
        d80 = null;

        l67 = l82.add(Direction.NORTH);
        c67 = 10000000;
        d67 = null;

        l68 = l82.add(Direction.NORTHEAST);
        c68 = 10000000;
        d68 = null;

        l66 = l82.add(Direction.NORTHWEST);
        c66 = 10000000;
        d66 = null;

        l69 = l83.add(Direction.NORTHEAST);
        c69 = 10000000;
        d69 = null;

        l65 = l81.add(Direction.NORTHWEST);
        c65 = 10000000;
        d65 = null;

        l115 = l114.add(Direction.EAST);
        c115 = 10000000;
        d115 = null;

        l130 = l114.add(Direction.SOUTHEAST);
        c130 = 10000000;
        d130 = null;

        l100 = l114.add(Direction.NORTHEAST);
        c100 = 10000000;
        d100 = null;

        l145 = l129.add(Direction.SOUTHEAST);
        c145 = 10000000;
        d145 = null;

        l85 = l99.add(Direction.NORTHEAST);
        c85 = 10000000;
        d85 = null;

        l160 = l144.add(Direction.SOUTHEAST);
        c160 = 10000000;
        d160 = null;

        l70 = l84.add(Direction.NORTHEAST);
        c70 = 10000000;
        d70 = null;

        l64 = l80.add(Direction.NORTHWEST);
        c64 = 10000000;
        d64 = null;

        l52 = l67.add(Direction.NORTH);
        c52 = 10000000;
        d52 = null;

        l53 = l67.add(Direction.NORTHEAST);
        c53 = 10000000;
        d53 = null;

        l51 = l67.add(Direction.NORTHWEST);
        c51 = 10000000;
        d51 = null;

        l54 = l68.add(Direction.NORTHEAST);
        c54 = 10000000;
        d54 = null;

        l50 = l66.add(Direction.NORTHWEST);
        c50 = 10000000;
        d50 = null;

        l116 = l115.add(Direction.EAST);
        c116 = 10000000;
        d116 = null;

        l131 = l115.add(Direction.SOUTHEAST);
        c131 = 10000000;
        d131 = null;

        l101 = l115.add(Direction.NORTHEAST);
        c101 = 10000000;
        d101 = null;

        l146 = l130.add(Direction.SOUTHEAST);
        c146 = 10000000;
        d146 = null;

        l86 = l100.add(Direction.NORTHEAST);
        c86 = 10000000;
        d86 = null;

        if(rc.onTheMap(l97)){
            if(!rc.isLocationOccupied(l97)){
                r97 = 10 + rc.senseRubble(l97);
                if(c97 > c112 + r97 && prev != Direction.NORTH){
                    d97 = Direction.NORTH;
                    c97 = c112 + r97;
                }
            }
        }

        if(rc.onTheMap(l113)){
            if(!rc.isLocationOccupied(l113)){
                r113 = 10 + rc.senseRubble(l113);
                if(c113 > c112 + r113 && prev != Direction.EAST){
                    d113 = Direction.EAST;
                    c113 = c112 + r113;
                }
                if(c113 > c97 + r113){
                    d113 = d97;
                    c113 = c97 + r113;
                }
            }
        }

        if(rc.onTheMap(l128)){
            if(!rc.isLocationOccupied(l128)){
                r128 = 10 + rc.senseRubble(l128);
                if(c128 > c112 + r128 && prev != Direction.SOUTHEAST){
                    d128 = Direction.SOUTHEAST;
                    c128 = c112 + r128;
                }
            }
        }

        if(rc.onTheMap(l98)){
            if(!rc.isLocationOccupied(l98)){
                r98 = 10 + rc.senseRubble(l98);
                if(c98 > c113 + r98){
                    d98 = d113;
                    c98 = c113 + r98;
                }
                if(c98 > c97 + r98){
                    d98 = d97;
                    c98 = c97 + r98;
                }
                if(c98 > c112 + r98 && prev != Direction.NORTHEAST){
                    d98 = Direction.NORTHEAST;
                    c98 = c112 + r98;
                }
            }
        }

        if(rc.onTheMap(l96)){
            if(!rc.isLocationOccupied(l96)){
                r96 = 10 + rc.senseRubble(l96);
                if(c96 > c112 + r96 && prev != Direction.NORTHWEST){
                    d96 = Direction.NORTHWEST;
                    c96 = c112 + r96;
                }
            }
        }

        if(rc.onTheMap(l82)){
            if(!rc.isLocationOccupied(l82)){
                r82 = 10 + rc.senseRubble(l82);
                if(c82 > c97 + r82){
                    d82 = d97;
                    c82 = c97 + r82;
                }
                if(c82 > c96 + r82){
                    d82 = d96;
                    c82 = c96 + r82;
                }
                if(c82 > c98 + r82){
                    d82 = d98;
                    c82 = c98 + r82;
                }
            }
        }

        if(rc.onTheMap(l83)){
            if(!rc.isLocationOccupied(l83)){
                r83 = 10 + rc.senseRubble(l83);
                if(c83 > c98 + r83){
                    d83 = d98;
                    c83 = c98 + r83;
                }
                if(c83 > c82 + r83){
                    d83 = d82;
                    c83 = c82 + r83;
                }
                if(c83 > c97 + r83){
                    d83 = d97;
                    c83 = c97 + r83;
                }
            }
        }

        if(rc.onTheMap(l81)){
            if(!rc.isLocationOccupied(l81)){
                r81 = 10 + rc.senseRubble(l81);
                if(c81 > c96 + r81){
                    d81 = d96;
                    c81 = c96 + r81;
                }
                if(c81 > c97 + r81){
                    d81 = d97;
                    c81 = c97 + r81;
                }
            }
        }

        if(rc.onTheMap(l114)){
            if(!rc.isLocationOccupied(l114)){
                r114 = 10 + rc.senseRubble(l114);
                if(c114 > c113 + r114){
                    d114 = d113;
                    c114 = c113 + r114;
                }
                if(c114 > c98 + r114){
                    d114 = d98;
                    c114 = c98 + r114;
                }
                if(c114 > c128 + r114){
                    d114 = d128;
                    c114 = c128 + r114;
                }
            }
        }

        if(rc.onTheMap(l129)){
            if(!rc.isLocationOccupied(l129)){
                r129 = 10 + rc.senseRubble(l129);
                if(c129 > c128 + r129){
                    d129 = d128;
                    c129 = c128 + r129;
                }
                if(c129 > c113 + r129){
                    d129 = d113;
                    c129 = c113 + r129;
                }
            }
        }

        if(rc.onTheMap(l99)){
            if(!rc.isLocationOccupied(l99)){
                r99 = 10 + rc.senseRubble(l99);
                if(c99 > c114 + r99){
                    d99 = d114;
                    c99 = c114 + r99;
                }
                if(c99 > c98 + r99){
                    d99 = d98;
                    c99 = c98 + r99;
                }
                if(c99 > c83 + r99){
                    d99 = d83;
                    c99 = c83 + r99;
                }
                if(c99 > c113 + r99){
                    d99 = d113;
                    c99 = c113 + r99;
                }
            }
        }

        if(rc.onTheMap(l144)){
            if(!rc.isLocationOccupied(l144)){
                r144 = 10 + rc.senseRubble(l144);
                if(c144 > c128 + r144){
                    d144 = d128;
                    c144 = c128 + r144;
                }
            }
        }

        if(rc.onTheMap(l84)){
            if(!rc.isLocationOccupied(l84)){
                r84 = 10 + rc.senseRubble(l84);
                if(c84 > c99 + r84){
                    d84 = d99;
                    c84 = c99 + r84;
                }
                if(c84 > c83 + r84){
                    d84 = d83;
                    c84 = c83 + r84;
                }
                if(c84 > c98 + r84){
                    d84 = d98;
                    c84 = c98 + r84;
                }
            }
        }

        if(rc.onTheMap(l80)){
            if(!rc.isLocationOccupied(l80)){
                r80 = 10 + rc.senseRubble(l80);
                if(c80 > c96 + r80){
                    d80 = d96;
                    c80 = c96 + r80;
                }
            }
        }

        if(rc.onTheMap(l67)){
            if(!rc.isLocationOccupied(l67)){
                r67 = 10 + rc.senseRubble(l67);
                if(c67 > c82 + r67){
                    d67 = d82;
                    c67 = c82 + r67;
                }
                if(c67 > c81 + r67){
                    d67 = d81;
                    c67 = c81 + r67;
                }
                if(c67 > c83 + r67){
                    d67 = d83;
                    c67 = c83 + r67;
                }
            }
        }

        if(rc.onTheMap(l68)){
            if(!rc.isLocationOccupied(l68)){
                r68 = 10 + rc.senseRubble(l68);
                if(c68 > c83 + r68){
                    d68 = d83;
                    c68 = c83 + r68;
                }
                if(c68 > c67 + r68){
                    d68 = d67;
                    c68 = c67 + r68;
                }
                if(c68 > c82 + r68){
                    d68 = d82;
                    c68 = c82 + r68;
                }
                if(c68 > c84 + r68){
                    d68 = d84;
                    c68 = c84 + r68;
                }
            }
        }

        if(rc.onTheMap(l66)){
            if(!rc.isLocationOccupied(l66)){
                r66 = 10 + rc.senseRubble(l66);
                if(c66 > c81 + r66){
                    d66 = d81;
                    c66 = c81 + r66;
                }
                if(c66 > c80 + r66){
                    d66 = d80;
                    c66 = c80 + r66;
                }
                if(c66 > c82 + r66){
                    d66 = d82;
                    c66 = c82 + r66;
                }
            }
        }

        if(rc.onTheMap(l69)){
            if(!rc.isLocationOccupied(l69)){
                r69 = 10 + rc.senseRubble(l69);
                if(c69 > c84 + r69){
                    d69 = d84;
                    c69 = c84 + r69;
                }
                if(c69 > c68 + r69){
                    d69 = d68;
                    c69 = c68 + r69;
                }
                if(c69 > c83 + r69){
                    d69 = d83;
                    c69 = c83 + r69;
                }
            }
        }

        if(rc.onTheMap(l65)){
            if(!rc.isLocationOccupied(l65)){
                r65 = 10 + rc.senseRubble(l65);
                if(c65 > c80 + r65){
                    d65 = d80;
                    c65 = c80 + r65;
                }
                if(c65 > c81 + r65){
                    d65 = d81;
                    c65 = c81 + r65;
                }
            }
        }

        if(rc.onTheMap(l115)){
            if(!rc.isLocationOccupied(l115)){
                r115 = 10 + rc.senseRubble(l115);
                if(c115 > c114 + r115){
                    d115 = d114;
                    c115 = c114 + r115;
                }
                if(c115 > c99 + r115){
                    d115 = d99;
                    c115 = c99 + r115;
                }
                if(c115 > c129 + r115){
                    d115 = d129;
                    c115 = c129 + r115;
                }
            }
        }

        if(rc.onTheMap(l130)){
            if(!rc.isLocationOccupied(l130)){
                r130 = 10 + rc.senseRubble(l130);
                if(c130 > c129 + r130){
                    d130 = d129;
                    c130 = c129 + r130;
                }
                if(c130 > c114 + r130){
                    d130 = d114;
                    c130 = c114 + r130;
                }
                if(c130 > c144 + r130){
                    d130 = d144;
                    c130 = c144 + r130;
                }
            }
        }

        if(rc.onTheMap(l100)){
            if(!rc.isLocationOccupied(l100)){
                r100 = 10 + rc.senseRubble(l100);
                if(c100 > c115 + r100){
                    d100 = d115;
                    c100 = c115 + r100;
                }
                if(c100 > c99 + r100){
                    d100 = d99;
                    c100 = c99 + r100;
                }
                if(c100 > c84 + r100){
                    d100 = d84;
                    c100 = c84 + r100;
                }
                if(c100 > c114 + r100){
                    d100 = d114;
                    c100 = c114 + r100;
                }
            }
        }

        if(rc.onTheMap(l145)){
            if(!rc.isLocationOccupied(l145)){
                r145 = 10 + rc.senseRubble(l145);
                if(c145 > c144 + r145){
                    d145 = d144;
                    c145 = c144 + r145;
                }
                if(c145 > c129 + r145){
                    d145 = d129;
                    c145 = c129 + r145;
                }
            }
        }

        if(rc.onTheMap(l85)){
            if(!rc.isLocationOccupied(l85)){
                r85 = 10 + rc.senseRubble(l85);
                if(c85 > c100 + r85){
                    d85 = d100;
                    c85 = c100 + r85;
                }
                if(c85 > c84 + r85){
                    d85 = d84;
                    c85 = c84 + r85;
                }
                if(c85 > c69 + r85){
                    d85 = d69;
                    c85 = c69 + r85;
                }
                if(c85 > c99 + r85){
                    d85 = d99;
                    c85 = c99 + r85;
                }
            }
        }

        if(rc.onTheMap(l160)){
            if(!rc.isLocationOccupied(l160)){
                r160 = 10 + rc.senseRubble(l160);
                if(c160 > c144 + r160){
                    d160 = d144;
                    c160 = c144 + r160;
                }
            }
        }

        if(rc.onTheMap(l70)){
            if(!rc.isLocationOccupied(l70)){
                r70 = 10 + rc.senseRubble(l70);
                if(c70 > c85 + r70){
                    d70 = d85;
                    c70 = c85 + r70;
                }
                if(c70 > c69 + r70){
                    d70 = d69;
                    c70 = c69 + r70;
                }
                if(c70 > c84 + r70){
                    d70 = d84;
                    c70 = c84 + r70;
                }
            }
        }

        if(rc.onTheMap(l64)){
            if(!rc.isLocationOccupied(l64)){
                r64 = 10 + rc.senseRubble(l64);
                if(c64 > c80 + r64){
                    d64 = d80;
                    c64 = c80 + r64;
                }
            }
        }

        if(rc.onTheMap(l52)){
            if(!rc.isLocationOccupied(l52)){
                r52 = 10 + rc.senseRubble(l52);
                if(c52 > c67 + r52){
                    d52 = d67;
                    c52 = c67 + r52;
                }
                if(c52 > c66 + r52){
                    d52 = d66;
                    c52 = c66 + r52;
                }
                if(c52 > c68 + r52){
                    d52 = d68;
                    c52 = c68 + r52;
                }
            }
        }

        if(rc.onTheMap(l53)){
            if(!rc.isLocationOccupied(l53)){
                r53 = 10 + rc.senseRubble(l53);
                if(c53 > c68 + r53){
                    d53 = d68;
                    c53 = c68 + r53;
                }
                if(c53 > c52 + r53){
                    d53 = d52;
                    c53 = c52 + r53;
                }
                if(c53 > c67 + r53){
                    d53 = d67;
                    c53 = c67 + r53;
                }
                if(c53 > c69 + r53){
                    d53 = d69;
                    c53 = c69 + r53;
                }
            }
        }

        if(rc.onTheMap(l51)){
            if(!rc.isLocationOccupied(l51)){
                r51 = 10 + rc.senseRubble(l51);
                if(c51 > c66 + r51){
                    d51 = d66;
                    c51 = c66 + r51;
                }
                if(c51 > c65 + r51){
                    d51 = d65;
                    c51 = c65 + r51;
                }
                if(c51 > c67 + r51){
                    d51 = d67;
                    c51 = c67 + r51;
                }
            }
        }

        if(rc.onTheMap(l54)){
            if(!rc.isLocationOccupied(l54)){
                r54 = 10 + rc.senseRubble(l54);
                if(c54 > c69 + r54){
                    d54 = d69;
                    c54 = c69 + r54;
                }
                if(c54 > c53 + r54){
                    d54 = d53;
                    c54 = c53 + r54;
                }
                if(c54 > c68 + r54){
                    d54 = d68;
                    c54 = c68 + r54;
                }
                if(c54 > c70 + r54){
                    d54 = d70;
                    c54 = c70 + r54;
                }
            }
        }

        if(rc.onTheMap(l50)){
            if(!rc.isLocationOccupied(l50)){
                r50 = 10 + rc.senseRubble(l50);
                if(c50 > c65 + r50){
                    d50 = d65;
                    c50 = c65 + r50;
                }
                if(c50 > c64 + r50){
                    d50 = d64;
                    c50 = c64 + r50;
                }
                if(c50 > c66 + r50){
                    d50 = d66;
                    c50 = c66 + r50;
                }
            }
        }

        if(rc.onTheMap(l116)){
            if(!rc.isLocationOccupied(l116)){
                r116 = 10 + rc.senseRubble(l116);
                if(c116 > c115 + r116){
                    d116 = d115;
                    c116 = c115 + r116;
                }
                if(c116 > c100 + r116){
                    d116 = d100;
                    c116 = c100 + r116;
                }
                if(c116 > c130 + r116){
                    d116 = d130;
                    c116 = c130 + r116;
                }
            }
        }

        if(rc.onTheMap(l131)){
            if(!rc.isLocationOccupied(l131)){
                r131 = 10 + rc.senseRubble(l131);
                if(c131 > c130 + r131){
                    d131 = d130;
                    c131 = c130 + r131;
                }
                if(c131 > c115 + r131){
                    d131 = d115;
                    c131 = c115 + r131;
                }
                if(c131 > c145 + r131){
                    d131 = d145;
                    c131 = c145 + r131;
                }
            }
        }

        if(rc.onTheMap(l101)){
            if(!rc.isLocationOccupied(l101)){
                r101 = 10 + rc.senseRubble(l101);
                if(c101 > c116 + r101){
                    d101 = d116;
                    c101 = c116 + r101;
                }
                if(c101 > c100 + r101){
                    d101 = d100;
                    c101 = c100 + r101;
                }
                if(c101 > c85 + r101){
                    d101 = d85;
                    c101 = c85 + r101;
                }
                if(c101 > c115 + r101){
                    d101 = d115;
                    c101 = c115 + r101;
                }
            }
        }

        if(rc.onTheMap(l146)){
            if(!rc.isLocationOccupied(l146)){
                r146 = 10 + rc.senseRubble(l146);
                if(c146 > c145 + r146){
                    d146 = d145;
                    c146 = c145 + r146;
                }
                if(c146 > c130 + r146){
                    d146 = d130;
                    c146 = c130 + r146;
                }
                if(c146 > c160 + r146){
                    d146 = d160;
                    c146 = c160 + r146;
                }
            }
        }

        if(rc.onTheMap(l86)){
            if(!rc.isLocationOccupied(l86)){
                r86 = 10 + rc.senseRubble(l86);
                if(c86 > c101 + r86){
                    d86 = d101;
                    c86 = c101 + r86;
                }
                if(c86 > c85 + r86){
                    d86 = d85;
                    c86 = c85 + r86;
                }
                if(c86 > c70 + r86){
                    d86 = d70;
                    c86 = c70 + r86;
                }
                if(c86 > c100 + r86){
                    d86 = d100;
                    c86 = c100 + r86;
                }
            }
        }

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;

        int dist50 = Math.max(Math.abs(cx+5)*49 + c50, Math.abs(cy - 3)*49+c50);
        if(dist50 <= cmin){
            cmin= dist50;
            ans = d50;
        }

        int dist51 = Math.max(Math.abs(cx+6)*49 + c51, Math.abs(cy - 3)*49+c51);
        if(dist51 <= cmin){
            cmin= dist51;
            ans = d51;
        }

        int dist52 = Math.max(Math.abs(cx+7)*49 + c52, Math.abs(cy - 3)*49+c52);
        if(dist52 <= cmin){
            cmin= dist52;
            ans = d52;
        }

        int dist53 = Math.max(Math.abs(cx+8)*49 + c53, Math.abs(cy - 3)*49+c53);
        if(dist53 <= cmin){
            cmin= dist53;
            ans = d53;
        }

        int dist54 = Math.max(Math.abs(cx+9)*49 + c54, Math.abs(cy - 3)*49+c54);
        if(dist54 <= cmin){
            cmin= dist54;
            ans = d54;
        }

        int dist64 = Math.max(Math.abs(cx+4)*49 + c64, Math.abs(cy - 4)*49+c64);
        if(dist64 <= cmin){
            cmin= dist64;
            ans = d64;
        }

        int dist65 = Math.max(Math.abs(cx+5)*49 + c65, Math.abs(cy - 4)*49+c65);
        if(dist65 <= cmin){
            cmin= dist65;
            ans = d65;
        }

        int dist69 = Math.max(Math.abs(cx+9)*49 + c69, Math.abs(cy - 4)*49+c69);
        if(dist69 <= cmin){
            cmin= dist69;
            ans = d69;
        }

        int dist70 = Math.max(Math.abs(cx+10)*49 + c70, Math.abs(cy - 4)*49+c70);
        if(dist70 <= cmin){
            cmin= dist70;
            ans = d70;
        }

        int dist85 = Math.max(Math.abs(cx+10)*49 + c85, Math.abs(cy - 5)*49+c85);
        if(dist85 <= cmin){
            cmin= dist85;
            ans = d85;
        }

        int dist86 = Math.max(Math.abs(cx+11)*49 + c86, Math.abs(cy - 5)*49+c86);
        if(dist86 <= cmin){
            cmin= dist86;
            ans = d86;
        }

        int dist101 = Math.max(Math.abs(cx+11)*49 + c101, Math.abs(cy - 6)*49+c101);
        if(dist101 <= cmin){
            cmin= dist101;
            ans = d101;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*49+c116);
        if(dist116 <= cmin){
            cmin= dist116;
            ans = d116;
        }

        int dist131 = Math.max(Math.abs(cx+11)*49 + c131, Math.abs(cy - 8)*49+c131);
        if(dist131 <= cmin){
            cmin= dist131;
            ans = d131;
        }

        int dist145 = Math.max(Math.abs(cx+10)*49 + c145, Math.abs(cy - 9)*49+c145);
        if(dist145 <= cmin){
            cmin= dist145;
            ans = d145;
        }

        int dist146 = Math.max(Math.abs(cx+11)*49 + c146, Math.abs(cy - 9)*49+c146);
        if(dist146 <= cmin){
            cmin= dist146;
            ans = d146;
        }

        int dist160 = Math.max(Math.abs(cx+10)*49 + c160, Math.abs(cy - 10)*49+c160);
        if(dist160 <= cmin){
            cmin= dist160;
            ans = d160;
        }

        if(cmin<=nomove) return ans;

        int dist66 = Math.max(Math.abs(cx+6)*49 + c66, Math.abs(cy - 4)*49+c66);
        if(dist66 <= cmin){
            cmin= dist66;
            ans = d66;
        }

        int dist67 = Math.max(Math.abs(cx+7)*49 + c67, Math.abs(cy - 4)*49+c67);
        if(dist67 <= cmin){
            cmin= dist67;
            ans = d67;
        }

        int dist68 = Math.max(Math.abs(cx+8)*49 + c68, Math.abs(cy - 4)*49+c68);
        if(dist68 <= cmin){
            cmin= dist68;
            ans = d68;
        }

        int dist80 = Math.max(Math.abs(cx+5)*49 + c80, Math.abs(cy - 5)*49+c80);
        if(dist80 <= cmin){
            cmin= dist80;
            ans = d80;
        }

        int dist81 = Math.max(Math.abs(cx+6)*49 + c81, Math.abs(cy - 5)*49+c81);
        if(dist81 <= cmin){
            cmin= dist81;
            ans = d81;
        }

        int dist83 = Math.max(Math.abs(cx+8)*49 + c83, Math.abs(cy - 5)*49+c83);
        if(dist83 <= cmin){
            cmin= dist83;
            ans = d83;
        }

        int dist84 = Math.max(Math.abs(cx+9)*49 + c84, Math.abs(cy - 5)*49+c84);
        if(dist84 <= cmin){
            cmin= dist84;
            ans = d84;
        }

        int dist99 = Math.max(Math.abs(cx+9)*49 + c99, Math.abs(cy - 6)*49+c99);
        if(dist99 <= cmin){
            cmin= dist99;
            ans = d99;
        }

        int dist100 = Math.max(Math.abs(cx+10)*49 + c100, Math.abs(cy - 6)*49+c100);
        if(dist100 <= cmin){
            cmin= dist100;
            ans = d100;
        }

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*49+c115);
        if(dist115 <= cmin){
            cmin= dist115;
            ans = d115;
        }

        int dist129 = Math.max(Math.abs(cx+9)*49 + c129, Math.abs(cy - 8)*49+c129);
        if(dist129 <= cmin){
            cmin= dist129;
            ans = d129;
        }

        int dist130 = Math.max(Math.abs(cx+10)*49 + c130, Math.abs(cy - 8)*49+c130);
        if(dist130 <= cmin){
            cmin= dist130;
            ans = d130;
        }

        int dist144 = Math.max(Math.abs(cx+9)*49 + c144, Math.abs(cy - 9)*49+c144);
        if(dist144 <= cmin){
            cmin= dist144;
            ans = d144;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*49+c82);
        if(dist82 <= cmin){
            cmin= dist82;
            ans = d82;
        }

        int dist96 = Math.max(Math.abs(cx+6)*49 + c96, Math.abs(cy - 6)*49+c96);
        if(dist96 <= cmin){
            cmin= dist96;
            ans = d96;
        }

        int dist97 = Math.max(Math.abs(cx+7)*49 + c97, Math.abs(cy - 6)*49+c97);
        if(dist97 <= cmin){
            cmin= dist97;
            ans = d97;
        }

        int dist98 = Math.max(Math.abs(cx+8)*49 + c98, Math.abs(cy - 6)*49+c98);
        if(dist98 <= cmin){
            cmin= dist98;
            ans = d98;
        }

        int dist113 = Math.max(Math.abs(cx+8)*49 + c113, Math.abs(cy - 7)*49+c113);
        if(dist113 <= cmin){
            cmin= dist113;
            ans = d113;
        }

        int dist114 = Math.max(Math.abs(cx+9)*49 + c114, Math.abs(cy - 7)*49+c114);
        if(dist114 <= cmin){
            cmin= dist114;
            ans = d114;
        }

        int dist128 = Math.max(Math.abs(cx+8)*49 + c128, Math.abs(cy - 8)*49+c128);
        if(dist128 <= cmin){
            cmin= dist128;
            ans = d128;
        }

        return ans;
    }
}
