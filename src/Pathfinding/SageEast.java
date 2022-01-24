package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class SageEast {
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

    static MapLocation l82;
    static int c82;
    static int r82;
    static Direction d82;

    static MapLocation l83;
    static int c83;
    static int r83;
    static Direction d83;

    static MapLocation l142;
    static int c142;
    static int r142;
    static Direction d142;

    static MapLocation l143;
    static int c143;
    static int r143;
    static Direction d143;

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

    static MapLocation l55;
    static int c55;
    static int r55;
    static Direction d55;

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

    static MapLocation l175;
    static int c175;
    static int r175;
    static Direction d175;

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

    static MapLocation l161;
    static int c161;
    static int r161;
    static Direction d161;

    static MapLocation l71;
    static int c71;
    static int r71;
    static Direction d71;

    static MapLocation l176;
    static int c176;
    static int r176;
    static Direction d176;

    static MapLocation l56;
    static int c56;
    static int r56;
    static Direction d56;

    static MapLocation l37;
    static int c37;
    static int r37;
    static Direction d37;

    static MapLocation l38;
    static int c38;
    static int r38;
    static Direction d38;

    static MapLocation l39;
    static int c39;
    static int r39;
    static Direction d39;

    static MapLocation l40;
    static int c40;
    static int r40;
    static Direction d40;

    static MapLocation l187;
    static int c187;
    static int r187;
    static Direction d187;

    static MapLocation l188;
    static int c188;
    static int r188;
    static Direction d188;

    static MapLocation l189;
    static int c189;
    static int r189;
    static Direction d189;

    static MapLocation l190;
    static int c190;
    static int r190;
    static Direction d190;

    static MapLocation l117;
    static int c117;
    static int r117;
    static Direction d117;

    static MapLocation l132;
    static int c132;
    static int r132;
    static Direction d132;

    static MapLocation l102;
    static int c102;
    static int r102;
    static Direction d102;

    static MapLocation l147;
    static int c147;
    static int r147;
    static Direction d147;

    static MapLocation l87;
    static int c87;
    static int r87;
    static Direction d87;

    static MapLocation l162;
    static int c162;
    static int r162;
    static Direction d162;

    static MapLocation l72;
    static int c72;
    static int r72;
    static Direction d72;

    static Direction ans;
    static Direction gbda(RobotController rc, MapLocation target, Direction prev) throws GameActionException {//get best dir -all
        ans = null;
        l112 = rc.getLocation();
        c112 = 0;

        l97 = l112.add(Direction.NORTH);
        c97 = 10000000;
        d97 = null;
        r97 = 10000000;

        l127 = l112.add(Direction.SOUTH);
        c127 = 10000000;
        d127 = null;
        r127 = 10000000;

        l113 = l112.add(Direction.EAST);
        c113 = 10000000;
        d113 = null;
        r113 = 10000000;

        l128 = l112.add(Direction.SOUTHEAST);
        c128 = 10000000;
        d128 = null;
        r128 = 10000000;

        l98 = l112.add(Direction.NORTHEAST);
        c98 = 10000000;
        d98 = null;
        r98 = 10000000;

        l82 = l97.add(Direction.NORTH);
        c82 = 10000000;
        d82 = null;
        r82 = 10000000;

        l83 = l97.add(Direction.NORTHEAST);
        c83 = 10000000;
        d83 = null;
        r83 = 10000000;

        l142 = l127.add(Direction.SOUTH);
        c142 = 10000000;
        d142 = null;
        r142 = 10000000;

        l143 = l127.add(Direction.SOUTHEAST);
        c143 = 10000000;
        d143 = null;
        r143 = 10000000;

        l114 = l113.add(Direction.EAST);
        c114 = 10000000;
        d114 = null;
        r114 = 10000000;

        l129 = l113.add(Direction.SOUTHEAST);
        c129 = 10000000;
        d129 = null;
        r129 = 10000000;

        l99 = l113.add(Direction.NORTHEAST);
        c99 = 10000000;
        d99 = null;
        r99 = 10000000;

        l144 = l128.add(Direction.SOUTHEAST);
        c144 = 10000000;
        d144 = null;
        r144 = 10000000;

        l84 = l98.add(Direction.NORTHEAST);
        c84 = 10000000;
        d84 = null;
        r84 = 10000000;

        l67 = l82.add(Direction.NORTH);
        c67 = 10000000;
        d67 = null;
        r67 = 10000000;

        l68 = l82.add(Direction.NORTHEAST);
        c68 = 10000000;
        d68 = null;
        r68 = 10000000;

        l69 = l83.add(Direction.NORTHEAST);
        c69 = 10000000;
        d69 = null;
        r69 = 10000000;

        l157 = l142.add(Direction.SOUTH);
        c157 = 10000000;
        d157 = null;
        r157 = 10000000;

        l158 = l142.add(Direction.SOUTHEAST);
        c158 = 10000000;
        d158 = null;
        r158 = 10000000;

        l159 = l143.add(Direction.SOUTHEAST);
        c159 = 10000000;
        d159 = null;
        r159 = 10000000;

        l115 = l114.add(Direction.EAST);
        c115 = 10000000;
        d115 = null;
        r115 = 10000000;

        l130 = l114.add(Direction.SOUTHEAST);
        c130 = 10000000;
        d130 = null;
        r130 = 10000000;

        l100 = l114.add(Direction.NORTHEAST);
        c100 = 10000000;
        d100 = null;
        r100 = 10000000;

        l145 = l129.add(Direction.SOUTHEAST);
        c145 = 10000000;
        d145 = null;
        r145 = 10000000;

        l85 = l99.add(Direction.NORTHEAST);
        c85 = 10000000;
        d85 = null;
        r85 = 10000000;

        l160 = l144.add(Direction.SOUTHEAST);
        c160 = 10000000;
        d160 = null;
        r160 = 10000000;

        l70 = l84.add(Direction.NORTHEAST);
        c70 = 10000000;
        d70 = null;
        r70 = 10000000;

        l52 = l67.add(Direction.NORTH);
        c52 = 10000000;
        d52 = null;
        r52 = 10000000;

        l53 = l67.add(Direction.NORTHEAST);
        c53 = 10000000;
        d53 = null;
        r53 = 10000000;

        l54 = l68.add(Direction.NORTHEAST);
        c54 = 10000000;
        d54 = null;
        r54 = 10000000;

        l55 = l69.add(Direction.NORTHEAST);
        c55 = 10000000;
        d55 = null;
        r55 = 10000000;

        l172 = l157.add(Direction.SOUTH);
        c172 = 10000000;
        d172 = null;
        r172 = 10000000;

        l173 = l157.add(Direction.SOUTHEAST);
        c173 = 10000000;
        d173 = null;
        r173 = 10000000;

        l174 = l158.add(Direction.SOUTHEAST);
        c174 = 10000000;
        d174 = null;
        r174 = 10000000;

        l175 = l159.add(Direction.SOUTHEAST);
        c175 = 10000000;
        d175 = null;
        r175 = 10000000;

        l116 = l115.add(Direction.EAST);
        c116 = 10000000;
        d116 = null;
        r116 = 10000000;

        l131 = l115.add(Direction.SOUTHEAST);
        c131 = 10000000;
        d131 = null;
        r131 = 10000000;

        l101 = l115.add(Direction.NORTHEAST);
        c101 = 10000000;
        d101 = null;
        r101 = 10000000;

        l146 = l130.add(Direction.SOUTHEAST);
        c146 = 10000000;
        d146 = null;
        r146 = 10000000;

        l86 = l100.add(Direction.NORTHEAST);
        c86 = 10000000;
        d86 = null;
        r86 = 10000000;

        l161 = l145.add(Direction.SOUTHEAST);
        c161 = 10000000;
        d161 = null;
        r161 = 10000000;

        l71 = l85.add(Direction.NORTHEAST);
        c71 = 10000000;
        d71 = null;
        r71 = 10000000;

        l176 = l160.add(Direction.SOUTHEAST);
        c176 = 10000000;
        d176 = null;
        r176 = 10000000;

        l56 = l70.add(Direction.NORTHEAST);
        c56 = 10000000;
        d56 = null;
        r56 = 10000000;

        l37 = l52.add(Direction.NORTH);
        c37 = 10000000;
        d37 = null;
        r37 = 10000000;

        l38 = l52.add(Direction.NORTHEAST);
        c38 = 10000000;
        d38 = null;
        r38 = 10000000;

        l39 = l53.add(Direction.NORTHEAST);
        c39 = 10000000;
        d39 = null;
        r39 = 10000000;

        l40 = l54.add(Direction.NORTHEAST);
        c40 = 10000000;
        d40 = null;
        r40 = 10000000;

        l187 = l172.add(Direction.SOUTH);
        c187 = 10000000;
        d187 = null;
        r187 = 10000000;

        l188 = l172.add(Direction.SOUTHEAST);
        c188 = 10000000;
        d188 = null;
        r188 = 10000000;

        l189 = l173.add(Direction.SOUTHEAST);
        c189 = 10000000;
        d189 = null;
        r189 = 10000000;

        l190 = l174.add(Direction.SOUTHEAST);
        c190 = 10000000;
        d190 = null;
        r190 = 10000000;

        l117 = l116.add(Direction.EAST);
        c117 = 10000000;
        d117 = null;
        r117 = 10000000;

        l132 = l116.add(Direction.SOUTHEAST);
        c132 = 10000000;
        d132 = null;
        r132 = 10000000;

        l102 = l116.add(Direction.NORTHEAST);
        c102 = 10000000;
        d102 = null;
        r102 = 10000000;

        l147 = l131.add(Direction.SOUTHEAST);
        c147 = 10000000;
        d147 = null;
        r147 = 10000000;

        l87 = l101.add(Direction.NORTHEAST);
        c87 = 10000000;
        d87 = null;
        r87 = 10000000;

        l162 = l146.add(Direction.SOUTHEAST);
        c162 = 10000000;
        d162 = null;
        r162 = 10000000;

        l72 = l86.add(Direction.NORTHEAST);
        c72 = 10000000;
        d72 = null;
        r72 = 10000000;

        if(rc.onTheMap(l97)){
            if(!rc.isLocationOccupied(l97)){
                r97 = 10 + rc.senseRubble(l97);
                if(c97 > c112 + r97){
                    d97 = Direction.NORTH;
                    c97 = c112 + r97;
                }
            }
        }

        if(rc.onTheMap(l127)){
            if(!rc.isLocationOccupied(l127)){
                r127 = 10 + rc.senseRubble(l127);
                if(c127 > c112 + r127){
                    d127 = Direction.SOUTH;
                    c127 = c112 + r127;
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
                if(c113 > c97 + r113){
                    d113 = d97;
                    c113 = c97 + r113;
                }
                if(c113 > c127 + r113){
                    d113 = d127;
                    c113 = c127 + r113;
                }
            }
        }

        if(rc.onTheMap(l128)){
            if(!rc.isLocationOccupied(l128)){
                r128 = 10 + rc.senseRubble(l128);
                if(c128 > c113 + r128){
                    d128 = d113;
                    c128 = c113 + r128;
                }
                if(c128 > c127 + r128){
                    d128 = d127;
                    c128 = c127 + r128;
                }
                if(c128 > c112 + r128){
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
                if(c98 > c112 + r98){
                    d98 = Direction.NORTHEAST;
                    c98 = c112 + r98;
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

        if(rc.onTheMap(l142)){
            if(!rc.isLocationOccupied(l142)){
                r142 = 10 + rc.senseRubble(l142);
                if(c142 > c127 + r142){
                    d142 = d127;
                    c142 = c127 + r142;
                }
            }
        }

        if(rc.onTheMap(l143)){
            if(!rc.isLocationOccupied(l143)){
                r143 = 10 + rc.senseRubble(l143);
                if(c143 > c128 + r143){
                    d143 = d128;
                    c143 = c128 + r143;
                }
                if(c143 > c142 + r143){
                    d143 = d142;
                    c143 = c142 + r143;
                }
                if(c143 > c127 + r143){
                    d143 = d127;
                    c143 = c127 + r143;
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
                if(c129 > c114 + r129){
                    d129 = d114;
                    c129 = c114 + r129;
                }
                if(c129 > c128 + r129){
                    d129 = d128;
                    c129 = c128 + r129;
                }
                if(c129 > c113 + r129){
                    d129 = d113;
                    c129 = c113 + r129;
                }
                if(c129 > c143 + r129){
                    d129 = d143;
                    c129 = c143 + r129;
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
                if(c144 > c129 + r144){
                    d144 = d129;
                    c144 = c129 + r144;
                }
                if(c144 > c143 + r144){
                    d144 = d143;
                    c144 = c143 + r144;
                }
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

        if(rc.onTheMap(l67)){
            if(!rc.isLocationOccupied(l67)){
                r67 = 10 + rc.senseRubble(l67);
                if(c67 > c82 + r67){
                    d67 = d82;
                    c67 = c82 + r67;
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

        if(rc.onTheMap(l157)){
            if(!rc.isLocationOccupied(l157)){
                r157 = 10 + rc.senseRubble(l157);
                if(c157 > c142 + r157){
                    d157 = d142;
                    c157 = c142 + r157;
                }
            }
        }

        if(rc.onTheMap(l158)){
            if(!rc.isLocationOccupied(l158)){
                r158 = 10 + rc.senseRubble(l158);
                if(c158 > c143 + r158){
                    d158 = d143;
                    c158 = c143 + r158;
                }
                if(c158 > c157 + r158){
                    d158 = d157;
                    c158 = c157 + r158;
                }
                if(c158 > c142 + r158){
                    d158 = d142;
                    c158 = c142 + r158;
                }
            }
        }

        if(rc.onTheMap(l159)){
            if(!rc.isLocationOccupied(l159)){
                r159 = 10 + rc.senseRubble(l159);
                if(c159 > c144 + r159){
                    d159 = d144;
                    c159 = c144 + r159;
                }
                if(c159 > c158 + r159){
                    d159 = d158;
                    c159 = c158 + r159;
                }
                if(c159 > c143 + r159){
                    d159 = d143;
                    c159 = c143 + r159;
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
                if(c130 > c115 + r130){
                    d130 = d115;
                    c130 = c115 + r130;
                }
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
                if(c145 > c130 + r145){
                    d145 = d130;
                    c145 = c130 + r145;
                }
                if(c145 > c144 + r145){
                    d145 = d144;
                    c145 = c144 + r145;
                }
                if(c145 > c129 + r145){
                    d145 = d129;
                    c145 = c129 + r145;
                }
                if(c145 > c159 + r145){
                    d145 = d159;
                    c145 = c159 + r145;
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
                if(c160 > c145 + r160){
                    d160 = d145;
                    c160 = c145 + r160;
                }
                if(c160 > c159 + r160){
                    d160 = d159;
                    c160 = c159 + r160;
                }
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

        if(rc.onTheMap(l52)){
            if(!rc.isLocationOccupied(l52)){
                r52 = 10 + rc.senseRubble(l52);
                if(c52 > c67 + r52){
                    d52 = d67;
                    c52 = c67 + r52;
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

        if(rc.onTheMap(l172)){
            if(!rc.isLocationOccupied(l172)){
                r172 = 10 + rc.senseRubble(l172);
                if(c172 > c157 + r172){
                    d172 = d157;
                    c172 = c157 + r172;
                }
            }
        }

        if(rc.onTheMap(l173)){
            if(!rc.isLocationOccupied(l173)){
                r173 = 10 + rc.senseRubble(l173);
                if(c173 > c158 + r173){
                    d173 = d158;
                    c173 = c158 + r173;
                }
                if(c173 > c172 + r173){
                    d173 = d172;
                    c173 = c172 + r173;
                }
                if(c173 > c157 + r173){
                    d173 = d157;
                    c173 = c157 + r173;
                }
            }
        }

        if(rc.onTheMap(l174)){
            if(!rc.isLocationOccupied(l174)){
                r174 = 10 + rc.senseRubble(l174);
                if(c174 > c159 + r174){
                    d174 = d159;
                    c174 = c159 + r174;
                }
                if(c174 > c173 + r174){
                    d174 = d173;
                    c174 = c173 + r174;
                }
                if(c174 > c158 + r174){
                    d174 = d158;
                    c174 = c158 + r174;
                }
            }
        }

        if(rc.onTheMap(l175)){
            if(!rc.isLocationOccupied(l175)){
                r175 = 10 + rc.senseRubble(l175);
                if(c175 > c160 + r175){
                    d175 = d160;
                    c175 = c160 + r175;
                }
                if(c175 > c174 + r175){
                    d175 = d174;
                    c175 = c174 + r175;
                }
                if(c175 > c159 + r175){
                    d175 = d159;
                    c175 = c159 + r175;
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
                if(c131 > c116 + r131){
                    d131 = d116;
                    c131 = c116 + r131;
                }
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
                if(c146 > c131 + r146){
                    d146 = d131;
                    c146 = c131 + r146;
                }
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

        if(rc.onTheMap(l161)){
            if(!rc.isLocationOccupied(l161)){
                r161 = 10 + rc.senseRubble(l161);
                if(c161 > c146 + r161){
                    d161 = d146;
                    c161 = c146 + r161;
                }
                if(c161 > c160 + r161){
                    d161 = d160;
                    c161 = c160 + r161;
                }
                if(c161 > c145 + r161){
                    d161 = d145;
                    c161 = c145 + r161;
                }
                if(c161 > c175 + r161){
                    d161 = d175;
                    c161 = c175 + r161;
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
                if(c71 > c55 + r71){
                    d71 = d55;
                    c71 = c55 + r71;
                }
                if(c71 > c85 + r71){
                    d71 = d85;
                    c71 = c85 + r71;
                }
            }
        }

        if(rc.onTheMap(l176)){
            if(!rc.isLocationOccupied(l176)){
                r176 = 10 + rc.senseRubble(l176);
                if(c176 > c161 + r176){
                    d176 = d161;
                    c176 = c161 + r176;
                }
                if(c176 > c175 + r176){
                    d176 = d175;
                    c176 = c175 + r176;
                }
                if(c176 > c160 + r176){
                    d176 = d160;
                    c176 = c160 + r176;
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

        if(rc.onTheMap(l37)){
            if(!rc.isLocationOccupied(l37)){
                r37 = 10 + rc.senseRubble(l37);
                if(c37 > c52 + r37){
                    d37 = d52;
                    c37 = c52 + r37;
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
            }
        }

        if(rc.onTheMap(l187)){
            if(!rc.isLocationOccupied(l187)){
                r187 = 10 + rc.senseRubble(l187);
                if(c187 > c172 + r187){
                    d187 = d172;
                    c187 = c172 + r187;
                }
            }
        }

        if(rc.onTheMap(l188)){
            if(!rc.isLocationOccupied(l188)){
                r188 = 10 + rc.senseRubble(l188);
                if(c188 > c173 + r188){
                    d188 = d173;
                    c188 = c173 + r188;
                }
                if(c188 > c187 + r188){
                    d188 = d187;
                    c188 = c187 + r188;
                }
                if(c188 > c172 + r188){
                    d188 = d172;
                    c188 = c172 + r188;
                }
            }
        }

        if(rc.onTheMap(l189)){
            if(!rc.isLocationOccupied(l189)){
                r189 = 10 + rc.senseRubble(l189);
                if(c189 > c174 + r189){
                    d189 = d174;
                    c189 = c174 + r189;
                }
                if(c189 > c188 + r189){
                    d189 = d188;
                    c189 = c188 + r189;
                }
                if(c189 > c173 + r189){
                    d189 = d173;
                    c189 = c173 + r189;
                }
            }
        }

        if(rc.onTheMap(l190)){
            if(!rc.isLocationOccupied(l190)){
                r190 = 10 + rc.senseRubble(l190);
                if(c190 > c175 + r190){
                    d190 = d175;
                    c190 = c175 + r190;
                }
                if(c190 > c189 + r190){
                    d190 = d189;
                    c190 = c189 + r190;
                }
                if(c190 > c174 + r190){
                    d190 = d174;
                    c190 = c174 + r190;
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
                if(c117 > c101 + r117){
                    d117 = d101;
                    c117 = c101 + r117;
                }
                if(c117 > c131 + r117){
                    d117 = d131;
                    c117 = c131 + r117;
                }
            }
        }

        if(rc.onTheMap(l132)){
            if(!rc.isLocationOccupied(l132)){
                r132 = 10 + rc.senseRubble(l132);
                if(c132 > c117 + r132){
                    d132 = d117;
                    c132 = c117 + r132;
                }
                if(c132 > c131 + r132){
                    d132 = d131;
                    c132 = c131 + r132;
                }
                if(c132 > c116 + r132){
                    d132 = d116;
                    c132 = c116 + r132;
                }
                if(c132 > c146 + r132){
                    d132 = d146;
                    c132 = c146 + r132;
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
                if(c102 > c86 + r102){
                    d102 = d86;
                    c102 = c86 + r102;
                }
                if(c102 > c116 + r102){
                    d102 = d116;
                    c102 = c116 + r102;
                }
            }
        }

        if(rc.onTheMap(l147)){
            if(!rc.isLocationOccupied(l147)){
                r147 = 10 + rc.senseRubble(l147);
                if(c147 > c132 + r147){
                    d147 = d132;
                    c147 = c132 + r147;
                }
                if(c147 > c146 + r147){
                    d147 = d146;
                    c147 = c146 + r147;
                }
                if(c147 > c131 + r147){
                    d147 = d131;
                    c147 = c131 + r147;
                }
                if(c147 > c161 + r147){
                    d147 = d161;
                    c147 = c161 + r147;
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
                if(c87 > c71 + r87){
                    d87 = d71;
                    c87 = c71 + r87;
                }
                if(c87 > c101 + r87){
                    d87 = d101;
                    c87 = c101 + r87;
                }
            }
        }

        if(rc.onTheMap(l162)){
            if(!rc.isLocationOccupied(l162)){
                r162 = 10 + rc.senseRubble(l162);
                if(c162 > c147 + r162){
                    d162 = d147;
                    c162 = c147 + r162;
                }
                if(c162 > c161 + r162){
                    d162 = d161;
                    c162 = c161 + r162;
                }
                if(c162 > c146 + r162){
                    d162 = d146;
                    c162 = c146 + r162;
                }
                if(c162 > c176 + r162){
                    d162 = d176;
                    c162 = c176 + r162;
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
                if(c72 > c56 + r72){
                    d72 = d56;
                    c72 = c56 + r72;
                }
                if(c72 > c86 + r72){
                    d72 = d86;
                    c72 = c86 + r72;
                }
            }
        }

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;

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

        int dist87 = Math.max(Math.abs(cx+12)*49 + c87, Math.abs(cy - 5)*49+c87);
        if(r87 < cmin){
            cmin= r87;
            ans = d87;
        }

        int dist102 = Math.max(Math.abs(cx+12)*49 + c102, Math.abs(cy - 6)*49+c102);
        if(r102 < cmin){
            cmin= r102;
            ans = d102;
        }

        int dist117 = Math.max(Math.abs(cx+12)*49 + c117, Math.abs(cy - 7)*49+c117);
        if(r117 < cmin){
            cmin= r117;
            ans = d117;
        }

        int dist132 = Math.max(Math.abs(cx+12)*49 + c132, Math.abs(cy - 8)*49+c132);
        if(r132 < cmin){
            cmin= r132;
            ans = d132;
        }

        int dist147 = Math.max(Math.abs(cx+12)*49 + c147, Math.abs(cy - 9)*49+c147);
        if(r147 < cmin){
            cmin= r147;
            ans = d147;
        }

        int dist161 = Math.max(Math.abs(cx+11)*49 + c161, Math.abs(cy - 10)*49+c161);
        if(r161 < cmin){
            cmin= r161;
            ans = d161;
        }

        int dist162 = Math.max(Math.abs(cx+12)*49 + c162, Math.abs(cy - 10)*49+c162);
        if(r162 < cmin){
            cmin= r162;
            ans = d162;
        }

        int dist175 = Math.max(Math.abs(cx+10)*49 + c175, Math.abs(cy - 11)*49+c175);
        if(r175 < cmin){
            cmin= r175;
            ans = d175;
        }

        int dist176 = Math.max(Math.abs(cx+11)*49 + c176, Math.abs(cy - 11)*49+c176);
        if(r176 < cmin){
            cmin= r176;
            ans = d176;
        }

        int dist187 = Math.max(Math.abs(cx+7)*49 + c187, Math.abs(cy - 12)*49+c187);
        if(r187 < cmin){
            cmin= r187;
            ans = d187;
        }

        int dist188 = Math.max(Math.abs(cx+8)*49 + c188, Math.abs(cy - 12)*49+c188);
        if(r188 < cmin){
            cmin= r188;
            ans = d188;
        }

        int dist189 = Math.max(Math.abs(cx+9)*49 + c189, Math.abs(cy - 12)*49+c189);
        if(r189 < cmin){
            cmin= r189;
            ans = d189;
        }

        int dist190 = Math.max(Math.abs(cx+10)*49 + c190, Math.abs(cy - 12)*49+c190);
        if(r190 < cmin){
            cmin= r190;
            ans = d190;
        }

        if(cmin<=nomove) return ans;

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

        int dist101 = Math.max(Math.abs(cx+11)*49 + c101, Math.abs(cy - 6)*49+c101);
        if(r101 < cmin){
            cmin= r101;
            ans = d101;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*49+c116);
        if(r116 < cmin){
            cmin= r116;
            ans = d116;
        }

        int dist131 = Math.max(Math.abs(cx+11)*49 + c131, Math.abs(cy - 8)*49+c131);
        if(r131 < cmin){
            cmin= r131;
            ans = d131;
        }

        int dist145 = Math.max(Math.abs(cx+10)*49 + c145, Math.abs(cy - 9)*49+c145);
        if(r145 < cmin){
            cmin= r145;
            ans = d145;
        }

        int dist146 = Math.max(Math.abs(cx+11)*49 + c146, Math.abs(cy - 9)*49+c146);
        if(r146 < cmin){
            cmin= r146;
            ans = d146;
        }

        int dist159 = Math.max(Math.abs(cx+9)*49 + c159, Math.abs(cy - 10)*49+c159);
        if(r159 < cmin){
            cmin= r159;
            ans = d159;
        }

        int dist160 = Math.max(Math.abs(cx+10)*49 + c160, Math.abs(cy - 10)*49+c160);
        if(r160 < cmin){
            cmin= r160;
            ans = d160;
        }

        int dist172 = Math.max(Math.abs(cx+7)*49 + c172, Math.abs(cy - 11)*49+c172);
        if(r172 < cmin){
            cmin= r172;
            ans = d172;
        }

        int dist173 = Math.max(Math.abs(cx+8)*49 + c173, Math.abs(cy - 11)*49+c173);
        if(r173 < cmin){
            cmin= r173;
            ans = d173;
        }

        int dist174 = Math.max(Math.abs(cx+9)*49 + c174, Math.abs(cy - 11)*49+c174);
        if(r174 < cmin){
            cmin= r174;
            ans = d174;
        }

        if(cmin<=nomove) return ans;

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

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*49+c115);
        if(r115 < cmin){
            cmin= r115;
            ans = d115;
        }

        int dist129 = Math.max(Math.abs(cx+9)*49 + c129, Math.abs(cy - 8)*49+c129);
        if(r129 < cmin){
            cmin= r129;
            ans = d129;
        }

        int dist130 = Math.max(Math.abs(cx+10)*49 + c130, Math.abs(cy - 8)*49+c130);
        if(r130 < cmin){
            cmin= r130;
            ans = d130;
        }

        int dist143 = Math.max(Math.abs(cx+8)*49 + c143, Math.abs(cy - 9)*49+c143);
        if(r143 < cmin){
            cmin= r143;
            ans = d143;
        }

        int dist144 = Math.max(Math.abs(cx+9)*49 + c144, Math.abs(cy - 9)*49+c144);
        if(r144 < cmin){
            cmin= r144;
            ans = d144;
        }

        int dist157 = Math.max(Math.abs(cx+7)*49 + c157, Math.abs(cy - 10)*49+c157);
        if(r157 < cmin){
            cmin= r157;
            ans = d157;
        }

        int dist158 = Math.max(Math.abs(cx+8)*49 + c158, Math.abs(cy - 10)*49+c158);
        if(r158 < cmin){
            cmin= r158;
            ans = d158;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*49+c82);
        if(r82 < cmin){
            cmin= r82;
            ans = d82;
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

        int dist127 = Math.max(Math.abs(cx+7)*49 + c127, Math.abs(cy - 8)*49+c127);
        if(r127 < cmin){
            cmin= r127;
            ans = d127;
        }

        int dist128 = Math.max(Math.abs(cx+8)*49 + c128, Math.abs(cy - 8)*49+c128);
        if(r128 < cmin){
            cmin= r128;
            ans = d128;
        }

        int dist142 = Math.max(Math.abs(cx+7)*49 + c142, Math.abs(cy - 9)*49+c142);
        if(r142 < cmin){
            cmin= r142;
            ans = d142;
        }
        return ans;
    }
}
