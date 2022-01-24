package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class BFSWest {
    static MapLocation l112;
    static int c112;
    static int r112;
    static Direction d112;

    static MapLocation l97;
    static int c97;
    static int r97;
    static Direction d97;

    static MapLocation l127;
    static int c127;
    static int r127;
    static Direction d127;

    static MapLocation l126;
    static int c126;
    static int r126;
    static Direction d126;

    static MapLocation l96;
    static int c96;
    static int r96;
    static Direction d96;

    static MapLocation l111;
    static int c111;
    static int r111;
    static Direction d111;

    static MapLocation l82;
    static int c82;
    static int r82;
    static Direction d82;

    static MapLocation l81;
    static int c81;
    static int r81;
    static Direction d81;

    static MapLocation l142;
    static int c142;
    static int r142;
    static Direction d142;

    static MapLocation l141;
    static int c141;
    static int r141;
    static Direction d141;

    static MapLocation l140;
    static int c140;
    static int r140;
    static Direction d140;

    static MapLocation l110;
    static int c110;
    static int r110;
    static Direction d110;

    static MapLocation l125;
    static int c125;
    static int r125;
    static Direction d125;

    static MapLocation l80;
    static int c80;
    static int r80;
    static Direction d80;

    static MapLocation l95;
    static int c95;
    static int r95;
    static Direction d95;

    static MapLocation l67;
    static int c67;
    static int r67;
    static Direction d67;

    static MapLocation l66;
    static int c66;
    static int r66;
    static Direction d66;

    static MapLocation l65;
    static int c65;
    static int r65;
    static Direction d65;

    static MapLocation l157;
    static int c157;
    static int r157;
    static Direction d157;

    static MapLocation l156;
    static int c156;
    static int r156;
    static Direction d156;

    static MapLocation l155;
    static int c155;
    static int r155;
    static Direction d155;

    static MapLocation l154;
    static int c154;
    static int r154;
    static Direction d154;

    static MapLocation l124;
    static int c124;
    static int r124;
    static Direction d124;

    static MapLocation l139;
    static int c139;
    static int r139;
    static Direction d139;

    static MapLocation l94;
    static int c94;
    static int r94;
    static Direction d94;

    static MapLocation l109;
    static int c109;
    static int r109;
    static Direction d109;

    static MapLocation l64;
    static int c64;
    static int r64;
    static Direction d64;

    static MapLocation l79;
    static int c79;
    static int r79;
    static Direction d79;

    static MapLocation l52;
    static int c52;
    static int r52;
    static Direction d52;

    static MapLocation l51;
    static int c51;
    static int r51;
    static Direction d51;

    static MapLocation l50;
    static int c50;
    static int r50;
    static Direction d50;

    static MapLocation l172;
    static int c172;
    static int r172;
    static Direction d172;

    static MapLocation l171;
    static int c171;
    static int r171;
    static Direction d171;

    static MapLocation l170;
    static int c170;
    static int r170;
    static Direction d170;

    static MapLocation l138;
    static int c138;
    static int r138;
    static Direction d138;

    static MapLocation l108;
    static int c108;
    static int r108;
    static Direction d108;

    static MapLocation l123;
    static int c123;
    static int r123;
    static Direction d123;

    static MapLocation l78;
    static int c78;
    static int r78;
    static Direction d78;

    static MapLocation l93;
    static int c93;
    static int r93;
    static Direction d93;

    static Direction ans;
    static MapLocation lowest(RobotController rc) throws GameActionException {
        l112 = rc.getLocation();
        int cmin = Integer.MAX_VALUE;
        MapLocation ret = null;

        if(rc.onTheMap(l112)&&!rc.isLocationOccupied(l112)&&rc.senseRubble(l112)<cmin){
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

        l141 = l127.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l141)&&!rc.isLocationOccupied(l141)&&rc.senseRubble(l141)<cmin){
            cmin=rc.senseRubble(l141);
            ret=l141;
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

        l66 = l82.add(Direction.NORTHWEST);
        if(rc.onTheMap(l66)&&!rc.isLocationOccupied(l66)&&rc.senseRubble(l66)<cmin){
            cmin=rc.senseRubble(l66);
            ret=l66;
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

        l156 = l142.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l156)&&!rc.isLocationOccupied(l156)&&rc.senseRubble(l156)<cmin){
            cmin=rc.senseRubble(l156);
            ret=l156;
        }

        l155 = l141.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l155)&&!rc.isLocationOccupied(l155)&&rc.senseRubble(l155)<cmin){
            cmin=rc.senseRubble(l155);
            ret=l155;
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

        l51 = l67.add(Direction.NORTHWEST);
        if(rc.onTheMap(l51)&&!rc.isLocationOccupied(l51)&&rc.senseRubble(l51)<cmin){
            cmin=rc.senseRubble(l51);
            ret=l51;
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

        l171 = l157.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l171)&&!rc.isLocationOccupied(l171)&&rc.senseRubble(l171)<cmin){
            cmin=rc.senseRubble(l171);
            ret=l171;
        }

        l170 = l156.add(Direction.SOUTHWEST);
        if(rc.onTheMap(l170)&&!rc.isLocationOccupied(l170)&&rc.senseRubble(l170)<cmin){
            cmin=rc.senseRubble(l170);
            ret=l170;
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
    static Direction gbda(RobotController rc, MapLocation target, Direction prev) throws GameActionException {//get best dir -all
        ans = null;
        l112 = rc.getLocation();
        c112 = 0;

        l97 = l112.add(Direction.NORTH);
        c97 = 10000000;
        d97 = null;

        l127 = l112.add(Direction.SOUTH);
        c127 = 10000000;
        d127 = null;

        l126 = l112.add(Direction.SOUTHWEST);
        c126 = 10000000;
        d126 = null;

        l96 = l112.add(Direction.NORTHWEST);
        c96 = 10000000;
        d96 = null;

        l111 = l112.add(Direction.WEST);
        c111 = 10000000;
        d111 = null;

        l82 = l97.add(Direction.NORTH);
        c82 = 10000000;
        d82 = null;

        l81 = l97.add(Direction.NORTHWEST);
        c81 = 10000000;
        d81 = null;

        l142 = l127.add(Direction.SOUTH);
        c142 = 10000000;
        d142 = null;

        l141 = l127.add(Direction.SOUTHWEST);
        c141 = 10000000;
        d141 = null;

        l140 = l126.add(Direction.SOUTHWEST);
        c140 = 10000000;
        d140 = null;

        l110 = l126.add(Direction.NORTHWEST);
        c110 = 10000000;
        d110 = null;

        l125 = l126.add(Direction.WEST);
        c125 = 10000000;
        d125 = null;

        l80 = l96.add(Direction.NORTHWEST);
        c80 = 10000000;
        d80 = null;

        l95 = l96.add(Direction.WEST);
        c95 = 10000000;
        d95 = null;

        l67 = l82.add(Direction.NORTH);
        c67 = 10000000;
        d67 = null;

        l66 = l82.add(Direction.NORTHWEST);
        c66 = 10000000;
        d66 = null;

        l65 = l81.add(Direction.NORTHWEST);
        c65 = 10000000;
        d65 = null;

        l157 = l142.add(Direction.SOUTH);
        c157 = 10000000;
        d157 = null;

        l156 = l142.add(Direction.SOUTHWEST);
        c156 = 10000000;
        d156 = null;

        l155 = l141.add(Direction.SOUTHWEST);
        c155 = 10000000;
        d155 = null;

        l154 = l140.add(Direction.SOUTHWEST);
        c154 = 10000000;
        d154 = null;

        l124 = l140.add(Direction.NORTHWEST);
        c124 = 10000000;
        d124 = null;

        l139 = l140.add(Direction.WEST);
        c139 = 10000000;
        d139 = null;

        l94 = l110.add(Direction.NORTHWEST);
        c94 = 10000000;
        d94 = null;

        l109 = l110.add(Direction.WEST);
        c109 = 10000000;
        d109 = null;

        l64 = l80.add(Direction.NORTHWEST);
        c64 = 10000000;
        d64 = null;

        l79 = l80.add(Direction.WEST);
        c79 = 10000000;
        d79 = null;

        l52 = l67.add(Direction.NORTH);
        c52 = 10000000;
        d52 = null;

        l51 = l67.add(Direction.NORTHWEST);
        c51 = 10000000;
        d51 = null;

        l50 = l66.add(Direction.NORTHWEST);
        c50 = 10000000;
        d50 = null;

        l172 = l157.add(Direction.SOUTH);
        c172 = 10000000;
        d172 = null;

        l171 = l157.add(Direction.SOUTHWEST);
        c171 = 10000000;
        d171 = null;

        l170 = l156.add(Direction.SOUTHWEST);
        c170 = 10000000;
        d170 = null;

        l138 = l154.add(Direction.NORTHWEST);
        c138 = 10000000;
        d138 = null;

        l108 = l124.add(Direction.NORTHWEST);
        c108 = 10000000;
        d108 = null;

        l123 = l124.add(Direction.WEST);
        c123 = 10000000;
        d123 = null;

        l78 = l94.add(Direction.NORTHWEST);
        c78 = 10000000;
        d78 = null;

        l93 = l94.add(Direction.WEST);
        c93 = 10000000;
        d93 = null;

        if(rc.onTheMap(l97)){
            if(!rc.isLocationOccupied(l97)){
                r97 = 10 + rc.senseRubble(l97);
                if(c97 > c112 + r97 && prev != Direction.NORTH){
                    d97 = Direction.NORTH;
                    c97 = c112 + r97;
                }
            }
        }

        if(rc.onTheMap(l127)){
            if(!rc.isLocationOccupied(l127)){
                r127 = 10 + rc.senseRubble(l127);
                if(c127 > c112 + r127 && prev != Direction.SOUTH){
                    d127 = Direction.SOUTH;
                    c127 = c112 + r127;
                }
            }
        }

        if(rc.onTheMap(l126)){
            if(!rc.isLocationOccupied(l126)){
                r126 = 10 + rc.senseRubble(l126);
                if(c126 > c112 + r126 && prev != Direction.SOUTHWEST){
                    d126 = Direction.SOUTHWEST;
                    c126 = c112 + r126;
                }
                if(c126 > c127 + r126){
                    d126 = d127;
                    c126 = c127 + r126;
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
                if(c96 > c97 + r96){
                    d96 = d97;
                    c96 = c97 + r96;
                }
            }
        }

        if(rc.onTheMap(l111)){
            if(!rc.isLocationOccupied(l111)){
                r111 = 10 + rc.senseRubble(l111);
                if(c111 > c126 + r111){
                    d111 = d126;
                    c111 = c126 + r111;
                }
                if(c111 > c96 + r111){
                    d111 = d96;
                    c111 = c96 + r111;
                }
                if(c111 > c97 + r111){
                    d111 = d97;
                    c111 = c97 + r111;
                }
                if(c111 > c127 + r111){
                    d111 = d127;
                    c111 = c127 + r111;
                }
                if(c111 > c112 + r111 && prev != Direction.WEST){
                    d111 = Direction.WEST;
                    c111 = c112 + r111;
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
                if(c81 > c82 + r81){
                    d81 = d82;
                    c81 = c82 + r81;
                }
            }
        }

        if(rc.onTheMap(l142)){
            if(!rc.isLocationOccupied(l142)){
                r142 = 10 + rc.senseRubble(l142);
                if(c142 > c127 + r142){
                    d142 = d127;
                    c142 = c127 + r142;
                }
            }
        }

        if(rc.onTheMap(l141)){
            if(!rc.isLocationOccupied(l141)){
                r141 = 10 + rc.senseRubble(l141);
                if(c141 > c126 + r141){
                    d141 = d126;
                    c141 = c126 + r141;
                }
                if(c141 > c127 + r141){
                    d141 = d127;
                    c141 = c127 + r141;
                }
                if(c141 > c142 + r141){
                    d141 = d142;
                    c141 = c142 + r141;
                }
            }
        }

        if(rc.onTheMap(l140)){
            if(!rc.isLocationOccupied(l140)){
                r140 = 10 + rc.senseRubble(l140);
                if(c140 > c126 + r140){
                    d140 = d126;
                    c140 = c126 + r140;
                }
                if(c140 > c141 + r140){
                    d140 = d141;
                    c140 = c141 + r140;
                }
            }
        }

        if(rc.onTheMap(l110)){
            if(!rc.isLocationOccupied(l110)){
                r110 = 10 + rc.senseRubble(l110);
                if(c110 > c96 + r110){
                    d110 = d96;
                    c110 = c96 + r110;
                }
                if(c110 > c126 + r110){
                    d110 = d126;
                    c110 = c126 + r110;
                }
                if(c110 > c111 + r110){
                    d110 = d111;
                    c110 = c111 + r110;
                }
            }
        }

        if(rc.onTheMap(l125)){
            if(!rc.isLocationOccupied(l125)){
                r125 = 10 + rc.senseRubble(l125);
                if(c125 > c140 + r125){
                    d125 = d140;
                    c125 = c140 + r125;
                }
                if(c125 > c110 + r125){
                    d125 = d110;
                    c125 = c110 + r125;
                }
                if(c125 > c111 + r125){
                    d125 = d111;
                    c125 = c111 + r125;
                }
                if(c125 > c141 + r125){
                    d125 = d141;
                    c125 = c141 + r125;
                }
                if(c125 > c126 + r125){
                    d125 = d126;
                    c125 = c126 + r125;
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
                if(c80 > c81 + r80){
                    d80 = d81;
                    c80 = c81 + r80;
                }
            }
        }

        if(rc.onTheMap(l95)){
            if(!rc.isLocationOccupied(l95)){
                r95 = 10 + rc.senseRubble(l95);
                if(c95 > c110 + r95){
                    d95 = d110;
                    c95 = c110 + r95;
                }
                if(c95 > c80 + r95){
                    d95 = d80;
                    c95 = c80 + r95;
                }
                if(c95 > c81 + r95){
                    d95 = d81;
                    c95 = c81 + r95;
                }
                if(c95 > c111 + r95){
                    d95 = d111;
                    c95 = c111 + r95;
                }
                if(c95 > c96 + r95){
                    d95 = d96;
                    c95 = c96 + r95;
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
            }
        }

        if(rc.onTheMap(l66)){
            if(!rc.isLocationOccupied(l66)){
                r66 = 10 + rc.senseRubble(l66);
                if(c66 > c81 + r66){
                    d66 = d81;
                    c66 = c81 + r66;
                }
                if(c66 > c82 + r66){
                    d66 = d82;
                    c66 = c82 + r66;
                }
                if(c66 > c67 + r66){
                    d66 = d67;
                    c66 = c67 + r66;
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
                if(c65 > c66 + r65){
                    d65 = d66;
                    c65 = c66 + r65;
                }
            }
        }

        if(rc.onTheMap(l157)){
            if(!rc.isLocationOccupied(l157)){
                r157 = 10 + rc.senseRubble(l157);
                if(c157 > c142 + r157){
                    d157 = d142;
                    c157 = c142 + r157;
                }
            }
        }

        if(rc.onTheMap(l156)){
            if(!rc.isLocationOccupied(l156)){
                r156 = 10 + rc.senseRubble(l156);
                if(c156 > c141 + r156){
                    d156 = d141;
                    c156 = c141 + r156;
                }
                if(c156 > c142 + r156){
                    d156 = d142;
                    c156 = c142 + r156;
                }
                if(c156 > c157 + r156){
                    d156 = d157;
                    c156 = c157 + r156;
                }
            }
        }

        if(rc.onTheMap(l155)){
            if(!rc.isLocationOccupied(l155)){
                r155 = 10 + rc.senseRubble(l155);
                if(c155 > c140 + r155){
                    d155 = d140;
                    c155 = c140 + r155;
                }
                if(c155 > c141 + r155){
                    d155 = d141;
                    c155 = c141 + r155;
                }
                if(c155 > c156 + r155){
                    d155 = d156;
                    c155 = c156 + r155;
                }
            }
        }

        if(rc.onTheMap(l154)){
            if(!rc.isLocationOccupied(l154)){
                r154 = 10 + rc.senseRubble(l154);
                if(c154 > c140 + r154){
                    d154 = d140;
                    c154 = c140 + r154;
                }
                if(c154 > c155 + r154){
                    d154 = d155;
                    c154 = c155 + r154;
                }
            }
        }

        if(rc.onTheMap(l124)){
            if(!rc.isLocationOccupied(l124)){
                r124 = 10 + rc.senseRubble(l124);
                if(c124 > c110 + r124){
                    d124 = d110;
                    c124 = c110 + r124;
                }
                if(c124 > c140 + r124){
                    d124 = d140;
                    c124 = c140 + r124;
                }
                if(c124 > c125 + r124){
                    d124 = d125;
                    c124 = c125 + r124;
                }
            }
        }

        if(rc.onTheMap(l139)){
            if(!rc.isLocationOccupied(l139)){
                r139 = 10 + rc.senseRubble(l139);
                if(c139 > c154 + r139){
                    d139 = d154;
                    c139 = c154 + r139;
                }
                if(c139 > c124 + r139){
                    d139 = d124;
                    c139 = c124 + r139;
                }
                if(c139 > c125 + r139){
                    d139 = d125;
                    c139 = c125 + r139;
                }
                if(c139 > c155 + r139){
                    d139 = d155;
                    c139 = c155 + r139;
                }
                if(c139 > c140 + r139){
                    d139 = d140;
                    c139 = c140 + r139;
                }
            }
        }

        if(rc.onTheMap(l94)){
            if(!rc.isLocationOccupied(l94)){
                r94 = 10 + rc.senseRubble(l94);
                if(c94 > c80 + r94){
                    d94 = d80;
                    c94 = c80 + r94;
                }
                if(c94 > c110 + r94){
                    d94 = d110;
                    c94 = c110 + r94;
                }
                if(c94 > c95 + r94){
                    d94 = d95;
                    c94 = c95 + r94;
                }
            }
        }

        if(rc.onTheMap(l109)){
            if(!rc.isLocationOccupied(l109)){
                r109 = 10 + rc.senseRubble(l109);
                if(c109 > c124 + r109){
                    d109 = d124;
                    c109 = c124 + r109;
                }
                if(c109 > c94 + r109){
                    d109 = d94;
                    c109 = c94 + r109;
                }
                if(c109 > c95 + r109){
                    d109 = d95;
                    c109 = c95 + r109;
                }
                if(c109 > c125 + r109){
                    d109 = d125;
                    c109 = c125 + r109;
                }
                if(c109 > c110 + r109){
                    d109 = d110;
                    c109 = c110 + r109;
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
                if(c64 > c65 + r64){
                    d64 = d65;
                    c64 = c65 + r64;
                }
            }
        }

        if(rc.onTheMap(l79)){
            if(!rc.isLocationOccupied(l79)){
                r79 = 10 + rc.senseRubble(l79);
                if(c79 > c94 + r79){
                    d79 = d94;
                    c79 = c94 + r79;
                }
                if(c79 > c64 + r79){
                    d79 = d64;
                    c79 = c64 + r79;
                }
                if(c79 > c65 + r79){
                    d79 = d65;
                    c79 = c65 + r79;
                }
                if(c79 > c95 + r79){
                    d79 = d95;
                    c79 = c95 + r79;
                }
                if(c79 > c80 + r79){
                    d79 = d80;
                    c79 = c80 + r79;
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
            }
        }

        if(rc.onTheMap(l51)){
            if(!rc.isLocationOccupied(l51)){
                r51 = 10 + rc.senseRubble(l51);
                if(c51 > c66 + r51){
                    d51 = d66;
                    c51 = c66 + r51;
                }
                if(c51 > c67 + r51){
                    d51 = d67;
                    c51 = c67 + r51;
                }
                if(c51 > c52 + r51){
                    d51 = d52;
                    c51 = c52 + r51;
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
                if(c50 > c66 + r50){
                    d50 = d66;
                    c50 = c66 + r50;
                }
                if(c50 > c51 + r50){
                    d50 = d51;
                    c50 = c51 + r50;
                }
            }
        }

        if(rc.onTheMap(l172)){
            if(!rc.isLocationOccupied(l172)){
                r172 = 10 + rc.senseRubble(l172);
                if(c172 > c157 + r172){
                    d172 = d157;
                    c172 = c157 + r172;
                }
            }
        }

        if(rc.onTheMap(l171)){
            if(!rc.isLocationOccupied(l171)){
                r171 = 10 + rc.senseRubble(l171);
                if(c171 > c156 + r171){
                    d171 = d156;
                    c171 = c156 + r171;
                }
                if(c171 > c157 + r171){
                    d171 = d157;
                    c171 = c157 + r171;
                }
                if(c171 > c172 + r171){
                    d171 = d172;
                    c171 = c172 + r171;
                }
            }
        }

        if(rc.onTheMap(l170)){
            if(!rc.isLocationOccupied(l170)){
                r170 = 10 + rc.senseRubble(l170);
                if(c170 > c155 + r170){
                    d170 = d155;
                    c170 = c155 + r170;
                }
                if(c170 > c156 + r170){
                    d170 = d156;
                    c170 = c156 + r170;
                }
                if(c170 > c171 + r170){
                    d170 = d171;
                    c170 = c171 + r170;
                }
            }
        }

        if(rc.onTheMap(l138)){
            if(!rc.isLocationOccupied(l138)){
                r138 = 10 + rc.senseRubble(l138);
                if(c138 > c124 + r138){
                    d138 = d124;
                    c138 = c124 + r138;
                }
                if(c138 > c154 + r138){
                    d138 = d154;
                    c138 = c154 + r138;
                }
                if(c138 > c139 + r138){
                    d138 = d139;
                    c138 = c139 + r138;
                }
            }
        }

        if(rc.onTheMap(l108)){
            if(!rc.isLocationOccupied(l108)){
                r108 = 10 + rc.senseRubble(l108);
                if(c108 > c94 + r108){
                    d108 = d94;
                    c108 = c94 + r108;
                }
                if(c108 > c124 + r108){
                    d108 = d124;
                    c108 = c124 + r108;
                }
                if(c108 > c109 + r108){
                    d108 = d109;
                    c108 = c109 + r108;
                }
            }
        }

        if(rc.onTheMap(l123)){
            if(!rc.isLocationOccupied(l123)){
                r123 = 10 + rc.senseRubble(l123);
                if(c123 > c138 + r123){
                    d123 = d138;
                    c123 = c138 + r123;
                }
                if(c123 > c108 + r123){
                    d123 = d108;
                    c123 = c108 + r123;
                }
                if(c123 > c109 + r123){
                    d123 = d109;
                    c123 = c109 + r123;
                }
                if(c123 > c139 + r123){
                    d123 = d139;
                    c123 = c139 + r123;
                }
                if(c123 > c124 + r123){
                    d123 = d124;
                    c123 = c124 + r123;
                }
            }
        }

        if(rc.onTheMap(l78)){
            if(!rc.isLocationOccupied(l78)){
                r78 = 10 + rc.senseRubble(l78);
                if(c78 > c64 + r78){
                    d78 = d64;
                    c78 = c64 + r78;
                }
                if(c78 > c94 + r78){
                    d78 = d94;
                    c78 = c94 + r78;
                }
                if(c78 > c79 + r78){
                    d78 = d79;
                    c78 = c79 + r78;
                }
            }
        }

        if(rc.onTheMap(l93)){
            if(!rc.isLocationOccupied(l93)){
                r93 = 10 + rc.senseRubble(l93);
                if(c93 > c108 + r93){
                    d93 = d108;
                    c93 = c108 + r93;
                }
                if(c93 > c78 + r93){
                    d93 = d78;
                    c93 = c78 + r93;
                }
                if(c93 > c79 + r93){
                    d93 = d79;
                    c93 = c79 + r93;
                }
                if(c93 > c109 + r93){
                    d93 = d109;
                    c93 = c109 + r93;
                }
                if(c93 > c94 + r93){
                    d93 = d94;
                    c93 = c94 + r93;
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

        int dist78 = Math.max(Math.abs(cx+3)*49 + c78, Math.abs(cy - 5)*49+c78);
        if(dist78 <= cmin){
            cmin= dist78;
            ans = d78;
        }

        int dist79 = Math.max(Math.abs(cx+4)*49 + c79, Math.abs(cy - 5)*49+c79);
        if(dist79 <= cmin){
            cmin= dist79;
            ans = d79;
        }

        int dist93 = Math.max(Math.abs(cx+3)*49 + c93, Math.abs(cy - 6)*49+c93);
        if(dist93 <= cmin){
            cmin= dist93;
            ans = d93;
        }

        int dist108 = Math.max(Math.abs(cx+3)*49 + c108, Math.abs(cy - 7)*49+c108);
        if(dist108 <= cmin){
            cmin= dist108;
            ans = d108;
        }

        int dist123 = Math.max(Math.abs(cx+3)*49 + c123, Math.abs(cy - 8)*49+c123);
        if(dist123 <= cmin){
            cmin= dist123;
            ans = d123;
        }

        int dist138 = Math.max(Math.abs(cx+3)*49 + c138, Math.abs(cy - 9)*49+c138);
        if(dist138 <= cmin){
            cmin= dist138;
            ans = d138;
        }

        int dist139 = Math.max(Math.abs(cx+4)*49 + c139, Math.abs(cy - 9)*49+c139);
        if(dist139 <= cmin){
            cmin= dist139;
            ans = d139;
        }

        int dist154 = Math.max(Math.abs(cx+4)*49 + c154, Math.abs(cy - 10)*49+c154);
        if(dist154 <= cmin){
            cmin= dist154;
            ans = d154;
        }

        int dist155 = Math.max(Math.abs(cx+5)*49 + c155, Math.abs(cy - 10)*49+c155);
        if(dist155 <= cmin){
            cmin= dist155;
            ans = d155;
        }

        int dist170 = Math.max(Math.abs(cx+5)*49 + c170, Math.abs(cy - 11)*49+c170);
        if(dist170 <= cmin){
            cmin= dist170;
            ans = d170;
        }

        int dist171 = Math.max(Math.abs(cx+6)*49 + c171, Math.abs(cy - 11)*49+c171);
        if(dist171 <= cmin){
            cmin= dist171;
            ans = d171;
        }

        int dist172 = Math.max(Math.abs(cx+7)*49 + c172, Math.abs(cy - 11)*49+c172);
        if(dist172 <= cmin){
            cmin= dist172;
            ans = d172;
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

        int dist94 = Math.max(Math.abs(cx+4)*49 + c94, Math.abs(cy - 6)*49+c94);
        if(dist94 <= cmin){
            cmin= dist94;
            ans = d94;
        }

        int dist95 = Math.max(Math.abs(cx+5)*49 + c95, Math.abs(cy - 6)*49+c95);
        if(dist95 <= cmin){
            cmin= dist95;
            ans = d95;
        }

        int dist109 = Math.max(Math.abs(cx+4)*49 + c109, Math.abs(cy - 7)*49+c109);
        if(dist109 <= cmin){
            cmin= dist109;
            ans = d109;
        }

        int dist124 = Math.max(Math.abs(cx+4)*49 + c124, Math.abs(cy - 8)*49+c124);
        if(dist124 <= cmin){
            cmin= dist124;
            ans = d124;
        }

        int dist125 = Math.max(Math.abs(cx+5)*49 + c125, Math.abs(cy - 8)*49+c125);
        if(dist125 <= cmin){
            cmin= dist125;
            ans = d125;
        }

        int dist140 = Math.max(Math.abs(cx+5)*49 + c140, Math.abs(cy - 9)*49+c140);
        if(dist140 <= cmin){
            cmin= dist140;
            ans = d140;
        }

        int dist141 = Math.max(Math.abs(cx+6)*49 + c141, Math.abs(cy - 9)*49+c141);
        if(dist141 <= cmin){
            cmin= dist141;
            ans = d141;
        }

        int dist156 = Math.max(Math.abs(cx+6)*49 + c156, Math.abs(cy - 10)*49+c156);
        if(dist156 <= cmin){
            cmin= dist156;
            ans = d156;
        }

        int dist157 = Math.max(Math.abs(cx+7)*49 + c157, Math.abs(cy - 10)*49+c157);
        if(dist157 <= cmin){
            cmin= dist157;
            ans = d157;
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

        int dist110 = Math.max(Math.abs(cx+5)*49 + c110, Math.abs(cy - 7)*49+c110);
        if(dist110 <= cmin){
            cmin= dist110;
            ans = d110;
        }

        int dist111 = Math.max(Math.abs(cx+6)*49 + c111, Math.abs(cy - 7)*49+c111);
        if(dist111 <= cmin){
            cmin= dist111;
            ans = d111;
        }

        int dist126 = Math.max(Math.abs(cx+6)*49 + c126, Math.abs(cy - 8)*49+c126);
        if(dist126 <= cmin){
            cmin= dist126;
            ans = d126;
        }

        int dist127 = Math.max(Math.abs(cx+7)*49 + c127, Math.abs(cy - 8)*49+c127);
        if(dist127 <= cmin){
            cmin= dist127;
            ans = d127;
        }

        int dist142 = Math.max(Math.abs(cx+7)*49 + c142, Math.abs(cy - 9)*49+c142);
        if(dist142 <= cmin){
            cmin= dist142;
            ans = d142;
        }

        return ans;
    }
}
