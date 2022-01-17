package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class BFSBuilder {

    static MapLocation l50; //curlocation
    static int c50; //cost to go there
    static int r50; //rubble calc
    static Direction d50; //direction

    static MapLocation l51;
    static int c51;
    static int r51;
    static Direction d51;

    static MapLocation l52;
    static int c52;
    static int r52;
    static Direction d52;

    static MapLocation l53;
    static int c53;
    static int r53;
    static Direction d53;

    static MapLocation l54;
    static int c54;
    static int r54;
    static Direction d54;

    static MapLocation l64;
    static int c64;
    static int r64;
    static Direction d64;

    static MapLocation l65;
    static int c65;
    static int r65;
    static Direction d65;

    static MapLocation l66;
    static int c66;
    static int r66;
    static Direction d66;

    static MapLocation l67;
    static int c67;
    static int r67;
    static Direction d67;

    static MapLocation l68;
    static int c68;
    static int r68;
    static Direction d68;

    static MapLocation l69;
    static int c69;
    static int r69;
    static Direction d69;

    static MapLocation l70;
    static int c70;
    static int r70;
    static Direction d70;

    static MapLocation l78;
    static int c78;
    static int r78;
    static Direction d78;

    static MapLocation l79;
    static int c79;
    static int r79;
    static Direction d79;

    static MapLocation l80;
    static int c80;
    static int r80;
    static Direction d80;

    static MapLocation l81;
    static int c81;
    static int r81;
    static Direction d81;

    static MapLocation l82;
    static int c82;
    static int r82;
    static Direction d82;

    static MapLocation l83;
    static int c83;
    static int r83;
    static Direction d83;

    static MapLocation l84;
    static int c84;
    static int r84;
    static Direction d84;

    static MapLocation l85;
    static int c85;
    static int r85;
    static Direction d85;

    static MapLocation l86;
    static int c86;
    static int r86;
    static Direction d86;

    static MapLocation l93;
    static int c93;
    static int r93;
    static Direction d93;

    static MapLocation l94;
    static int c94;
    static int r94;
    static Direction d94;

    static MapLocation l95;
    static int c95;
    static int r95;
    static Direction d95;

    static MapLocation l96;
    static int c96;
    static int r96;
    static Direction d96;

    static MapLocation l97;
    static int c97;
    static int r97;
    static Direction d97;

    static MapLocation l98;
    static int c98;
    static int r98;
    static Direction d98;

    static MapLocation l99;
    static int c99;
    static int r99;
    static Direction d99;

    static MapLocation l100;
    static int c100;
    static int r100;
    static Direction d100;

    static MapLocation l101;
    static int c101;
    static int r101;
    static Direction d101;

    static MapLocation l108;
    static int c108;
    static int r108;
    static Direction d108;

    static MapLocation l109;
    static int c109;
    static int r109;
    static Direction d109;

    static MapLocation l110;
    static int c110;
    static int r110;
    static Direction d110;

    static MapLocation l111;
    static int c111;
    static int r111;
    static Direction d111;

    static MapLocation l112;
    static int c112;
    static int r112;
    static Direction d112;

    static MapLocation l113;
    static int c113;
    static int r113;
    static Direction d113;

    static MapLocation l114;
    static int c114;
    static int r114;
    static Direction d114;

    static MapLocation l115;
    static int c115;
    static int r115;
    static Direction d115;

    static MapLocation l116;
    static int c116;
    static int r116;
    static Direction d116;

    static MapLocation l123;
    static int c123;
    static int r123;
    static Direction d123;

    static MapLocation l124;
    static int c124;
    static int r124;
    static Direction d124;

    static MapLocation l125;
    static int c125;
    static int r125;
    static Direction d125;

    static MapLocation l126;
    static int c126;
    static int r126;
    static Direction d126;

    static MapLocation l127;
    static int c127;
    static int r127;
    static Direction d127;

    static MapLocation l128;
    static int c128;
    static int r128;
    static Direction d128;

    static MapLocation l129;
    static int c129;
    static int r129;
    static Direction d129;

    static MapLocation l130;
    static int c130;
    static int r130;
    static Direction d130;

    static MapLocation l131;
    static int c131;
    static int r131;
    static Direction d131;

    static MapLocation l138;
    static int c138;
    static int r138;
    static Direction d138;

    static MapLocation l139;
    static int c139;
    static int r139;
    static Direction d139;

    static MapLocation l140;
    static int c140;
    static int r140;
    static Direction d140;

    static MapLocation l141;
    static int c141;
    static int r141;
    static Direction d141;

    static MapLocation l142;
    static int c142;
    static int r142;
    static Direction d142;

    static MapLocation l143;
    static int c143;
    static int r143;
    static Direction d143;

    static MapLocation l144;
    static int c144;
    static int r144;
    static Direction d144;

    static MapLocation l145;
    static int c145;
    static int r145;
    static Direction d145;

    static MapLocation l146;
    static int c146;
    static int r146;
    static Direction d146;

    static MapLocation l154;
    static int c154;
    static int r154;
    static Direction d154;

    static MapLocation l155;
    static int c155;
    static int r155;
    static Direction d155;

    static MapLocation l156;
    static int c156;
    static int r156;
    static Direction d156;

    static MapLocation l157;
    static int c157;
    static int r157;
    static Direction d157;

    static MapLocation l158;
    static int c158;
    static int r158;
    static Direction d158;

    static MapLocation l159;
    static int c159;
    static int r159;
    static Direction d159;

    static MapLocation l160;
    static int c160;
    static int r160;
    static Direction d160;

    static MapLocation l170;
    static int c170;
    static int r170;
    static Direction d170;

    static MapLocation l171;
    static int c171;
    static int r171;
    static Direction d171;

    static MapLocation l172;
    static int c172;
    static int r172;
    static Direction d172;

    static MapLocation l173;
    static int c173;
    static int r173;
    static Direction d173;

    static MapLocation l174;
    static int c174;
    static int r174;
    static Direction d174;

    static Direction ans;
    static Direction getBestDir(RobotController rc, MapLocation target) throws GameActionException {
        ans = null;
        l112 = rc.getLocation();
        c112 = 0;

        l97 = l112.add(Direction.NORTH);
        c97 = 10000000;
        d97 = null;

        l127 = l112.add(Direction.SOUTH);
        c127 = 10000000;
        d127 = null;

        l113 = l112.add(Direction.EAST);
        c113 = 10000000;
        d113 = null;

        l128 = l112.add(Direction.SOUTHEAST);
        c128 = 10000000;
        d128 = null;

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

        l142 = l127.add(Direction.SOUTH);
        c142 = 10000000;
        d142 = null;

        l143 = l127.add(Direction.SOUTHEAST);
        c143 = 10000000;
        d143 = null;

        l141 = l127.add(Direction.SOUTHWEST);
        c141 = 10000000;
        d141 = null;

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

        l157 = l142.add(Direction.SOUTH);
        c157 = 10000000;
        d157 = null;

        l158 = l142.add(Direction.SOUTHEAST);
        c158 = 10000000;
        d158 = null;

        l156 = l142.add(Direction.SOUTHWEST);
        c156 = 10000000;
        d156 = null;

        l159 = l143.add(Direction.SOUTHEAST);
        c159 = 10000000;
        d159 = null;

        l155 = l141.add(Direction.SOUTHWEST);
        c155 = 10000000;
        d155 = null;

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

        l172 = l157.add(Direction.SOUTH);
        c172 = 10000000;
        d172 = null;

        l173 = l157.add(Direction.SOUTHEAST);
        c173 = 10000000;
        d173 = null;

        l171 = l157.add(Direction.SOUTHWEST);
        c171 = 10000000;
        d171 = null;

        l174 = l158.add(Direction.SOUTHEAST);
        c174 = 10000000;
        d174 = null;

        l170 = l156.add(Direction.SOUTHWEST);
        c170 = 10000000;
        d170 = null;

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

        try {

            if (rc.onTheMap(l127)) {
                if (!rc.isLocationOccupied(l127)) {
                    r127 = 10 + rc.senseRubble(l127);
                    if (c127 > c112 + r127) {
                        c127 = c112 + r127;
                        d127 = Direction.SOUTH;
                    }
                }
            }

            if (rc.onTheMap(l97)) {
                if (!rc.isLocationOccupied(l97)) {
                    r97 = 10 + rc.senseRubble(l97);
                    if (c97 > c112 + r97) {
                        c97 = c112 + r97;
                        d97 = Direction.NORTH;
                    }
                }
            }

            if (rc.onTheMap(l111)) {
                if (!rc.isLocationOccupied(l111)) {
                    r111 = 10 + rc.senseRubble(l111);
                    if (c111 > c97 + r111) {
                        c111 = c97 + r111;
                        d111 = d97;
                    }
                    if (c111 > c127 + r111) {
                        c111 = c127 + r111;
                        d111 = d127;
                    }
                    if (c111 > c112 + r111) {
                        c111 = c112 + r111;
                        d111 = Direction.WEST;
                    }
                }
            }

            if (rc.onTheMap(l96)) {
                if (!rc.isLocationOccupied(l96)) {
                    r96 = 10 + rc.senseRubble(l96);
                    if (c96 > c111 + r96) {
                        c96 = c111 + r96;
                        d96 = d111;
                    }
                    if (c96 > c112 + r96) {
                        c96 = c112 + r96;
                        d96 = Direction.NORTHWEST;
                    }
                    if (c96 > c97 + r96) {
                        c96 = c97 + r96;
                        d96 = d97;
                    }
                }
            }

            if (rc.onTheMap(l126)) {
                if (!rc.isLocationOccupied(l126)) {
                    r126 = 10 + rc.senseRubble(l126);
                    if (c126 > c111 + r126) {
                        c126 = c111 + r126;
                        d126 = d111;
                    }
                    if (c126 > c112 + r126) {
                        c126 = c112 + r126;
                        d126 = Direction.SOUTHWEST;
                    }
                    if (c126 > c127 + r126) {
                        c126 = c127 + r126;
                        d126 = d127;
                    }
                }
            }

            if (rc.onTheMap(l98)) {
                if (!rc.isLocationOccupied(l98)) {
                    r98 = 10 + rc.senseRubble(l98);
                    if (c98 > c97 + r98) {
                        c98 = c97 + r98;
                        d98 = d97;
                    }
                    if (c98 > c112 + r98) {
                        c98 = c112 + r98;
                        d98 = Direction.NORTHEAST;
                    }
                }
            }

            if (rc.onTheMap(l128)) {
                if (!rc.isLocationOccupied(l128)) {
                    r128 = 10 + rc.senseRubble(l128);
                    if (c128 > c127 + r128) {
                        c128 = c127 + r128;
                        d128 = d127;
                    }
                    if (c128 > c112 + r128) {
                        c128 = c112 + r128;
                        d128 = Direction.SOUTHEAST;
                    }
                }
            }

            if (rc.onTheMap(l113)) {
                if (!rc.isLocationOccupied(l113)) {
                    r113 = 10 + rc.senseRubble(l113);
                    if (c113 > c128 + r113) {
                        c113 = c128 + r113;
                        d113 = d128;
                    }
                    if (c113 > c98 + r113) {
                        c113 = c98 + r113;
                        d113 = d98;
                    }
                    if (c113 > c112 + r113) {
                        c113 = c112 + r113;
                        d113 = Direction.EAST;
                    }
                    if (c113 > c97 + r113) {
                        c113 = c97 + r113;
                        d113 = d97;
                    }
                    if (c113 > c127 + r113) {
                        c113 = c127 + r113;
                        d113 = d127;
                    }
                }
            }

            if (rc.onTheMap(l142)) {
                if (!rc.isLocationOccupied(l142)) {
                    r142 = 10 + rc.senseRubble(l142);
                    if (c142 > c127 + r142) {
                        c142 = c127 + r142;
                        d142 = d127;
                    }
                    if (c142 > c126 + r142) {
                        c142 = c126 + r142;
                        d142 = d126;
                    }
                    if (c142 > c128 + r142) {
                        c142 = c128 + r142;
                        d142 = d128;
                    }
                }
            }

            if (rc.onTheMap(l141)) {
                if (!rc.isLocationOccupied(l141)) {
                    r141 = 10 + rc.senseRubble(l141);
                    if (c141 > c126 + r141) {
                        c141 = c126 + r141;
                        d141 = d126;
                    }
                    if (c141 > c127 + r141) {
                        c141 = c127 + r141;
                        d141 = d127;
                    }
                    if (c141 > c142 + r141) {
                        c141 = c142 + r141;
                        d141 = d142;
                    }
                }
            }

            if (rc.onTheMap(l143)) {
                if (!rc.isLocationOccupied(l143)) {
                    r143 = 10 + rc.senseRubble(l143);
                    if (c143 > c128 + r143) {
                        c143 = c128 + r143;
                        d143 = d128;
                    }
                    if (c143 > c142 + r143) {
                        c143 = c142 + r143;
                        d143 = d142;
                    }
                    if (c143 > c127 + r143) {
                        c143 = c127 + r143;
                        d143 = d127;
                    }
                }
            }

            if (rc.onTheMap(l82)) {
                if (!rc.isLocationOccupied(l82)) {
                    r82 = 10 + rc.senseRubble(l82);
                    if (c82 > c97 + r82) {
                        c82 = c97 + r82;
                        d82 = d97;
                    }
                    if (c82 > c96 + r82) {
                        c82 = c96 + r82;
                        d82 = d96;
                    }
                    if (c82 > c98 + r82) {
                        c82 = c98 + r82;
                        d82 = d98;
                    }
                }
            }

            if (rc.onTheMap(l81)) {
                if (!rc.isLocationOccupied(l81)) {
                    r81 = 10 + rc.senseRubble(l81);
                    if (c81 > c96 + r81) {
                        c81 = c96 + r81;
                        d81 = d96;
                    }
                    if (c81 > c97 + r81) {
                        c81 = c97 + r81;
                        d81 = d97;
                    }
                    if (c81 > c82 + r81) {
                        c81 = c82 + r81;
                        d81 = d82;
                    }
                }
            }

            if (rc.onTheMap(l83)) {
                if (!rc.isLocationOccupied(l83)) {
                    r83 = 10 + rc.senseRubble(l83);
                    if (c83 > c98 + r83) {
                        c83 = c98 + r83;
                        d83 = d98;
                    }
                    if (c83 > c82 + r83) {
                        c83 = c82 + r83;
                        d83 = d82;
                    }
                    if (c83 > c97 + r83) {
                        c83 = c97 + r83;
                        d83 = d97;
                    }
                }
            }

            if (rc.onTheMap(l110)) {
                if (!rc.isLocationOccupied(l110)) {
                    r110 = 10 + rc.senseRubble(l110);
                    if (c110 > c96 + r110) {
                        c110 = c96 + r110;
                        d110 = d96;
                    }
                    if (c110 > c126 + r110) {
                        c110 = c126 + r110;
                        d110 = d126;
                    }
                    if (c110 > c111 + r110) {
                        c110 = c111 + r110;
                        d110 = d111;
                    }
                }
            }

            if (rc.onTheMap(l95)) {
                if (!rc.isLocationOccupied(l95)) {
                    r95 = 10 + rc.senseRubble(l95);
                    if (c95 > c110 + r95) {
                        c95 = c110 + r95;
                        d95 = d110;
                    }
                    if (c95 > c81 + r95) {
                        c95 = c81 + r95;
                        d95 = d81;
                    }
                    if (c95 > c111 + r95) {
                        c95 = c111 + r95;
                        d95 = d111;
                    }
                    if (c95 > c96 + r95) {
                        c95 = c96 + r95;
                        d95 = d96;
                    }
                }
            }

            if (rc.onTheMap(l125)) {
                if (!rc.isLocationOccupied(l125)) {
                    r125 = 10 + rc.senseRubble(l125);
                    if (c125 > c110 + r125) {
                        c125 = c110 + r125;
                        d125 = d110;
                    }
                    if (c125 > c111 + r125) {
                        c125 = c111 + r125;
                        d125 = d111;
                    }
                    if (c125 > c141 + r125) {
                        c125 = c141 + r125;
                        d125 = d141;
                    }
                    if (c125 > c126 + r125) {
                        c125 = c126 + r125;
                        d125 = d126;
                    }
                }
            }

            if (rc.onTheMap(l80)) {
                if (!rc.isLocationOccupied(l80)) {
                    r80 = 10 + rc.senseRubble(l80);
                    if (c80 > c95 + r80) {
                        c80 = c95 + r80;
                        d80 = d95;
                    }
                    if (c80 > c96 + r80) {
                        c80 = c96 + r80;
                        d80 = d96;
                    }
                    if (c80 > c81 + r80) {
                        c80 = c81 + r80;
                        d80 = d81;
                    }
                }
            }

            if (rc.onTheMap(l140)) {
                if (!rc.isLocationOccupied(l140)) {
                    r140 = 10 + rc.senseRubble(l140);
                    if (c140 > c125 + r140) {
                        c140 = c125 + r140;
                        d140 = d125;
                    }
                    if (c140 > c126 + r140) {
                        c140 = c126 + r140;
                        d140 = d126;
                    }
                    if (c140 > c141 + r140) {
                        c140 = c141 + r140;
                        d140 = d141;
                    }
                }
            }

            if (rc.onTheMap(l84)) {
                if (!rc.isLocationOccupied(l84)) {
                    r84 = 10 + rc.senseRubble(l84);
                    if (c84 > c83 + r84) {
                        c84 = c83 + r84;
                        d84 = d83;
                    }
                    if (c84 > c98 + r84) {
                        c84 = c98 + r84;
                        d84 = d98;
                    }
                }
            }

            if (rc.onTheMap(l114)) {
                if (!rc.isLocationOccupied(l114)) {
                    r114 = 10 + rc.senseRubble(l114);
                    if (c114 > c113 + r114) {
                        c114 = c113 + r114;
                        d114 = d113;
                    }
                    if (c114 > c98 + r114) {
                        c114 = c98 + r114;
                        d114 = d98;
                    }
                    if (c114 > c128 + r114) {
                        c114 = c128 + r114;
                        d114 = d128;
                    }
                }
            }

            if (rc.onTheMap(l99)) {
                if (!rc.isLocationOccupied(l99)) {
                    r99 = 10 + rc.senseRubble(l99);
                    if (c99 > c114 + r99) {
                        c99 = c114 + r99;
                        d99 = d114;
                    }
                    if (c99 > c84 + r99) {
                        c99 = c84 + r99;
                        d99 = d84;
                    }
                    if (c99 > c98 + r99) {
                        c99 = c98 + r99;
                        d99 = d98;
                    }
                    if (c99 > c83 + r99) {
                        c99 = c83 + r99;
                        d99 = d83;
                    }
                    if (c99 > c113 + r99) {
                        c99 = c113 + r99;
                        d99 = d113;
                    }
                }
            }

            if (rc.onTheMap(l144)) {
                if (!rc.isLocationOccupied(l144)) {
                    r144 = 10 + rc.senseRubble(l144);
                    if (c144 > c143 + r144) {
                        c144 = c143 + r144;
                        d144 = d143;
                    }
                    if (c144 > c128 + r144) {
                        c144 = c128 + r144;
                        d144 = d128;
                    }
                }
            }

            if (rc.onTheMap(l129)) {
                if (!rc.isLocationOccupied(l129)) {
                    r129 = 10 + rc.senseRubble(l129);
                    if (c129 > c144 + r129) {
                        c129 = c144 + r129;
                        d129 = d144;
                    }
                    if (c129 > c114 + r129) {
                        c129 = c114 + r129;
                        d129 = d114;
                    }
                    if (c129 > c128 + r129) {
                        c129 = c128 + r129;
                        d129 = d128;
                    }
                    if (c129 > c113 + r129) {
                        c129 = c113 + r129;
                        d129 = d113;
                    }
                    if (c129 > c143 + r129) {
                        c129 = c143 + r129;
                        d129 = d143;
                    }
                }
            }

            if (rc.onTheMap(l157)) {
                if (!rc.isLocationOccupied(l157)) {
                    r157 = 10 + rc.senseRubble(l157);
                    if (c157 > c142 + r157) {
                        c157 = c142 + r157;
                        d157 = d142;
                    }
                    if (c157 > c141 + r157) {
                        c157 = c141 + r157;
                        d157 = d141;
                    }
                    if (c157 > c143 + r157) {
                        c157 = c143 + r157;
                        d157 = d143;
                    }
                }
            }

            if (rc.onTheMap(l156)) {
                if (!rc.isLocationOccupied(l156)) {
                    r156 = 10 + rc.senseRubble(l156);
                    if (c156 > c141 + r156) {
                        c156 = c141 + r156;
                        d156 = d141;
                    }
                    if (c156 > c140 + r156) {
                        c156 = c140 + r156;
                        d156 = d140;
                    }
                    if (c156 > c142 + r156) {
                        c156 = c142 + r156;
                        d156 = d142;
                    }
                    if (c156 > c157 + r156) {
                        c156 = c157 + r156;
                        d156 = d157;
                    }
                }
            }

            if (rc.onTheMap(l158)) {
                if (!rc.isLocationOccupied(l158)) {
                    r158 = 10 + rc.senseRubble(l158);
                    if (c158 > c143 + r158) {
                        c158 = c143 + r158;
                        d158 = d143;
                    }
                    if (c158 > c157 + r158) {
                        c158 = c157 + r158;
                        d158 = d157;
                    }
                    if (c158 > c142 + r158) {
                        c158 = c142 + r158;
                        d158 = d142;
                    }
                    if (c158 > c144 + r158) {
                        c158 = c144 + r158;
                        d158 = d144;
                    }
                }
            }

            if (rc.onTheMap(l155)) {
                if (!rc.isLocationOccupied(l155)) {
                    r155 = 10 + rc.senseRubble(l155);
                    if (c155 > c140 + r155) {
                        c155 = c140 + r155;
                        d155 = d140;
                    }
                    if (c155 > c141 + r155) {
                        c155 = c141 + r155;
                        d155 = d141;
                    }
                    if (c155 > c156 + r155) {
                        c155 = c156 + r155;
                        d155 = d156;
                    }
                }
            }

            if (rc.onTheMap(l159)) {
                if (!rc.isLocationOccupied(l159)) {
                    r159 = 10 + rc.senseRubble(l159);
                    if (c159 > c144 + r159) {
                        c159 = c144 + r159;
                        d159 = d144;
                    }
                    if (c159 > c158 + r159) {
                        c159 = c158 + r159;
                        d159 = d158;
                    }
                    if (c159 > c143 + r159) {
                        c159 = c143 + r159;
                        d159 = d143;
                    }
                }
            }

            if (rc.onTheMap(l67)) {
                if (!rc.isLocationOccupied(l67)) {
                    r67 = 10 + rc.senseRubble(l67);
                    if (c67 > c82 + r67) {
                        c67 = c82 + r67;
                        d67 = d82;
                    }
                    if (c67 > c81 + r67) {
                        c67 = c81 + r67;
                        d67 = d81;
                    }
                    if (c67 > c83 + r67) {
                        c67 = c83 + r67;
                        d67 = d83;
                    }
                }
            }

            if (rc.onTheMap(l66)) {
                if (!rc.isLocationOccupied(l66)) {
                    r66 = 10 + rc.senseRubble(l66);
                    if (c66 > c81 + r66) {
                        c66 = c81 + r66;
                        d66 = d81;
                    }
                    if (c66 > c80 + r66) {
                        c66 = c80 + r66;
                        d66 = d80;
                    }
                    if (c66 > c82 + r66) {
                        c66 = c82 + r66;
                        d66 = d82;
                    }
                    if (c66 > c67 + r66) {
                        c66 = c67 + r66;
                        d66 = d67;
                    }
                }
            }

            if (rc.onTheMap(l68)) {
                if (!rc.isLocationOccupied(l68)) {
                    r68 = 10 + rc.senseRubble(l68);
                    if (c68 > c83 + r68) {
                        c68 = c83 + r68;
                        d68 = d83;
                    }
                    if (c68 > c67 + r68) {
                        c68 = c67 + r68;
                        d68 = d67;
                    }
                    if (c68 > c82 + r68) {
                        c68 = c82 + r68;
                        d68 = d82;
                    }
                    if (c68 > c84 + r68) {
                        c68 = c84 + r68;
                        d68 = d84;
                    }
                }
            }

            if (rc.onTheMap(l65)) {
                if (!rc.isLocationOccupied(l65)) {
                    r65 = 10 + rc.senseRubble(l65);
                    if (c65 > c80 + r65) {
                        c65 = c80 + r65;
                        d65 = d80;
                    }
                    if (c65 > c81 + r65) {
                        c65 = c81 + r65;
                        d65 = d81;
                    }
                    if (c65 > c66 + r65) {
                        c65 = c66 + r65;
                        d65 = d66;
                    }
                }
            }

            if (rc.onTheMap(l69)) {
                if (!rc.isLocationOccupied(l69)) {
                    r69 = 10 + rc.senseRubble(l69);
                    if (c69 > c84 + r69) {
                        c69 = c84 + r69;
                        d69 = d84;
                    }
                    if (c69 > c68 + r69) {
                        c69 = c68 + r69;
                        d69 = d68;
                    }
                    if (c69 > c83 + r69) {
                        c69 = c83 + r69;
                        d69 = d83;
                    }
                }
            }

            if (rc.onTheMap(l109)) {
                if (!rc.isLocationOccupied(l109)) {
                    r109 = 10 + rc.senseRubble(l109);
                    if (c109 > c95 + r109) {
                        c109 = c95 + r109;
                        d109 = d95;
                    }
                    if (c109 > c125 + r109) {
                        c109 = c125 + r109;
                        d109 = d125;
                    }
                    if (c109 > c110 + r109) {
                        c109 = c110 + r109;
                        d109 = d110;
                    }
                }
            }

            if (rc.onTheMap(l94)) {
                if (!rc.isLocationOccupied(l94)) {
                    r94 = 10 + rc.senseRubble(l94);
                    if (c94 > c109 + r94) {
                        c94 = c109 + r94;
                        d94 = d109;
                    }
                    if (c94 > c80 + r94) {
                        c94 = c80 + r94;
                        d94 = d80;
                    }
                    if (c94 > c110 + r94) {
                        c94 = c110 + r94;
                        d94 = d110;
                    }
                    if (c94 > c95 + r94) {
                        c94 = c95 + r94;
                        d94 = d95;
                    }
                }
            }

            if (rc.onTheMap(l124)) {
                if (!rc.isLocationOccupied(l124)) {
                    r124 = 10 + rc.senseRubble(l124);
                    if (c124 > c109 + r124) {
                        c124 = c109 + r124;
                        d124 = d109;
                    }
                    if (c124 > c110 + r124) {
                        c124 = c110 + r124;
                        d124 = d110;
                    }
                    if (c124 > c140 + r124) {
                        c124 = c140 + r124;
                        d124 = d140;
                    }
                    if (c124 > c125 + r124) {
                        c124 = c125 + r124;
                        d124 = d125;
                    }
                }
            }

            if (rc.onTheMap(l79)) {
                if (!rc.isLocationOccupied(l79)) {
                    r79 = 10 + rc.senseRubble(l79);
                    if (c79 > c94 + r79) {
                        c79 = c94 + r79;
                        d79 = d94;
                    }
                    if (c79 > c65 + r79) {
                        c79 = c65 + r79;
                        d79 = d65;
                    }
                    if (c79 > c95 + r79) {
                        c79 = c95 + r79;
                        d79 = d95;
                    }
                    if (c79 > c80 + r79) {
                        c79 = c80 + r79;
                        d79 = d80;
                    }
                }
            }

            if (rc.onTheMap(l139)) {
                if (!rc.isLocationOccupied(l139)) {
                    r139 = 10 + rc.senseRubble(l139);
                    if (c139 > c124 + r139) {
                        c139 = c124 + r139;
                        d139 = d124;
                    }
                    if (c139 > c125 + r139) {
                        c139 = c125 + r139;
                        d139 = d125;
                    }
                    if (c139 > c155 + r139) {
                        c139 = c155 + r139;
                        d139 = d155;
                    }
                    if (c139 > c140 + r139) {
                        c139 = c140 + r139;
                        d139 = d140;
                    }
                }
            }

            if (rc.onTheMap(l64)) {
                if (!rc.isLocationOccupied(l64)) {
                    r64 = 10 + rc.senseRubble(l64);
                    if (c64 > c79 + r64) {
                        c64 = c79 + r64;
                        d64 = d79;
                    }
                    if (c64 > c80 + r64) {
                        c64 = c80 + r64;
                        d64 = d80;
                    }
                    if (c64 > c65 + r64) {
                        c64 = c65 + r64;
                        d64 = d65;
                    }
                }
            }

            if (rc.onTheMap(l154)) {
                if (!rc.isLocationOccupied(l154)) {
                    r154 = 10 + rc.senseRubble(l154);
                    if (c154 > c139 + r154) {
                        c154 = c139 + r154;
                        d154 = d139;
                    }
                    if (c154 > c140 + r154) {
                        c154 = c140 + r154;
                        d154 = d140;
                    }
                    if (c154 > c155 + r154) {
                        c154 = c155 + r154;
                        d154 = d155;
                    }
                }
            }

            if (rc.onTheMap(l70)) {
                if (!rc.isLocationOccupied(l70)) {
                    r70 = 10 + rc.senseRubble(l70);
                    if (c70 > c69 + r70) {
                        c70 = c69 + r70;
                        d70 = d69;
                    }
                    if (c70 > c84 + r70) {
                        c70 = c84 + r70;
                        d70 = d84;
                    }
                }
            }

            if (rc.onTheMap(l100)) {
                if (!rc.isLocationOccupied(l100)) {
                    r100 = 10 + rc.senseRubble(l100);
                    if (c100 > c99 + r100) {
                        c100 = c99 + r100;
                        d100 = d99;
                    }
                    if (c100 > c84 + r100) {
                        c100 = c84 + r100;
                        d100 = d84;
                    }
                    if (c100 > c114 + r100) {
                        c100 = c114 + r100;
                        d100 = d114;
                    }
                }
            }

            if (rc.onTheMap(l85)) {
                if (!rc.isLocationOccupied(l85)) {
                    r85 = 10 + rc.senseRubble(l85);
                    if (c85 > c100 + r85) {
                        c85 = c100 + r85;
                        d85 = d100;
                    }
                    if (c85 > c70 + r85) {
                        c85 = c70 + r85;
                        d85 = d70;
                    }
                    if (c85 > c84 + r85) {
                        c85 = c84 + r85;
                        d85 = d84;
                    }
                    if (c85 > c69 + r85) {
                        c85 = c69 + r85;
                        d85 = d69;
                    }
                    if (c85 > c99 + r85) {
                        c85 = c99 + r85;
                        d85 = d99;
                    }
                }
            }

            if (rc.onTheMap(l130)) {
                if (!rc.isLocationOccupied(l130)) {
                    r130 = 10 + rc.senseRubble(l130);
                    if (c130 > c129 + r130) {
                        c130 = c129 + r130;
                        d130 = d129;
                    }
                    if (c130 > c114 + r130) {
                        c130 = c114 + r130;
                        d130 = d114;
                    }
                    if (c130 > c144 + r130) {
                        c130 = c144 + r130;
                        d130 = d144;
                    }
                }
            }

            if (rc.onTheMap(l115)) {
                if (!rc.isLocationOccupied(l115)) {
                    r115 = 10 + rc.senseRubble(l115);
                    if (c115 > c130 + r115) {
                        c115 = c130 + r115;
                        d115 = d130;
                    }
                    if (c115 > c100 + r115) {
                        c115 = c100 + r115;
                        d115 = d100;
                    }
                    if (c115 > c114 + r115) {
                        c115 = c114 + r115;
                        d115 = d114;
                    }
                    if (c115 > c99 + r115) {
                        c115 = c99 + r115;
                        d115 = d99;
                    }
                    if (c115 > c129 + r115) {
                        c115 = c129 + r115;
                        d115 = d129;
                    }
                }
            }

            if (rc.onTheMap(l160)) {
                if (!rc.isLocationOccupied(l160)) {
                    r160 = 10 + rc.senseRubble(l160);
                    if (c160 > c159 + r160) {
                        c160 = c159 + r160;
                        d160 = d159;
                    }
                    if (c160 > c144 + r160) {
                        c160 = c144 + r160;
                        d160 = d144;
                    }
                }
            }

            if (rc.onTheMap(l145)) {
                if (!rc.isLocationOccupied(l145)) {
                    r145 = 10 + rc.senseRubble(l145);
                    if (c145 > c160 + r145) {
                        c145 = c160 + r145;
                        d145 = d160;
                    }
                    if (c145 > c130 + r145) {
                        c145 = c130 + r145;
                        d145 = d130;
                    }
                    if (c145 > c144 + r145) {
                        c145 = c144 + r145;
                        d145 = d144;
                    }
                    if (c145 > c129 + r145) {
                        c145 = c129 + r145;
                        d145 = d129;
                    }
                    if (c145 > c159 + r145) {
                        c145 = c159 + r145;
                        d145 = d159;
                    }
                }
            }

            if (rc.onTheMap(l172)) {
                if (!rc.isLocationOccupied(l172)) {
                    r172 = 10 + rc.senseRubble(l172);
                    if (c172 > c157 + r172) {
                        c172 = c157 + r172;
                        d172 = d157;
                    }
                    if (c172 > c156 + r172) {
                        c172 = c156 + r172;
                        d172 = d156;
                    }
                    if (c172 > c158 + r172) {
                        c172 = c158 + r172;
                        d172 = d158;
                    }
                }
            }

            if (rc.onTheMap(l171)) {
                if (!rc.isLocationOccupied(l171)) {
                    r171 = 10 + rc.senseRubble(l171);
                    if (c171 > c156 + r171) {
                        c171 = c156 + r171;
                        d171 = d156;
                    }
                    if (c171 > c155 + r171) {
                        c171 = c155 + r171;
                        d171 = d155;
                    }
                    if (c171 > c157 + r171) {
                        c171 = c157 + r171;
                        d171 = d157;
                    }
                    if (c171 > c172 + r171) {
                        c171 = c172 + r171;
                        d171 = d172;
                    }
                }
            }

            if (rc.onTheMap(l173)) {
                if (!rc.isLocationOccupied(l173)) {
                    r173 = 10 + rc.senseRubble(l173);
                    if (c173 > c158 + r173) {
                        c173 = c158 + r173;
                        d173 = d158;
                    }
                    if (c173 > c172 + r173) {
                        c173 = c172 + r173;
                        d173 = d172;
                    }
                    if (c173 > c157 + r173) {
                        c173 = c157 + r173;
                        d173 = d157;
                    }
                    if (c173 > c159 + r173) {
                        c173 = c159 + r173;
                        d173 = d159;
                    }
                }
            }

            if (rc.onTheMap(l170)) {
                if (!rc.isLocationOccupied(l170)) {
                    r170 = 10 + rc.senseRubble(l170);
                    if (c170 > c155 + r170) {
                        c170 = c155 + r170;
                        d170 = d155;
                    }
                    if (c170 > c154 + r170) {
                        c170 = c154 + r170;
                        d170 = d154;
                    }
                    if (c170 > c156 + r170) {
                        c170 = c156 + r170;
                        d170 = d156;
                    }
                    if (c170 > c171 + r170) {
                        c170 = c171 + r170;
                        d170 = d171;
                    }
                }
            }

            if (rc.onTheMap(l174)) {
                if (!rc.isLocationOccupied(l174)) {
                    r174 = 10 + rc.senseRubble(l174);
                    if (c174 > c159 + r174) {
                        c174 = c159 + r174;
                        d174 = d159;
                    }
                    if (c174 > c173 + r174) {
                        c174 = c173 + r174;
                        d174 = d173;
                    }
                    if (c174 > c158 + r174) {
                        c174 = c158 + r174;
                        d174 = d158;
                    }
                    if (c174 > c160 + r174) {
                        c174 = c160 + r174;
                        d174 = d160;
                    }
                }
            }

            if (rc.onTheMap(l52)) {
                if (!rc.isLocationOccupied(l52)) {
                    r52 = 10 + rc.senseRubble(l52);
                    if (c52 > c67 + r52) {
                        c52 = c67 + r52;
                        d52 = d67;
                    }
                    if (c52 > c66 + r52) {
                        c52 = c66 + r52;
                        d52 = d66;
                    }
                    if (c52 > c68 + r52) {
                        c52 = c68 + r52;
                        d52 = d68;
                    }
                }
            }

            if (rc.onTheMap(l51)) {
                if (!rc.isLocationOccupied(l51)) {
                    r51 = 10 + rc.senseRubble(l51);
                    if (c51 > c66 + r51) {
                        c51 = c66 + r51;
                        d51 = d66;
                    }
                    if (c51 > c65 + r51) {
                        c51 = c65 + r51;
                        d51 = d65;
                    }
                    if (c51 > c67 + r51) {
                        c51 = c67 + r51;
                        d51 = d67;
                    }
                    if (c51 > c52 + r51) {
                        c51 = c52 + r51;
                        d51 = d52;
                    }
                }
            }

            if (rc.onTheMap(l53)) {
                if (!rc.isLocationOccupied(l53)) {
                    r53 = 10 + rc.senseRubble(l53);
                    if (c53 > c68 + r53) {
                        c53 = c68 + r53;
                        d53 = d68;
                    }
                    if (c53 > c52 + r53) {
                        c53 = c52 + r53;
                        d53 = d52;
                    }
                    if (c53 > c67 + r53) {
                        c53 = c67 + r53;
                        d53 = d67;
                    }
                    if (c53 > c69 + r53) {
                        c53 = c69 + r53;
                        d53 = d69;
                    }
                }
            }

            if (rc.onTheMap(l50)) {
                if (!rc.isLocationOccupied(l50)) {
                    r50 = 10 + rc.senseRubble(l50);
                    if (c50 > c65 + r50) {
                        c50 = c65 + r50;
                        d50 = d65;
                    }
                    if (c50 > c64 + r50) {
                        c50 = c64 + r50;
                        d50 = d64;
                    }
                    if (c50 > c66 + r50) {
                        c50 = c66 + r50;
                        d50 = d66;
                    }
                    if (c50 > c51 + r50) {
                        c50 = c51 + r50;
                        d50 = d51;
                    }
                }
            }

            if (rc.onTheMap(l54)) {
                if (!rc.isLocationOccupied(l54)) {
                    r54 = 10 + rc.senseRubble(l54);
                    if (c54 > c69 + r54) {
                        c54 = c69 + r54;
                        d54 = d69;
                    }
                    if (c54 > c53 + r54) {
                        c54 = c53 + r54;
                        d54 = d53;
                    }
                    if (c54 > c68 + r54) {
                        c54 = c68 + r54;
                        d54 = d68;
                    }
                    if (c54 > c70 + r54) {
                        c54 = c70 + r54;
                        d54 = d70;
                    }
                }
            }

            if (rc.onTheMap(l108)) {
                if (!rc.isLocationOccupied(l108)) {
                    r108 = 10 + rc.senseRubble(l108);
                    if (c108 > c94 + r108) {
                        c108 = c94 + r108;
                        d108 = d94;
                    }
                    if (c108 > c124 + r108) {
                        c108 = c124 + r108;
                        d108 = d124;
                    }
                    if (c108 > c109 + r108) {
                        c108 = c109 + r108;
                        d108 = d109;
                    }
                }
            }

            if (rc.onTheMap(l93)) {
                if (!rc.isLocationOccupied(l93)) {
                    r93 = 10 + rc.senseRubble(l93);
                    if (c93 > c108 + r93) {
                        c93 = c108 + r93;
                        d93 = d108;
                    }
                    if (c93 > c79 + r93) {
                        c93 = c79 + r93;
                        d93 = d79;
                    }
                    if (c93 > c109 + r93) {
                        c93 = c109 + r93;
                        d93 = d109;
                    }
                    if (c93 > c94 + r93) {
                        c93 = c94 + r93;
                        d93 = d94;
                    }
                }
            }

            if (rc.onTheMap(l123)) {
                if (!rc.isLocationOccupied(l123)) {
                    r123 = 10 + rc.senseRubble(l123);
                    if (c123 > c108 + r123) {
                        c123 = c108 + r123;
                        d123 = d108;
                    }
                    if (c123 > c109 + r123) {
                        c123 = c109 + r123;
                        d123 = d109;
                    }
                    if (c123 > c139 + r123) {
                        c123 = c139 + r123;
                        d123 = d139;
                    }
                    if (c123 > c124 + r123) {
                        c123 = c124 + r123;
                        d123 = d124;
                    }
                }
            }

            if (rc.onTheMap(l78)) {
                if (!rc.isLocationOccupied(l78)) {
                    r78 = 10 + rc.senseRubble(l78);
                    if (c78 > c93 + r78) {
                        c78 = c93 + r78;
                        d78 = d93;
                    }
                    if (c78 > c64 + r78) {
                        c78 = c64 + r78;
                        d78 = d64;
                    }
                    if (c78 > c94 + r78) {
                        c78 = c94 + r78;
                        d78 = d94;
                    }
                    if (c78 > c79 + r78) {
                        c78 = c79 + r78;
                        d78 = d79;
                    }
                }
            }

            if (rc.onTheMap(l138)) {
                if (!rc.isLocationOccupied(l138)) {
                    r138 = 10 + rc.senseRubble(l138);
                    if (c138 > c123 + r138) {
                        c138 = c123 + r138;
                        d138 = d123;
                    }
                    if (c138 > c124 + r138) {
                        c138 = c124 + r138;
                        d138 = d124;
                    }
                    if (c138 > c154 + r138) {
                        c138 = c154 + r138;
                        d138 = d154;
                    }
                    if (c138 > c139 + r138) {
                        c138 = c139 + r138;
                        d138 = d139;
                    }
                }
            }

            if (rc.onTheMap(l86)) {
                if (!rc.isLocationOccupied(l86)) {
                    r86 = 10 + rc.senseRubble(l86);
                    if (c86 > c85 + r86) {
                        c86 = c85 + r86;
                        d86 = d85;
                    }
                    if (c86 > c70 + r86) {
                        c86 = c70 + r86;
                        d86 = d70;
                    }
                    if (c86 > c100 + r86) {
                        c86 = c100 + r86;
                        d86 = d100;
                    }
                }
            }

            if (rc.onTheMap(l116)) {
                if (!rc.isLocationOccupied(l116)) {
                    r116 = 10 + rc.senseRubble(l116);
                    if (c116 > c115 + r116) {
                        c116 = c115 + r116;
                        d116 = d115;
                    }
                    if (c116 > c100 + r116) {
                        c116 = c100 + r116;
                        d116 = d100;
                    }
                    if (c116 > c130 + r116) {
                        c116 = c130 + r116;
                        d116 = d130;
                    }
                }
            }

            if (rc.onTheMap(l101)) {
                if (!rc.isLocationOccupied(l101)) {
                    r101 = 10 + rc.senseRubble(l101);
                    if (c101 > c116 + r101) {
                        c101 = c116 + r101;
                        d101 = d116;
                    }
                    if (c101 > c86 + r101) {
                        c101 = c86 + r101;
                        d101 = d86;
                    }
                    if (c101 > c100 + r101) {
                        c101 = c100 + r101;
                        d101 = d100;
                    }
                    if (c101 > c85 + r101) {
                        c101 = c85 + r101;
                        d101 = d85;
                    }
                    if (c101 > c115 + r101) {
                        c101 = c115 + r101;
                        d101 = d115;
                    }
                }
            }

            if (rc.onTheMap(l146)) {
                if (!rc.isLocationOccupied(l146)) {
                    r146 = 10 + rc.senseRubble(l146);
                    if (c146 > c145 + r146) {
                        c146 = c145 + r146;
                        d146 = d145;
                    }
                    if (c146 > c130 + r146) {
                        c146 = c130 + r146;
                        d146 = d130;
                    }
                    if (c146 > c160 + r146) {
                        c146 = c160 + r146;
                        d146 = d160;
                    }
                }
            }

            if (rc.onTheMap(l131)) {
                if (!rc.isLocationOccupied(l131)) {
                    r131 = 10 + rc.senseRubble(l131);
                    if (c131 > c146 + r131) {
                        c131 = c146 + r131;
                        d131 = d146;
                    }
                    if (c131 > c116 + r131) {
                        c131 = c116 + r131;
                        d131 = d116;
                    }
                    if (c131 > c130 + r131) {
                        c131 = c130 + r131;
                        d131 = d130;
                    }
                    if (c131 > c115 + r131) {
                        c131 = c115 + r131;
                        d131 = d115;
                    }
                    if (c131 > c145 + r131) {
                        c131 = c145 + r131;
                        d131 = d145;
                    }
                }
            }

//            int dx = target.x - l112.x;//KInda fricked cuz (0, 0) isnt top left
//            int dy = l112.y-target.y;
//            switch (dy) {
//            case -4:
//                switch (dx) {
//                case -2:
//                    return d50;
//                case -1:
//                    return d51;
//                case 0:
//                    return d52;
//                case 1:
//                    return d53;
//                case 2:
//                    return d54;
//                }
//                break;
//            case -3:
//                switch (dx) {
//                case -3:
//                    return d64;
//                case -2:
//                    return d65;
//                case -1:
//                    return d66;
//                case 0:
//                    return d67;
//                case 1:
//                    return d68;
//                case 2:
//                    return d69;
//                case 3:
//                    return d70;
//                }
//                break;
//            case -2:
//                switch (dx) {
//                case -4:
//                    return d78;
//                case -3:
//                    return d79;
//                case -2:
//                    return d80;
//                case -1:
//                    return d81;
//                case 0:
//                    return d82;
//                case 1:
//                    return d83;
//                case 2:
//                    return d84;
//                case 3:
//                    return d85;
//                case 4:
//                    return d86;
//                }
//                break;
//            case -1:
//                switch (dx) {
//                case -4:
//                    return d93;
//                case -3:
//                    return d94;
//                case -2:
//                    return d95;
//                case -1:
//                    return d96;
//                case 0:
//                    return d97;
//                case 1:
//                    return d98;
//                case 2:
//                    return d99;
//                case 3:
//                    return d100;
//                case 4:
//                    return d101;
//                }
//                break;
//            case 0:
//                switch (dx) {
//                case -4:
//                    return d108;
//                case -3:
//                    return d109;
//                case -2:
//                    return d110;
//                case -1:
//                    return d111;
//                case 0:
//                    return d112;
//                case 1:
//                    return d113;
//                case 2:
//                    return d114;
//                case 3:
//                    return d115;
//                case 4:
//                    return d116;
//                }
//                break;
//            case 1:
//                switch (dx) {
//                case -4:
//                    return d123;
//                case -3:
//                    return d124;
//                case -2:
//                    return d125;
//                case -1:
//                    return d126;
//                case 0:
//                    return d127;
//                case 1:
//                    return d128;
//                case 2:
//                    return d129;
//                case 3:
//                    return d130;
//                case 4:
//                    return d131;
//                }
//                break;
//            case 2:
//                switch (dx) {
//                case -4:
//                    return d138;
//                case -3:
//                    return d139;
//                case -2:
//                    return d140;
//                case -1:
//                    return d141;
//                case 0:
//                    return d142;
//                case 1:
//                    return d143;
//                case 2:
//                    return d144;
//                case 3:
//                    return d145;
//                case 4:
//                    return d146;
//                }
//                break;
//            case 3:
//                switch (dx) {
//                case -3:
//                    return d154;
//                case -2:
//                    return d155;
//                case -1:
//                    return d156;
//                case 0:
//                    return d157;
//                case 1:
//                    return d158;
//                case 2:
//                    return d159;
//                case 3:
//                    return d160;
//                }
//                break;
//            case 4:
//                switch (dx) {
//                case -2:
//                    return d170;
//                case -1:
//                    return d171;
//                case 0:
//                    return d172;
//                case 1:
//                    return d173;
//                case 2:
//                    return d174;
//                }
//                break;
//            }
            ans = Direction.SOUTH;//CHANGE
            int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
            int cy = l112.y + 7 - target.y;
            int nomove = Math.max(Math.abs(cx + 7) * 50, Math.abs(cy - 7) * 50); //make it <=
            int cmin = Integer.MAX_VALUE;

            int dist50 = Math.max(Math.abs(cx + 5) * 50 + c50, Math.abs(cy - 3) * 50 + c50);
            if (dist50 <= cmin) {
                cmin = dist50;
                ans = d50;
            }

            int dist51 = Math.max(Math.abs(cx + 6) * 50 + c51, Math.abs(cy - 3) * 50 + c51);
            if (dist51 <= cmin) {
                cmin = dist51;
                ans = d51;
            }

            int dist52 = Math.max(Math.abs(cx + 7) * 50 + c52, Math.abs(cy - 3) * 50 + c52);
            if (dist52 <= cmin) {
                cmin = dist52;
                ans = d52;
            }

            int dist53 = Math.max(Math.abs(cx + 8) * 50 + c53, Math.abs(cy - 3) * 50 + c53);
            if (dist53 <= cmin) {
                cmin = dist53;
                ans = d53;
            }

            int dist54 = Math.max(Math.abs(cx + 9) * 50 + c54, Math.abs(cy - 3) * 50 + c54);
            if (dist54 <= cmin) {
                cmin = dist54;
                ans = d54;
            }

            int dist64 = Math.max(Math.abs(cx + 4) * 50 + c64, Math.abs(cy - 4) * 50 + c64);
            if (dist64 <= cmin) {
                cmin = dist64;
                ans = d64;
            }

            int dist65 = Math.max(Math.abs(cx + 5) * 50 + c65, Math.abs(cy - 4) * 50 + c65);
            if (dist65 <= cmin) {
                cmin = dist65;
                ans = d65;
            }

            int dist69 = Math.max(Math.abs(cx + 9) * 50 + c69, Math.abs(cy - 4) * 50 + c69);
            if (dist69 <= cmin) {
                cmin = dist69;
                ans = d69;
            }

            int dist70 = Math.max(Math.abs(cx + 10) * 50 + c70, Math.abs(cy - 4) * 50 + c70);
            if (dist70 <= cmin) {
                cmin = dist70;
                ans = d70;
            }

            int dist78 = Math.max(Math.abs(cx + 3) * 50 + c78, Math.abs(cy - 5) * 50 + c78);
            if (dist78 <= cmin) {
                cmin = dist78;
                ans = d78;
            }

            int dist79 = Math.max(Math.abs(cx + 4) * 50 + c79, Math.abs(cy - 5) * 50 + c79);
            if (dist79 <= cmin) {
                cmin = dist79;
                ans = d79;
            }

            int dist85 = Math.max(Math.abs(cx + 10) * 50 + c85, Math.abs(cy - 5) * 50 + c85);
            if (dist85 <= cmin) {
                cmin = dist85;
                ans = d85;
            }

            int dist86 = Math.max(Math.abs(cx + 11) * 50 + c86, Math.abs(cy - 5) * 50 + c86);
            if (dist86 <= cmin) {
                cmin = dist86;
                ans = d86;
            }

            int dist93 = Math.max(Math.abs(cx + 3) * 50 + c93, Math.abs(cy - 6) * 50 + c93);
            if (dist93 <= cmin) {
                cmin = dist93;
                ans = d93;
            }

            int dist101 = Math.max(Math.abs(cx + 11) * 50 + c101, Math.abs(cy - 6) * 50 + c101);
            if (dist101 <= cmin) {
                cmin = dist101;
                ans = d101;
            }

            int dist108 = Math.max(Math.abs(cx + 3) * 50 + c108, Math.abs(cy - 7) * 50 + c108);
            if (dist108 <= cmin) {
                cmin = dist108;
                ans = d108;
            }

            int dist116 = Math.max(Math.abs(cx + 11) * 50 + c116, Math.abs(cy - 7) * 50 + c116);
            if (dist116 <= cmin) {
                cmin = dist116;
                ans = d116;
            }

            int dist123 = Math.max(Math.abs(cx + 3) * 50 + c123, Math.abs(cy - 8) * 50 + c123);
            if (dist123 <= cmin) {
                cmin = dist123;
                ans = d123;
            }

            int dist131 = Math.max(Math.abs(cx + 11) * 50 + c131, Math.abs(cy - 8) * 50 + c131);
            if (dist131 <= cmin) {
                cmin = dist131;
                ans = d131;
            }

            int dist138 = Math.max(Math.abs(cx + 3) * 50 + c138, Math.abs(cy - 9) * 50 + c138);
            if (dist138 <= cmin) {
                cmin = dist138;
                ans = d138;
            }

            int dist139 = Math.max(Math.abs(cx + 4) * 50 + c139, Math.abs(cy - 9) * 50 + c139);
            if (dist139 <= cmin) {
                cmin = dist139;
                ans = d139;
            }

            int dist145 = Math.max(Math.abs(cx + 10) * 50 + c145, Math.abs(cy - 9) * 50 + c145);
            if (dist145 <= cmin) {
                cmin = dist145;
                ans = d145;
            }

            int dist146 = Math.max(Math.abs(cx + 11) * 50 + c146, Math.abs(cy - 9) * 50 + c146);
            if (dist146 <= cmin) {
                cmin = dist146;
                ans = d146;
            }

            int dist154 = Math.max(Math.abs(cx + 4) * 50 + c154, Math.abs(cy - 10) * 50 + c154);
            if (dist154 <= cmin) {
                cmin = dist154;
                ans = d154;
            }

            int dist155 = Math.max(Math.abs(cx + 5) * 50 + c155, Math.abs(cy - 10) * 50 + c155);
            if (dist155 <= cmin) {
                cmin = dist155;
                ans = d155;
            }

            int dist159 = Math.max(Math.abs(cx + 9) * 50 + c159, Math.abs(cy - 10) * 50 + c159);
            if (dist159 <= cmin) {
                cmin = dist159;
                ans = d159;
            }

            int dist160 = Math.max(Math.abs(cx + 10) * 50 + c160, Math.abs(cy - 10) * 50 + c160);
            if (dist160 <= cmin) {
                cmin = dist160;
                ans = d160;
            }

            int dist170 = Math.max(Math.abs(cx + 5) * 50 + c170, Math.abs(cy - 11) * 50 + c170);
            if (dist170 <= cmin) {
                cmin = dist170;
                ans = d170;
            }

            int dist171 = Math.max(Math.abs(cx + 6) * 50 + c171, Math.abs(cy - 11) * 50 + c171);
            if (dist171 <= cmin) {
                cmin = dist171;
                ans = d171;
            }

            int dist172 = Math.max(Math.abs(cx + 7) * 50 + c172, Math.abs(cy - 11) * 50 + c172);
            if (dist172 <= cmin) {
                cmin = dist172;
                ans = d172;
            }

            int dist173 = Math.max(Math.abs(cx + 8) * 50 + c173, Math.abs(cy - 11) * 50 + c173);
            if (dist173 <= cmin) {
                cmin = dist173;
                ans = d173;
            }

            int dist174 = Math.max(Math.abs(cx + 9) * 50 + c174, Math.abs(cy - 11) * 50 + c174);
            if (dist174 <= cmin) {
                cmin = dist174;
                ans = d174;
            }
            rc.setIndicatorString(String.valueOf(cmin));
            if (cmin <= nomove) return ans;

            int dist66 = Math.max(Math.abs(cx + 6) * 50 + c66, Math.abs(cy - 4) * 50 + c66);
            if (dist66 <= cmin) {
                cmin = dist66;
                ans = d66;
            }

            int dist67 = Math.max(Math.abs(cx + 7) * 50 + c67, Math.abs(cy - 4) * 50 + c67);
            if (dist67 <= cmin) {
                cmin = dist67;
                ans = d67;
            }

            int dist68 = Math.max(Math.abs(cx + 8) * 50 + c68, Math.abs(cy - 4) * 50 + c68);
            if (dist68 <= cmin) {
                cmin = dist68;
                ans = d68;
            }

            int dist80 = Math.max(Math.abs(cx + 5) * 50 + c80, Math.abs(cy - 5) * 50 + c80);
            if (dist80 <= cmin) {
                cmin = dist80;
                ans = d80;
            }

            int dist81 = Math.max(Math.abs(cx + 6) * 50 + c81, Math.abs(cy - 5) * 50 + c81);
            if (dist81 <= cmin) {
                cmin = dist81;
                ans = d81;
            }

            int dist83 = Math.max(Math.abs(cx + 8) * 50 + c83, Math.abs(cy - 5) * 50 + c83);
            if (dist83 <= cmin) {
                cmin = dist83;
                ans = d83;
            }

            int dist84 = Math.max(Math.abs(cx + 9) * 50 + c84, Math.abs(cy - 5) * 50 + c84);
            if (dist84 <= cmin) {
                cmin = dist84;
                ans = d84;
            }

            int dist94 = Math.max(Math.abs(cx + 4) * 50 + c94, Math.abs(cy - 6) * 50 + c94);
            if (dist94 <= cmin) {
                cmin = dist94;
                ans = d94;
            }

            int dist95 = Math.max(Math.abs(cx + 5) * 50 + c95, Math.abs(cy - 6) * 50 + c95);
            if (dist95 <= cmin) {
                cmin = dist95;
                ans = d95;
            }

            int dist99 = Math.max(Math.abs(cx + 9) * 50 + c99, Math.abs(cy - 6) * 50 + c99);
            if (dist99 <= cmin) {
                cmin = dist99;
                ans = d99;
            }

            int dist100 = Math.max(Math.abs(cx + 10) * 50 + c100, Math.abs(cy - 6) * 50 + c100);
            if (dist100 <= cmin) {
                cmin = dist100;
                ans = d100;
            }

            int dist109 = Math.max(Math.abs(cx + 4) * 50 + c109, Math.abs(cy - 7) * 50 + c109);
            if (dist109 <= cmin) {
                cmin = dist109;
                ans = d109;
            }

            int dist115 = Math.max(Math.abs(cx + 10) * 50 + c115, Math.abs(cy - 7) * 50 + c115);
            if (dist115 <= cmin) {
                cmin = dist115;
                ans = d115;
            }

            int dist124 = Math.max(Math.abs(cx + 4) * 50 + c124, Math.abs(cy - 8) * 50 + c124);
            if (dist124 <= cmin) {
                cmin = dist124;
                ans = d124;
            }

            int dist125 = Math.max(Math.abs(cx + 5) * 50 + c125, Math.abs(cy - 8) * 50 + c125);
            if (dist125 <= cmin) {
                cmin = dist125;
                ans = d125;
            }

            int dist129 = Math.max(Math.abs(cx + 9) * 50 + c129, Math.abs(cy - 8) * 50 + c129);
            if (dist129 <= cmin) {
                cmin = dist129;
                ans = d129;
            }

            int dist130 = Math.max(Math.abs(cx + 10) * 50 + c130, Math.abs(cy - 8) * 50 + c130);
            if (dist130 <= cmin) {
                cmin = dist130;
                ans = d130;
            }

            int dist140 = Math.max(Math.abs(cx + 5) * 50 + c140, Math.abs(cy - 9) * 50 + c140);
            if (dist140 <= cmin) {
                cmin = dist140;
                ans = d140;
            }

            int dist141 = Math.max(Math.abs(cx + 6) * 50 + c141, Math.abs(cy - 9) * 50 + c141);
            if (dist141 <= cmin) {
                cmin = dist141;
                ans = d141;
            }

            int dist143 = Math.max(Math.abs(cx + 8) * 50 + c143, Math.abs(cy - 9) * 50 + c143);
            if (dist143 <= cmin) {
                cmin = dist143;
                ans = d143;
            }

            int dist144 = Math.max(Math.abs(cx + 9) * 50 + c144, Math.abs(cy - 9) * 50 + c144);
            if (dist144 <= cmin) {
                cmin = dist144;
                ans = d144;
            }

            int dist156 = Math.max(Math.abs(cx + 6) * 50 + c156, Math.abs(cy - 10) * 50 + c156);
            if (dist156 <= cmin) {
                cmin = dist156;
                ans = d156;
            }

            int dist157 = Math.max(Math.abs(cx + 7) * 50 + c157, Math.abs(cy - 10) * 50 + c157);
            if (dist157 <= cmin) {
                cmin = dist157;
                ans = d157;
            }

            int dist158 = Math.max(Math.abs(cx + 8) * 50 + c158, Math.abs(cy - 10) * 50 + c158);
            if (dist158 <= cmin) {
                cmin = dist158;
                ans = d158;
            }
            rc.setIndicatorString(String.valueOf(cmin));

            if (cmin <= nomove) return ans;

            int dist82 = Math.max(Math.abs(cx + 7) * 50 + c82, Math.abs(cy - 5) * 50 + c82);
            if (dist82 <= cmin) {
                cmin = dist82;
                ans = d82;
            }

            int dist96 = Math.max(Math.abs(cx + 6) * 50 + c96, Math.abs(cy - 6) * 50 + c96);
            if (dist96 <= cmin) {
                cmin = dist96;
                ans = d96;
            }

            int dist97 = Math.max(Math.abs(cx + 7) * 50 + c97, Math.abs(cy - 6) * 50 + c97);
            if (dist97 <= cmin) {
                cmin = dist97;
                ans = d97;
            }

            int dist98 = Math.max(Math.abs(cx + 8) * 50 + c98, Math.abs(cy - 6) * 50 + c98);
            if (dist98 <= cmin) {
                cmin = dist98;
                ans = d98;
            }

            int dist110 = Math.max(Math.abs(cx + 5) * 50 + c110, Math.abs(cy - 7) * 50 + c110);
            if (dist110 <= cmin) {
                cmin = dist110;
                ans = d110;
            }

            int dist111 = Math.max(Math.abs(cx + 6) * 50 + c111, Math.abs(cy - 7) * 50 + c111);
            if (dist111 <= cmin) {
                cmin = dist111;
                ans = d111;
            }

            int dist113 = Math.max(Math.abs(cx + 8) * 50 + c113, Math.abs(cy - 7) * 50 + c113);
            if (dist113 <= cmin) {
                cmin = dist113;
                ans = d113;
            }

            int dist114 = Math.max(Math.abs(cx + 9) * 50 + c114, Math.abs(cy - 7) * 50 + c114);
            if (dist114 <= cmin) {
                cmin = dist114;
                ans = d114;
            }

            int dist126 = Math.max(Math.abs(cx + 6) * 50 + c126, Math.abs(cy - 8) * 50 + c126);
            if (dist126 <= cmin) {
                cmin = dist126;
                ans = d126;
            }

            int dist127 = Math.max(Math.abs(cx + 7) * 50 + c127, Math.abs(cy - 8) * 50 + c127);
            if (dist127 <= cmin) {
                cmin = dist127;
                ans = d127;
            }

            int dist128 = Math.max(Math.abs(cx + 8) * 50 + c128, Math.abs(cy - 8) * 50 + c128);
            if (dist128 <= cmin) {
                cmin = dist128;
                ans = d128;
            }

            int dist142 = Math.max(Math.abs(cx + 7) * 50 + c142, Math.abs(cy - 9) * 50 + c142);
            if (dist142 <= cmin) {
                cmin = dist142;
                ans = d142;
            }
            rc.setIndicatorString(String.valueOf(cmin));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ans; //should never happen
    }
}
