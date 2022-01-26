package baller;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class BFSBuilder {
    static MapLocation l112;
    static MapLocation l97;
    static MapLocation l127;
    static MapLocation l113;
    static MapLocation l128;
    static MapLocation l98;
    static MapLocation l126;
    static MapLocation l96;
    static MapLocation l111;
    static MapLocation l82;
    static MapLocation l83;
    static MapLocation l81;
    static MapLocation l142;
    static MapLocation l143;
    static MapLocation l141;
    static MapLocation l114;
    static MapLocation l129;
    static MapLocation l99;
    static MapLocation l144;
    static MapLocation l84;
    static MapLocation l140;
    static MapLocation l110;
    static MapLocation l125;
    static MapLocation l80;
    static MapLocation l95;
    static MapLocation l67;
    static MapLocation l68;
    static MapLocation l66;
    static MapLocation l69;
    static MapLocation l65;
    static MapLocation l157;
    static MapLocation l158;
    static MapLocation l156;
    static MapLocation l159;
    static MapLocation l155;
    static MapLocation l115;
    static MapLocation l130;
    static MapLocation l100;
    static MapLocation l145;
    static MapLocation l85;
    static MapLocation l160;
    static MapLocation l70;
    static MapLocation l154;
    static MapLocation l124;
    static MapLocation l139;
    static MapLocation l94;
    static MapLocation l109;
    static MapLocation l64;
    static MapLocation l79;
    static MapLocation l52;
    static MapLocation l53;
    static MapLocation l51;
    static MapLocation l54;
    static MapLocation l50;
    static MapLocation l172;
    static MapLocation l173;
    static MapLocation l171;
    static MapLocation l174;
    static MapLocation l170;
    static MapLocation l116;
    static MapLocation l131;
    static MapLocation l101;
    static MapLocation l146;
    static MapLocation l86;
    static MapLocation l138;
    static MapLocation l108;
    static MapLocation l123;
    static MapLocation l78;
    static MapLocation l93;
    static Direction getBestDir(RobotController rc) throws GameActionException {// find the least rubble
        MapLocation cur = rc.getLocation();
        MapLocation north = cur.add(Direction.NORTH);
        MapLocation south = cur.add(Direction.SOUTH);
        MapLocation east = cur.add(Direction.EAST);
        MapLocation west = cur.add(Direction.WEST);
        MapLocation northeast = cur.add(Direction.NORTHEAST);
        MapLocation northwest = cur.add(Direction.NORTHWEST);
        MapLocation southeast = cur.add(Direction.SOUTHEAST);
        MapLocation southwest = cur.add(Direction.SOUTHWEST);
        int cmin = Integer.MAX_VALUE;
        Direction ret = null;
        if(rc.onTheMap(north)&&!rc.isLocationOccupied(north)&&rc.senseRubble(north)<cmin){
            ret =  Direction.NORTH;
            cmin = rc.senseRubble(north);
        }
        if(rc.onTheMap(south)&&!rc.isLocationOccupied(south)&&rc.senseRubble(south)<cmin){
            ret= Direction.SOUTH;
            cmin = rc.senseRubble(south);

        }
        if(rc.onTheMap(east)&&!rc.isLocationOccupied(east)&&rc.senseRubble(east)<cmin){
            ret= Direction.EAST;
            cmin = rc.senseRubble(east);
        }
        if(rc.onTheMap(west)&&!rc.isLocationOccupied(west)&&rc.senseRubble(west)<cmin){
            ret= Direction.WEST;
            cmin = rc.senseRubble(west);
        }
        if(rc.onTheMap(northeast)&&!rc.isLocationOccupied(northeast)&&rc.senseRubble(northeast)<cmin){
            ret= Direction.NORTHEAST;
            cmin = rc.senseRubble(northeast);
        }
        if(rc.onTheMap(northwest)&&!rc.isLocationOccupied(northwest)&&rc.senseRubble(northwest)<cmin){
            ret= Direction.NORTHWEST;
            cmin = rc.senseRubble(northwest);
        }
        if(rc.onTheMap(southeast)&&!rc.isLocationOccupied(southeast)&&rc.senseRubble(southeast)<cmin){
            ret= Direction.SOUTHEAST;
            cmin = rc.senseRubble(southeast);
        }
        if(rc.onTheMap(southwest)&&!rc.isLocationOccupied(southwest)&&rc.senseRubble(southwest)<cmin){
            ret= Direction.SOUTHWEST;
            cmin = rc.senseRubble(southwest);
        }
        System.out.println(cmin);
        System.out.println(ret);
        return ret;
    }
    static MapLocation smallestInRange(RobotController rc) throws GameActionException {
        MapLocation ret = null;
        int cmin = Integer.MAX_VALUE;
        l112 = rc.getLocation();
        if(rc.senseRubble(l112)<cmin){
            cmin=rc.senseRubble(l112);
            ret=l112;
        }

        l97 = l112.add(Direction.NORTH);
        if(rc.onTheMap(l97)&&!rc.isLocationOccupied(l97)&&rc.senseRubble(l97)<cmin){
            cmin=rc.senseRubble(l97);
            ret=l97;
        }

        l127 = l112.add(Direction.SOUTH);
        if(rc.onTheMap(l127)&&!rc.isLocationOccupied(l127)&&rc.senseRubble(l127)<cmin){
            cmin=rc.senseRubble(l127);
            ret=l127;
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

        l126 = l112.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l126)&&!rc.isLocationOccupied(l126)&&rc.senseRubble(l126)<cmin){
            cmin=rc.senseRubble(l126);
            ret=l126;
        }

        l96 = l112.add(Direction.NORTHWEST);
        if(rc.onTheMap(l96)&&!rc.isLocationOccupied(l96)&&rc.senseRubble(l96)<cmin){
            cmin=rc.senseRubble(l96);
            ret=l96;
        }

        l111 = l112.add(Direction.WEST);
        if(rc.onTheMap(l111)&&!rc.isLocationOccupied(l111)&&rc.senseRubble(l111)<cmin){
            cmin=rc.senseRubble(l111);
            ret=l111;
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

        l142 = l127.add(Direction.SOUTH);
        if(rc.onTheMap(l142)&&!rc.isLocationOccupied(l142)&&rc.senseRubble(l142)<cmin){
            cmin=rc.senseRubble(l142);
            ret=l142;
        }

        l143 = l127.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l143)&&!rc.isLocationOccupied(l143)&&rc.senseRubble(l143)<cmin){
            cmin=rc.senseRubble(l143);
            ret=l143;
        }

        l141 = l127.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l141)&&!rc.isLocationOccupied(l141)&&rc.senseRubble(l141)<cmin){
            cmin=rc.senseRubble(l141);
            ret=l141;
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

        l140 = l126.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l140)&&!rc.isLocationOccupied(l140)&&rc.senseRubble(l140)<cmin){
            cmin=rc.senseRubble(l140);
            ret=l140;
        }

        l110 = l126.add(Direction.NORTHWEST);
        if(rc.onTheMap(l110)&&!rc.isLocationOccupied(l110)&&rc.senseRubble(l110)<cmin){
            cmin=rc.senseRubble(l110);
            ret=l110;
        }

        l125 = l126.add(Direction.WEST);
        if(rc.onTheMap(l125)&&!rc.isLocationOccupied(l125)&&rc.senseRubble(l125)<cmin){
            cmin=rc.senseRubble(l125);
            ret=l125;
        }

        l80 = l96.add(Direction.NORTHWEST);
        if(rc.onTheMap(l80)&&!rc.isLocationOccupied(l80)&&rc.senseRubble(l80)<cmin){
            cmin=rc.senseRubble(l80);
            ret=l80;
        }

        l95 = l96.add(Direction.WEST);
        if(rc.onTheMap(l95)&&!rc.isLocationOccupied(l95)&&rc.senseRubble(l95)<cmin){
            cmin=rc.senseRubble(l95);
            ret=l95;
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

        l157 = l142.add(Direction.SOUTH);
        if(rc.onTheMap(l157)&&!rc.isLocationOccupied(l157)&&rc.senseRubble(l157)<cmin){
            cmin=rc.senseRubble(l157);
            ret=l157;
        }

        l158 = l142.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l158)&&!rc.isLocationOccupied(l158)&&rc.senseRubble(l158)<cmin){
            cmin=rc.senseRubble(l158);
            ret=l158;
        }

        l156 = l142.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l156)&&!rc.isLocationOccupied(l156)&&rc.senseRubble(l156)<cmin){
            cmin=rc.senseRubble(l156);
            ret=l156;
        }

        l159 = l143.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l159)&&!rc.isLocationOccupied(l159)&&rc.senseRubble(l159)<cmin){
            cmin=rc.senseRubble(l159);
            ret=l159;
        }

        l155 = l141.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l155)&&!rc.isLocationOccupied(l155)&&rc.senseRubble(l155)<cmin){
            cmin=rc.senseRubble(l155);
            ret=l155;
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

        l154 = l140.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l154)&&!rc.isLocationOccupied(l154)&&rc.senseRubble(l154)<cmin){
            cmin=rc.senseRubble(l154);
            ret=l154;
        }

        l124 = l140.add(Direction.NORTHWEST);
        if(rc.onTheMap(l124)&&!rc.isLocationOccupied(l124)&&rc.senseRubble(l124)<cmin){
            cmin=rc.senseRubble(l124);
            ret=l124;
        }

        l139 = l140.add(Direction.WEST);
        if(rc.onTheMap(l139)&&!rc.isLocationOccupied(l139)&&rc.senseRubble(l139)<cmin){
            cmin=rc.senseRubble(l139);
            ret=l139;
        }

        l94 = l110.add(Direction.NORTHWEST);
        if(rc.onTheMap(l94)&&!rc.isLocationOccupied(l94)&&rc.senseRubble(l94)<cmin){
            cmin=rc.senseRubble(l94);
            ret=l94;
        }

        l109 = l110.add(Direction.WEST);
        if(rc.onTheMap(l109)&&!rc.isLocationOccupied(l109)&&rc.senseRubble(l109)<cmin){
            cmin=rc.senseRubble(l109);
            ret=l109;
        }

        l64 = l80.add(Direction.NORTHWEST);
        if(rc.onTheMap(l64)&&!rc.isLocationOccupied(l64)&&rc.senseRubble(l64)<cmin){
            cmin=rc.senseRubble(l64);
            ret=l64;
        }

        l79 = l80.add(Direction.WEST);
        if(rc.onTheMap(l79)&&!rc.isLocationOccupied(l79)&&rc.senseRubble(l79)<cmin){
            cmin=rc.senseRubble(l79);
            ret=l79;
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

        l172 = l157.add(Direction.SOUTH);
        if(rc.onTheMap(l172)&&!rc.isLocationOccupied(l172)&&rc.senseRubble(l172)<cmin){
            cmin=rc.senseRubble(l172);
            ret=l172;
        }

        l173 = l157.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l173)&&!rc.isLocationOccupied(l173)&&rc.senseRubble(l173)<cmin){
            cmin=rc.senseRubble(l173);
            ret=l173;
        }

        l171 = l157.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l171)&&!rc.isLocationOccupied(l171)&&rc.senseRubble(l171)<cmin){
            cmin=rc.senseRubble(l171);
            ret=l171;
        }

        l174 = l158.add(Direction.SOUTHEAST);
        if(rc.onTheMap(l174)&&!rc.isLocationOccupied(l174)&&rc.senseRubble(l174)<cmin){
            cmin=rc.senseRubble(l174);
            ret=l174;
        }

        l170 = l156.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l170)&&!rc.isLocationOccupied(l170)&&rc.senseRubble(l170)<cmin){
            cmin=rc.senseRubble(l170);
            ret=l170;
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

        l138 = l154.add(Direction.NORTHWEST);
        if(rc.onTheMap(l138)&&!rc.isLocationOccupied(l138)&&rc.senseRubble(l138)<cmin){
            cmin=rc.senseRubble(l138);
            ret=l138;
        }

        l108 = l124.add(Direction.NORTHWEST);
        if(rc.onTheMap(l108)&&!rc.isLocationOccupied(l108)&&rc.senseRubble(l108)<cmin){
            cmin=rc.senseRubble(l108);
            ret=l108;
        }

        l123 = l124.add(Direction.WEST);
        if(rc.onTheMap(l123)&&!rc.isLocationOccupied(l123)&&rc.senseRubble(l123)<cmin){
            cmin=rc.senseRubble(l123);
            ret=l123;
        }

        l78 = l94.add(Direction.NORTHWEST);
        if(rc.onTheMap(l78)&&!rc.isLocationOccupied(l78)&&rc.senseRubble(l78)<cmin){
            cmin=rc.senseRubble(l78);
            ret=l78;
        }

        l93 = l94.add(Direction.WEST);
        if(rc.onTheMap(l93)&&!rc.isLocationOccupied(l93)&&rc.senseRubble(l93)<cmin){
            cmin=rc.senseRubble(l93);
            ret=l93;
        }
        return ret;
    }
}
