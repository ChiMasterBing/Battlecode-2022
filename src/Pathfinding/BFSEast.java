package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class BFSEast {
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

        l113 = l112.add(Direction.EAST);
        c113 = 10000000;
        d113 = null;

        l128 = l112.add(Direction.SOUTHEAST);
        c128 = 10000000;
        d128 = null;

        l98 = l112.add(Direction.NORTHEAST);
        c98 = 10000000;
        d98 = null;

        l82 = l97.add(Direction.NORTH);
        c82 = 10000000;
        d82 = null;

        l83 = l97.add(Direction.NORTHEAST);
        c83 = 10000000;
        d83 = null;

        l142 = l127.add(Direction.SOUTH);
        c142 = 10000000;
        d142 = null;

        l143 = l127.add(Direction.SOUTHEAST);
        c143 = 10000000;
        d143 = null;

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

        l67 = l82.add(Direction.NORTH);
        c67 = 10000000;
        d67 = null;

        l68 = l82.add(Direction.NORTHEAST);
        c68 = 10000000;
        d68 = null;

        l69 = l83.add(Direction.NORTHEAST);
        c69 = 10000000;
        d69 = null;

        l157 = l142.add(Direction.SOUTH);
        c157 = 10000000;
        d157 = null;

        l158 = l142.add(Direction.SOUTHEAST);
        c158 = 10000000;
        d158 = null;

        l159 = l143.add(Direction.SOUTHEAST);
        c159 = 10000000;
        d159 = null;

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

        l52 = l67.add(Direction.NORTH);
        c52 = 10000000;
        d52 = null;

        l53 = l67.add(Direction.NORTHEAST);
        c53 = 10000000;
        d53 = null;

        l54 = l68.add(Direction.NORTHEAST);
        c54 = 10000000;
        d54 = null;

        l172 = l157.add(Direction.SOUTH);
        c172 = 10000000;
        d172 = null;

        l173 = l157.add(Direction.SOUTHEAST);
        c173 = 10000000;
        d173 = null;

        l174 = l158.add(Direction.SOUTHEAST);
        c174 = 10000000;
        d174 = null;

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

        if(rc.onTheMap(l127)){
            if(!rc.isLocationOccupied(l127)){
                r127 = 10 + rc.senseRubble(l127);
                if(c127 > c112 + r127 && prev != Direction.SOUTH){
                    d127 = Direction.SOUTH;
                    c127 = c112 + r127;
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

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;

        int dist52 = Math.max(Math.abs(cx+7)*49 + c52, Math.abs(cy - 3)*50+c52);
        if(dist52 <= cmin){
            cmin= dist52;
            ans = d52;
        }

        int dist53 = Math.max(Math.abs(cx+8)*49 + c53, Math.abs(cy - 3)*50+c53);
        if(dist53 <= cmin){
            cmin= dist53;
            ans = d53;
        }

        int dist54 = Math.max(Math.abs(cx+9)*49 + c54, Math.abs(cy - 3)*50+c54);
        if(dist54 <= cmin){
            cmin= dist54;
            ans = d54;
        }

        int dist69 = Math.max(Math.abs(cx+9)*49 + c69, Math.abs(cy - 4)*50+c69);
        if(dist69 <= cmin){
            cmin= dist69;
            ans = d69;
        }

        int dist70 = Math.max(Math.abs(cx+10)*49 + c70, Math.abs(cy - 4)*50+c70);
        if(dist70 <= cmin){
            cmin= dist70;
            ans = d70;
        }

        int dist85 = Math.max(Math.abs(cx+10)*49 + c85, Math.abs(cy - 5)*50+c85);
        if(dist85 <= cmin){
            cmin= dist85;
            ans = d85;
        }

        int dist86 = Math.max(Math.abs(cx+11)*49 + c86, Math.abs(cy - 5)*50+c86);
        if(dist86 <= cmin){
            cmin= dist86;
            ans = d86;
        }

        int dist101 = Math.max(Math.abs(cx+11)*49 + c101, Math.abs(cy - 6)*50+c101);
        if(dist101 <= cmin){
            cmin= dist101;
            ans = d101;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*50+c116);
        if(dist116 <= cmin){
            cmin= dist116;
            ans = d116;
        }

        int dist131 = Math.max(Math.abs(cx+11)*49 + c131, Math.abs(cy - 8)*50+c131);
        if(dist131 <= cmin){
            cmin= dist131;
            ans = d131;
        }

        int dist145 = Math.max(Math.abs(cx+10)*49 + c145, Math.abs(cy - 9)*50+c145);
        if(dist145 <= cmin){
            cmin= dist145;
            ans = d145;
        }

        int dist146 = Math.max(Math.abs(cx+11)*49 + c146, Math.abs(cy - 9)*50+c146);
        if(dist146 <= cmin){
            cmin= dist146;
            ans = d146;
        }

        int dist159 = Math.max(Math.abs(cx+9)*49 + c159, Math.abs(cy - 10)*50+c159);
        if(dist159 <= cmin){
            cmin= dist159;
            ans = d159;
        }

        int dist160 = Math.max(Math.abs(cx+10)*49 + c160, Math.abs(cy - 10)*50+c160);
        if(dist160 <= cmin){
            cmin= dist160;
            ans = d160;
        }

        int dist172 = Math.max(Math.abs(cx+7)*49 + c172, Math.abs(cy - 11)*50+c172);
        if(dist172 <= cmin){
            cmin= dist172;
            ans = d172;
        }

        int dist173 = Math.max(Math.abs(cx+8)*49 + c173, Math.abs(cy - 11)*50+c173);
        if(dist173 <= cmin){
            cmin= dist173;
            ans = d173;
        }

        int dist174 = Math.max(Math.abs(cx+9)*49 + c174, Math.abs(cy - 11)*50+c174);
        if(dist174 <= cmin){
            cmin= dist174;
            ans = d174;
        }

        if(cmin<=nomove) return ans;

        int dist67 = Math.max(Math.abs(cx+7)*49 + c67, Math.abs(cy - 4)*50+c67);
        if(dist67 <= cmin){
            cmin= dist67;
            ans = d67;
        }

        int dist68 = Math.max(Math.abs(cx+8)*49 + c68, Math.abs(cy - 4)*50+c68);
        if(dist68 <= cmin){
            cmin= dist68;
            ans = d68;
        }

        int dist83 = Math.max(Math.abs(cx+8)*49 + c83, Math.abs(cy - 5)*50+c83);
        if(dist83 <= cmin){
            cmin= dist83;
            ans = d83;
        }

        int dist84 = Math.max(Math.abs(cx+9)*49 + c84, Math.abs(cy - 5)*50+c84);
        if(dist84 <= cmin){
            cmin= dist84;
            ans = d84;
        }

        int dist99 = Math.max(Math.abs(cx+9)*49 + c99, Math.abs(cy - 6)*50+c99);
        if(dist99 <= cmin){
            cmin= dist99;
            ans = d99;
        }

        int dist100 = Math.max(Math.abs(cx+10)*49 + c100, Math.abs(cy - 6)*50+c100);
        if(dist100 <= cmin){
            cmin= dist100;
            ans = d100;
        }

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*50+c115);
        if(dist115 <= cmin){
            cmin= dist115;
            ans = d115;
        }

        int dist129 = Math.max(Math.abs(cx+9)*49 + c129, Math.abs(cy - 8)*50+c129);
        if(dist129 <= cmin){
            cmin= dist129;
            ans = d129;
        }

        int dist130 = Math.max(Math.abs(cx+10)*49 + c130, Math.abs(cy - 8)*50+c130);
        if(dist130 <= cmin){
            cmin= dist130;
            ans = d130;
        }

        int dist143 = Math.max(Math.abs(cx+8)*49 + c143, Math.abs(cy - 9)*50+c143);
        if(dist143 <= cmin){
            cmin= dist143;
            ans = d143;
        }

        int dist144 = Math.max(Math.abs(cx+9)*49 + c144, Math.abs(cy - 9)*50+c144);
        if(dist144 <= cmin){
            cmin= dist144;
            ans = d144;
        }

        int dist157 = Math.max(Math.abs(cx+7)*49 + c157, Math.abs(cy - 10)*50+c157);
        if(dist157 <= cmin){
            cmin= dist157;
            ans = d157;
        }

        int dist158 = Math.max(Math.abs(cx+8)*49 + c158, Math.abs(cy - 10)*50+c158);
        if(dist158 <= cmin){
            cmin= dist158;
            ans = d158;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*50+c82);
        if(dist82 <= cmin){
            cmin= dist82;
            ans = d82;
        }

        int dist97 = Math.max(Math.abs(cx+7)*49 + c97, Math.abs(cy - 6)*50+c97);
        if(dist97 <= cmin){
            cmin= dist97;
            ans = d97;
        }

        int dist98 = Math.max(Math.abs(cx+8)*49 + c98, Math.abs(cy - 6)*50+c98);
        if(dist98 <= cmin){
            cmin= dist98;
            ans = d98;
        }

        int dist113 = Math.max(Math.abs(cx+8)*49 + c113, Math.abs(cy - 7)*50+c113);
        if(dist113 <= cmin){
            cmin= dist113;
            ans = d113;
        }

        int dist114 = Math.max(Math.abs(cx+9)*49 + c114, Math.abs(cy - 7)*50+c114);
        if(dist114 <= cmin){
            cmin= dist114;
            ans = d114;
        }

        int dist127 = Math.max(Math.abs(cx+7)*49 + c127, Math.abs(cy - 8)*50+c127);
        if(dist127 <= cmin){
            cmin= dist127;
            ans = d127;
        }

        int dist128 = Math.max(Math.abs(cx+8)*49 + c128, Math.abs(cy - 8)*50+c128);
        if(dist128 <= cmin){
            cmin= dist128;
            ans = d128;
        }

        int dist142 = Math.max(Math.abs(cx+7)*49 + c142, Math.abs(cy - 9)*50+c142);
        if(dist142 <= cmin){
            cmin= dist142;
            ans = d142;
        }

        return ans;

    }
}
