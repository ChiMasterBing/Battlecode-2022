package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class SageNorth {
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

    static MapLocation l98;
    static int c98;
    static int r98;
    static Direction d98;

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

    static MapLocation l114;
    static int c114;
    static int r114;
    static Direction d114;

    static MapLocation l99;
    static int c99;
    static int r99;
    static Direction d99;

    static MapLocation l84;
    static int c84;
    static int r84;
    static Direction d84;

    static MapLocation l80;
    static int c80;
    static int r80;
    static Direction d80;

    static MapLocation l95;
    static int c95;
    static int r95;
    static Direction d95;

    static MapLocation l110;
    static int c110;
    static int r110;
    static Direction d110;

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

    static MapLocation l100;
    static int c100;
    static int r100;
    static Direction d100;

    static MapLocation l85;
    static int c85;
    static int r85;
    static Direction d85;

    static MapLocation l70;
    static int c70;
    static int r70;
    static Direction d70;

    static MapLocation l64;
    static int c64;
    static int r64;
    static Direction d64;

    static MapLocation l79;
    static int c79;
    static int r79;
    static Direction d79;

    static MapLocation l94;
    static int c94;
    static int r94;
    static Direction d94;

    static MapLocation l109;
    static int c109;
    static int r109;
    static Direction d109;

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

    static MapLocation l55;
    static int c55;
    static int r55;
    static Direction d55;

    static MapLocation l49;
    static int c49;
    static int r49;
    static Direction d49;

    static MapLocation l116;
    static int c116;
    static int r116;
    static Direction d116;

    static MapLocation l101;
    static int c101;
    static int r101;
    static Direction d101;

    static MapLocation l86;
    static int c86;
    static int r86;
    static Direction d86;

    static MapLocation l71;
    static int c71;
    static int r71;
    static Direction d71;

    static MapLocation l56;
    static int c56;
    static int r56;
    static Direction d56;

    static MapLocation l48;
    static int c48;
    static int r48;
    static Direction d48;

    static MapLocation l63;
    static int c63;
    static int r63;
    static Direction d63;

    static MapLocation l78;
    static int c78;
    static int r78;
    static Direction d78;

    static MapLocation l93;
    static int c93;
    static int r93;
    static Direction d93;

    static MapLocation l108;
    static int c108;
    static int r108;
    static Direction d108;

    static MapLocation l37;
    static int c37;
    static int r37;
    static Direction d37;

    static MapLocation l38;
    static int c38;
    static int r38;
    static Direction d38;

    static MapLocation l36;
    static int c36;
    static int r36;
    static Direction d36;

    static MapLocation l39;
    static int c39;
    static int r39;
    static Direction d39;

    static MapLocation l35;
    static int c35;
    static int r35;
    static Direction d35;

    static MapLocation l40;
    static int c40;
    static int r40;
    static Direction d40;

    static MapLocation l34;
    static int c34;
    static int r34;
    static Direction d34;

    static MapLocation l117;
    static int c117;
    static int r117;
    static Direction d117;

    static MapLocation l102;
    static int c102;
    static int r102;
    static Direction d102;

    static MapLocation l87;
    static int c87;
    static int r87;
    static Direction d87;

    static MapLocation l72;
    static int c72;
    static int r72;
    static Direction d72;

    static MapLocation l62;
    static int c62;
    static int r62;
    static Direction d62;

    static MapLocation l77;
    static int c77;
    static int r77;
    static Direction d77;

    static MapLocation l92;
    static int c92;
    static int r92;
    static Direction d92;

    static MapLocation l107;
    static int c107;
    static int r107;
    static Direction d107;

    static Direction ans;
    static Direction gbda(RobotController rc, MapLocation target, Direction prev) throws GameActionException {//get best dir -all
        ans = null;
        l112 = rc.getLocation();
        c112 = 0;

        l97 = l112.add(Direction.NORTH);
        c97 = 10000000;
        d97 = null;
        r97 = 10000000;

        l113 = l112.add(Direction.EAST);
        c113 = 10000000;
        d113 = null;
        r113 = 10000000;

        l98 = l112.add(Direction.NORTHEAST);
        c98 = 10000000;
        d98 = null;
        r98 = 10000000;

        l96 = l112.add(Direction.NORTHWEST);
        c96 = 10000000;
        d96 = null;
        r96 = 10000000;

        l111 = l112.add(Direction.WEST);
        c111 = 10000000;
        d111 = null;
        r111 = 10000000;

        l82 = l97.add(Direction.NORTH);
        c82 = 10000000;
        d82 = null;
        r82 = 10000000;

        l83 = l97.add(Direction.NORTHEAST);
        c83 = 10000000;
        d83 = null;
        r83 = 10000000;

        l81 = l97.add(Direction.NORTHWEST);
        c81 = 10000000;
        d81 = null;
        r81 = 10000000;

        l114 = l113.add(Direction.EAST);
        c114 = 10000000;
        d114 = null;
        r114 = 10000000;

        l99 = l113.add(Direction.NORTHEAST);
        c99 = 10000000;
        d99 = null;
        r99 = 10000000;

        l84 = l98.add(Direction.NORTHEAST);
        c84 = 10000000;
        d84 = null;
        r84 = 10000000;

        l80 = l96.add(Direction.NORTHWEST);
        c80 = 10000000;
        d80 = null;
        r80 = 10000000;

        l95 = l96.add(Direction.WEST);
        c95 = 10000000;
        d95 = null;
        r95 = 10000000;

        l110 = l111.add(Direction.WEST);
        c110 = 10000000;
        d110 = null;
        r110 = 10000000;

        l67 = l82.add(Direction.NORTH);
        c67 = 10000000;
        d67 = null;
        r67 = 10000000;

        l68 = l82.add(Direction.NORTHEAST);
        c68 = 10000000;
        d68 = null;
        r68 = 10000000;

        l66 = l82.add(Direction.NORTHWEST);
        c66 = 10000000;
        d66 = null;
        r66 = 10000000;

        l69 = l83.add(Direction.NORTHEAST);
        c69 = 10000000;
        d69 = null;
        r69 = 10000000;

        l65 = l81.add(Direction.NORTHWEST);
        c65 = 10000000;
        d65 = null;
        r65 = 10000000;

        l115 = l114.add(Direction.EAST);
        c115 = 10000000;
        d115 = null;
        r115 = 10000000;

        l100 = l114.add(Direction.NORTHEAST);
        c100 = 10000000;
        d100 = null;
        r100 = 10000000;

        l85 = l99.add(Direction.NORTHEAST);
        c85 = 10000000;
        d85 = null;
        r85 = 10000000;

        l70 = l84.add(Direction.NORTHEAST);
        c70 = 10000000;
        d70 = null;
        r70 = 10000000;

        l64 = l80.add(Direction.NORTHWEST);
        c64 = 10000000;
        d64 = null;
        r64 = 10000000;

        l79 = l80.add(Direction.WEST);
        c79 = 10000000;
        d79 = null;
        r79 = 10000000;

        l94 = l95.add(Direction.WEST);
        c94 = 10000000;
        d94 = null;
        r94 = 10000000;

        l109 = l110.add(Direction.WEST);
        c109 = 10000000;
        d109 = null;
        r109 = 10000000;

        l52 = l67.add(Direction.NORTH);
        c52 = 10000000;
        d52 = null;
        r52 = 10000000;

        l53 = l67.add(Direction.NORTHEAST);
        c53 = 10000000;
        d53 = null;
        r53 = 10000000;

        l51 = l67.add(Direction.NORTHWEST);
        c51 = 10000000;
        d51 = null;
        r51 = 10000000;

        l54 = l68.add(Direction.NORTHEAST);
        c54 = 10000000;
        d54 = null;
        r54 = 10000000;

        l50 = l66.add(Direction.NORTHWEST);
        c50 = 10000000;
        d50 = null;
        r50 = 10000000;

        l55 = l69.add(Direction.NORTHEAST);
        c55 = 10000000;
        d55 = null;
        r55 = 10000000;

        l49 = l65.add(Direction.NORTHWEST);
        c49 = 10000000;
        d49 = null;
        r49 = 10000000;

        l116 = l115.add(Direction.EAST);
        c116 = 10000000;
        d116 = null;
        r116 = 10000000;

        l101 = l115.add(Direction.NORTHEAST);
        c101 = 10000000;
        d101 = null;
        r101 = 10000000;

        l86 = l100.add(Direction.NORTHEAST);
        c86 = 10000000;
        d86 = null;
        r86 = 10000000;

        l71 = l85.add(Direction.NORTHEAST);
        c71 = 10000000;
        d71 = null;
        r71 = 10000000;

        l56 = l70.add(Direction.NORTHEAST);
        c56 = 10000000;
        d56 = null;
        r56 = 10000000;

        l48 = l64.add(Direction.NORTHWEST);
        c48 = 10000000;
        d48 = null;
        r48 = 10000000;

        l63 = l64.add(Direction.WEST);
        c63 = 10000000;
        d63 = null;
        r63 = 10000000;

        l78 = l79.add(Direction.WEST);
        c78 = 10000000;
        d78 = null;
        r78 = 10000000;

        l93 = l94.add(Direction.WEST);
        c93 = 10000000;
        d93 = null;
        r93 = 10000000;

        l108 = l109.add(Direction.WEST);
        c108 = 10000000;
        d108 = null;
        r108 = 10000000;

        l37 = l52.add(Direction.NORTH);
        c37 = 10000000;
        d37 = null;
        r37 = 10000000;

        l38 = l52.add(Direction.NORTHEAST);
        c38 = 10000000;
        d38 = null;
        r38 = 10000000;

        l36 = l52.add(Direction.NORTHWEST);
        c36 = 10000000;
        d36 = null;
        r36 = 10000000;

        l39 = l53.add(Direction.NORTHEAST);
        c39 = 10000000;
        d39 = null;
        r39 = 10000000;

        l35 = l51.add(Direction.NORTHWEST);
        c35 = 10000000;
        d35 = null;
        r35 = 10000000;

        l40 = l54.add(Direction.NORTHEAST);
        c40 = 10000000;
        d40 = null;
        r40 = 10000000;

        l34 = l50.add(Direction.NORTHWEST);
        c34 = 10000000;
        d34 = null;
        r34 = 10000000;

        l117 = l116.add(Direction.EAST);
        c117 = 10000000;
        d117 = null;
        r117 = 10000000;

        l102 = l116.add(Direction.NORTHEAST);
        c102 = 10000000;
        d102 = null;
        r102 = 10000000;

        l87 = l101.add(Direction.NORTHEAST);
        c87 = 10000000;
        d87 = null;
        r87 = 10000000;

        l72 = l86.add(Direction.NORTHEAST);
        c72 = 10000000;
        d72 = null;
        r72 = 10000000;

        l62 = l63.add(Direction.WEST);
        c62 = 10000000;
        d62 = null;
        r62 = 10000000;

        l77 = l78.add(Direction.WEST);
        c77 = 10000000;
        d77 = null;
        r77 = 10000000;

        l92 = l93.add(Direction.WEST);
        c92 = 10000000;
        d92 = null;
        r92 = 10000000;

        l107 = l108.add(Direction.WEST);
        c107 = 10000000;
        d107 = null;
        r107 = 10000000;

        if(rc.onTheMap(l97)){
            if(!rc.isLocationOccupied(l97)){
                r97 = 10 + rc.senseRubble(l97);
                if(c97 > c112 + r97){
                    d97 = Direction.NORTH;
                    c97 = c112 + r97;
                }
            }
        }

        if(rc.onTheMap(l113)){
            if(!rc.isLocationOccupied(l113)){
                r113 = 10 + rc.senseRubble(l113);
                if(c113 > c112 + r113){
                    d113 = Direction.EAST;
                    c113 = c112 + r113;
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
                if(c98 > c112 + r98){
                    d98 = Direction.NORTHEAST;
                    c98 = c112 + r98;
                }
            }
        }

        if(rc.onTheMap(l96)){
            if(!rc.isLocationOccupied(l96)){
                r96 = 10 + rc.senseRubble(l96);
                if(c96 > c112 + r96){
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
                if(c111 > c112 + r111){
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
                if(c81 > c82 + r81){
                    d81 = d82;
                    c81 = c82 + r81;
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
                if(c99 > c113 + r99){
                    d99 = d113;
                    c99 = c113 + r99;
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
                if(c80 > c81 + r80){
                    d80 = d81;
                    c80 = c81 + r80;
                }
            }
        }

        if(rc.onTheMap(l95)){
            if(!rc.isLocationOccupied(l95)){
                r95 = 10 + rc.senseRubble(l95);
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

        if(rc.onTheMap(l110)){
            if(!rc.isLocationOccupied(l110)){
                r110 = 10 + rc.senseRubble(l110);
                if(c110 > c111 + r110){
                    d110 = d111;
                    c110 = c111 + r110;
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
                if(c65 > c66 + r65){
                    d65 = d66;
                    c65 = c66 + r65;
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
                if(c100 > c114 + r100){
                    d100 = d114;
                    c100 = c114 + r100;
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
                if(c85 > c99 + r85){
                    d85 = d99;
                    c85 = c99 + r85;
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
                if(c64 > c65 + r64){
                    d64 = d65;
                    c64 = c65 + r64;
                }
            }
        }

        if(rc.onTheMap(l79)){
            if(!rc.isLocationOccupied(l79)){
                r79 = 10 + rc.senseRubble(l79);
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

        if(rc.onTheMap(l94)){
            if(!rc.isLocationOccupied(l94)){
                r94 = 10 + rc.senseRubble(l94);
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
                if(c109 > c110 + r109){
                    d109 = d110;
                    c109 = c110 + r109;
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
                if(c50 > c51 + r50){
                    d50 = d51;
                    c50 = c51 + r50;
                }
            }
        }

        if(rc.onTheMap(l55)){
            if(!rc.isLocationOccupied(l55)){
                r55 = 10 + rc.senseRubble(l55);
                if(c55 > c70 + r55){
                    d55 = d70;
                    c55 = c70 + r55;
                }
                if(c55 > c54 + r55){
                    d55 = d54;
                    c55 = c54 + r55;
                }
                if(c55 > c69 + r55){
                    d55 = d69;
                    c55 = c69 + r55;
                }
            }
        }

        if(rc.onTheMap(l49)){
            if(!rc.isLocationOccupied(l49)){
                r49 = 10 + rc.senseRubble(l49);
                if(c49 > c64 + r49){
                    d49 = d64;
                    c49 = c64 + r49;
                }
                if(c49 > c65 + r49){
                    d49 = d65;
                    c49 = c65 + r49;
                }
                if(c49 > c50 + r49){
                    d49 = d50;
                    c49 = c50 + r49;
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
                if(c101 > c115 + r101){
                    d101 = d115;
                    c101 = c115 + r101;
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
                if(c86 > c100 + r86){
                    d86 = d100;
                    c86 = c100 + r86;
                }
            }
        }

        if(rc.onTheMap(l71)){
            if(!rc.isLocationOccupied(l71)){
                r71 = 10 + rc.senseRubble(l71);
                if(c71 > c86 + r71){
                    d71 = d86;
                    c71 = c86 + r71;
                }
                if(c71 > c70 + r71){
                    d71 = d70;
                    c71 = c70 + r71;
                }
                if(c71 > c85 + r71){
                    d71 = d85;
                    c71 = c85 + r71;
                }
            }
        }

        if(rc.onTheMap(l56)){
            if(!rc.isLocationOccupied(l56)){
                r56 = 10 + rc.senseRubble(l56);
                if(c56 > c71 + r56){
                    d56 = d71;
                    c56 = c71 + r56;
                }
                if(c56 > c55 + r56){
                    d56 = d55;
                    c56 = c55 + r56;
                }
                if(c56 > c70 + r56){
                    d56 = d70;
                    c56 = c70 + r56;
                }
            }
        }

        if(rc.onTheMap(l48)){
            if(!rc.isLocationOccupied(l48)){
                r48 = 10 + rc.senseRubble(l48);
                if(c48 > c64 + r48){
                    d48 = d64;
                    c48 = c64 + r48;
                }
                if(c48 > c49 + r48){
                    d48 = d49;
                    c48 = c49 + r48;
                }
            }
        }

        if(rc.onTheMap(l63)){
            if(!rc.isLocationOccupied(l63)){
                r63 = 10 + rc.senseRubble(l63);
                if(c63 > c79 + r63){
                    d63 = d79;
                    c63 = c79 + r63;
                }
                if(c63 > c64 + r63){
                    d63 = d64;
                    c63 = c64 + r63;
                }
            }
        }

        if(rc.onTheMap(l78)){
            if(!rc.isLocationOccupied(l78)){
                r78 = 10 + rc.senseRubble(l78);
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

        if(rc.onTheMap(l108)){
            if(!rc.isLocationOccupied(l108)){
                r108 = 10 + rc.senseRubble(l108);
                if(c108 > c109 + r108){
                    d108 = d109;
                    c108 = c109 + r108;
                }
            }
        }

        if(rc.onTheMap(l37)){
            if(!rc.isLocationOccupied(l37)){
                r37 = 10 + rc.senseRubble(l37);
                if(c37 > c52 + r37){
                    d37 = d52;
                    c37 = c52 + r37;
                }
                if(c37 > c51 + r37){
                    d37 = d51;
                    c37 = c51 + r37;
                }
                if(c37 > c53 + r37){
                    d37 = d53;
                    c37 = c53 + r37;
                }
            }
        }

        if(rc.onTheMap(l38)){
            if(!rc.isLocationOccupied(l38)){
                r38 = 10 + rc.senseRubble(l38);
                if(c38 > c53 + r38){
                    d38 = d53;
                    c38 = c53 + r38;
                }
                if(c38 > c37 + r38){
                    d38 = d37;
                    c38 = c37 + r38;
                }
                if(c38 > c52 + r38){
                    d38 = d52;
                    c38 = c52 + r38;
                }
                if(c38 > c54 + r38){
                    d38 = d54;
                    c38 = c54 + r38;
                }
            }
        }

        if(rc.onTheMap(l36)){
            if(!rc.isLocationOccupied(l36)){
                r36 = 10 + rc.senseRubble(l36);
                if(c36 > c51 + r36){
                    d36 = d51;
                    c36 = c51 + r36;
                }
                if(c36 > c50 + r36){
                    d36 = d50;
                    c36 = c50 + r36;
                }
                if(c36 > c52 + r36){
                    d36 = d52;
                    c36 = c52 + r36;
                }
                if(c36 > c37 + r36){
                    d36 = d37;
                    c36 = c37 + r36;
                }
            }
        }

        if(rc.onTheMap(l39)){
            if(!rc.isLocationOccupied(l39)){
                r39 = 10 + rc.senseRubble(l39);
                if(c39 > c54 + r39){
                    d39 = d54;
                    c39 = c54 + r39;
                }
                if(c39 > c38 + r39){
                    d39 = d38;
                    c39 = c38 + r39;
                }
                if(c39 > c53 + r39){
                    d39 = d53;
                    c39 = c53 + r39;
                }
                if(c39 > c55 + r39){
                    d39 = d55;
                    c39 = c55 + r39;
                }
            }
        }

        if(rc.onTheMap(l35)){
            if(!rc.isLocationOccupied(l35)){
                r35 = 10 + rc.senseRubble(l35);
                if(c35 > c50 + r35){
                    d35 = d50;
                    c35 = c50 + r35;
                }
                if(c35 > c49 + r35){
                    d35 = d49;
                    c35 = c49 + r35;
                }
                if(c35 > c51 + r35){
                    d35 = d51;
                    c35 = c51 + r35;
                }
                if(c35 > c36 + r35){
                    d35 = d36;
                    c35 = c36 + r35;
                }
            }
        }

        if(rc.onTheMap(l40)){
            if(!rc.isLocationOccupied(l40)){
                r40 = 10 + rc.senseRubble(l40);
                if(c40 > c55 + r40){
                    d40 = d55;
                    c40 = c55 + r40;
                }
                if(c40 > c39 + r40){
                    d40 = d39;
                    c40 = c39 + r40;
                }
                if(c40 > c54 + r40){
                    d40 = d54;
                    c40 = c54 + r40;
                }
                if(c40 > c56 + r40){
                    d40 = d56;
                    c40 = c56 + r40;
                }
            }
        }

        if(rc.onTheMap(l34)){
            if(!rc.isLocationOccupied(l34)){
                r34 = 10 + rc.senseRubble(l34);
                if(c34 > c49 + r34){
                    d34 = d49;
                    c34 = c49 + r34;
                }
                if(c34 > c48 + r34){
                    d34 = d48;
                    c34 = c48 + r34;
                }
                if(c34 > c50 + r34){
                    d34 = d50;
                    c34 = c50 + r34;
                }
                if(c34 > c35 + r34){
                    d34 = d35;
                    c34 = c35 + r34;
                }
            }
        }

        if(rc.onTheMap(l117)){
            if(!rc.isLocationOccupied(l117)){
                r117 = 10 + rc.senseRubble(l117);
                if(c117 > c116 + r117){
                    d117 = d116;
                    c117 = c116 + r117;
                }
            }
        }

        if(rc.onTheMap(l102)){
            if(!rc.isLocationOccupied(l102)){
                r102 = 10 + rc.senseRubble(l102);
                if(c102 > c117 + r102){
                    d102 = d117;
                    c102 = c117 + r102;
                }
                if(c102 > c101 + r102){
                    d102 = d101;
                    c102 = c101 + r102;
                }
                if(c102 > c116 + r102){
                    d102 = d116;
                    c102 = c116 + r102;
                }
            }
        }

        if(rc.onTheMap(l87)){
            if(!rc.isLocationOccupied(l87)){
                r87 = 10 + rc.senseRubble(l87);
                if(c87 > c102 + r87){
                    d87 = d102;
                    c87 = c102 + r87;
                }
                if(c87 > c86 + r87){
                    d87 = d86;
                    c87 = c86 + r87;
                }
                if(c87 > c101 + r87){
                    d87 = d101;
                    c87 = c101 + r87;
                }
            }
        }

        if(rc.onTheMap(l72)){
            if(!rc.isLocationOccupied(l72)){
                r72 = 10 + rc.senseRubble(l72);
                if(c72 > c87 + r72){
                    d72 = d87;
                    c72 = c87 + r72;
                }
                if(c72 > c71 + r72){
                    d72 = d71;
                    c72 = c71 + r72;
                }
                if(c72 > c86 + r72){
                    d72 = d86;
                    c72 = c86 + r72;
                }
            }
        }

        if(rc.onTheMap(l62)){
            if(!rc.isLocationOccupied(l62)){
                r62 = 10 + rc.senseRubble(l62);
                if(c62 > c78 + r62){
                    d62 = d78;
                    c62 = c78 + r62;
                }
                if(c62 > c63 + r62){
                    d62 = d63;
                    c62 = c63 + r62;
                }
            }
        }

        if(rc.onTheMap(l77)){
            if(!rc.isLocationOccupied(l77)){
                r77 = 10 + rc.senseRubble(l77);
                if(c77 > c93 + r77){
                    d77 = d93;
                    c77 = c93 + r77;
                }
                if(c77 > c78 + r77){
                    d77 = d78;
                    c77 = c78 + r77;
                }
            }
        }

        if(rc.onTheMap(l92)){
            if(!rc.isLocationOccupied(l92)){
                r92 = 10 + rc.senseRubble(l92);
                if(c92 > c108 + r92){
                    d92 = d108;
                    c92 = c108 + r92;
                }
                if(c92 > c93 + r92){
                    d92 = d93;
                    c92 = c93 + r92;
                }
            }
        }

        if(rc.onTheMap(l107)){
            if(!rc.isLocationOccupied(l107)){
                r107 = 10 + rc.senseRubble(l107);
                if(c107 > c108 + r107){
                    d107 = d108;
                    c107 = c108 + r107;
                }
            }
        }

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;

        int dist34 = Math.max(Math.abs(cx+4)*49 + c34, Math.abs(cy - 2)*49+c34);
        if(r34 < cmin){
            cmin= r34;
            ans = d34;
        }

        int dist35 = Math.max(Math.abs(cx+5)*49 + c35, Math.abs(cy - 2)*49+c35);
        if(r35 < cmin){
            cmin= r35;
            ans = d35;
        }

        int dist36 = Math.max(Math.abs(cx+6)*49 + c36, Math.abs(cy - 2)*49+c36);
        if(r36 < cmin){
            cmin= r36;
            ans = d36;
        }

        int dist37 = Math.max(Math.abs(cx+7)*49 + c37, Math.abs(cy - 2)*49+c37);
        if(r37 < cmin){
            cmin= r37;
            ans = d37;
        }

        int dist38 = Math.max(Math.abs(cx+8)*49 + c38, Math.abs(cy - 2)*49+c38);
        if(r38 < cmin){
            cmin= r38;
            ans = d38;
        }

        int dist39 = Math.max(Math.abs(cx+9)*49 + c39, Math.abs(cy - 2)*49+c39);
        if(r39 < cmin){
            cmin= r39;
            ans = d39;
        }

        int dist40 = Math.max(Math.abs(cx+10)*49 + c40, Math.abs(cy - 2)*49+c40);
        if(r40 < cmin){
            cmin= r40;
            ans = d40;
        }

        int dist48 = Math.max(Math.abs(cx+3)*49 + c48, Math.abs(cy - 3)*49+c48);
        if(r48 < cmin){
            cmin= r48;
            ans = d48;
        }

        int dist49 = Math.max(Math.abs(cx+4)*49 + c49, Math.abs(cy - 3)*49+c49);
        if(r49 < cmin){
            cmin= r49;
            ans = d49;
        }

        int dist55 = Math.max(Math.abs(cx+10)*49 + c55, Math.abs(cy - 3)*49+c55);
        if(r55 < cmin){
            cmin= r55;
            ans = d55;
        }

        int dist56 = Math.max(Math.abs(cx+11)*49 + c56, Math.abs(cy - 3)*49+c56);
        if(r56 < cmin){
            cmin= r56;
            ans = d56;
        }

        int dist62 = Math.max(Math.abs(cx+2)*49 + c62, Math.abs(cy - 4)*49+c62);
        if(r62 < cmin){
            cmin= r62;
            ans = d62;
        }

        int dist63 = Math.max(Math.abs(cx+3)*49 + c63, Math.abs(cy - 4)*49+c63);
        if(r63 < cmin){
            cmin= r63;
            ans = d63;
        }

        int dist71 = Math.max(Math.abs(cx+11)*49 + c71, Math.abs(cy - 4)*49+c71);
        if(r71 < cmin){
            cmin= r71;
            ans = d71;
        }

        int dist72 = Math.max(Math.abs(cx+12)*49 + c72, Math.abs(cy - 4)*49+c72);
        if(r72 < cmin){
            cmin= r72;
            ans = d72;
        }

        int dist77 = Math.max(Math.abs(cx+2)*49 + c77, Math.abs(cy - 5)*49+c77);
        if(r77 < cmin){
            cmin= r77;
            ans = d77;
        }

        int dist87 = Math.max(Math.abs(cx+12)*49 + c87, Math.abs(cy - 5)*49+c87);
        if(r87 < cmin){
            cmin= r87;
            ans = d87;
        }

        int dist92 = Math.max(Math.abs(cx+2)*49 + c92, Math.abs(cy - 6)*49+c92);
        if(r92 < cmin){
            cmin= r92;
            ans = d92;
        }

        int dist102 = Math.max(Math.abs(cx+12)*49 + c102, Math.abs(cy - 6)*49+c102);
        if(r102 < cmin){
            cmin= r102;
            ans = d102;
        }

        int dist107 = Math.max(Math.abs(cx+2)*49 + c107, Math.abs(cy - 7)*49+c107);
        if(r107 < cmin){
            cmin= r107;
            ans = d107;
        }

        int dist117 = Math.max(Math.abs(cx+12)*49 + c117, Math.abs(cy - 7)*49+c117);
        if(r117 < cmin){
            cmin= r117;
            ans = d117;
        }

        if(cmin<=nomove) return ans;

        int dist50 = Math.max(Math.abs(cx+5)*49 + c50, Math.abs(cy - 3)*49+c50);
        if(r50 < cmin){
            cmin= r50;
            ans = d50;
        }

        int dist51 = Math.max(Math.abs(cx+6)*49 + c51, Math.abs(cy - 3)*49+c51);
        if(r51 < cmin){
            cmin= r51;
            ans = d51;
        }

        int dist52 = Math.max(Math.abs(cx+7)*49 + c52, Math.abs(cy - 3)*49+c52);
        if(r52 < cmin){
            cmin= r52;
            ans = d52;
        }

        int dist53 = Math.max(Math.abs(cx+8)*49 + c53, Math.abs(cy - 3)*49+c53);
        if(r53 < cmin){
            cmin= r53;
            ans = d53;
        }

        int dist54 = Math.max(Math.abs(cx+9)*49 + c54, Math.abs(cy - 3)*49+c54);
        if(r54 < cmin){
            cmin= r54;
            ans = d54;
        }

        int dist64 = Math.max(Math.abs(cx+4)*49 + c64, Math.abs(cy - 4)*49+c64);
        if(r64 < cmin){
            cmin= r64;
            ans = d64;
        }

        int dist65 = Math.max(Math.abs(cx+5)*49 + c65, Math.abs(cy - 4)*49+c65);
        if(r65 < cmin){
            cmin= r65;
            ans = d65;
        }

        int dist69 = Math.max(Math.abs(cx+9)*49 + c69, Math.abs(cy - 4)*49+c69);
        if(r69 < cmin){
            cmin= r69;
            ans = d69;
        }

        int dist70 = Math.max(Math.abs(cx+10)*49 + c70, Math.abs(cy - 4)*49+c70);
        if(r70 < cmin){
            cmin= r70;
            ans = d70;
        }

        int dist78 = Math.max(Math.abs(cx+3)*49 + c78, Math.abs(cy - 5)*49+c78);
        if(r78 < cmin){
            cmin= r78;
            ans = d78;
        }

        int dist79 = Math.max(Math.abs(cx+4)*49 + c79, Math.abs(cy - 5)*49+c79);
        if(r79 < cmin){
            cmin= r79;
            ans = d79;
        }

        int dist85 = Math.max(Math.abs(cx+10)*49 + c85, Math.abs(cy - 5)*49+c85);
        if(r85 < cmin){
            cmin= r85;
            ans = d85;
        }

        int dist86 = Math.max(Math.abs(cx+11)*49 + c86, Math.abs(cy - 5)*49+c86);
        if(r86 < cmin){
            cmin= r86;
            ans = d86;
        }

        int dist93 = Math.max(Math.abs(cx+3)*49 + c93, Math.abs(cy - 6)*49+c93);
        if(r93 < cmin){
            cmin= r93;
            ans = d93;
        }

        int dist101 = Math.max(Math.abs(cx+11)*49 + c101, Math.abs(cy - 6)*49+c101);
        if(r101 < cmin){
            cmin= r101;
            ans = d101;
        }

        int dist108 = Math.max(Math.abs(cx+3)*49 + c108, Math.abs(cy - 7)*49+c108);
        if(r108 < cmin){
            cmin= r108;
            ans = d108;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*49+c116);
        if(r116 < cmin){
            cmin= r116;
            ans = d116;
        }

        if(cmin<=nomove) return ans;

        int dist66 = Math.max(Math.abs(cx+6)*49 + c66, Math.abs(cy - 4)*49+c66);
        if(r66 < cmin){
            cmin= r66;
            ans = d66;
        }

        int dist67 = Math.max(Math.abs(cx+7)*49 + c67, Math.abs(cy - 4)*49+c67);
        if(r67 < cmin){
            cmin= r67;
            ans = d67;
        }

        int dist68 = Math.max(Math.abs(cx+8)*49 + c68, Math.abs(cy - 4)*49+c68);
        if(r68 < cmin){
            cmin= r68;
            ans = d68;
        }

        int dist80 = Math.max(Math.abs(cx+5)*49 + c80, Math.abs(cy - 5)*49+c80);
        if(r80 < cmin){
            cmin= r80;
            ans = d80;
        }

        int dist81 = Math.max(Math.abs(cx+6)*49 + c81, Math.abs(cy - 5)*49+c81);
        if(r81 < cmin){
            cmin= r81;
            ans = d81;
        }

        int dist83 = Math.max(Math.abs(cx+8)*49 + c83, Math.abs(cy - 5)*49+c83);
        if(r83 < cmin){
            cmin= r83;
            ans = d83;
        }

        int dist84 = Math.max(Math.abs(cx+9)*49 + c84, Math.abs(cy - 5)*49+c84);
        if(r84 < cmin){
            cmin= r84;
            ans = d84;
        }

        int dist94 = Math.max(Math.abs(cx+4)*49 + c94, Math.abs(cy - 6)*49+c94);
        if(r94 < cmin){
            cmin= r94;
            ans = d94;
        }

        int dist95 = Math.max(Math.abs(cx+5)*49 + c95, Math.abs(cy - 6)*49+c95);
        if(r95 < cmin){
            cmin= r95;
            ans = d95;
        }

        int dist99 = Math.max(Math.abs(cx+9)*49 + c99, Math.abs(cy - 6)*49+c99);
        if(r99 < cmin){
            cmin= r99;
            ans = d99;
        }

        int dist100 = Math.max(Math.abs(cx+10)*49 + c100, Math.abs(cy - 6)*49+c100);
        if(r100 < cmin){
            cmin= r100;
            ans = d100;
        }

        int dist109 = Math.max(Math.abs(cx+4)*49 + c109, Math.abs(cy - 7)*49+c109);
        if(r109 < cmin){
            cmin= r109;
            ans = d109;
        }

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*49+c115);
        if(r115 < cmin){
            cmin= r115;
            ans = d115;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*49+c82);
        if(r82 < cmin){
            cmin= r82;
            ans = d82;
        }

        int dist96 = Math.max(Math.abs(cx+6)*49 + c96, Math.abs(cy - 6)*49+c96);
        if(r96 < cmin){
            cmin= r96;
            ans = d96;
        }

        int dist97 = Math.max(Math.abs(cx+7)*49 + c97, Math.abs(cy - 6)*49+c97);
        if(r97 < cmin){
            cmin= r97;
            ans = d97;
        }

        int dist98 = Math.max(Math.abs(cx+8)*49 + c98, Math.abs(cy - 6)*49+c98);
        if(r98 < cmin){
            cmin= r98;
            ans = d98;
        }

        int dist110 = Math.max(Math.abs(cx+5)*49 + c110, Math.abs(cy - 7)*49+c110);
        if(r110 < cmin){
            cmin= r110;
            ans = d110;
        }

        int dist111 = Math.max(Math.abs(cx+6)*49 + c111, Math.abs(cy - 7)*49+c111);
        if(r111 < cmin){
            cmin= r111;
            ans = d111;
        }

        int dist113 = Math.max(Math.abs(cx+8)*49 + c113, Math.abs(cy - 7)*49+c113);
        if(r113 < cmin){
            cmin= r113;
            ans = d113;
        }

        int dist114 = Math.max(Math.abs(cx+9)*49 + c114, Math.abs(cy - 7)*49+c114);
        if(r114 < cmin){
            cmin= r114;
            ans = d114;
        }

        return ans;

    }
}
