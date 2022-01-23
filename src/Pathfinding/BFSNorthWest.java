package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class BFSNorthWest {
    static MapLocation l112;
    static int c112;
    static int r112;
    static Direction d112;

    static MapLocation l97;
    static int c97;
    static int r97;
    static Direction d97;

    static MapLocation l98;
    static int c98;
    static int r98;
    static Direction d98;

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

    static MapLocation l83;
    static int c83;
    static int r83;
    static Direction d83;

    static MapLocation l81;
    static int c81;
    static int r81;
    static Direction d81;

    static MapLocation l84;
    static int c84;
    static int r84;
    static Direction d84;

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

    static MapLocation l70;
    static int c70;
    static int r70;
    static Direction d70;

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
    static Direction gbda(RobotController rc, MapLocation target, Direction prev) throws GameActionException {//get best dir -all
        ans = null;
        l112 = rc.getLocation();
        c112 = 0;

        l97 = l112.add(Direction.NORTH);
        c97 = 10000000;
        d97 = null;

        l98 = l112.add(Direction.NORTHEAST);
        c98 = 10000000;
        d98 = null;

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

        l83 = l97.add(Direction.NORTHEAST);
        c83 = 10000000;
        d83 = null;

        l81 = l97.add(Direction.NORTHWEST);
        c81 = 10000000;
        d81 = null;

        l84 = l98.add(Direction.NORTHEAST);
        c84 = 10000000;
        d84 = null;

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

        l70 = l84.add(Direction.NORTHEAST);
        c70 = 10000000;
        d70 = null;

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

        if(rc.onTheMap(l98)){
            if(!rc.isLocationOccupied(l98)){
                r98 = 10 + rc.senseRubble(l98);
                if(c98 > c112 + r98 && prev != Direction.NORTHEAST){
                    d98 = Direction.NORTHEAST;
                    c98 = c112 + r98;
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
                if(c111 > c97 + r111){
                    d111 = d97;
                    c111 = c97 + r111;
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
                if(c81 > c82 + r81){
                    d81 = d82;
                    c81 = c82 + r81;
                }
            }
        }

        if(rc.onTheMap(l84)){
            if(!rc.isLocationOccupied(l84)){
                r84 = 10 + rc.senseRubble(l84);
                if(c84 > c98 + r84){
                    d84 = d98;
                    c84 = c98 + r84;
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
                if(c125 > c111 + r125){
                    d125 = d111;
                    c125 = c111 + r125;
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
                if(c66 > c67 + r66){
                    d66 = d67;
                    c66 = c67 + r66;
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
                if(c65 > c66 + r65){
                    d65 = d66;
                    c65 = c66 + r65;
                }
            }
        }

        if(rc.onTheMap(l70)){
            if(!rc.isLocationOccupied(l70)){
                r70 = 10 + rc.senseRubble(l70);
                if(c70 > c84 + r70){
                    d70 = d84;
                    c70 = c84 + r70;
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
                if(c139 > c125 + r139){
                    d139 = d125;
                    c139 = c125 + r139;
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
                if(c51 > c52 + r51){
                    d51 = d52;
                    c51 = c52 + r51;
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
                if(c50 > c51 + r50){
                    d50 = d51;
                    c50 = c51 + r50;
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
        return ans;
    }
}
