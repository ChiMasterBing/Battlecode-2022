package Pathfinding;

import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class SageBFS {
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

    static MapLocation l142;
    static int c142;
    static int r142;
    static Direction d142;

    static MapLocation l143;
    static int c143;
    static int r143;
    static Direction d143;

    static MapLocation l141;
    static int c141;
    static int r141;
    static Direction d141;

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

    static MapLocation l157;
    static int c157;
    static int r157;
    static Direction d157;

    static MapLocation l158;
    static int c158;
    static int r158;
    static Direction d158;

    static MapLocation l156;
    static int c156;
    static int r156;
    static Direction d156;

    static MapLocation l159;
    static int c159;
    static int r159;
    static Direction d159;

    static MapLocation l155;
    static int c155;
    static int r155;
    static Direction d155;

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

    static MapLocation l55;
    static int c55;
    static int r55;
    static Direction d55;

    static MapLocation l49;
    static int c49;
    static int r49;
    static Direction d49;

    static MapLocation l172;
    static int c172;
    static int r172;
    static Direction d172;

    static MapLocation l173;
    static int c173;
    static int r173;
    static Direction d173;

    static MapLocation l171;
    static int c171;
    static int r171;
    static Direction d171;

    static MapLocation l174;
    static int c174;
    static int r174;
    static Direction d174;

    static MapLocation l170;
    static int c170;
    static int r170;
    static Direction d170;

    static MapLocation l175;
    static int c175;
    static int r175;
    static Direction d175;

    static MapLocation l169;
    static int c169;
    static int r169;
    static Direction d169;

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

    static MapLocation l168;
    static int c168;
    static int r168;
    static Direction d168;

    static MapLocation l138;
    static int c138;
    static int r138;
    static Direction d138;

    static MapLocation l153;
    static int c153;
    static int r153;
    static Direction d153;

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

    static MapLocation l48;
    static int c48;
    static int r48;
    static Direction d48;

    static MapLocation l63;
    static int c63;
    static int r63;
    static Direction d63;

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

    static MapLocation l187;
    static int c187;
    static int r187;
    static Direction d187;

    static MapLocation l188;
    static int c188;
    static int r188;
    static Direction d188;

    static MapLocation l186;
    static int c186;
    static int r186;
    static Direction d186;

    static MapLocation l189;
    static int c189;
    static int r189;
    static Direction d189;

    static MapLocation l185;
    static int c185;
    static int r185;
    static Direction d185;

    static MapLocation l190;
    static int c190;
    static int r190;
    static Direction d190;

    static MapLocation l184;
    static int c184;
    static int r184;
    static Direction d184;

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

    static MapLocation l152;
    static int c152;
    static int r152;
    static Direction d152;

    static MapLocation l122;
    static int c122;
    static int r122;
    static Direction d122;

    static MapLocation l137;
    static int c137;
    static int r137;
    static Direction d137;

    static MapLocation l92;
    static int c92;
    static int r92;
    static Direction d92;

    static MapLocation l107;
    static int c107;
    static int r107;
    static Direction d107;

    static MapLocation l62;
    static int c62;
    static int r62;
    static Direction d62;

    static MapLocation l77;
    static int c77;
    static int r77;
    static Direction d77;


    static Direction ans;

    static void init(RobotController rc) throws GameActionException {
        ans = null;
        l112 = rc.getLocation();
        c112 = 0;
        d112 = Direction.CENTER;
        if(rc.onTheMap(l112)){
            r112 = rc.senseRubble(l112);
        }else{
            r112 = 10000000;
        }

        l97 = l112.add(Direction.NORTH);
        c97 = 10000000;
        d97 = Direction.NORTH;
        if(rc.onTheMap(l97)&&!rc.isLocationOccupied(l97)){
            r97 = rc.senseRubble(l97);
        }else{
            r97 = 10000000;
        }

        l127 = l112.add(Direction.SOUTH);
        c127 = 10000000;
        d127 = Direction.SOUTH;
        if(rc.onTheMap(l127)&&!rc.isLocationOccupied(l127)){
            r127 = rc.senseRubble(l127);
        }else{
            r127 = 10000000;
        }

        l113 = l112.add(Direction.EAST);
        c113 = 10000000;
        d113 = Direction.EAST;
        if(rc.onTheMap(l113)&&!rc.isLocationOccupied(l113)){
            r113 = rc.senseRubble(l113);
        }else{
            r113 = 10000000;
        }

        l128 = l112.add(Direction.SOUTHEAST);
        c128 = 10000000;
        d128 = Direction.SOUTHEAST;
        if(rc.onTheMap(l128)&&!rc.isLocationOccupied(l128)){
            r128 = rc.senseRubble(l128);
        }else{
            r128 = 10000000;
        }

        l98 = l112.add(Direction.NORTHEAST);
        c98 = 10000000;
        d98 = Direction.NORTHEAST;
        if(rc.onTheMap(l98)&&!rc.isLocationOccupied(l98)){
            r98 = rc.senseRubble(l98);
        }else{
            r98 = 10000000;
        }

        l126 = l112.add(Direction.SOUTHWEST);
        c126 = 10000000;
        d126 = Direction.SOUTHWEST;
        if(rc.onTheMap(l126)&&!rc.isLocationOccupied(l126)){
            r126 = rc.senseRubble(l126);
        }else{
            r126 = 10000000;
        }

        l96 = l112.add(Direction.NORTHWEST);
        c96 = 10000000;
        d96 = Direction.NORTHWEST;
        if(rc.onTheMap(l96)&&!rc.isLocationOccupied(l96)){
            r96 = rc.senseRubble(l96);
        }else{
            r96 = 10000000;
        }

        l111 = l112.add(Direction.WEST);
        c111 = 10000000;
        d111 = Direction.WEST;
        if(rc.onTheMap(l111)&&!rc.isLocationOccupied(l111)){
            r111 = rc.senseRubble(l111);
        }else{
            r111 = 10000000;
        }

        l82 = l97.add(Direction.NORTH);
        c82 = 10000000;
        d82 = null;
        if(rc.onTheMap(l82)&&!rc.isLocationOccupied(l82)){
            r82 = rc.senseRubble(l82);
        }else{
            r82 = 10000000;
        }

        l83 = l97.add(Direction.NORTHEAST);
        c83 = 10000000;
        d83 = null;
        if(rc.onTheMap(l83)&&!rc.isLocationOccupied(l83)){
            r83 = rc.senseRubble(l83);
        }else{
            r83 = 10000000;
        }

        l81 = l97.add(Direction.NORTHWEST);
        c81 = 10000000;
        d81 = null;
        if(rc.onTheMap(l81)&&!rc.isLocationOccupied(l81)){
            r81 = rc.senseRubble(l81);
        }else{
            r81 = 10000000;
        }

        l142 = l127.add(Direction.SOUTH);
        c142 = 10000000;
        d142 = null;
        if(rc.onTheMap(l142)&&!rc.isLocationOccupied(l142)){
            r142 = rc.senseRubble(l142);
        }else{
            r142 = 10000000;
        }

        l143 = l127.add(Direction.SOUTHEAST);
        c143 = 10000000;
        d143 = null;
        if(rc.onTheMap(l143)&&!rc.isLocationOccupied(l143)){
            r143 = rc.senseRubble(l143);
        }else{
            r143 = 10000000;
        }

        l141 = l127.add(Direction.SOUTHWEST);
        c141 = 10000000;
        d141 = null;
        if(rc.onTheMap(l141)&&!rc.isLocationOccupied(l141)){
            r141 = rc.senseRubble(l141);
        }else{
            r141 = 10000000;
        }

        l114 = l113.add(Direction.EAST);
        c114 = 10000000;
        d114 = null;
        if(rc.onTheMap(l114)&&!rc.isLocationOccupied(l114)){
            r114 = rc.senseRubble(l114);
        }else{
            r114 = 10000000;
        }

        l129 = l113.add(Direction.SOUTHEAST);
        c129 = 10000000;
        d129 = null;
        if(rc.onTheMap(l129)&&!rc.isLocationOccupied(l129)){
            r129 = rc.senseRubble(l129);
        }else{
            r129 = 10000000;
        }

        l99 = l113.add(Direction.NORTHEAST);
        c99 = 10000000;
        d99 = null;
        if(rc.onTheMap(l99)&&!rc.isLocationOccupied(l99)){
            r99 = rc.senseRubble(l99);
        }else{
            r99 = 10000000;
        }

        l144 = l128.add(Direction.SOUTHEAST);
        c144 = 10000000;
        d144 = null;
        if(rc.onTheMap(l144)&&!rc.isLocationOccupied(l144)){
            r144 = rc.senseRubble(l144);
        }else{
            r144 = 10000000;
        }

        l84 = l98.add(Direction.NORTHEAST);
        c84 = 10000000;
        d84 = null;
        if(rc.onTheMap(l84)&&!rc.isLocationOccupied(l84)){
            r84 = rc.senseRubble(l84);
        }else{
            r84 = 10000000;
        }

        l140 = l126.add(Direction.SOUTHWEST);
        c140 = 10000000;
        d140 = null;
        if(rc.onTheMap(l140)&&!rc.isLocationOccupied(l140)){
            r140 = rc.senseRubble(l140);
        }else{
            r140 = 10000000;
        }

        l110 = l126.add(Direction.NORTHWEST);
        c110 = 10000000;
        d110 = null;
        if(rc.onTheMap(l110)&&!rc.isLocationOccupied(l110)){
            r110 = rc.senseRubble(l110);
        }else{
            r110 = 10000000;
        }

        l125 = l126.add(Direction.WEST);
        c125 = 10000000;
        d125 = null;
        if(rc.onTheMap(l125)&&!rc.isLocationOccupied(l125)){
            r125 = rc.senseRubble(l125);
        }else{
            r125 = 10000000;
        }

        l80 = l96.add(Direction.NORTHWEST);
        c80 = 10000000;
        d80 = null;
        if(rc.onTheMap(l80)&&!rc.isLocationOccupied(l80)){
            r80 = rc.senseRubble(l80);
        }else{
            r80 = 10000000;
        }

        l95 = l96.add(Direction.WEST);
        c95 = 10000000;
        d95 = null;
        if(rc.onTheMap(l95)&&!rc.isLocationOccupied(l95)){
            r95 = rc.senseRubble(l95);
        }else{
            r95 = 10000000;
        }

        l67 = l82.add(Direction.NORTH);
        c67 = 10000000;
        d67 = null;
        if(rc.onTheMap(l67)&&!rc.isLocationOccupied(l67)){
            r67 = rc.senseRubble(l67);
        }else{
            r67 = 10000000;
        }

        l68 = l82.add(Direction.NORTHEAST);
        c68 = 10000000;
        d68 = null;
        if(rc.onTheMap(l68)&&!rc.isLocationOccupied(l68)){
            r68 = rc.senseRubble(l68);
        }else{
            r68 = 10000000;
        }

        l66 = l82.add(Direction.NORTHWEST);
        c66 = 10000000;
        d66 = null;
        if(rc.onTheMap(l66)&&!rc.isLocationOccupied(l66)){
            r66 = rc.senseRubble(l66);
        }else{
            r66 = 10000000;
        }

        l69 = l83.add(Direction.NORTHEAST);
        c69 = 10000000;
        d69 = null;
        if(rc.onTheMap(l69)&&!rc.isLocationOccupied(l69)){
            r69 = rc.senseRubble(l69);
        }else{
            r69 = 10000000;
        }

        l65 = l81.add(Direction.NORTHWEST);
        c65 = 10000000;
        d65 = null;
        if(rc.onTheMap(l65)&&!rc.isLocationOccupied(l65)){
            r65 = rc.senseRubble(l65);
        }else{
            r65 = 10000000;
        }

        l157 = l142.add(Direction.SOUTH);
        c157 = 10000000;
        d157 = null;
        if(rc.onTheMap(l157)&&!rc.isLocationOccupied(l157)){
            r157 = rc.senseRubble(l157);
        }else{
            r157 = 10000000;
        }

        l158 = l142.add(Direction.SOUTHEAST);
        c158 = 10000000;
        d158 = null;
        if(rc.onTheMap(l158)&&!rc.isLocationOccupied(l158)){
            r158 = rc.senseRubble(l158);
        }else{
            r158 = 10000000;
        }

        l156 = l142.add(Direction.SOUTHWEST);
        c156 = 10000000;
        d156 = null;
        if(rc.onTheMap(l156)&&!rc.isLocationOccupied(l156)){
            r156 = rc.senseRubble(l156);
        }else{
            r156 = 10000000;
        }

        l159 = l143.add(Direction.SOUTHEAST);
        c159 = 10000000;
        d159 = null;
        if(rc.onTheMap(l159)&&!rc.isLocationOccupied(l159)){
            r159 = rc.senseRubble(l159);
        }else{
            r159 = 10000000;
        }

        l155 = l141.add(Direction.SOUTHWEST);
        c155 = 10000000;
        d155 = null;
        if(rc.onTheMap(l155)&&!rc.isLocationOccupied(l155)){
            r155 = rc.senseRubble(l155);
        }else{
            r155 = 10000000;
        }

        l115 = l114.add(Direction.EAST);
        c115 = 10000000;
        d115 = null;
        if(rc.onTheMap(l115)&&!rc.isLocationOccupied(l115)){
            r115 = rc.senseRubble(l115);
        }else{
            r115 = 10000000;
        }

        l130 = l114.add(Direction.SOUTHEAST);
        c130 = 10000000;
        d130 = null;
        if(rc.onTheMap(l130)&&!rc.isLocationOccupied(l130)){
            r130 = rc.senseRubble(l130);
        }else{
            r130 = 10000000;
        }

        l100 = l114.add(Direction.NORTHEAST);
        c100 = 10000000;
        d100 = null;
        if(rc.onTheMap(l100)&&!rc.isLocationOccupied(l100)){
            r100 = rc.senseRubble(l100);
        }else{
            r100 = 10000000;
        }

        l145 = l129.add(Direction.SOUTHEAST);
        c145 = 10000000;
        d145 = null;
        if(rc.onTheMap(l145)&&!rc.isLocationOccupied(l145)){
            r145 = rc.senseRubble(l145);
        }else{
            r145 = 10000000;
        }

        l85 = l99.add(Direction.NORTHEAST);
        c85 = 10000000;
        d85 = null;
        if(rc.onTheMap(l85)&&!rc.isLocationOccupied(l85)){
            r85 = rc.senseRubble(l85);
        }else{
            r85 = 10000000;
        }

        l160 = l144.add(Direction.SOUTHEAST);
        c160 = 10000000;
        d160 = null;
        if(rc.onTheMap(l160)&&!rc.isLocationOccupied(l160)){
            r160 = rc.senseRubble(l160);
        }else{
            r160 = 10000000;
        }

        l70 = l84.add(Direction.NORTHEAST);
        c70 = 10000000;
        d70 = null;
        if(rc.onTheMap(l70)&&!rc.isLocationOccupied(l70)){
            r70 = rc.senseRubble(l70);
        }else{
            r70 = 10000000;
        }

        l154 = l140.add(Direction.SOUTHWEST);
        c154 = 10000000;
        d154 = null;
        if(rc.onTheMap(l154)&&!rc.isLocationOccupied(l154)){
            r154 = rc.senseRubble(l154);
        }else{
            r154 = 10000000;
        }

        l124 = l140.add(Direction.NORTHWEST);
        c124 = 10000000;
        d124 = null;
        if(rc.onTheMap(l124)&&!rc.isLocationOccupied(l124)){
            r124 = rc.senseRubble(l124);
        }else{
            r124 = 10000000;
        }

        l139 = l140.add(Direction.WEST);
        c139 = 10000000;
        d139 = null;
        if(rc.onTheMap(l139)&&!rc.isLocationOccupied(l139)){
            r139 = rc.senseRubble(l139);
        }else{
            r139 = 10000000;
        }

        l94 = l110.add(Direction.NORTHWEST);
        c94 = 10000000;
        d94 = null;
        if(rc.onTheMap(l94)&&!rc.isLocationOccupied(l94)){
            r94 = rc.senseRubble(l94);
        }else{
            r94 = 10000000;
        }

        l109 = l110.add(Direction.WEST);
        c109 = 10000000;
        d109 = null;
        if(rc.onTheMap(l109)&&!rc.isLocationOccupied(l109)){
            r109 = rc.senseRubble(l109);
        }else{
            r109 = 10000000;
        }

        l64 = l80.add(Direction.NORTHWEST);
        c64 = 10000000;
        d64 = null;
        if(rc.onTheMap(l64)&&!rc.isLocationOccupied(l64)){
            r64 = rc.senseRubble(l64);
        }else{
            r64 = 10000000;
        }

        l79 = l80.add(Direction.WEST);
        c79 = 10000000;
        d79 = null;
        if(rc.onTheMap(l79)&&!rc.isLocationOccupied(l79)){
            r79 = rc.senseRubble(l79);
        }else{
            r79 = 10000000;
        }

        l52 = l67.add(Direction.NORTH);
        c52 = 10000000;
        d52 = null;
        if(rc.onTheMap(l52)&&!rc.isLocationOccupied(l52)){
            r52 = rc.senseRubble(l52);
        }else{
            r52 = 10000000;
        }

        l53 = l67.add(Direction.NORTHEAST);
        c53 = 10000000;
        d53 = null;
        if(rc.onTheMap(l53)&&!rc.isLocationOccupied(l53)){
            r53 = rc.senseRubble(l53);
        }else{
            r53 = 10000000;
        }

        l51 = l67.add(Direction.NORTHWEST);
        c51 = 10000000;
        d51 = null;
        if(rc.onTheMap(l51)&&!rc.isLocationOccupied(l51)){
            r51 = rc.senseRubble(l51);
        }else{
            r51 = 10000000;
        }

        l54 = l68.add(Direction.NORTHEAST);
        c54 = 10000000;
        d54 = null;
        if(rc.onTheMap(l54)&&!rc.isLocationOccupied(l54)){
            r54 = rc.senseRubble(l54);
        }else{
            r54 = 10000000;
        }

        l50 = l66.add(Direction.NORTHWEST);
        c50 = 10000000;
        d50 = null;
        if(rc.onTheMap(l50)&&!rc.isLocationOccupied(l50)){
            r50 = rc.senseRubble(l50);
        }else{
            r50 = 10000000;
        }

        l55 = l69.add(Direction.NORTHEAST);
        c55 = 10000000;
        d55 = null;
        if(rc.onTheMap(l55)&&!rc.isLocationOccupied(l55)){
            r55 = rc.senseRubble(l55);
        }else{
            r55 = 10000000;
        }

        l49 = l65.add(Direction.NORTHWEST);
        c49 = 10000000;
        d49 = null;
        if(rc.onTheMap(l49)&&!rc.isLocationOccupied(l49)){
            r49 = rc.senseRubble(l49);
        }else{
            r49 = 10000000;
        }

        l172 = l157.add(Direction.SOUTH);
        c172 = 10000000;
        d172 = null;
        if(rc.onTheMap(l172)&&!rc.isLocationOccupied(l172)){
            r172 = rc.senseRubble(l172);
        }else{
            r172 = 10000000;
        }

        l173 = l157.add(Direction.SOUTHEAST);
        c173 = 10000000;
        d173 = null;
        if(rc.onTheMap(l173)&&!rc.isLocationOccupied(l173)){
            r173 = rc.senseRubble(l173);
        }else{
            r173 = 10000000;
        }

        l171 = l157.add(Direction.SOUTHWEST);
        c171 = 10000000;
        d171 = null;
        if(rc.onTheMap(l171)&&!rc.isLocationOccupied(l171)){
            r171 = rc.senseRubble(l171);
        }else{
            r171 = 10000000;
        }

        l174 = l158.add(Direction.SOUTHEAST);
        c174 = 10000000;
        d174 = null;
        if(rc.onTheMap(l174)&&!rc.isLocationOccupied(l174)){
            r174 = rc.senseRubble(l174);
        }else{
            r174 = 10000000;
        }

        l170 = l156.add(Direction.SOUTHWEST);
        c170 = 10000000;
        d170 = null;
        if(rc.onTheMap(l170)&&!rc.isLocationOccupied(l170)){
            r170 = rc.senseRubble(l170);
        }else{
            r170 = 10000000;
        }

        l175 = l159.add(Direction.SOUTHEAST);
        c175 = 10000000;
        d175 = null;
        if(rc.onTheMap(l175)&&!rc.isLocationOccupied(l175)){
            r175 = rc.senseRubble(l175);
        }else{
            r175 = 10000000;
        }

        l169 = l155.add(Direction.SOUTHWEST);
        c169 = 10000000;
        d169 = null;
        if(rc.onTheMap(l169)&&!rc.isLocationOccupied(l169)){
            r169 = rc.senseRubble(l169);
        }else{
            r169 = 10000000;
        }

        l116 = l115.add(Direction.EAST);
        c116 = 10000000;
        d116 = null;
        if(rc.onTheMap(l116)&&!rc.isLocationOccupied(l116)){
            r116 = rc.senseRubble(l116);
        }else{
            r116 = 10000000;
        }

        l131 = l115.add(Direction.SOUTHEAST);
        c131 = 10000000;
        d131 = null;
        if(rc.onTheMap(l131)&&!rc.isLocationOccupied(l131)){
            r131 = rc.senseRubble(l131);
        }else{
            r131 = 10000000;
        }

        l101 = l115.add(Direction.NORTHEAST);
        c101 = 10000000;
        d101 = null;
        if(rc.onTheMap(l101)&&!rc.isLocationOccupied(l101)){
            r101 = rc.senseRubble(l101);
        }else{
            r101 = 10000000;
        }

        l146 = l130.add(Direction.SOUTHEAST);
        c146 = 10000000;
        d146 = null;
        if(rc.onTheMap(l146)&&!rc.isLocationOccupied(l146)){
            r146 = rc.senseRubble(l146);
        }else{
            r146 = 10000000;
        }

        l86 = l100.add(Direction.NORTHEAST);
        c86 = 10000000;
        d86 = null;
        if(rc.onTheMap(l86)&&!rc.isLocationOccupied(l86)){
            r86 = rc.senseRubble(l86);
        }else{
            r86 = 10000000;
        }

        l161 = l145.add(Direction.SOUTHEAST);
        c161 = 10000000;
        d161 = null;
        if(rc.onTheMap(l161)&&!rc.isLocationOccupied(l161)){
            r161 = rc.senseRubble(l161);
        }else{
            r161 = 10000000;
        }

        l71 = l85.add(Direction.NORTHEAST);
        c71 = 10000000;
        d71 = null;
        if(rc.onTheMap(l71)&&!rc.isLocationOccupied(l71)){
            r71 = rc.senseRubble(l71);
        }else{
            r71 = 10000000;
        }

        l176 = l160.add(Direction.SOUTHEAST);
        c176 = 10000000;
        d176 = null;
        if(rc.onTheMap(l176)&&!rc.isLocationOccupied(l176)){
            r176 = rc.senseRubble(l176);
        }else{
            r176 = 10000000;
        }

        l56 = l70.add(Direction.NORTHEAST);
        c56 = 10000000;
        d56 = null;
        if(rc.onTheMap(l56)&&!rc.isLocationOccupied(l56)){
            r56 = rc.senseRubble(l56);
        }else{
            r56 = 10000000;
        }

        l168 = l154.add(Direction.SOUTHWEST);
        c168 = 10000000;
        d168 = null;
        if(rc.onTheMap(l168)&&!rc.isLocationOccupied(l168)){
            r168 = rc.senseRubble(l168);
        }else{
            r168 = 10000000;
        }

        l138 = l154.add(Direction.NORTHWEST);
        c138 = 10000000;
        d138 = null;
        if(rc.onTheMap(l138)&&!rc.isLocationOccupied(l138)){
            r138 = rc.senseRubble(l138);
        }else{
            r138 = 10000000;
        }

        l153 = l154.add(Direction.WEST);
        c153 = 10000000;
        d153 = null;
        if(rc.onTheMap(l153)&&!rc.isLocationOccupied(l153)){
            r153 = rc.senseRubble(l153);
        }else{
            r153 = 10000000;
        }

        l108 = l124.add(Direction.NORTHWEST);
        c108 = 10000000;
        d108 = null;
        if(rc.onTheMap(l108)&&!rc.isLocationOccupied(l108)){
            r108 = rc.senseRubble(l108);
        }else{
            r108 = 10000000;
        }

        l123 = l124.add(Direction.WEST);
        c123 = 10000000;
        d123 = null;
        if(rc.onTheMap(l123)&&!rc.isLocationOccupied(l123)){
            r123 = rc.senseRubble(l123);
        }else{
            r123 = 10000000;
        }

        l78 = l94.add(Direction.NORTHWEST);
        c78 = 10000000;
        d78 = null;
        if(rc.onTheMap(l78)&&!rc.isLocationOccupied(l78)){
            r78 = rc.senseRubble(l78);
        }else{
            r78 = 10000000;
        }

        l93 = l94.add(Direction.WEST);
        c93 = 10000000;
        d93 = null;
        if(rc.onTheMap(l93)&&!rc.isLocationOccupied(l93)){
            r93 = rc.senseRubble(l93);
        }else{
            r93 = 10000000;
        }

        l48 = l64.add(Direction.NORTHWEST);
        c48 = 10000000;
        d48 = null;
        if(rc.onTheMap(l48)&&!rc.isLocationOccupied(l48)){
            r48 = rc.senseRubble(l48);
        }else{
            r48 = 10000000;
        }

        l63 = l64.add(Direction.WEST);
        c63 = 10000000;
        d63 = null;
        if(rc.onTheMap(l63)&&!rc.isLocationOccupied(l63)){
            r63 = rc.senseRubble(l63);
        }else{
            r63 = 10000000;
        }

        l37 = l52.add(Direction.NORTH);
        c37 = 10000000;
        d37 = null;
        if(rc.onTheMap(l37)&&!rc.isLocationOccupied(l37)){
            r37 = rc.senseRubble(l37);
        }else{
            r37 = 10000000;
        }

        l38 = l52.add(Direction.NORTHEAST);
        c38 = 10000000;
        d38 = null;
        if(rc.onTheMap(l38)&&!rc.isLocationOccupied(l38)){
            r38 = rc.senseRubble(l38);
        }else{
            r38 = 10000000;
        }

        l36 = l52.add(Direction.NORTHWEST);
        c36 = 10000000;
        d36 = null;
        if(rc.onTheMap(l36)&&!rc.isLocationOccupied(l36)){
            r36 = rc.senseRubble(l36);
        }else{
            r36 = 10000000;
        }

        l39 = l53.add(Direction.NORTHEAST);
        c39 = 10000000;
        d39 = null;
        if(rc.onTheMap(l39)&&!rc.isLocationOccupied(l39)){
            r39 = rc.senseRubble(l39);
        }else{
            r39 = 10000000;
        }

        l35 = l51.add(Direction.NORTHWEST);
        c35 = 10000000;
        d35 = null;
        if(rc.onTheMap(l35)&&!rc.isLocationOccupied(l35)){
            r35 = rc.senseRubble(l35);
        }else{
            r35 = 10000000;
        }

        l40 = l54.add(Direction.NORTHEAST);
        c40 = 10000000;
        d40 = null;
        if(rc.onTheMap(l40)&&!rc.isLocationOccupied(l40)){
            r40 = rc.senseRubble(l40);
        }else{
            r40 = 10000000;
        }

        l34 = l50.add(Direction.NORTHWEST);
        c34 = 10000000;
        d34 = null;
        if(rc.onTheMap(l34)&&!rc.isLocationOccupied(l34)){
            r34 = rc.senseRubble(l34);
        }else{
            r34 = 10000000;
        }

        l187 = l172.add(Direction.SOUTH);
        c187 = 10000000;
        d187 = null;
        if(rc.onTheMap(l187)&&!rc.isLocationOccupied(l187)){
            r187 = rc.senseRubble(l187);
        }else{
            r187 = 10000000;
        }

        l188 = l172.add(Direction.SOUTHEAST);
        c188 = 10000000;
        d188 = null;
        if(rc.onTheMap(l188)&&!rc.isLocationOccupied(l188)){
            r188 = rc.senseRubble(l188);
        }else{
            r188 = 10000000;
        }

        l186 = l172.add(Direction.SOUTHWEST);
        c186 = 10000000;
        d186 = null;
        if(rc.onTheMap(l186)&&!rc.isLocationOccupied(l186)){
            r186 = rc.senseRubble(l186);
        }else{
            r186 = 10000000;
        }

        l189 = l173.add(Direction.SOUTHEAST);
        c189 = 10000000;
        d189 = null;
        if(rc.onTheMap(l189)&&!rc.isLocationOccupied(l189)){
            r189 = rc.senseRubble(l189);
        }else{
            r189 = 10000000;
        }

        l185 = l171.add(Direction.SOUTHWEST);
        c185 = 10000000;
        d185 = null;
        if(rc.onTheMap(l185)&&!rc.isLocationOccupied(l185)){
            r185 = rc.senseRubble(l185);
        }else{
            r185 = 10000000;
        }

        l190 = l174.add(Direction.SOUTHEAST);
        c190 = 10000000;
        d190 = null;
        if(rc.onTheMap(l190)&&!rc.isLocationOccupied(l190)){
            r190 = rc.senseRubble(l190);
        }else{
            r190 = 10000000;
        }

        l184 = l170.add(Direction.SOUTHWEST);
        c184 = 10000000;
        d184 = null;
        if(rc.onTheMap(l184)&&!rc.isLocationOccupied(l184)){
            r184 = rc.senseRubble(l184);
        }else{
            r184 = 10000000;
        }

        l117 = l116.add(Direction.EAST);
        c117 = 10000000;
        d117 = null;
        if(rc.onTheMap(l117)&&!rc.isLocationOccupied(l117)){
            r117 = rc.senseRubble(l117);
        }else{
            r117 = 10000000;
        }

        l132 = l116.add(Direction.SOUTHEAST);
        c132 = 10000000;
        d132 = null;
        if(rc.onTheMap(l132)&&!rc.isLocationOccupied(l132)){
            r132 = rc.senseRubble(l132);
        }else{
            r132 = 10000000;
        }

        l102 = l116.add(Direction.NORTHEAST);
        c102 = 10000000;
        d102 = null;
        if(rc.onTheMap(l102)&&!rc.isLocationOccupied(l102)){
            r102 = rc.senseRubble(l102);
        }else{
            r102 = 10000000;
        }

        l147 = l131.add(Direction.SOUTHEAST);
        c147 = 10000000;
        d147 = null;
        if(rc.onTheMap(l147)&&!rc.isLocationOccupied(l147)){
            r147 = rc.senseRubble(l147);
        }else{
            r147 = 10000000;
        }

        l87 = l101.add(Direction.NORTHEAST);
        c87 = 10000000;
        d87 = null;
        if(rc.onTheMap(l87)&&!rc.isLocationOccupied(l87)){
            r87 = rc.senseRubble(l87);
        }else{
            r87 = 10000000;
        }

        l162 = l146.add(Direction.SOUTHEAST);
        c162 = 10000000;
        d162 = null;
        if(rc.onTheMap(l162)&&!rc.isLocationOccupied(l162)){
            r162 = rc.senseRubble(l162);
        }else{
            r162 = 10000000;
        }

        l72 = l86.add(Direction.NORTHEAST);
        c72 = 10000000;
        d72 = null;
        if(rc.onTheMap(l72)&&!rc.isLocationOccupied(l72)){
            r72 = rc.senseRubble(l72);
        }else{
            r72 = 10000000;
        }

        l152 = l168.add(Direction.NORTHWEST);
        c152 = 10000000;
        d152 = null;
        if(rc.onTheMap(l152)&&!rc.isLocationOccupied(l152)){
            r152 = rc.senseRubble(l152);
        }else{
            r152 = 10000000;
        }

        l122 = l138.add(Direction.NORTHWEST);
        c122 = 10000000;
        d122 = null;
        if(rc.onTheMap(l122)&&!rc.isLocationOccupied(l122)){
            r122 = rc.senseRubble(l122);
        }else{
            r122 = 10000000;
        }

        l137 = l138.add(Direction.WEST);
        c137 = 10000000;
        d137 = null;
        if(rc.onTheMap(l137)&&!rc.isLocationOccupied(l137)){
            r137 = rc.senseRubble(l137);
        }else{
            r137 = 10000000;
        }

        l92 = l108.add(Direction.NORTHWEST);
        c92 = 10000000;
        d92 = null;
        if(rc.onTheMap(l92)&&!rc.isLocationOccupied(l92)){
            r92 = rc.senseRubble(l92);
        }else{
            r92 = 10000000;
        }

        l107 = l108.add(Direction.WEST);
        c107 = 10000000;
        d107 = null;
        if(rc.onTheMap(l107)&&!rc.isLocationOccupied(l107)){
            r107 = rc.senseRubble(l107);
        }else{
            r107 = 10000000;
        }

        l62 = l78.add(Direction.NORTHWEST);
        c62 = 10000000;
        d62 = null;
        if(rc.onTheMap(l62)&&!rc.isLocationOccupied(l62)){
            r62 = rc.senseRubble(l62);
        }else{
            r62 = 10000000;
        }

        l77 = l78.add(Direction.WEST);
        c77 = 10000000;
        d77 = null;
        if(rc.onTheMap(l77)&&!rc.isLocationOccupied(l77)){
            r77 = rc.senseRubble(l77);
        }else{
            r77 = 10000000;
        }


    }
    static MapLocation lowest(int layer){
        int lowest = Integer.MAX_VALUE;
        MapLocation ret = null;

        if(r112 < lowest&&layer>0){
            lowest = r112;
            ret = l112;
        }
        if(r127 < lowest&&layer>1){
            lowest = r127;
            ret = l127;
        }
        if(r128 < lowest&&layer>1){
            lowest = r128;
            ret = l128;
        }
        if(r126 < lowest&&layer>1){
            lowest = r126;
            ret = l126;
        }
        if(r96 < lowest&&layer>1){
            lowest = r96;
            ret = l96;
        }
        if(r111 < lowest&&layer>1){
            lowest = r111;
            ret = l111;
        }
        if(r142 < lowest&&layer>2){
            lowest = r142;
            ret = l142;
        }
        if(r143 < lowest&&layer>2){
            lowest = r143;
            ret = l143;
        }
        if(r141 < lowest&&layer>2){
            lowest = r141;
            ret = l141;
        }
        if(r144 < lowest&&layer>2){
            lowest = r144;
            ret = l144;
        }
        if(r140 < lowest&&layer>2){
            lowest = r140;
            ret = l140;
        }
        if(r110 < lowest&&layer>2){
            lowest = r110;
            ret = l110;
        }
        if(r125 < lowest&&layer>2){
            lowest = r125;
            ret = l125;
        }
        if(r80 < lowest&&layer>2){
            lowest = r80;
            ret = l80;
        }
        if(r95 < lowest&&layer>2){
            lowest = r95;
            ret = l95;
        }
        if(r157 < lowest&&layer>3){
            lowest = r157;
            ret = l157;
        }
        if(r158 < lowest&&layer>3){
            lowest = r158;
            ret = l158;
        }
        if(r156 < lowest&&layer>3){
            lowest = r156;
            ret = l156;
        }
        if(r159 < lowest&&layer>3){
            lowest = r159;
            ret = l159;
        }
        if(r155 < lowest&&layer>3){
            lowest = r155;
            ret = l155;
        }
        if(r160 < lowest&&layer>3){
            lowest = r160;
            ret = l160;
        }
        if(r154 < lowest&&layer>3){
            lowest = r154;
            ret = l154;
        }
        if(r124 < lowest&&layer>3){
            lowest = r124;
            ret = l124;
        }
        if(r139 < lowest&&layer>3){
            lowest = r139;
            ret = l139;
        }
        if(r94 < lowest&&layer>3){
            lowest = r94;
            ret = l94;
        }
        if(r109 < lowest&&layer>3){
            lowest = r109;
            ret = l109;
        }
        if(r64 < lowest&&layer>3){
            lowest = r64;
            ret = l64;
        }
        if(r79 < lowest&&layer>3){
            lowest = r79;
            ret = l79;
        }
        if(r172 < lowest&&layer>4){
            lowest = r172;
            ret = l172;
        }
        if(r173 < lowest&&layer>4){
            lowest = r173;
            ret = l173;
        }
        if(r171 < lowest&&layer>4){
            lowest = r171;
            ret = l171;
        }
        if(r174 < lowest&&layer>4){
            lowest = r174;
            ret = l174;
        }
        if(r170 < lowest&&layer>4){
            lowest = r170;
            ret = l170;
        }
        if(r175 < lowest&&layer>4){
            lowest = r175;
            ret = l175;
        }
        if(r169 < lowest&&layer>4){
            lowest = r169;
            ret = l169;
        }
        if(r176 < lowest&&layer>4){
            lowest = r176;
            ret = l176;
        }
        if(r168 < lowest&&layer>4){
            lowest = r168;
            ret = l168;
        }
        if(r138 < lowest&&layer>4){
            lowest = r138;
            ret = l138;
        }
        if(r153 < lowest&&layer>4){
            lowest = r153;
            ret = l153;
        }
        if(r108 < lowest&&layer>4){
            lowest = r108;
            ret = l108;
        }
        if(r123 < lowest&&layer>4){
            lowest = r123;
            ret = l123;
        }
        if(r78 < lowest&&layer>4){
            lowest = r78;
            ret = l78;
        }
        if(r93 < lowest&&layer>4){
            lowest = r93;
            ret = l93;
        }
        if(r48 < lowest&&layer>4){
            lowest = r48;
            ret = l48;
        }
        if(r63 < lowest&&layer>4){
            lowest = r63;
            ret = l63;
        }
        if(r187 < lowest&&layer>5){
            lowest = r187;
            ret = l187;
        }
        if(r188 < lowest&&layer>5){
            lowest = r188;
            ret = l188;
        }
        if(r186 < lowest&&layer>5){
            lowest = r186;
            ret = l186;
        }
        if(r189 < lowest&&layer>5){
            lowest = r189;
            ret = l189;
        }
        if(r185 < lowest&&layer>5){
            lowest = r185;
            ret = l185;
        }
        if(r190 < lowest&&layer>5){
            lowest = r190;
            ret = l190;
        }
        if(r184 < lowest&&layer>5){
            lowest = r184;
            ret = l184;
        }
        if(r152 < lowest&&layer>5){
            lowest = r152;
            ret = l152;
        }
        if(r122 < lowest&&layer>5){
            lowest = r122;
            ret = l122;
        }
        if(r137 < lowest&&layer>5){
            lowest = r137;
            ret = l137;
        }
        if(r92 < lowest&&layer>5){
            lowest = r92;
            ret = l92;
        }
        if(r107 < lowest&&layer>5){
            lowest = r107;
            ret = l107;
        }
        if(r62 < lowest&&layer>5){
            lowest = r62;
            ret = l62;
        }
        if(r77 < lowest&&layer>5){
            lowest = r77;
            ret = l77;
        }
        return ret;
    }

    static Direction sdir(MapLocation cur){
        //add the four dirs to cur, if any of teh four is special loc, then return opp
        MapLocation north = cur.add(Direction.NORTH);
        MapLocation south = cur.add(Direction.SOUTH);
        MapLocation east = cur.add(Direction.EAST);
        MapLocation west = cur.add(Direction.WEST);
        MapLocation northeast = cur.add(Direction.NORTHEAST);
        MapLocation northwest = cur.add(Direction.NORTHWEST);
        MapLocation southeast = cur.add(Direction.SOUTHEAST);
        MapLocation southwest = cur.add(Direction.SOUTHWEST);
        if(north.equals(l37))
            return Direction.SOUTH;
        if(south.equals(l37))
            return Direction.NORTH;
        if(east.equals(l37))
            return Direction.WEST;
        if(west.equals(l37))
            return Direction.EAST;
        if(northeast.equals(l37))
            return Direction.SOUTHWEST;
        if(northwest.equals(l37))
            return Direction.SOUTHEAST;
        if(southeast.equals(l37))
            return Direction.NORTHWEST;
        if(southwest.equals(l37))
            return Direction.NORTHEAST;
        if(north.equals(l49))
            return Direction.SOUTH;
        if(south.equals(l49))
            return Direction.NORTH;
        if(east.equals(l49))
            return Direction.WEST;
        if(west.equals(l49))
            return Direction.EAST;
        if(northeast.equals(l49))
            return Direction.SOUTHWEST;
        if(northwest.equals(l49))
            return Direction.SOUTHEAST;
        if(southeast.equals(l49))
            return Direction.NORTHWEST;
        if(southwest.equals(l49))
            return Direction.NORTHEAST;
        if(north.equals(l55))
            return Direction.SOUTH;
        if(south.equals(l55))
            return Direction.NORTH;
        if(east.equals(l55))
            return Direction.WEST;
        if(west.equals(l55))
            return Direction.EAST;
        if(northeast.equals(l55))
            return Direction.SOUTHWEST;
        if(northwest.equals(l55))
            return Direction.SOUTHEAST;
        if(southeast.equals(l55))
            return Direction.NORTHWEST;
        if(southwest.equals(l55))
            return Direction.NORTHEAST;
        if(north.equals(l63))
            return Direction.SOUTH;
        if(south.equals(l63))
            return Direction.NORTH;
        if(east.equals(l63))
            return Direction.WEST;
        if(west.equals(l63))
            return Direction.EAST;
        if(northeast.equals(l63))
            return Direction.SOUTHWEST;
        if(northwest.equals(l63))
            return Direction.SOUTHEAST;
        if(southeast.equals(l63))
            return Direction.NORTHWEST;
        if(southwest.equals(l63))
            return Direction.NORTHEAST;
        if(north.equals(l71))
            return Direction.SOUTH;
        if(south.equals(l71))
            return Direction.NORTH;
        if(east.equals(l71))
            return Direction.WEST;
        if(west.equals(l71))
            return Direction.EAST;
        if(northeast.equals(l71))
            return Direction.SOUTHWEST;
        if(northwest.equals(l71))
            return Direction.SOUTHEAST;
        if(southeast.equals(l71))
            return Direction.NORTHWEST;
        if(southwest.equals(l71))
            return Direction.NORTHEAST;
        if(north.equals(l107))
            return Direction.SOUTH;
        if(south.equals(l107))
            return Direction.NORTH;
        if(east.equals(l107))
            return Direction.WEST;
        if(west.equals(l107))
            return Direction.EAST;
        if(northeast.equals(l107))
            return Direction.SOUTHWEST;
        if(northwest.equals(l107))
            return Direction.SOUTHEAST;
        if(southeast.equals(l107))
            return Direction.NORTHWEST;
        if(southwest.equals(l107))
            return Direction.NORTHEAST;
        if(north.equals(l117))
            return Direction.SOUTH;
        if(south.equals(l117))
            return Direction.NORTH;
        if(east.equals(l117))
            return Direction.WEST;
        if(west.equals(l117))
            return Direction.EAST;
        if(northeast.equals(l117))
            return Direction.SOUTHWEST;
        if(northwest.equals(l117))
            return Direction.SOUTHEAST;
        if(southeast.equals(l117))
            return Direction.NORTHWEST;
        if(southwest.equals(l117))
            return Direction.NORTHEAST;
        if(north.equals(l153))
            return Direction.SOUTH;
        if(south.equals(l153))
            return Direction.NORTH;
        if(east.equals(l153))
            return Direction.WEST;
        if(west.equals(l153))
            return Direction.EAST;
        if(northeast.equals(l153))
            return Direction.SOUTHWEST;
        if(northwest.equals(l153))
            return Direction.SOUTHEAST;
        if(southeast.equals(l153))
            return Direction.NORTHWEST;
        if(southwest.equals(l153))
            return Direction.NORTHEAST;
        if(north.equals(l161))
            return Direction.SOUTH;
        if(south.equals(l161))
            return Direction.NORTH;
        if(east.equals(l161))
            return Direction.WEST;
        if(west.equals(l161))
            return Direction.EAST;
        if(northeast.equals(l161))
            return Direction.SOUTHWEST;
        if(northwest.equals(l161))
            return Direction.SOUTHEAST;
        if(southeast.equals(l161))
            return Direction.NORTHWEST;
        if(southwest.equals(l161))
            return Direction.NORTHEAST;
        if(north.equals(l169))
            return Direction.SOUTH;
        if(south.equals(l169))
            return Direction.NORTH;
        if(east.equals(l169))
            return Direction.WEST;
        if(west.equals(l169))
            return Direction.EAST;
        if(northeast.equals(l169))
            return Direction.SOUTHWEST;
        if(northwest.equals(l169))
            return Direction.SOUTHEAST;
        if(southeast.equals(l169))
            return Direction.NORTHWEST;
        if(southwest.equals(l169))
            return Direction.NORTHEAST;
        if(north.equals(l175))
            return Direction.SOUTH;
        if(south.equals(l175))
            return Direction.NORTH;
        if(east.equals(l175))
            return Direction.WEST;
        if(west.equals(l175))
            return Direction.EAST;
        if(northeast.equals(l175))
            return Direction.SOUTHWEST;
        if(northwest.equals(l175))
            return Direction.SOUTHEAST;
        if(southeast.equals(l175))
            return Direction.NORTHWEST;
        if(southwest.equals(l175))
            return Direction.NORTHEAST;
        if(north.equals(l187))
            return Direction.SOUTH;
        if(south.equals(l187))
            return Direction.NORTH;
        if(east.equals(l187))
            return Direction.WEST;
        if(west.equals(l187))
            return Direction.EAST;
        if(northeast.equals(l187))
            return Direction.SOUTHWEST;
        if(northwest.equals(l187))
            return Direction.SOUTHEAST;
        if(southeast.equals(l187))
            return Direction.NORTHWEST;
        if(southwest.equals(l187))
            return Direction.NORTHEAST;
        return null;
    }
    static Direction BFSNorth(MapLocation target, Direction prev) throws GameActionException {
        if(c97 > c112 + r97 && prev != Direction.NORTH){
            d97 = Direction.NORTH;
            c97 = c112 + r97;
        }

        if(c113 > c112 + r113 && prev != Direction.EAST){
            d113 = Direction.EAST;
            c113 = c112 + r113;
        }

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

        if(c96 > c112 + r96 && prev != Direction.NORTHWEST){
            d96 = Direction.NORTHWEST;
            c96 = c112 + r96;
        }

        if(c96 > c97 + r96){
            d96 = d97;
            c96 = c97 + r96;
        }

        if(c111 > c112 + r111 && prev != Direction.WEST){
            d111 = Direction.WEST;
            c111 = c112 + r111;
        }

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

        if(c114 > c113 + r114){
            d114 = d113;
            c114 = c113 + r114;
        }

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

        if(c80 > c96 + r80){
            d80 = d96;
            c80 = c96 + r80;
        }

        if(c80 > c81 + r80){
            d80 = d81;
            c80 = c81 + r80;
        }

        if(c95 > c111 + r95){
            d95 = d111;
            c95 = c111 + r95;
        }

        if(c95 > c96 + r95){
            d95 = d96;
            c95 = c96 + r95;
        }

        if(c110 > c111 + r110){
            d110 = d111;
            c110 = c111 + r110;
        }

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

        if(c115 > c114 + r115){
            d115 = d114;
            c115 = c114 + r115;
        }

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

        if(c64 > c80 + r64){
            d64 = d80;
            c64 = c80 + r64;
        }

        if(c64 > c65 + r64){
            d64 = d65;
            c64 = c65 + r64;
        }

        if(c79 > c95 + r79){
            d79 = d95;
            c79 = c95 + r79;
        }

        if(c79 > c80 + r79){
            d79 = d80;
            c79 = c80 + r79;
        }

        if(c94 > c110 + r94){
            d94 = d110;
            c94 = c110 + r94;
        }

        if(c94 > c95 + r94){
            d94 = d95;
            c94 = c95 + r94;
        }

        if(c109 > c110 + r109){
            d109 = d110;
            c109 = c110 + r109;
        }

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

        if(c116 > c115 + r116){
            d116 = d115;
            c116 = c115 + r116;
        }

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

        if(c48 > c64 + r48){
            d48 = d64;
            c48 = c64 + r48;
        }

        if(c48 > c49 + r48){
            d48 = d49;
            c48 = c49 + r48;
        }

        if(c63 > c79 + r63){
            d63 = d79;
            c63 = c79 + r63;
        }

        if(c63 > c64 + r63){
            d63 = d64;
            c63 = c64 + r63;
        }

        if(c78 > c94 + r78){
            d78 = d94;
            c78 = c94 + r78;
        }

        if(c78 > c79 + r78){
            d78 = d79;
            c78 = c79 + r78;
        }

        if(c93 > c109 + r93){
            d93 = d109;
            c93 = c109 + r93;
        }

        if(c93 > c94 + r93){
            d93 = d94;
            c93 = c94 + r93;
        }

        if(c108 > c109 + r108){
            d108 = d109;
            c108 = c109 + r108;
        }

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

        if(c117 > c116 + r117){
            d117 = d116;
            c117 = c116 + r117;
        }

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

        if(c62 > c78 + r62){
            d62 = d78;
            c62 = c78 + r62;
        }

        if(c62 > c63 + r62){
            d62 = d63;
            c62 = c63 + r62;
        }

        if(c77 > c93 + r77){
            d77 = d93;
            c77 = c93 + r77;
        }

        if(c77 > c78 + r77){
            d77 = d78;
            c77 = c78 + r77;
        }

        if(c92 > c108 + r92){
            d92 = d108;
            c92 = c108 + r92;
        }

        if(c92 > c93 + r92){
            d92 = d93;
            c92 = c93 + r92;
        }

        if(c107 > c108 + r107){
            d107 = d108;
            c107 = c108 + r107;
        }

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;

        int dist34 = Math.max(Math.abs(cx+4)*49 + c34, Math.abs(cy - 2)*49+c34);
        if(dist34 < cmin){
            cmin= dist34;
            ans = d34;
        }

        int dist35 = Math.max(Math.abs(cx+5)*49 + c35, Math.abs(cy - 2)*49+c35);
        if(dist35 < cmin){
            cmin= dist35;
            ans = d35;
        }

        int dist36 = Math.max(Math.abs(cx+6)*49 + c36, Math.abs(cy - 2)*49+c36);
        if(dist36 < cmin){
            cmin= dist36;
            ans = d36;
        }

        int dist37 = Math.max(Math.abs(cx+7)*49 + c37, Math.abs(cy - 2)*49+c37);
        if(dist37 < cmin){
            cmin= dist37;
            ans = d37;
        }

        int dist38 = Math.max(Math.abs(cx+8)*49 + c38, Math.abs(cy - 2)*49+c38);
        if(dist38 < cmin){
            cmin= dist38;
            ans = d38;
        }

        int dist39 = Math.max(Math.abs(cx+9)*49 + c39, Math.abs(cy - 2)*49+c39);
        if(dist39 < cmin){
            cmin= dist39;
            ans = d39;
        }

        int dist40 = Math.max(Math.abs(cx+10)*49 + c40, Math.abs(cy - 2)*49+c40);
        if(dist40 < cmin){
            cmin= dist40;
            ans = d40;
        }

        int dist48 = Math.max(Math.abs(cx+3)*49 + c48, Math.abs(cy - 3)*49+c48);
        if(dist48 < cmin){
            cmin= dist48;
            ans = d48;
        }

        int dist49 = Math.max(Math.abs(cx+4)*49 + c49, Math.abs(cy - 3)*49+c49);
        if(dist49 < cmin){
            cmin= dist49;
            ans = d49;
        }

        int dist55 = Math.max(Math.abs(cx+10)*49 + c55, Math.abs(cy - 3)*49+c55);
        if(dist55 < cmin){
            cmin= dist55;
            ans = d55;
        }

        int dist56 = Math.max(Math.abs(cx+11)*49 + c56, Math.abs(cy - 3)*49+c56);
        if(dist56 < cmin){
            cmin= dist56;
            ans = d56;
        }

        int dist62 = Math.max(Math.abs(cx+2)*49 + c62, Math.abs(cy - 4)*49+c62);
        if(dist62 < cmin){
            cmin= dist62;
            ans = d62;
        }

        int dist63 = Math.max(Math.abs(cx+3)*49 + c63, Math.abs(cy - 4)*49+c63);
        if(dist63 < cmin){
            cmin= dist63;
            ans = d63;
        }

        int dist71 = Math.max(Math.abs(cx+11)*49 + c71, Math.abs(cy - 4)*49+c71);
        if(dist71 < cmin){
            cmin= dist71;
            ans = d71;
        }

        int dist72 = Math.max(Math.abs(cx+12)*49 + c72, Math.abs(cy - 4)*49+c72);
        if(dist72 < cmin){
            cmin= dist72;
            ans = d72;
        }

        int dist77 = Math.max(Math.abs(cx+2)*49 + c77, Math.abs(cy - 5)*49+c77);
        if(dist77 < cmin){
            cmin= dist77;
            ans = d77;
        }

        int dist87 = Math.max(Math.abs(cx+12)*49 + c87, Math.abs(cy - 5)*49+c87);
        if(dist87 < cmin){
            cmin= dist87;
            ans = d87;
        }

        int dist92 = Math.max(Math.abs(cx+2)*49 + c92, Math.abs(cy - 6)*49+c92);
        if(dist92 < cmin){
            cmin= dist92;
            ans = d92;
        }

        int dist102 = Math.max(Math.abs(cx+12)*49 + c102, Math.abs(cy - 6)*49+c102);
        if(dist102 < cmin){
            cmin= dist102;
            ans = d102;
        }

        int dist107 = Math.max(Math.abs(cx+2)*49 + c107, Math.abs(cy - 7)*49+c107);
        if(dist107 < cmin){
            cmin= dist107;
            ans = d107;
        }

        int dist117 = Math.max(Math.abs(cx+12)*49 + c117, Math.abs(cy - 7)*49+c117);
        if(dist117 < cmin){
            cmin= dist117;
            ans = d117;
        }

        if(cmin<=nomove) return ans;

        int dist50 = Math.max(Math.abs(cx+5)*49 + c50, Math.abs(cy - 3)*49+c50);
        if(dist50 < cmin){
            cmin= dist50;
            ans = d50;
        }

        int dist51 = Math.max(Math.abs(cx+6)*49 + c51, Math.abs(cy - 3)*49+c51);
        if(dist51 < cmin){
            cmin= dist51;
            ans = d51;
        }

        int dist52 = Math.max(Math.abs(cx+7)*49 + c52, Math.abs(cy - 3)*49+c52);
        if(dist52 < cmin){
            cmin= dist52;
            ans = d52;
        }

        int dist53 = Math.max(Math.abs(cx+8)*49 + c53, Math.abs(cy - 3)*49+c53);
        if(dist53 < cmin){
            cmin= dist53;
            ans = d53;
        }

        int dist54 = Math.max(Math.abs(cx+9)*49 + c54, Math.abs(cy - 3)*49+c54);
        if(dist54 < cmin){
            cmin= dist54;
            ans = d54;
        }

        int dist64 = Math.max(Math.abs(cx+4)*49 + c64, Math.abs(cy - 4)*49+c64);
        if(dist64 < cmin){
            cmin= dist64;
            ans = d64;
        }

        int dist65 = Math.max(Math.abs(cx+5)*49 + c65, Math.abs(cy - 4)*49+c65);
        if(dist65 < cmin){
            cmin= dist65;
            ans = d65;
        }

        int dist69 = Math.max(Math.abs(cx+9)*49 + c69, Math.abs(cy - 4)*49+c69);
        if(dist69 < cmin){
            cmin= dist69;
            ans = d69;
        }

        int dist70 = Math.max(Math.abs(cx+10)*49 + c70, Math.abs(cy - 4)*49+c70);
        if(dist70 < cmin){
            cmin= dist70;
            ans = d70;
        }

        int dist78 = Math.max(Math.abs(cx+3)*49 + c78, Math.abs(cy - 5)*49+c78);
        if(dist78 < cmin){
            cmin= dist78;
            ans = d78;
        }

        int dist79 = Math.max(Math.abs(cx+4)*49 + c79, Math.abs(cy - 5)*49+c79);
        if(dist79 < cmin){
            cmin= dist79;
            ans = d79;
        }

        int dist85 = Math.max(Math.abs(cx+10)*49 + c85, Math.abs(cy - 5)*49+c85);
        if(dist85 < cmin){
            cmin= dist85;
            ans = d85;
        }

        int dist86 = Math.max(Math.abs(cx+11)*49 + c86, Math.abs(cy - 5)*49+c86);
        if(dist86 < cmin){
            cmin= dist86;
            ans = d86;
        }

        int dist93 = Math.max(Math.abs(cx+3)*49 + c93, Math.abs(cy - 6)*49+c93);
        if(dist93 < cmin){
            cmin= dist93;
            ans = d93;
        }

        int dist101 = Math.max(Math.abs(cx+11)*49 + c101, Math.abs(cy - 6)*49+c101);
        if(dist101 < cmin){
            cmin= dist101;
            ans = d101;
        }

        int dist108 = Math.max(Math.abs(cx+3)*49 + c108, Math.abs(cy - 7)*49+c108);
        if(dist108 < cmin){
            cmin= dist108;
            ans = d108;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*49+c116);
        if(dist116 < cmin){
            cmin= dist116;
            ans = d116;
        }

        if(cmin<=nomove) return ans;

        int dist66 = Math.max(Math.abs(cx+6)*49 + c66, Math.abs(cy - 4)*49+c66);
        if(dist66 < cmin){
            cmin= dist66;
            ans = d66;
        }

        int dist67 = Math.max(Math.abs(cx+7)*49 + c67, Math.abs(cy - 4)*49+c67);
        if(dist67 < cmin){
            cmin= dist67;
            ans = d67;
        }

        int dist68 = Math.max(Math.abs(cx+8)*49 + c68, Math.abs(cy - 4)*49+c68);
        if(dist68 < cmin){
            cmin= dist68;
            ans = d68;
        }

        int dist80 = Math.max(Math.abs(cx+5)*49 + c80, Math.abs(cy - 5)*49+c80);
        if(dist80 < cmin){
            cmin= dist80;
            ans = d80;
        }

        int dist81 = Math.max(Math.abs(cx+6)*49 + c81, Math.abs(cy - 5)*49+c81);
        if(dist81 < cmin){
            cmin= dist81;
            ans = d81;
        }

        int dist83 = Math.max(Math.abs(cx+8)*49 + c83, Math.abs(cy - 5)*49+c83);
        if(dist83 < cmin){
            cmin= dist83;
            ans = d83;
        }

        int dist84 = Math.max(Math.abs(cx+9)*49 + c84, Math.abs(cy - 5)*49+c84);
        if(dist84 < cmin){
            cmin= dist84;
            ans = d84;
        }

        int dist94 = Math.max(Math.abs(cx+4)*49 + c94, Math.abs(cy - 6)*49+c94);
        if(dist94 < cmin){
            cmin= dist94;
            ans = d94;
        }

        int dist95 = Math.max(Math.abs(cx+5)*49 + c95, Math.abs(cy - 6)*49+c95);
        if(dist95 < cmin){
            cmin= dist95;
            ans = d95;
        }

        int dist99 = Math.max(Math.abs(cx+9)*49 + c99, Math.abs(cy - 6)*49+c99);
        if(dist99 < cmin){
            cmin= dist99;
            ans = d99;
        }

        int dist100 = Math.max(Math.abs(cx+10)*49 + c100, Math.abs(cy - 6)*49+c100);
        if(dist100 < cmin){
            cmin= dist100;
            ans = d100;
        }

        int dist109 = Math.max(Math.abs(cx+4)*49 + c109, Math.abs(cy - 7)*49+c109);
        if(dist109 < cmin){
            cmin= dist109;
            ans = d109;
        }

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*49+c115);
        if(dist115 < cmin){
            cmin= dist115;
            ans = d115;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*49+c82);
        if(dist82 < cmin){
            cmin= dist82;
            ans = d82;
        }

        int dist96 = Math.max(Math.abs(cx+6)*49 + c96, Math.abs(cy - 6)*49+c96);
        if(dist96 < cmin){
            cmin= dist96;
            ans = d96;
        }

        int dist97 = Math.max(Math.abs(cx+7)*49 + c97, Math.abs(cy - 6)*49+c97);
        if(dist97 < cmin){
            cmin= dist97;
            ans = d97;
        }

        int dist98 = Math.max(Math.abs(cx+8)*49 + c98, Math.abs(cy - 6)*49+c98);
        if(dist98 < cmin){
            cmin= dist98;
            ans = d98;
        }

        int dist110 = Math.max(Math.abs(cx+5)*49 + c110, Math.abs(cy - 7)*49+c110);
        if(dist110 < cmin){
            cmin= dist110;
            ans = d110;
        }

        int dist111 = Math.max(Math.abs(cx+6)*49 + c111, Math.abs(cy - 7)*49+c111);
        if(dist111 < cmin){
            cmin= dist111;
            ans = d111;
        }

        int dist113 = Math.max(Math.abs(cx+8)*49 + c113, Math.abs(cy - 7)*49+c113);
        if(dist113 < cmin){
            cmin= dist113;
            ans = d113;
        }

        int dist114 = Math.max(Math.abs(cx+9)*49 + c114, Math.abs(cy - 7)*49+c114);
        if(dist114 < cmin){
            cmin= dist114;
            ans = d114;
        }
        return ans;
    }
    static Direction BFSEast(MapLocation target, Direction prev) throws GameActionException{
        if(c97 > c112 + r97 && prev != Direction.NORTH){
            d97 = Direction.NORTH;
            c97 = c112 + r97;
        }

        if(c127 > c112 + r127 && prev != Direction.SOUTH){
            d127 = Direction.SOUTH;
            c127 = c112 + r127;
        }

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

        if(c82 > c97 + r82){
            d82 = d97;
            c82 = c97 + r82;
        }

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

        if(c142 > c127 + r142){
            d142 = d127;
            c142 = c127 + r142;
        }

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

        if(c67 > c82 + r67){
            d67 = d82;
            c67 = c82 + r67;
        }

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

        if(c157 > c142 + r157){
            d157 = d142;
            c157 = c142 + r157;
        }

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

        if(c52 > c67 + r52){
            d52 = d67;
            c52 = c67 + r52;
        }

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

        if(c172 > c157 + r172){
            d172 = d157;
            c172 = c157 + r172;
        }

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

        if(c37 > c52 + r37){
            d37 = d52;
            c37 = c52 + r37;
        }

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

        if(c187 > c172 + r187){
            d187 = d172;
            c187 = c172 + r187;
        }

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


        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;

        int dist37 = Math.max(Math.abs(cx+7)*49 + c37, Math.abs(cy - 2)*49+c37);
        if(dist37 < cmin){
            cmin= dist37;
            ans = d37;
        }

        int dist38 = Math.max(Math.abs(cx+8)*49 + c38, Math.abs(cy - 2)*49+c38);
        if(dist38 < cmin){
            cmin= dist38;
            ans = d38;
        }

        int dist39 = Math.max(Math.abs(cx+9)*49 + c39, Math.abs(cy - 2)*49+c39);
        if(dist39 < cmin){
            cmin= dist39;
            ans = d39;
        }

        int dist40 = Math.max(Math.abs(cx+10)*49 + c40, Math.abs(cy - 2)*49+c40);
        if(dist40 < cmin){
            cmin= dist40;
            ans = d40;
        }

        int dist55 = Math.max(Math.abs(cx+10)*49 + c55, Math.abs(cy - 3)*49+c55);
        if(dist55 < cmin){
            cmin= dist55;
            ans = d55;
        }

        int dist56 = Math.max(Math.abs(cx+11)*49 + c56, Math.abs(cy - 3)*49+c56);
        if(dist56 < cmin){
            cmin= dist56;
            ans = d56;
        }

        int dist71 = Math.max(Math.abs(cx+11)*49 + c71, Math.abs(cy - 4)*49+c71);
        if(dist71 < cmin){
            cmin= dist71;
            ans = d71;
        }

        int dist72 = Math.max(Math.abs(cx+12)*49 + c72, Math.abs(cy - 4)*49+c72);
        if(dist72 < cmin){
            cmin= dist72;
            ans = d72;
        }

        int dist87 = Math.max(Math.abs(cx+12)*49 + c87, Math.abs(cy - 5)*49+c87);
        if(dist87 < cmin){
            cmin= dist87;
            ans = d87;
        }

        int dist102 = Math.max(Math.abs(cx+12)*49 + c102, Math.abs(cy - 6)*49+c102);
        if(dist102 < cmin){
            cmin= dist102;
            ans = d102;
        }

        int dist117 = Math.max(Math.abs(cx+12)*49 + c117, Math.abs(cy - 7)*49+c117);
        if(dist117 < cmin){
            cmin= dist117;
            ans = d117;
        }

        int dist132 = Math.max(Math.abs(cx+12)*49 + c132, Math.abs(cy - 8)*49+c132);
        if(dist132 < cmin){
            cmin= dist132;
            ans = d132;
        }

        int dist147 = Math.max(Math.abs(cx+12)*49 + c147, Math.abs(cy - 9)*49+c147);
        if(dist147 < cmin){
            cmin= dist147;
            ans = d147;
        }

        int dist161 = Math.max(Math.abs(cx+11)*49 + c161, Math.abs(cy - 10)*49+c161);
        if(dist161 < cmin){
            cmin= dist161;
            ans = d161;
        }

        int dist162 = Math.max(Math.abs(cx+12)*49 + c162, Math.abs(cy - 10)*49+c162);
        if(dist162 < cmin){
            cmin= dist162;
            ans = d162;
        }

        int dist175 = Math.max(Math.abs(cx+10)*49 + c175, Math.abs(cy - 11)*49+c175);
        if(dist175 < cmin){
            cmin= dist175;
            ans = d175;
        }

        int dist176 = Math.max(Math.abs(cx+11)*49 + c176, Math.abs(cy - 11)*49+c176);
        if(dist176 < cmin){
            cmin= dist176;
            ans = d176;
        }

        int dist187 = Math.max(Math.abs(cx+7)*49 + c187, Math.abs(cy - 12)*49+c187);
        if(dist187 < cmin){
            cmin= dist187;
            ans = d187;
        }

        int dist188 = Math.max(Math.abs(cx+8)*49 + c188, Math.abs(cy - 12)*49+c188);
        if(dist188 < cmin){
            cmin= dist188;
            ans = d188;
        }

        int dist189 = Math.max(Math.abs(cx+9)*49 + c189, Math.abs(cy - 12)*49+c189);
        if(dist189 < cmin){
            cmin= dist189;
            ans = d189;
        }

        int dist190 = Math.max(Math.abs(cx+10)*49 + c190, Math.abs(cy - 12)*49+c190);
        if(dist190 < cmin){
            cmin= dist190;
            ans = d190;
        }

        if(cmin<=nomove) return ans;

        int dist52 = Math.max(Math.abs(cx+7)*49 + c52, Math.abs(cy - 3)*49+c52);
        if(dist52 < cmin){
            cmin= dist52;
            ans = d52;
        }

        int dist53 = Math.max(Math.abs(cx+8)*49 + c53, Math.abs(cy - 3)*49+c53);
        if(dist53 < cmin){
            cmin= dist53;
            ans = d53;
        }

        int dist54 = Math.max(Math.abs(cx+9)*49 + c54, Math.abs(cy - 3)*49+c54);
        if(dist54 < cmin){
            cmin= dist54;
            ans = d54;
        }

        int dist69 = Math.max(Math.abs(cx+9)*49 + c69, Math.abs(cy - 4)*49+c69);
        if(dist69 < cmin){
            cmin= dist69;
            ans = d69;
        }

        int dist70 = Math.max(Math.abs(cx+10)*49 + c70, Math.abs(cy - 4)*49+c70);
        if(dist70 < cmin){
            cmin= dist70;
            ans = d70;
        }

        int dist85 = Math.max(Math.abs(cx+10)*49 + c85, Math.abs(cy - 5)*49+c85);
        if(dist85 < cmin){
            cmin= dist85;
            ans = d85;
        }

        int dist86 = Math.max(Math.abs(cx+11)*49 + c86, Math.abs(cy - 5)*49+c86);
        if(dist86 < cmin){
            cmin= dist86;
            ans = d86;
        }

        int dist101 = Math.max(Math.abs(cx+11)*49 + c101, Math.abs(cy - 6)*49+c101);
        if(dist101 < cmin){
            cmin= dist101;
            ans = d101;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*49+c116);
        if(dist116 < cmin){
            cmin= dist116;
            ans = d116;
        }

        int dist131 = Math.max(Math.abs(cx+11)*49 + c131, Math.abs(cy - 8)*49+c131);
        if(dist131 < cmin){
            cmin= dist131;
            ans = d131;
        }

        int dist145 = Math.max(Math.abs(cx+10)*49 + c145, Math.abs(cy - 9)*49+c145);
        if(dist145 < cmin){
            cmin= dist145;
            ans = d145;
        }

        int dist146 = Math.max(Math.abs(cx+11)*49 + c146, Math.abs(cy - 9)*49+c146);
        if(dist146 < cmin){
            cmin= dist146;
            ans = d146;
        }

        int dist159 = Math.max(Math.abs(cx+9)*49 + c159, Math.abs(cy - 10)*49+c159);
        if(dist159 < cmin){
            cmin= dist159;
            ans = d159;
        }

        int dist160 = Math.max(Math.abs(cx+10)*49 + c160, Math.abs(cy - 10)*49+c160);
        if(dist160 < cmin){
            cmin= dist160;
            ans = d160;
        }

        int dist172 = Math.max(Math.abs(cx+7)*49 + c172, Math.abs(cy - 11)*49+c172);
        if(dist172 < cmin){
            cmin= dist172;
            ans = d172;
        }

        int dist173 = Math.max(Math.abs(cx+8)*49 + c173, Math.abs(cy - 11)*49+c173);
        if(dist173 < cmin){
            cmin= dist173;
            ans = d173;
        }

        int dist174 = Math.max(Math.abs(cx+9)*49 + c174, Math.abs(cy - 11)*49+c174);
        if(dist174 < cmin){
            cmin= dist174;
            ans = d174;
        }

        if(cmin<=nomove) return ans;

        int dist67 = Math.max(Math.abs(cx+7)*49 + c67, Math.abs(cy - 4)*49+c67);
        if(dist67 < cmin){
            cmin= dist67;
            ans = d67;
        }

        int dist68 = Math.max(Math.abs(cx+8)*49 + c68, Math.abs(cy - 4)*49+c68);
        if(dist68 < cmin){
            cmin= dist68;
            ans = d68;
        }

        int dist83 = Math.max(Math.abs(cx+8)*49 + c83, Math.abs(cy - 5)*49+c83);
        if(dist83 < cmin){
            cmin= dist83;
            ans = d83;
        }

        int dist84 = Math.max(Math.abs(cx+9)*49 + c84, Math.abs(cy - 5)*49+c84);
        if(dist84 < cmin){
            cmin= dist84;
            ans = d84;
        }

        int dist99 = Math.max(Math.abs(cx+9)*49 + c99, Math.abs(cy - 6)*49+c99);
        if(dist99 < cmin){
            cmin= dist99;
            ans = d99;
        }

        int dist100 = Math.max(Math.abs(cx+10)*49 + c100, Math.abs(cy - 6)*49+c100);
        if(dist100 < cmin){
            cmin= dist100;
            ans = d100;
        }

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*49+c115);
        if(dist115 < cmin){
            cmin= dist115;
            ans = d115;
        }

        int dist129 = Math.max(Math.abs(cx+9)*49 + c129, Math.abs(cy - 8)*49+c129);
        if(dist129 < cmin){
            cmin= dist129;
            ans = d129;
        }

        int dist130 = Math.max(Math.abs(cx+10)*49 + c130, Math.abs(cy - 8)*49+c130);
        if(dist130 < cmin){
            cmin= dist130;
            ans = d130;
        }

        int dist143 = Math.max(Math.abs(cx+8)*49 + c143, Math.abs(cy - 9)*49+c143);
        if(dist143 < cmin){
            cmin= dist143;
            ans = d143;
        }

        int dist144 = Math.max(Math.abs(cx+9)*49 + c144, Math.abs(cy - 9)*49+c144);
        if(dist144 < cmin){
            cmin= dist144;
            ans = d144;
        }

        int dist157 = Math.max(Math.abs(cx+7)*49 + c157, Math.abs(cy - 10)*49+c157);
        if(dist157 < cmin){
            cmin= dist157;
            ans = d157;
        }

        int dist158 = Math.max(Math.abs(cx+8)*49 + c158, Math.abs(cy - 10)*49+c158);
        if(dist158 < cmin){
            cmin= dist158;
            ans = d158;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*49+c82);
        if(dist82 < cmin){
            cmin= dist82;
            ans = d82;
        }

        int dist97 = Math.max(Math.abs(cx+7)*49 + c97, Math.abs(cy - 6)*49+c97);
        if(dist97 < cmin){
            cmin= dist97;
            ans = d97;
        }

        int dist98 = Math.max(Math.abs(cx+8)*49 + c98, Math.abs(cy - 6)*49+c98);
        if(dist98 < cmin){
            cmin= dist98;
            ans = d98;
        }

        int dist113 = Math.max(Math.abs(cx+8)*49 + c113, Math.abs(cy - 7)*49+c113);
        if(dist113 < cmin){
            cmin= dist113;
            ans = d113;
        }

        int dist114 = Math.max(Math.abs(cx+9)*49 + c114, Math.abs(cy - 7)*49+c114);
        if(dist114 < cmin){
            cmin= dist114;
            ans = d114;
        }

        int dist127 = Math.max(Math.abs(cx+7)*49 + c127, Math.abs(cy - 8)*49+c127);
        if(dist127 < cmin){
            cmin= dist127;
            ans = d127;
        }

        int dist128 = Math.max(Math.abs(cx+8)*49 + c128, Math.abs(cy - 8)*49+c128);
        if(dist128 < cmin){
            cmin= dist128;
            ans = d128;
        }

        int dist142 = Math.max(Math.abs(cx+7)*49 + c142, Math.abs(cy - 9)*49+c142);
        if(dist142 < cmin){
            cmin= dist142;
            ans = d142;
        }
        return ans;
    }
    static Direction BFSWest(MapLocation target, Direction prev) throws GameActionException{
        if(c97 > c112 + r97 && prev != Direction.NORTH){
            d97 = Direction.NORTH;
            c97 = c112 + r97;
        }

        if(c127 > c112 + r127 && prev != Direction.SOUTH){
            d127 = Direction.SOUTH;
            c127 = c112 + r127;
        }

        if(c126 > c112 + r126 && prev != Direction.SOUTHWEST){
            d126 = Direction.SOUTHWEST;
            c126 = c112 + r126;
        }

        if(c126 > c127 + r126){
            d126 = d127;
            c126 = c127 + r126;
        }

        if(c96 > c112 + r96 && prev != Direction.NORTHWEST){
            d96 = Direction.NORTHWEST;
            c96 = c112 + r96;
        }

        if(c96 > c97 + r96){
            d96 = d97;
            c96 = c97 + r96;
        }

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

        if(c82 > c97 + r82){
            d82 = d97;
            c82 = c97 + r82;
        }

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

        if(c142 > c127 + r142){
            d142 = d127;
            c142 = c127 + r142;
        }

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

        if(c140 > c126 + r140){
            d140 = d126;
            c140 = c126 + r140;
        }

        if(c140 > c141 + r140){
            d140 = d141;
            c140 = c141 + r140;
        }

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

        if(c80 > c96 + r80){
            d80 = d96;
            c80 = c96 + r80;
        }

        if(c80 > c81 + r80){
            d80 = d81;
            c80 = c81 + r80;
        }

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

        if(c67 > c82 + r67){
            d67 = d82;
            c67 = c82 + r67;
        }

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

        if(c157 > c142 + r157){
            d157 = d142;
            c157 = c142 + r157;
        }

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

        if(c154 > c140 + r154){
            d154 = d140;
            c154 = c140 + r154;
        }

        if(c154 > c155 + r154){
            d154 = d155;
            c154 = c155 + r154;
        }

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

        if(c64 > c80 + r64){
            d64 = d80;
            c64 = c80 + r64;
        }

        if(c64 > c65 + r64){
            d64 = d65;
            c64 = c65 + r64;
        }

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

        if(c52 > c67 + r52){
            d52 = d67;
            c52 = c67 + r52;
        }

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

        if(c172 > c157 + r172){
            d172 = d157;
            c172 = c157 + r172;
        }

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

        if(c169 > c154 + r169){
            d169 = d154;
            c169 = c154 + r169;
        }

        if(c169 > c155 + r169){
            d169 = d155;
            c169 = c155 + r169;
        }

        if(c169 > c170 + r169){
            d169 = d170;
            c169 = c170 + r169;
        }

        if(c168 > c154 + r168){
            d168 = d154;
            c168 = c154 + r168;
        }

        if(c168 > c169 + r168){
            d168 = d169;
            c168 = c169 + r168;
        }

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

        if(c153 > c168 + r153){
            d153 = d168;
            c153 = c168 + r153;
        }

        if(c153 > c138 + r153){
            d153 = d138;
            c153 = c138 + r153;
        }

        if(c153 > c139 + r153){
            d153 = d139;
            c153 = c139 + r153;
        }

        if(c153 > c169 + r153){
            d153 = d169;
            c153 = c169 + r153;
        }

        if(c153 > c154 + r153){
            d153 = d154;
            c153 = c154 + r153;
        }

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

        if(c48 > c64 + r48){
            d48 = d64;
            c48 = c64 + r48;
        }

        if(c48 > c49 + r48){
            d48 = d49;
            c48 = c49 + r48;
        }

        if(c63 > c78 + r63){
            d63 = d78;
            c63 = c78 + r63;
        }

        if(c63 > c48 + r63){
            d63 = d48;
            c63 = c48 + r63;
        }

        if(c63 > c49 + r63){
            d63 = d49;
            c63 = c49 + r63;
        }

        if(c63 > c79 + r63){
            d63 = d79;
            c63 = c79 + r63;
        }

        if(c63 > c64 + r63){
            d63 = d64;
            c63 = c64 + r63;
        }

        if(c37 > c52 + r37){
            d37 = d52;
            c37 = c52 + r37;
        }

        if(c36 > c51 + r36){
            d36 = d51;
            c36 = c51 + r36;
        }

        if(c36 > c52 + r36){
            d36 = d52;
            c36 = c52 + r36;
        }

        if(c36 > c37 + r36){
            d36 = d37;
            c36 = c37 + r36;
        }

        if(c35 > c50 + r35){
            d35 = d50;
            c35 = c50 + r35;
        }

        if(c35 > c51 + r35){
            d35 = d51;
            c35 = c51 + r35;
        }

        if(c35 > c36 + r35){
            d35 = d36;
            c35 = c36 + r35;
        }

        if(c34 > c49 + r34){
            d34 = d49;
            c34 = c49 + r34;
        }

        if(c34 > c50 + r34){
            d34 = d50;
            c34 = c50 + r34;
        }

        if(c34 > c35 + r34){
            d34 = d35;
            c34 = c35 + r34;
        }

        if(c187 > c172 + r187){
            d187 = d172;
            c187 = c172 + r187;
        }

        if(c186 > c171 + r186){
            d186 = d171;
            c186 = c171 + r186;
        }

        if(c186 > c172 + r186){
            d186 = d172;
            c186 = c172 + r186;
        }

        if(c186 > c187 + r186){
            d186 = d187;
            c186 = c187 + r186;
        }

        if(c185 > c170 + r185){
            d185 = d170;
            c185 = c170 + r185;
        }

        if(c185 > c171 + r185){
            d185 = d171;
            c185 = c171 + r185;
        }

        if(c185 > c186 + r185){
            d185 = d186;
            c185 = c186 + r185;
        }

        if(c184 > c169 + r184){
            d184 = d169;
            c184 = c169 + r184;
        }

        if(c184 > c170 + r184){
            d184 = d170;
            c184 = c170 + r184;
        }

        if(c184 > c185 + r184){
            d184 = d185;
            c184 = c185 + r184;
        }

        if(c152 > c138 + r152){
            d152 = d138;
            c152 = c138 + r152;
        }

        if(c152 > c168 + r152){
            d152 = d168;
            c152 = c168 + r152;
        }

        if(c152 > c153 + r152){
            d152 = d153;
            c152 = c153 + r152;
        }

        if(c122 > c108 + r122){
            d122 = d108;
            c122 = c108 + r122;
        }

        if(c122 > c138 + r122){
            d122 = d138;
            c122 = c138 + r122;
        }

        if(c122 > c123 + r122){
            d122 = d123;
            c122 = c123 + r122;
        }

        if(c137 > c152 + r137){
            d137 = d152;
            c137 = c152 + r137;
        }

        if(c137 > c122 + r137){
            d137 = d122;
            c137 = c122 + r137;
        }

        if(c137 > c123 + r137){
            d137 = d123;
            c137 = c123 + r137;
        }

        if(c137 > c153 + r137){
            d137 = d153;
            c137 = c153 + r137;
        }

        if(c137 > c138 + r137){
            d137 = d138;
            c137 = c138 + r137;
        }

        if(c92 > c78 + r92){
            d92 = d78;
            c92 = c78 + r92;
        }

        if(c92 > c108 + r92){
            d92 = d108;
            c92 = c108 + r92;
        }

        if(c92 > c93 + r92){
            d92 = d93;
            c92 = c93 + r92;
        }

        if(c107 > c122 + r107){
            d107 = d122;
            c107 = c122 + r107;
        }

        if(c107 > c92 + r107){
            d107 = d92;
            c107 = c92 + r107;
        }

        if(c107 > c93 + r107){
            d107 = d93;
            c107 = c93 + r107;
        }

        if(c107 > c123 + r107){
            d107 = d123;
            c107 = c123 + r107;
        }

        if(c107 > c108 + r107){
            d107 = d108;
            c107 = c108 + r107;
        }

        if(c62 > c48 + r62){
            d62 = d48;
            c62 = c48 + r62;
        }

        if(c62 > c78 + r62){
            d62 = d78;
            c62 = c78 + r62;
        }

        if(c62 > c63 + r62){
            d62 = d63;
            c62 = c63 + r62;
        }

        if(c77 > c92 + r77){
            d77 = d92;
            c77 = c92 + r77;
        }

        if(c77 > c62 + r77){
            d77 = d62;
            c77 = c62 + r77;
        }

        if(c77 > c63 + r77){
            d77 = d63;
            c77 = c63 + r77;
        }

        if(c77 > c93 + r77){
            d77 = d93;
            c77 = c93 + r77;
        }

        if(c77 > c78 + r77){
            d77 = d78;
            c77 = c78 + r77;
        }

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;

        int dist34 = Math.max(Math.abs(cx+4)*49 + c34, Math.abs(cy - 2)*49+c34);
        if(dist34 < cmin){
            cmin= dist34;
            ans = d34;
        }

        int dist35 = Math.max(Math.abs(cx+5)*49 + c35, Math.abs(cy - 2)*49+c35);
        if(dist35 < cmin){
            cmin= dist35;
            ans = d35;
        }

        int dist36 = Math.max(Math.abs(cx+6)*49 + c36, Math.abs(cy - 2)*49+c36);
        if(dist36 < cmin){
            cmin= dist36;
            ans = d36;
        }

        int dist37 = Math.max(Math.abs(cx+7)*49 + c37, Math.abs(cy - 2)*49+c37);
        if(dist37 < cmin){
            cmin= dist37;
            ans = d37;
        }

        int dist48 = Math.max(Math.abs(cx+3)*49 + c48, Math.abs(cy - 3)*49+c48);
        if(dist48 < cmin){
            cmin= dist48;
            ans = d48;
        }

        int dist49 = Math.max(Math.abs(cx+4)*49 + c49, Math.abs(cy - 3)*49+c49);
        if(dist49 < cmin){
            cmin= dist49;
            ans = d49;
        }

        int dist62 = Math.max(Math.abs(cx+2)*49 + c62, Math.abs(cy - 4)*49+c62);
        if(dist62 < cmin){
            cmin= dist62;
            ans = d62;
        }

        int dist63 = Math.max(Math.abs(cx+3)*49 + c63, Math.abs(cy - 4)*49+c63);
        if(dist63 < cmin){
            cmin= dist63;
            ans = d63;
        }

        int dist77 = Math.max(Math.abs(cx+2)*49 + c77, Math.abs(cy - 5)*49+c77);
        if(dist77 < cmin){
            cmin= dist77;
            ans = d77;
        }

        int dist92 = Math.max(Math.abs(cx+2)*49 + c92, Math.abs(cy - 6)*49+c92);
        if(dist92 < cmin){
            cmin= dist92;
            ans = d92;
        }

        int dist107 = Math.max(Math.abs(cx+2)*49 + c107, Math.abs(cy - 7)*49+c107);
        if(dist107 < cmin){
            cmin= dist107;
            ans = d107;
        }

        int dist122 = Math.max(Math.abs(cx+2)*49 + c122, Math.abs(cy - 8)*49+c122);
        if(dist122 < cmin){
            cmin= dist122;
            ans = d122;
        }

        int dist137 = Math.max(Math.abs(cx+2)*49 + c137, Math.abs(cy - 9)*49+c137);
        if(dist137 < cmin){
            cmin= dist137;
            ans = d137;
        }

        int dist152 = Math.max(Math.abs(cx+2)*49 + c152, Math.abs(cy - 10)*49+c152);
        if(dist152 < cmin){
            cmin= dist152;
            ans = d152;
        }

        int dist153 = Math.max(Math.abs(cx+3)*49 + c153, Math.abs(cy - 10)*49+c153);
        if(dist153 < cmin){
            cmin= dist153;
            ans = d153;
        }

        int dist168 = Math.max(Math.abs(cx+3)*49 + c168, Math.abs(cy - 11)*49+c168);
        if(dist168 < cmin){
            cmin= dist168;
            ans = d168;
        }

        int dist169 = Math.max(Math.abs(cx+4)*49 + c169, Math.abs(cy - 11)*49+c169);
        if(dist169 < cmin){
            cmin= dist169;
            ans = d169;
        }

        int dist184 = Math.max(Math.abs(cx+4)*49 + c184, Math.abs(cy - 12)*49+c184);
        if(dist184 < cmin){
            cmin= dist184;
            ans = d184;
        }

        int dist185 = Math.max(Math.abs(cx+5)*49 + c185, Math.abs(cy - 12)*49+c185);
        if(dist185 < cmin){
            cmin= dist185;
            ans = d185;
        }

        int dist186 = Math.max(Math.abs(cx+6)*49 + c186, Math.abs(cy - 12)*49+c186);
        if(dist186 < cmin){
            cmin= dist186;
            ans = d186;
        }

        int dist187 = Math.max(Math.abs(cx+7)*49 + c187, Math.abs(cy - 12)*49+c187);
        if(dist187 < cmin){
            cmin= dist187;
            ans = d187;
        }

        if(cmin<=nomove) return ans;

        int dist50 = Math.max(Math.abs(cx+5)*49 + c50, Math.abs(cy - 3)*49+c50);
        if(dist50 < cmin){
            cmin= dist50;
            ans = d50;
        }

        int dist51 = Math.max(Math.abs(cx+6)*49 + c51, Math.abs(cy - 3)*49+c51);
        if(dist51 < cmin){
            cmin= dist51;
            ans = d51;
        }

        int dist52 = Math.max(Math.abs(cx+7)*49 + c52, Math.abs(cy - 3)*49+c52);
        if(dist52 < cmin){
            cmin= dist52;
            ans = d52;
        }

        int dist64 = Math.max(Math.abs(cx+4)*49 + c64, Math.abs(cy - 4)*49+c64);
        if(dist64 < cmin){
            cmin= dist64;
            ans = d64;
        }

        int dist65 = Math.max(Math.abs(cx+5)*49 + c65, Math.abs(cy - 4)*49+c65);
        if(dist65 < cmin){
            cmin= dist65;
            ans = d65;
        }

        int dist78 = Math.max(Math.abs(cx+3)*49 + c78, Math.abs(cy - 5)*49+c78);
        if(dist78 < cmin){
            cmin= dist78;
            ans = d78;
        }

        int dist79 = Math.max(Math.abs(cx+4)*49 + c79, Math.abs(cy - 5)*49+c79);
        if(dist79 < cmin){
            cmin= dist79;
            ans = d79;
        }

        int dist93 = Math.max(Math.abs(cx+3)*49 + c93, Math.abs(cy - 6)*49+c93);
        if(dist93 < cmin){
            cmin= dist93;
            ans = d93;
        }

        int dist108 = Math.max(Math.abs(cx+3)*49 + c108, Math.abs(cy - 7)*49+c108);
        if(dist108 < cmin){
            cmin= dist108;
            ans = d108;
        }

        int dist123 = Math.max(Math.abs(cx+3)*49 + c123, Math.abs(cy - 8)*49+c123);
        if(dist123 < cmin){
            cmin= dist123;
            ans = d123;
        }

        int dist138 = Math.max(Math.abs(cx+3)*49 + c138, Math.abs(cy - 9)*49+c138);
        if(dist138 < cmin){
            cmin= dist138;
            ans = d138;
        }

        int dist139 = Math.max(Math.abs(cx+4)*49 + c139, Math.abs(cy - 9)*49+c139);
        if(dist139 < cmin){
            cmin= dist139;
            ans = d139;
        }

        int dist154 = Math.max(Math.abs(cx+4)*49 + c154, Math.abs(cy - 10)*49+c154);
        if(dist154 < cmin){
            cmin= dist154;
            ans = d154;
        }

        int dist155 = Math.max(Math.abs(cx+5)*49 + c155, Math.abs(cy - 10)*49+c155);
        if(dist155 < cmin){
            cmin= dist155;
            ans = d155;
        }

        int dist170 = Math.max(Math.abs(cx+5)*49 + c170, Math.abs(cy - 11)*49+c170);
        if(dist170 < cmin){
            cmin= dist170;
            ans = d170;
        }

        int dist171 = Math.max(Math.abs(cx+6)*49 + c171, Math.abs(cy - 11)*49+c171);
        if(dist171 < cmin){
            cmin= dist171;
            ans = d171;
        }

        int dist172 = Math.max(Math.abs(cx+7)*49 + c172, Math.abs(cy - 11)*49+c172);
        if(dist172 < cmin){
            cmin= dist172;
            ans = d172;
        }

        if(cmin<=nomove) return ans;

        int dist66 = Math.max(Math.abs(cx+6)*49 + c66, Math.abs(cy - 4)*49+c66);
        if(dist66 < cmin){
            cmin= dist66;
            ans = d66;
        }

        int dist67 = Math.max(Math.abs(cx+7)*49 + c67, Math.abs(cy - 4)*49+c67);
        if(dist67 < cmin){
            cmin= dist67;
            ans = d67;
        }

        int dist80 = Math.max(Math.abs(cx+5)*49 + c80, Math.abs(cy - 5)*49+c80);
        if(dist80 < cmin){
            cmin= dist80;
            ans = d80;
        }

        int dist81 = Math.max(Math.abs(cx+6)*49 + c81, Math.abs(cy - 5)*49+c81);
        if(dist81 < cmin){
            cmin= dist81;
            ans = d81;
        }

        int dist94 = Math.max(Math.abs(cx+4)*49 + c94, Math.abs(cy - 6)*49+c94);
        if(dist94 < cmin){
            cmin= dist94;
            ans = d94;
        }

        int dist95 = Math.max(Math.abs(cx+5)*49 + c95, Math.abs(cy - 6)*49+c95);
        if(dist95 < cmin){
            cmin= dist95;
            ans = d95;
        }

        int dist109 = Math.max(Math.abs(cx+4)*49 + c109, Math.abs(cy - 7)*49+c109);
        if(dist109 < cmin){
            cmin= dist109;
            ans = d109;
        }

        int dist124 = Math.max(Math.abs(cx+4)*49 + c124, Math.abs(cy - 8)*49+c124);
        if(dist124 < cmin){
            cmin= dist124;
            ans = d124;
        }

        int dist125 = Math.max(Math.abs(cx+5)*49 + c125, Math.abs(cy - 8)*49+c125);
        if(dist125 < cmin){
            cmin= dist125;
            ans = d125;
        }

        int dist140 = Math.max(Math.abs(cx+5)*49 + c140, Math.abs(cy - 9)*49+c140);
        if(dist140 < cmin){
            cmin= dist140;
            ans = d140;
        }

        int dist141 = Math.max(Math.abs(cx+6)*49 + c141, Math.abs(cy - 9)*49+c141);
        if(dist141 < cmin){
            cmin= dist141;
            ans = d141;
        }

        int dist156 = Math.max(Math.abs(cx+6)*49 + c156, Math.abs(cy - 10)*49+c156);
        if(dist156 < cmin){
            cmin= dist156;
            ans = d156;
        }

        int dist157 = Math.max(Math.abs(cx+7)*49 + c157, Math.abs(cy - 10)*49+c157);
        if(dist157 < cmin){
            cmin= dist157;
            ans = d157;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*49+c82);
        if(dist82 < cmin){
            cmin= dist82;
            ans = d82;
        }

        int dist96 = Math.max(Math.abs(cx+6)*49 + c96, Math.abs(cy - 6)*49+c96);
        if(dist96 < cmin){
            cmin= dist96;
            ans = d96;
        }

        int dist97 = Math.max(Math.abs(cx+7)*49 + c97, Math.abs(cy - 6)*49+c97);
        if(dist97 < cmin){
            cmin= dist97;
            ans = d97;
        }

        int dist110 = Math.max(Math.abs(cx+5)*49 + c110, Math.abs(cy - 7)*49+c110);
        if(dist110 < cmin){
            cmin= dist110;
            ans = d110;
        }

        int dist111 = Math.max(Math.abs(cx+6)*49 + c111, Math.abs(cy - 7)*49+c111);
        if(dist111 < cmin){
            cmin= dist111;
            ans = d111;
        }

        int dist126 = Math.max(Math.abs(cx+6)*49 + c126, Math.abs(cy - 8)*49+c126);
        if(dist126 < cmin){
            cmin= dist126;
            ans = d126;
        }

        int dist127 = Math.max(Math.abs(cx+7)*49 + c127, Math.abs(cy - 8)*49+c127);
        if(dist127 < cmin){
            cmin= dist127;
            ans = d127;
        }

        int dist142 = Math.max(Math.abs(cx+7)*49 + c142, Math.abs(cy - 9)*49+c142);
        if(dist142 < cmin){
            cmin= dist142;
            ans = d142;
        }

        return ans;
    }
    static Direction BFSSouth(MapLocation target, Direction prev) throws GameActionException{
        if(c127 > c112 + r127 && prev != Direction.SOUTH){
            d127 = Direction.SOUTH;
            c127 = c112 + r127;
        }

        if(c113 > c112 + r113 && prev != Direction.EAST){
            d113 = Direction.EAST;
            c113 = c112 + r113;
        }

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

        if(c126 > c112 + r126 && prev != Direction.SOUTHWEST){
            d126 = Direction.SOUTHWEST;
            c126 = c112 + r126;
        }

        if(c126 > c127 + r126){
            d126 = d127;
            c126 = c127 + r126;
        }

        if(c111 > c112 + r111 && prev != Direction.WEST){
            d111 = Direction.WEST;
            c111 = c112 + r111;
        }

        if(c142 > c127 + r142){
            d142 = d127;
            c142 = c127 + r142;
        }

        if(c142 > c126 + r142){
            d142 = d126;
            c142 = c126 + r142;
        }

        if(c142 > c128 + r142){
            d142 = d128;
            c142 = c128 + r142;
        }

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

        if(c114 > c113 + r114){
            d114 = d113;
            c114 = c113 + r114;
        }

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

        if(c140 > c126 + r140){
            d140 = d126;
            c140 = c126 + r140;
        }

        if(c140 > c141 + r140){
            d140 = d141;
            c140 = c141 + r140;
        }

        if(c125 > c111 + r125){
            d125 = d111;
            c125 = c111 + r125;
        }

        if(c125 > c126 + r125){
            d125 = d126;
            c125 = c126 + r125;
        }

        if(c110 > c111 + r110){
            d110 = d111;
            c110 = c111 + r110;
        }

        if(c157 > c142 + r157){
            d157 = d142;
            c157 = c142 + r157;
        }

        if(c157 > c141 + r157){
            d157 = d141;
            c157 = c141 + r157;
        }

        if(c157 > c143 + r157){
            d157 = d143;
            c157 = c143 + r157;
        }

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

        if(c158 > c144 + r158){
            d158 = d144;
            c158 = c144 + r158;
        }

        if(c156 > c141 + r156){
            d156 = d141;
            c156 = c141 + r156;
        }

        if(c156 > c140 + r156){
            d156 = d140;
            c156 = c140 + r156;
        }

        if(c156 > c142 + r156){
            d156 = d142;
            c156 = c142 + r156;
        }

        if(c156 > c157 + r156){
            d156 = d157;
            c156 = c157 + r156;
        }

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

        if(c115 > c114 + r115){
            d115 = d114;
            c115 = c114 + r115;
        }

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

        if(c154 > c140 + r154){
            d154 = d140;
            c154 = c140 + r154;
        }

        if(c154 > c155 + r154){
            d154 = d155;
            c154 = c155 + r154;
        }

        if(c139 > c125 + r139){
            d139 = d125;
            c139 = c125 + r139;
        }

        if(c139 > c140 + r139){
            d139 = d140;
            c139 = c140 + r139;
        }

        if(c124 > c110 + r124){
            d124 = d110;
            c124 = c110 + r124;
        }

        if(c124 > c125 + r124){
            d124 = d125;
            c124 = c125 + r124;
        }

        if(c109 > c110 + r109){
            d109 = d110;
            c109 = c110 + r109;
        }

        if(c172 > c157 + r172){
            d172 = d157;
            c172 = c157 + r172;
        }

        if(c172 > c156 + r172){
            d172 = d156;
            c172 = c156 + r172;
        }

        if(c172 > c158 + r172){
            d172 = d158;
            c172 = c158 + r172;
        }

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

        if(c173 > c159 + r173){
            d173 = d159;
            c173 = c159 + r173;
        }

        if(c171 > c156 + r171){
            d171 = d156;
            c171 = c156 + r171;
        }

        if(c171 > c155 + r171){
            d171 = d155;
            c171 = c155 + r171;
        }

        if(c171 > c157 + r171){
            d171 = d157;
            c171 = c157 + r171;
        }

        if(c171 > c172 + r171){
            d171 = d172;
            c171 = c172 + r171;
        }

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

        if(c174 > c160 + r174){
            d174 = d160;
            c174 = c160 + r174;
        }

        if(c170 > c155 + r170){
            d170 = d155;
            c170 = c155 + r170;
        }

        if(c170 > c154 + r170){
            d170 = d154;
            c170 = c154 + r170;
        }

        if(c170 > c156 + r170){
            d170 = d156;
            c170 = c156 + r170;
        }

        if(c170 > c171 + r170){
            d170 = d171;
            c170 = c171 + r170;
        }

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

        if(c169 > c154 + r169){
            d169 = d154;
            c169 = c154 + r169;
        }

        if(c169 > c155 + r169){
            d169 = d155;
            c169 = c155 + r169;
        }

        if(c169 > c170 + r169){
            d169 = d170;
            c169 = c170 + r169;
        }

        if(c116 > c115 + r116){
            d116 = d115;
            c116 = c115 + r116;
        }

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

        if(c168 > c154 + r168){
            d168 = d154;
            c168 = c154 + r168;
        }

        if(c168 > c169 + r168){
            d168 = d169;
            c168 = c169 + r168;
        }

        if(c153 > c139 + r153){
            d153 = d139;
            c153 = c139 + r153;
        }

        if(c153 > c154 + r153){
            d153 = d154;
            c153 = c154 + r153;
        }

        if(c138 > c124 + r138){
            d138 = d124;
            c138 = c124 + r138;
        }

        if(c138 > c139 + r138){
            d138 = d139;
            c138 = c139 + r138;
        }

        if(c123 > c109 + r123){
            d123 = d109;
            c123 = c109 + r123;
        }

        if(c123 > c124 + r123){
            d123 = d124;
            c123 = c124 + r123;
        }

        if(c108 > c109 + r108){
            d108 = d109;
            c108 = c109 + r108;
        }

        if(c187 > c172 + r187){
            d187 = d172;
            c187 = c172 + r187;
        }

        if(c187 > c171 + r187){
            d187 = d171;
            c187 = c171 + r187;
        }

        if(c187 > c173 + r187){
            d187 = d173;
            c187 = c173 + r187;
        }

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

        if(c188 > c174 + r188){
            d188 = d174;
            c188 = c174 + r188;
        }

        if(c186 > c171 + r186){
            d186 = d171;
            c186 = c171 + r186;
        }

        if(c186 > c170 + r186){
            d186 = d170;
            c186 = c170 + r186;
        }

        if(c186 > c172 + r186){
            d186 = d172;
            c186 = c172 + r186;
        }

        if(c186 > c187 + r186){
            d186 = d187;
            c186 = c187 + r186;
        }

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

        if(c189 > c175 + r189){
            d189 = d175;
            c189 = c175 + r189;
        }

        if(c185 > c170 + r185){
            d185 = d170;
            c185 = c170 + r185;
        }

        if(c185 > c169 + r185){
            d185 = d169;
            c185 = c169 + r185;
        }

        if(c185 > c171 + r185){
            d185 = d171;
            c185 = c171 + r185;
        }

        if(c185 > c186 + r185){
            d185 = d186;
            c185 = c186 + r185;
        }

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

        if(c190 > c176 + r190){
            d190 = d176;
            c190 = c176 + r190;
        }

        if(c184 > c169 + r184){
            d184 = d169;
            c184 = c169 + r184;
        }

        if(c184 > c168 + r184){
            d184 = d168;
            c184 = c168 + r184;
        }

        if(c184 > c170 + r184){
            d184 = d170;
            c184 = c170 + r184;
        }

        if(c184 > c185 + r184){
            d184 = d185;
            c184 = c185 + r184;
        }

        if(c117 > c116 + r117){
            d117 = d116;
            c117 = c116 + r117;
        }

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

        if(c152 > c138 + r152){
            d152 = d138;
            c152 = c138 + r152;
        }

        if(c152 > c153 + r152){
            d152 = d153;
            c152 = c153 + r152;
        }

        if(c137 > c123 + r137){
            d137 = d123;
            c137 = c123 + r137;
        }

        if(c137 > c138 + r137){
            d137 = d138;
            c137 = c138 + r137;
        }

        if(c122 > c108 + r122){
            d122 = d108;
            c122 = c108 + r122;
        }

        if(c122 > c123 + r122){
            d122 = d123;
            c122 = c123 + r122;
        }

        if(c107 > c108 + r107){
            d107 = d108;
            c107 = c108 + r107;
        }

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;
        int dist107 = Math.max(Math.abs(cx+2)*49 + c107, Math.abs(cy - 7)*49+c107);
        if(dist107 < cmin){
            cmin= dist107;
            ans = d107;
        }

        int dist117 = Math.max(Math.abs(cx+12)*49 + c117, Math.abs(cy - 7)*49+c117);
        if(dist117 < cmin){
            cmin= dist117;
            ans = d117;
        }

        int dist122 = Math.max(Math.abs(cx+2)*49 + c122, Math.abs(cy - 8)*49+c122);
        if(dist122 < cmin){
            cmin= dist122;
            ans = d122;
        }

        int dist132 = Math.max(Math.abs(cx+12)*49 + c132, Math.abs(cy - 8)*49+c132);
        if(dist132 < cmin){
            cmin= dist132;
            ans = d132;
        }

        int dist137 = Math.max(Math.abs(cx+2)*49 + c137, Math.abs(cy - 9)*49+c137);
        if(dist137 < cmin){
            cmin= dist137;
            ans = d137;
        }

        int dist147 = Math.max(Math.abs(cx+12)*49 + c147, Math.abs(cy - 9)*49+c147);
        if(dist147 < cmin){
            cmin= dist147;
            ans = d147;
        }

        int dist152 = Math.max(Math.abs(cx+2)*49 + c152, Math.abs(cy - 10)*49+c152);
        if(dist152 < cmin){
            cmin= dist152;
            ans = d152;
        }

        int dist153 = Math.max(Math.abs(cx+3)*49 + c153, Math.abs(cy - 10)*49+c153);
        if(dist153 < cmin){
            cmin= dist153;
            ans = d153;
        }

        int dist161 = Math.max(Math.abs(cx+11)*49 + c161, Math.abs(cy - 10)*49+c161);
        if(dist161 < cmin){
            cmin= dist161;
            ans = d161;
        }

        int dist162 = Math.max(Math.abs(cx+12)*49 + c162, Math.abs(cy - 10)*49+c162);
        if(dist162 < cmin){
            cmin= dist162;
            ans = d162;
        }

        int dist168 = Math.max(Math.abs(cx+3)*49 + c168, Math.abs(cy - 11)*49+c168);
        if(dist168 < cmin){
            cmin= dist168;
            ans = d168;
        }

        int dist169 = Math.max(Math.abs(cx+4)*49 + c169, Math.abs(cy - 11)*49+c169);
        if(dist169 < cmin){
            cmin= dist169;
            ans = d169;
        }

        int dist175 = Math.max(Math.abs(cx+10)*49 + c175, Math.abs(cy - 11)*49+c175);
        if(dist175 < cmin){
            cmin= dist175;
            ans = d175;
        }

        int dist176 = Math.max(Math.abs(cx+11)*49 + c176, Math.abs(cy - 11)*49+c176);
        if(dist176 < cmin){
            cmin= dist176;
            ans = d176;
        }

        int dist184 = Math.max(Math.abs(cx+4)*49 + c184, Math.abs(cy - 12)*49+c184);
        if(dist184 < cmin){
            cmin= dist184;
            ans = d184;
        }

        int dist185 = Math.max(Math.abs(cx+5)*49 + c185, Math.abs(cy - 12)*49+c185);
        if(dist185 < cmin){
            cmin= dist185;
            ans = d185;
        }

        int dist186 = Math.max(Math.abs(cx+6)*49 + c186, Math.abs(cy - 12)*49+c186);
        if(dist186 < cmin){
            cmin= dist186;
            ans = d186;
        }

        int dist187 = Math.max(Math.abs(cx+7)*49 + c187, Math.abs(cy - 12)*49+c187);
        if(dist187 < cmin){
            cmin= dist187;
            ans = d187;
        }

        int dist188 = Math.max(Math.abs(cx+8)*49 + c188, Math.abs(cy - 12)*49+c188);
        if(dist188 < cmin){
            cmin= dist188;
            ans = d188;
        }

        int dist189 = Math.max(Math.abs(cx+9)*49 + c189, Math.abs(cy - 12)*49+c189);
        if(dist189 < cmin){
            cmin= dist189;
            ans = d189;
        }

        int dist190 = Math.max(Math.abs(cx+10)*49 + c190, Math.abs(cy - 12)*49+c190);
        if(dist190 < cmin){
            cmin= dist190;
            ans = d190;
        }

        if(cmin<=nomove) return ans;

        int dist108 = Math.max(Math.abs(cx+3)*49 + c108, Math.abs(cy - 7)*49+c108);
        if(dist108 < cmin){
            cmin= dist108;
            ans = d108;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*49+c116);
        if(dist116 < cmin){
            cmin= dist116;
            ans = d116;
        }

        int dist123 = Math.max(Math.abs(cx+3)*49 + c123, Math.abs(cy - 8)*49+c123);
        if(dist123 < cmin){
            cmin= dist123;
            ans = d123;
        }

        int dist131 = Math.max(Math.abs(cx+11)*49 + c131, Math.abs(cy - 8)*49+c131);
        if(dist131 < cmin){
            cmin= dist131;
            ans = d131;
        }

        int dist138 = Math.max(Math.abs(cx+3)*49 + c138, Math.abs(cy - 9)*49+c138);
        if(dist138 < cmin){
            cmin= dist138;
            ans = d138;
        }

        int dist139 = Math.max(Math.abs(cx+4)*49 + c139, Math.abs(cy - 9)*49+c139);
        if(dist139 < cmin){
            cmin= dist139;
            ans = d139;
        }

        int dist145 = Math.max(Math.abs(cx+10)*49 + c145, Math.abs(cy - 9)*49+c145);
        if(dist145 < cmin){
            cmin= dist145;
            ans = d145;
        }

        int dist146 = Math.max(Math.abs(cx+11)*49 + c146, Math.abs(cy - 9)*49+c146);
        if(dist146 < cmin){
            cmin= dist146;
            ans = d146;
        }

        int dist154 = Math.max(Math.abs(cx+4)*49 + c154, Math.abs(cy - 10)*49+c154);
        if(dist154 < cmin){
            cmin= dist154;
            ans = d154;
        }

        int dist155 = Math.max(Math.abs(cx+5)*49 + c155, Math.abs(cy - 10)*49+c155);
        if(dist155 < cmin){
            cmin= dist155;
            ans = d155;
        }

        int dist159 = Math.max(Math.abs(cx+9)*49 + c159, Math.abs(cy - 10)*49+c159);
        if(dist159 < cmin){
            cmin= dist159;
            ans = d159;
        }

        int dist160 = Math.max(Math.abs(cx+10)*49 + c160, Math.abs(cy - 10)*49+c160);
        if(dist160 < cmin){
            cmin= dist160;
            ans = d160;
        }

        int dist170 = Math.max(Math.abs(cx+5)*49 + c170, Math.abs(cy - 11)*49+c170);
        if(dist170 < cmin){
            cmin= dist170;
            ans = d170;
        }

        int dist171 = Math.max(Math.abs(cx+6)*49 + c171, Math.abs(cy - 11)*49+c171);
        if(dist171 < cmin){
            cmin= dist171;
            ans = d171;
        }

        int dist172 = Math.max(Math.abs(cx+7)*49 + c172, Math.abs(cy - 11)*49+c172);
        if(dist172 < cmin){
            cmin= dist172;
            ans = d172;
        }

        int dist173 = Math.max(Math.abs(cx+8)*49 + c173, Math.abs(cy - 11)*49+c173);
        if(dist173 < cmin){
            cmin= dist173;
            ans = d173;
        }

        int dist174 = Math.max(Math.abs(cx+9)*49 + c174, Math.abs(cy - 11)*49+c174);
        if(dist174 < cmin){
            cmin= dist174;
            ans = d174;
        }

        if(cmin<=nomove) return ans;

        int dist109 = Math.max(Math.abs(cx+4)*49 + c109, Math.abs(cy - 7)*49+c109);
        if(dist109 < cmin){
            cmin= dist109;
            ans = d109;
        }

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*49+c115);
        if(dist115 < cmin){
            cmin= dist115;
            ans = d115;
        }

        int dist124 = Math.max(Math.abs(cx+4)*49 + c124, Math.abs(cy - 8)*49+c124);
        if(dist124 < cmin){
            cmin= dist124;
            ans = d124;
        }

        int dist125 = Math.max(Math.abs(cx+5)*49 + c125, Math.abs(cy - 8)*49+c125);
        if(dist125 < cmin){
            cmin= dist125;
            ans = d125;
        }

        int dist129 = Math.max(Math.abs(cx+9)*49 + c129, Math.abs(cy - 8)*49+c129);
        if(dist129 < cmin){
            cmin= dist129;
            ans = d129;
        }

        int dist130 = Math.max(Math.abs(cx+10)*49 + c130, Math.abs(cy - 8)*49+c130);
        if(dist130 < cmin){
            cmin= dist130;
            ans = d130;
        }

        int dist140 = Math.max(Math.abs(cx+5)*49 + c140, Math.abs(cy - 9)*49+c140);
        if(dist140 < cmin){
            cmin= dist140;
            ans = d140;
        }

        int dist141 = Math.max(Math.abs(cx+6)*49 + c141, Math.abs(cy - 9)*49+c141);
        if(dist141 < cmin){
            cmin= dist141;
            ans = d141;
        }

        int dist143 = Math.max(Math.abs(cx+8)*49 + c143, Math.abs(cy - 9)*49+c143);
        if(dist143 < cmin){
            cmin= dist143;
            ans = d143;
        }

        int dist144 = Math.max(Math.abs(cx+9)*49 + c144, Math.abs(cy - 9)*49+c144);
        if(dist144 < cmin){
            cmin= dist144;
            ans = d144;
        }

        int dist156 = Math.max(Math.abs(cx+6)*49 + c156, Math.abs(cy - 10)*49+c156);
        if(dist156 < cmin){
            cmin= dist156;
            ans = d156;
        }

        int dist157 = Math.max(Math.abs(cx+7)*49 + c157, Math.abs(cy - 10)*49+c157);
        if(dist157 < cmin){
            cmin= dist157;
            ans = d157;
        }

        int dist158 = Math.max(Math.abs(cx+8)*49 + c158, Math.abs(cy - 10)*49+c158);
        if(dist158 < cmin){
            cmin= dist158;
            ans = d158;
        }

        if(cmin<=nomove) return ans;

        int dist110 = Math.max(Math.abs(cx+5)*49 + c110, Math.abs(cy - 7)*49+c110);
        if(dist110 < cmin){
            cmin= dist110;
            ans = d110;
        }

        int dist111 = Math.max(Math.abs(cx+6)*49 + c111, Math.abs(cy - 7)*49+c111);
        if(dist111 < cmin){
            cmin= dist111;
            ans = d111;
        }

        int dist113 = Math.max(Math.abs(cx+8)*49 + c113, Math.abs(cy - 7)*49+c113);
        if(dist113 < cmin){
            cmin= dist113;
            ans = d113;
        }

        int dist114 = Math.max(Math.abs(cx+9)*49 + c114, Math.abs(cy - 7)*49+c114);
        if(dist114 < cmin){
            cmin= dist114;
            ans = d114;
        }

        int dist126 = Math.max(Math.abs(cx+6)*49 + c126, Math.abs(cy - 8)*49+c126);
        if(dist126 < cmin){
            cmin= dist126;
            ans = d126;
        }

        int dist127 = Math.max(Math.abs(cx+7)*49 + c127, Math.abs(cy - 8)*49+c127);
        if(dist127 < cmin){
            cmin= dist127;
            ans = d127;
        }

        int dist128 = Math.max(Math.abs(cx+8)*49 + c128, Math.abs(cy - 8)*49+c128);
        if(dist128 < cmin){
            cmin= dist128;
            ans = d128;
        }

        int dist142 = Math.max(Math.abs(cx+7)*49 + c142, Math.abs(cy - 9)*49+c142);
        if(dist142 < cmin){
            cmin= dist142;
            ans = d142;
        }

        return ans;
    }
    static Direction BFSNorthEast(MapLocation target, Direction prev) throws GameActionException{
        if(c97 > c112 + r97 && prev != Direction.NORTH){
            d97 = Direction.NORTH;
            c97 = c112 + r97;
        }

        if(c113 > c112 + r113 && prev != Direction.EAST){
            d113 = Direction.EAST;
            c113 = c112 + r113;
        }

        if(c113 > c97 + r113){
            d113 = d97;
            c113 = c97 + r113;
        }

        if(c128 > c112 + r128 && prev != Direction.SOUTHEAST){
            d128 = Direction.SOUTHEAST;
            c128 = c112 + r128;
        }

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

        if(c96 > c112 + r96 && prev != Direction.NORTHWEST){
            d96 = Direction.NORTHWEST;
            c96 = c112 + r96;
        }

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

        if(c81 > c96 + r81){
            d81 = d96;
            c81 = c96 + r81;
        }

        if(c81 > c97 + r81){
            d81 = d97;
            c81 = c97 + r81;
        }

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

        if(c129 > c128 + r129){
            d129 = d128;
            c129 = c128 + r129;
        }

        if(c129 > c113 + r129){
            d129 = d113;
            c129 = c113 + r129;
        }

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

        if(c144 > c128 + r144){
            d144 = d128;
            c144 = c128 + r144;
        }

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

        if(c80 > c96 + r80){
            d80 = d96;
            c80 = c96 + r80;
        }

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

        if(c65 > c80 + r65){
            d65 = d80;
            c65 = c80 + r65;
        }

        if(c65 > c81 + r65){
            d65 = d81;
            c65 = c81 + r65;
        }

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

        if(c145 > c144 + r145){
            d145 = d144;
            c145 = c144 + r145;
        }

        if(c145 > c129 + r145){
            d145 = d129;
            c145 = c129 + r145;
        }

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

        if(c160 > c144 + r160){
            d160 = d144;
            c160 = c144 + r160;
        }

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

        if(c64 > c80 + r64){
            d64 = d80;
            c64 = c80 + r64;
        }

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

        if(c49 > c64 + r49){
            d49 = d64;
            c49 = c64 + r49;
        }

        if(c49 > c65 + r49){
            d49 = d65;
            c49 = c65 + r49;
        }

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

        if(c161 > c160 + r161){
            d161 = d160;
            c161 = c160 + r161;
        }

        if(c161 > c145 + r161){
            d161 = d145;
            c161 = c145 + r161;
        }

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

        if(c176 > c160 + r176){
            d176 = d160;
            c176 = c160 + r176;
        }

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

        if(c48 > c64 + r48){
            d48 = d64;
            c48 = c64 + r48;
        }

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


        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;

        int dist34 = Math.max(Math.abs(cx+4)*49 + c34, Math.abs(cy - 2)*49+c34);
        if(dist34 < cmin){
            cmin= dist34;
            ans = d34;
        }

        int dist35 = Math.max(Math.abs(cx+5)*49 + c35, Math.abs(cy - 2)*49+c35);
        if(dist35 < cmin){
            cmin= dist35;
            ans = d35;
        }

        int dist36 = Math.max(Math.abs(cx+6)*49 + c36, Math.abs(cy - 2)*49+c36);
        if(dist36 < cmin){
            cmin= dist36;
            ans = d36;
        }

        int dist37 = Math.max(Math.abs(cx+7)*49 + c37, Math.abs(cy - 2)*49+c37);
        if(dist37 < cmin){
            cmin= dist37;
            ans = d37;
        }

        int dist38 = Math.max(Math.abs(cx+8)*49 + c38, Math.abs(cy - 2)*49+c38);
        if(dist38 < cmin){
            cmin= dist38;
            ans = d38;
        }

        int dist39 = Math.max(Math.abs(cx+9)*49 + c39, Math.abs(cy - 2)*49+c39);
        if(dist39 < cmin){
            cmin= dist39;
            ans = d39;
        }

        int dist40 = Math.max(Math.abs(cx+10)*49 + c40, Math.abs(cy - 2)*49+c40);
        if(dist40 < cmin){
            cmin= dist40;
            ans = d40;
        }

        int dist48 = Math.max(Math.abs(cx+3)*49 + c48, Math.abs(cy - 3)*49+c48);
        if(dist48 < cmin){
            cmin= dist48;
            ans = d48;
        }

        int dist49 = Math.max(Math.abs(cx+4)*49 + c49, Math.abs(cy - 3)*49+c49);
        if(dist49 < cmin){
            cmin= dist49;
            ans = d49;
        }

        int dist55 = Math.max(Math.abs(cx+10)*49 + c55, Math.abs(cy - 3)*49+c55);
        if(dist55 < cmin){
            cmin= dist55;
            ans = d55;
        }

        int dist56 = Math.max(Math.abs(cx+11)*49 + c56, Math.abs(cy - 3)*49+c56);
        if(dist56 < cmin){
            cmin= dist56;
            ans = d56;
        }

        int dist71 = Math.max(Math.abs(cx+11)*49 + c71, Math.abs(cy - 4)*49+c71);
        if(dist71 < cmin){
            cmin= dist71;
            ans = d71;
        }

        int dist72 = Math.max(Math.abs(cx+12)*49 + c72, Math.abs(cy - 4)*49+c72);
        if(dist72 < cmin){
            cmin= dist72;
            ans = d72;
        }

        int dist87 = Math.max(Math.abs(cx+12)*49 + c87, Math.abs(cy - 5)*49+c87);
        if(dist87 < cmin){
            cmin= dist87;
            ans = d87;
        }

        int dist102 = Math.max(Math.abs(cx+12)*49 + c102, Math.abs(cy - 6)*49+c102);
        if(dist102 < cmin){
            cmin= dist102;
            ans = d102;
        }

        int dist117 = Math.max(Math.abs(cx+12)*49 + c117, Math.abs(cy - 7)*49+c117);
        if(dist117 < cmin){
            cmin= dist117;
            ans = d117;
        }

        int dist132 = Math.max(Math.abs(cx+12)*49 + c132, Math.abs(cy - 8)*49+c132);
        if(dist132 < cmin){
            cmin= dist132;
            ans = d132;
        }

        int dist147 = Math.max(Math.abs(cx+12)*49 + c147, Math.abs(cy - 9)*49+c147);
        if(dist147 < cmin){
            cmin= dist147;
            ans = d147;
        }

        int dist161 = Math.max(Math.abs(cx+11)*49 + c161, Math.abs(cy - 10)*49+c161);
        if(dist161 < cmin){
            cmin= dist161;
            ans = d161;
        }

        int dist162 = Math.max(Math.abs(cx+12)*49 + c162, Math.abs(cy - 10)*49+c162);
        if(dist162 < cmin){
            cmin= dist162;
            ans = d162;
        }

        int dist176 = Math.max(Math.abs(cx+11)*49 + c176, Math.abs(cy - 11)*49+c176);
        if(dist176 < cmin){
            cmin= dist176;
            ans = d176;
        }

        if(cmin<=nomove) return ans;

        int dist50 = Math.max(Math.abs(cx+5)*49 + c50, Math.abs(cy - 3)*49+c50);
        if(dist50 < cmin){
            cmin= dist50;
            ans = d50;
        }

        int dist51 = Math.max(Math.abs(cx+6)*49 + c51, Math.abs(cy - 3)*49+c51);
        if(dist51 < cmin){
            cmin= dist51;
            ans = d51;
        }

        int dist52 = Math.max(Math.abs(cx+7)*49 + c52, Math.abs(cy - 3)*49+c52);
        if(dist52 < cmin){
            cmin= dist52;
            ans = d52;
        }

        int dist53 = Math.max(Math.abs(cx+8)*49 + c53, Math.abs(cy - 3)*49+c53);
        if(dist53 < cmin){
            cmin= dist53;
            ans = d53;
        }

        int dist54 = Math.max(Math.abs(cx+9)*49 + c54, Math.abs(cy - 3)*49+c54);
        if(dist54 < cmin){
            cmin= dist54;
            ans = d54;
        }

        int dist64 = Math.max(Math.abs(cx+4)*49 + c64, Math.abs(cy - 4)*49+c64);
        if(dist64 < cmin){
            cmin= dist64;
            ans = d64;
        }

        int dist65 = Math.max(Math.abs(cx+5)*49 + c65, Math.abs(cy - 4)*49+c65);
        if(dist65 < cmin){
            cmin= dist65;
            ans = d65;
        }

        int dist69 = Math.max(Math.abs(cx+9)*49 + c69, Math.abs(cy - 4)*49+c69);
        if(dist69 < cmin){
            cmin= dist69;
            ans = d69;
        }

        int dist70 = Math.max(Math.abs(cx+10)*49 + c70, Math.abs(cy - 4)*49+c70);
        if(dist70 < cmin){
            cmin= dist70;
            ans = d70;
        }

        int dist85 = Math.max(Math.abs(cx+10)*49 + c85, Math.abs(cy - 5)*49+c85);
        if(dist85 < cmin){
            cmin= dist85;
            ans = d85;
        }

        int dist86 = Math.max(Math.abs(cx+11)*49 + c86, Math.abs(cy - 5)*49+c86);
        if(dist86 < cmin){
            cmin= dist86;
            ans = d86;
        }

        int dist101 = Math.max(Math.abs(cx+11)*49 + c101, Math.abs(cy - 6)*49+c101);
        if(dist101 < cmin){
            cmin= dist101;
            ans = d101;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*49+c116);
        if(dist116 < cmin){
            cmin= dist116;
            ans = d116;
        }

        int dist131 = Math.max(Math.abs(cx+11)*49 + c131, Math.abs(cy - 8)*49+c131);
        if(dist131 < cmin){
            cmin= dist131;
            ans = d131;
        }

        int dist145 = Math.max(Math.abs(cx+10)*49 + c145, Math.abs(cy - 9)*49+c145);
        if(dist145 < cmin){
            cmin= dist145;
            ans = d145;
        }

        int dist146 = Math.max(Math.abs(cx+11)*49 + c146, Math.abs(cy - 9)*49+c146);
        if(dist146 < cmin){
            cmin= dist146;
            ans = d146;
        }

        int dist160 = Math.max(Math.abs(cx+10)*49 + c160, Math.abs(cy - 10)*49+c160);
        if(dist160 < cmin){
            cmin= dist160;
            ans = d160;
        }

        if(cmin<=nomove) return ans;

        int dist66 = Math.max(Math.abs(cx+6)*49 + c66, Math.abs(cy - 4)*49+c66);
        if(dist66 < cmin){
            cmin= dist66;
            ans = d66;
        }

        int dist67 = Math.max(Math.abs(cx+7)*49 + c67, Math.abs(cy - 4)*49+c67);
        if(dist67 < cmin){
            cmin= dist67;
            ans = d67;
        }

        int dist68 = Math.max(Math.abs(cx+8)*49 + c68, Math.abs(cy - 4)*49+c68);
        if(dist68 < cmin){
            cmin= dist68;
            ans = d68;
        }

        int dist80 = Math.max(Math.abs(cx+5)*49 + c80, Math.abs(cy - 5)*49+c80);
        if(dist80 < cmin){
            cmin= dist80;
            ans = d80;
        }

        int dist81 = Math.max(Math.abs(cx+6)*49 + c81, Math.abs(cy - 5)*49+c81);
        if(dist81 < cmin){
            cmin= dist81;
            ans = d81;
        }

        int dist83 = Math.max(Math.abs(cx+8)*49 + c83, Math.abs(cy - 5)*49+c83);
        if(dist83 < cmin){
            cmin= dist83;
            ans = d83;
        }

        int dist84 = Math.max(Math.abs(cx+9)*49 + c84, Math.abs(cy - 5)*49+c84);
        if(dist84 < cmin){
            cmin= dist84;
            ans = d84;
        }

        int dist99 = Math.max(Math.abs(cx+9)*49 + c99, Math.abs(cy - 6)*49+c99);
        if(dist99 < cmin){
            cmin= dist99;
            ans = d99;
        }

        int dist100 = Math.max(Math.abs(cx+10)*49 + c100, Math.abs(cy - 6)*49+c100);
        if(dist100 < cmin){
            cmin= dist100;
            ans = d100;
        }

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*49+c115);
        if(dist115 < cmin){
            cmin= dist115;
            ans = d115;
        }

        int dist129 = Math.max(Math.abs(cx+9)*49 + c129, Math.abs(cy - 8)*49+c129);
        if(dist129 < cmin){
            cmin= dist129;
            ans = d129;
        }

        int dist130 = Math.max(Math.abs(cx+10)*49 + c130, Math.abs(cy - 8)*49+c130);
        if(dist130 < cmin){
            cmin= dist130;
            ans = d130;
        }

        int dist144 = Math.max(Math.abs(cx+9)*49 + c144, Math.abs(cy - 9)*49+c144);
        if(dist144 < cmin){
            cmin= dist144;
            ans = d144;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*49+c82);
        if(dist82 < cmin){
            cmin= dist82;
            ans = d82;
        }

        int dist96 = Math.max(Math.abs(cx+6)*49 + c96, Math.abs(cy - 6)*49+c96);
        if(dist96 < cmin){
            cmin= dist96;
            ans = d96;
        }

        int dist97 = Math.max(Math.abs(cx+7)*49 + c97, Math.abs(cy - 6)*49+c97);
        if(dist97 < cmin){
            cmin= dist97;
            ans = d97;
        }

        int dist98 = Math.max(Math.abs(cx+8)*49 + c98, Math.abs(cy - 6)*49+c98);
        if(dist98 < cmin){
            cmin= dist98;
            ans = d98;
        }

        int dist113 = Math.max(Math.abs(cx+8)*49 + c113, Math.abs(cy - 7)*49+c113);
        if(dist113 < cmin){
            cmin= dist113;
            ans = d113;
        }

        int dist114 = Math.max(Math.abs(cx+9)*49 + c114, Math.abs(cy - 7)*49+c114);
        if(dist114 < cmin){
            cmin= dist114;
            ans = d114;
        }

        int dist128 = Math.max(Math.abs(cx+8)*49 + c128, Math.abs(cy - 8)*49+c128);
        if(dist128 < cmin){
            cmin= dist128;
            ans = d128;
        }
        return ans;
    }
    static Direction BFSNorthWest(MapLocation target, Direction prev) throws GameActionException{
        if(c97 > c112 + r97 && prev != Direction.NORTH){
            d97 = Direction.NORTH;
            c97 = c112 + r97;
        }

        if(c98 > c112 + r98 && prev != Direction.NORTHEAST){
            d98 = Direction.NORTHEAST;
            c98 = c112 + r98;
        }

        if(c126 > c112 + r126 && prev != Direction.SOUTHWEST){
            d126 = Direction.SOUTHWEST;
            c126 = c112 + r126;
        }

        if(c96 > c112 + r96 && prev != Direction.NORTHWEST){
            d96 = Direction.NORTHWEST;
            c96 = c112 + r96;
        }

        if(c96 > c97 + r96){
            d96 = d97;
            c96 = c97 + r96;
        }

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

        if(c83 > c98 + r83){
            d83 = d98;
            c83 = c98 + r83;
        }

        if(c83 > c97 + r83){
            d83 = d97;
            c83 = c97 + r83;
        }

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

        if(c84 > c98 + r84){
            d84 = d98;
            c84 = c98 + r84;
        }

        if(c140 > c126 + r140){
            d140 = d126;
            c140 = c126 + r140;
        }

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

        if(c80 > c96 + r80){
            d80 = d96;
            c80 = c96 + r80;
        }

        if(c80 > c81 + r80){
            d80 = d81;
            c80 = c81 + r80;
        }

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

        if(c69 > c84 + r69){
            d69 = d84;
            c69 = c84 + r69;
        }

        if(c69 > c83 + r69){
            d69 = d83;
            c69 = c83 + r69;
        }

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

        if(c70 > c84 + r70){
            d70 = d84;
            c70 = c84 + r70;
        }

        if(c154 > c140 + r154){
            d154 = d140;
            c154 = c140 + r154;
        }

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

        if(c64 > c80 + r64){
            d64 = d80;
            c64 = c80 + r64;
        }

        if(c64 > c65 + r64){
            d64 = d65;
            c64 = c65 + r64;
        }

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

        if(c55 > c70 + r55){
            d55 = d70;
            c55 = c70 + r55;
        }

        if(c55 > c69 + r55){
            d55 = d69;
            c55 = c69 + r55;
        }

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

        if(c56 > c70 + r56){
            d56 = d70;
            c56 = c70 + r56;
        }

        if(c168 > c154 + r168){
            d168 = d154;
            c168 = c154 + r168;
        }

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

        if(c153 > c168 + r153){
            d153 = d168;
            c153 = c168 + r153;
        }

        if(c153 > c139 + r153){
            d153 = d139;
            c153 = c139 + r153;
        }

        if(c153 > c154 + r153){
            d153 = d154;
            c153 = c154 + r153;
        }

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

        if(c48 > c64 + r48){
            d48 = d64;
            c48 = c64 + r48;
        }

        if(c48 > c49 + r48){
            d48 = d49;
            c48 = c49 + r48;
        }

        if(c63 > c78 + r63){
            d63 = d78;
            c63 = c78 + r63;
        }

        if(c63 > c49 + r63){
            d63 = d49;
            c63 = c49 + r63;
        }

        if(c63 > c79 + r63){
            d63 = d79;
            c63 = c79 + r63;
        }

        if(c63 > c64 + r63){
            d63 = d64;
            c63 = c64 + r63;
        }

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

        if(c38 > c53 + r38){
            d38 = d53;
            c38 = c53 + r38;
        }

        if(c38 > c52 + r38){
            d38 = d52;
            c38 = c52 + r38;
        }

        if(c38 > c54 + r38){
            d38 = d54;
            c38 = c54 + r38;
        }

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

        if(c39 > c54 + r39){
            d39 = d54;
            c39 = c54 + r39;
        }

        if(c39 > c53 + r39){
            d39 = d53;
            c39 = c53 + r39;
        }

        if(c39 > c55 + r39){
            d39 = d55;
            c39 = c55 + r39;
        }

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

        if(c40 > c55 + r40){
            d40 = d55;
            c40 = c55 + r40;
        }

        if(c40 > c54 + r40){
            d40 = d54;
            c40 = c54 + r40;
        }

        if(c40 > c56 + r40){
            d40 = d56;
            c40 = c56 + r40;
        }

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

        if(c152 > c138 + r152){
            d152 = d138;
            c152 = c138 + r152;
        }

        if(c152 > c168 + r152){
            d152 = d168;
            c152 = c168 + r152;
        }

        if(c152 > c153 + r152){
            d152 = d153;
            c152 = c153 + r152;
        }

        if(c122 > c108 + r122){
            d122 = d108;
            c122 = c108 + r122;
        }

        if(c122 > c138 + r122){
            d122 = d138;
            c122 = c138 + r122;
        }

        if(c122 > c123 + r122){
            d122 = d123;
            c122 = c123 + r122;
        }

        if(c137 > c152 + r137){
            d137 = d152;
            c137 = c152 + r137;
        }

        if(c137 > c123 + r137){
            d137 = d123;
            c137 = c123 + r137;
        }

        if(c137 > c153 + r137){
            d137 = d153;
            c137 = c153 + r137;
        }

        if(c137 > c138 + r137){
            d137 = d138;
            c137 = c138 + r137;
        }

        if(c92 > c78 + r92){
            d92 = d78;
            c92 = c78 + r92;
        }

        if(c92 > c108 + r92){
            d92 = d108;
            c92 = c108 + r92;
        }

        if(c92 > c93 + r92){
            d92 = d93;
            c92 = c93 + r92;
        }

        if(c107 > c122 + r107){
            d107 = d122;
            c107 = c122 + r107;
        }

        if(c107 > c93 + r107){
            d107 = d93;
            c107 = c93 + r107;
        }

        if(c107 > c123 + r107){
            d107 = d123;
            c107 = c123 + r107;
        }

        if(c107 > c108 + r107){
            d107 = d108;
            c107 = c108 + r107;
        }

        if(c62 > c48 + r62){
            d62 = d48;
            c62 = c48 + r62;
        }

        if(c62 > c78 + r62){
            d62 = d78;
            c62 = c78 + r62;
        }

        if(c62 > c63 + r62){
            d62 = d63;
            c62 = c63 + r62;
        }

        if(c77 > c92 + r77){
            d77 = d92;
            c77 = c92 + r77;
        }

        if(c77 > c63 + r77){
            d77 = d63;
            c77 = c63 + r77;
        }

        if(c77 > c93 + r77){
            d77 = d93;
            c77 = c93 + r77;
        }

        if(c77 > c78 + r77){
            d77 = d78;
            c77 = c78 + r77;
        }

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;
        int dist34 = Math.max(Math.abs(cx+4)*49 + c34, Math.abs(cy - 2)*49+c34);
        if(dist34 < cmin){
            cmin= dist34;
            ans = d34;
        }

        int dist35 = Math.max(Math.abs(cx+5)*49 + c35, Math.abs(cy - 2)*49+c35);
        if(dist35 < cmin){
            cmin= dist35;
            ans = d35;
        }

        int dist36 = Math.max(Math.abs(cx+6)*49 + c36, Math.abs(cy - 2)*49+c36);
        if(dist36 < cmin){
            cmin= dist36;
            ans = d36;
        }

        int dist37 = Math.max(Math.abs(cx+7)*49 + c37, Math.abs(cy - 2)*49+c37);
        if(dist37 < cmin){
            cmin= dist37;
            ans = d37;
        }

        int dist38 = Math.max(Math.abs(cx+8)*49 + c38, Math.abs(cy - 2)*49+c38);
        if(dist38 < cmin){
            cmin= dist38;
            ans = d38;
        }

        int dist39 = Math.max(Math.abs(cx+9)*49 + c39, Math.abs(cy - 2)*49+c39);
        if(dist39 < cmin){
            cmin= dist39;
            ans = d39;
        }

        int dist40 = Math.max(Math.abs(cx+10)*49 + c40, Math.abs(cy - 2)*49+c40);
        if(dist40 < cmin){
            cmin= dist40;
            ans = d40;
        }

        int dist48 = Math.max(Math.abs(cx+3)*49 + c48, Math.abs(cy - 3)*49+c48);
        if(dist48 < cmin){
            cmin= dist48;
            ans = d48;
        }

        int dist49 = Math.max(Math.abs(cx+4)*49 + c49, Math.abs(cy - 3)*49+c49);
        if(dist49 < cmin){
            cmin= dist49;
            ans = d49;
        }

        int dist55 = Math.max(Math.abs(cx+10)*49 + c55, Math.abs(cy - 3)*49+c55);
        if(dist55 < cmin){
            cmin= dist55;
            ans = d55;
        }

        int dist56 = Math.max(Math.abs(cx+11)*49 + c56, Math.abs(cy - 3)*49+c56);
        if(dist56 < cmin){
            cmin= dist56;
            ans = d56;
        }

        int dist62 = Math.max(Math.abs(cx+2)*49 + c62, Math.abs(cy - 4)*49+c62);
        if(dist62 < cmin){
            cmin= dist62;
            ans = d62;
        }

        int dist63 = Math.max(Math.abs(cx+3)*49 + c63, Math.abs(cy - 4)*49+c63);
        if(dist63 < cmin){
            cmin= dist63;
            ans = d63;
        }

        int dist77 = Math.max(Math.abs(cx+2)*49 + c77, Math.abs(cy - 5)*49+c77);
        if(dist77 < cmin){
            cmin= dist77;
            ans = d77;
        }

        int dist92 = Math.max(Math.abs(cx+2)*49 + c92, Math.abs(cy - 6)*49+c92);
        if(dist92 < cmin){
            cmin= dist92;
            ans = d92;
        }

        int dist107 = Math.max(Math.abs(cx+2)*49 + c107, Math.abs(cy - 7)*49+c107);
        if(dist107 < cmin){
            cmin= dist107;
            ans = d107;
        }

        int dist122 = Math.max(Math.abs(cx+2)*49 + c122, Math.abs(cy - 8)*49+c122);
        if(dist122 < cmin){
            cmin= dist122;
            ans = d122;
        }

        int dist137 = Math.max(Math.abs(cx+2)*49 + c137, Math.abs(cy - 9)*49+c137);
        if(dist137 < cmin){
            cmin= dist137;
            ans = d137;
        }

        int dist152 = Math.max(Math.abs(cx+2)*49 + c152, Math.abs(cy - 10)*49+c152);
        if(dist152 < cmin){
            cmin= dist152;
            ans = d152;
        }

        int dist153 = Math.max(Math.abs(cx+3)*49 + c153, Math.abs(cy - 10)*49+c153);
        if(dist153 < cmin){
            cmin= dist153;
            ans = d153;
        }

        int dist168 = Math.max(Math.abs(cx+3)*49 + c168, Math.abs(cy - 11)*49+c168);
        if(dist168 < cmin){
            cmin= dist168;
            ans = d168;
        }

        if(cmin<=nomove) return ans;

        int dist50 = Math.max(Math.abs(cx+5)*49 + c50, Math.abs(cy - 3)*49+c50);
        if(dist50 < cmin){
            cmin= dist50;
            ans = d50;
        }

        int dist51 = Math.max(Math.abs(cx+6)*49 + c51, Math.abs(cy - 3)*49+c51);
        if(dist51 < cmin){
            cmin= dist51;
            ans = d51;
        }

        int dist52 = Math.max(Math.abs(cx+7)*49 + c52, Math.abs(cy - 3)*49+c52);
        if(dist52 < cmin){
            cmin= dist52;
            ans = d52;
        }

        int dist53 = Math.max(Math.abs(cx+8)*49 + c53, Math.abs(cy - 3)*49+c53);
        if(dist53 < cmin){
            cmin= dist53;
            ans = d53;
        }

        int dist54 = Math.max(Math.abs(cx+9)*49 + c54, Math.abs(cy - 3)*49+c54);
        if(dist54 < cmin){
            cmin= dist54;
            ans = d54;
        }

        int dist64 = Math.max(Math.abs(cx+4)*49 + c64, Math.abs(cy - 4)*49+c64);
        if(dist64 < cmin){
            cmin= dist64;
            ans = d64;
        }

        int dist65 = Math.max(Math.abs(cx+5)*49 + c65, Math.abs(cy - 4)*49+c65);
        if(dist65 < cmin){
            cmin= dist65;
            ans = d65;
        }

        int dist69 = Math.max(Math.abs(cx+9)*49 + c69, Math.abs(cy - 4)*49+c69);
        if(dist69 < cmin){
            cmin= dist69;
            ans = d69;
        }

        int dist70 = Math.max(Math.abs(cx+10)*49 + c70, Math.abs(cy - 4)*49+c70);
        if(dist70 < cmin){
            cmin= dist70;
            ans = d70;
        }

        int dist78 = Math.max(Math.abs(cx+3)*49 + c78, Math.abs(cy - 5)*49+c78);
        if(dist78 < cmin){
            cmin= dist78;
            ans = d78;
        }

        int dist79 = Math.max(Math.abs(cx+4)*49 + c79, Math.abs(cy - 5)*49+c79);
        if(dist79 < cmin){
            cmin= dist79;
            ans = d79;
        }

        int dist93 = Math.max(Math.abs(cx+3)*49 + c93, Math.abs(cy - 6)*49+c93);
        if(dist93 < cmin){
            cmin= dist93;
            ans = d93;
        }

        int dist108 = Math.max(Math.abs(cx+3)*49 + c108, Math.abs(cy - 7)*49+c108);
        if(dist108 < cmin){
            cmin= dist108;
            ans = d108;
        }

        int dist123 = Math.max(Math.abs(cx+3)*49 + c123, Math.abs(cy - 8)*49+c123);
        if(dist123 < cmin){
            cmin= dist123;
            ans = d123;
        }

        int dist138 = Math.max(Math.abs(cx+3)*49 + c138, Math.abs(cy - 9)*49+c138);
        if(dist138 < cmin){
            cmin= dist138;
            ans = d138;
        }

        int dist139 = Math.max(Math.abs(cx+4)*49 + c139, Math.abs(cy - 9)*49+c139);
        if(dist139 < cmin){
            cmin= dist139;
            ans = d139;
        }

        int dist154 = Math.max(Math.abs(cx+4)*49 + c154, Math.abs(cy - 10)*49+c154);
        if(dist154 < cmin){
            cmin= dist154;
            ans = d154;
        }

        if(cmin<=nomove) return ans;

        int dist66 = Math.max(Math.abs(cx+6)*49 + c66, Math.abs(cy - 4)*49+c66);
        if(dist66 < cmin){
            cmin= dist66;
            ans = d66;
        }

        int dist67 = Math.max(Math.abs(cx+7)*49 + c67, Math.abs(cy - 4)*49+c67);
        if(dist67 < cmin){
            cmin= dist67;
            ans = d67;
        }

        int dist68 = Math.max(Math.abs(cx+8)*49 + c68, Math.abs(cy - 4)*49+c68);
        if(dist68 < cmin){
            cmin= dist68;
            ans = d68;
        }

        int dist80 = Math.max(Math.abs(cx+5)*49 + c80, Math.abs(cy - 5)*49+c80);
        if(dist80 < cmin){
            cmin= dist80;
            ans = d80;
        }

        int dist81 = Math.max(Math.abs(cx+6)*49 + c81, Math.abs(cy - 5)*49+c81);
        if(dist81 < cmin){
            cmin= dist81;
            ans = d81;
        }

        int dist83 = Math.max(Math.abs(cx+8)*49 + c83, Math.abs(cy - 5)*49+c83);
        if(dist83 < cmin){
            cmin= dist83;
            ans = d83;
        }

        int dist84 = Math.max(Math.abs(cx+9)*49 + c84, Math.abs(cy - 5)*49+c84);
        if(dist84 < cmin){
            cmin= dist84;
            ans = d84;
        }

        int dist94 = Math.max(Math.abs(cx+4)*49 + c94, Math.abs(cy - 6)*49+c94);
        if(dist94 < cmin){
            cmin= dist94;
            ans = d94;
        }

        int dist95 = Math.max(Math.abs(cx+5)*49 + c95, Math.abs(cy - 6)*49+c95);
        if(dist95 < cmin){
            cmin= dist95;
            ans = d95;
        }

        int dist109 = Math.max(Math.abs(cx+4)*49 + c109, Math.abs(cy - 7)*49+c109);
        if(dist109 < cmin){
            cmin= dist109;
            ans = d109;
        }

        int dist124 = Math.max(Math.abs(cx+4)*49 + c124, Math.abs(cy - 8)*49+c124);
        if(dist124 < cmin){
            cmin= dist124;
            ans = d124;
        }

        int dist125 = Math.max(Math.abs(cx+5)*49 + c125, Math.abs(cy - 8)*49+c125);
        if(dist125 < cmin){
            cmin= dist125;
            ans = d125;
        }

        int dist140 = Math.max(Math.abs(cx+5)*49 + c140, Math.abs(cy - 9)*49+c140);
        if(dist140 < cmin){
            cmin= dist140;
            ans = d140;
        }

        if(cmin<=nomove) return ans;

        int dist82 = Math.max(Math.abs(cx+7)*49 + c82, Math.abs(cy - 5)*49+c82);
        if(dist82 < cmin){
            cmin= dist82;
            ans = d82;
        }

        int dist96 = Math.max(Math.abs(cx+6)*49 + c96, Math.abs(cy - 6)*49+c96);
        if(dist96 < cmin){
            cmin= dist96;
            ans = d96;
        }

        int dist97 = Math.max(Math.abs(cx+7)*49 + c97, Math.abs(cy - 6)*49+c97);
        if(dist97 < cmin){
            cmin= dist97;
            ans = d97;
        }

        int dist98 = Math.max(Math.abs(cx+8)*49 + c98, Math.abs(cy - 6)*49+c98);
        if(dist98 < cmin){
            cmin= dist98;
            ans = d98;
        }

        int dist110 = Math.max(Math.abs(cx+5)*49 + c110, Math.abs(cy - 7)*49+c110);
        if(dist110 < cmin){
            cmin= dist110;
            ans = d110;
        }

        int dist111 = Math.max(Math.abs(cx+6)*49 + c111, Math.abs(cy - 7)*49+c111);
        if(dist111 < cmin){
            cmin= dist111;
            ans = d111;
        }

        int dist126 = Math.max(Math.abs(cx+6)*49 + c126, Math.abs(cy - 8)*49+c126);
        if(dist126 < cmin){
            cmin= dist126;
            ans = d126;
        }
        return ans;
    }
    static Direction BFSSouthEast(MapLocation target, Direction prev) throws GameActionException{
        if(c127 > c112 + r127 && prev != Direction.SOUTH){
            d127 = Direction.SOUTH;
            c127 = c112 + r127;
        }

        if(c113 > c112 + r113 && prev != Direction.EAST){
            d113 = Direction.EAST;
            c113 = c112 + r113;
        }

        if(c113 > c127 + r113){
            d113 = d127;
            c113 = c127 + r113;
        }

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

        if(c98 > c112 + r98 && prev != Direction.NORTHEAST){
            d98 = Direction.NORTHEAST;
            c98 = c112 + r98;
        }

        if(c126 > c112 + r126 && prev != Direction.SOUTHWEST){
            d126 = Direction.SOUTHWEST;
            c126 = c112 + r126;
        }

        if(c142 > c127 + r142){
            d142 = d127;
            c142 = c127 + r142;
        }

        if(c142 > c126 + r142){
            d142 = d126;
            c142 = c126 + r142;
        }

        if(c142 > c128 + r142){
            d142 = d128;
            c142 = c128 + r142;
        }

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

        if(c141 > c126 + r141){
            d141 = d126;
            c141 = c126 + r141;
        }

        if(c141 > c127 + r141){
            d141 = d127;
            c141 = c127 + r141;
        }

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

        if(c99 > c98 + r99){
            d99 = d98;
            c99 = c98 + r99;
        }

        if(c99 > c113 + r99){
            d99 = d113;
            c99 = c113 + r99;
        }

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

        if(c84 > c98 + r84){
            d84 = d98;
            c84 = c98 + r84;
        }

        if(c140 > c126 + r140){
            d140 = d126;
            c140 = c126 + r140;
        }

        if(c157 > c142 + r157){
            d157 = d142;
            c157 = c142 + r157;
        }

        if(c157 > c141 + r157){
            d157 = d141;
            c157 = c141 + r157;
        }

        if(c157 > c143 + r157){
            d157 = d143;
            c157 = c143 + r157;
        }

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

        if(c158 > c144 + r158){
            d158 = d144;
            c158 = c144 + r158;
        }

        if(c156 > c141 + r156){
            d156 = d141;
            c156 = c141 + r156;
        }

        if(c156 > c140 + r156){
            d156 = d140;
            c156 = c140 + r156;
        }

        if(c156 > c142 + r156){
            d156 = d142;
            c156 = c142 + r156;
        }

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

        if(c155 > c140 + r155){
            d155 = d140;
            c155 = c140 + r155;
        }

        if(c155 > c141 + r155){
            d155 = d141;
            c155 = c141 + r155;
        }

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

        if(c85 > c84 + r85){
            d85 = d84;
            c85 = c84 + r85;
        }

        if(c85 > c99 + r85){
            d85 = d99;
            c85 = c99 + r85;
        }

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

        if(c70 > c84 + r70){
            d70 = d84;
            c70 = c84 + r70;
        }

        if(c154 > c140 + r154){
            d154 = d140;
            c154 = c140 + r154;
        }

        if(c172 > c157 + r172){
            d172 = d157;
            c172 = c157 + r172;
        }

        if(c172 > c156 + r172){
            d172 = d156;
            c172 = c156 + r172;
        }

        if(c172 > c158 + r172){
            d172 = d158;
            c172 = c158 + r172;
        }

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

        if(c173 > c159 + r173){
            d173 = d159;
            c173 = c159 + r173;
        }

        if(c171 > c156 + r171){
            d171 = d156;
            c171 = c156 + r171;
        }

        if(c171 > c155 + r171){
            d171 = d155;
            c171 = c155 + r171;
        }

        if(c171 > c157 + r171){
            d171 = d157;
            c171 = c157 + r171;
        }

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

        if(c174 > c160 + r174){
            d174 = d160;
            c174 = c160 + r174;
        }

        if(c170 > c155 + r170){
            d170 = d155;
            c170 = c155 + r170;
        }

        if(c170 > c154 + r170){
            d170 = d154;
            c170 = c154 + r170;
        }

        if(c170 > c156 + r170){
            d170 = d156;
            c170 = c156 + r170;
        }

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

        if(c169 > c154 + r169){
            d169 = d154;
            c169 = c154 + r169;
        }

        if(c169 > c155 + r169){
            d169 = d155;
            c169 = c155 + r169;
        }

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

        if(c71 > c70 + r71){
            d71 = d70;
            c71 = c70 + r71;
        }

        if(c71 > c85 + r71){
            d71 = d85;
            c71 = c85 + r71;
        }

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

        if(c56 > c70 + r56){
            d56 = d70;
            c56 = c70 + r56;
        }

        if(c168 > c154 + r168){
            d168 = d154;
            c168 = c154 + r168;
        }

        if(c187 > c172 + r187){
            d187 = d172;
            c187 = c172 + r187;
        }

        if(c187 > c171 + r187){
            d187 = d171;
            c187 = c171 + r187;
        }

        if(c187 > c173 + r187){
            d187 = d173;
            c187 = c173 + r187;
        }

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

        if(c188 > c174 + r188){
            d188 = d174;
            c188 = c174 + r188;
        }

        if(c186 > c171 + r186){
            d186 = d171;
            c186 = c171 + r186;
        }

        if(c186 > c170 + r186){
            d186 = d170;
            c186 = c170 + r186;
        }

        if(c186 > c172 + r186){
            d186 = d172;
            c186 = c172 + r186;
        }

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

        if(c189 > c175 + r189){
            d189 = d175;
            c189 = c175 + r189;
        }

        if(c185 > c170 + r185){
            d185 = d170;
            c185 = c170 + r185;
        }

        if(c185 > c169 + r185){
            d185 = d169;
            c185 = c169 + r185;
        }

        if(c185 > c171 + r185){
            d185 = d171;
            c185 = c171 + r185;
        }

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

        if(c190 > c176 + r190){
            d190 = d176;
            c190 = c176 + r190;
        }

        if(c184 > c169 + r184){
            d184 = d169;
            c184 = c169 + r184;
        }

        if(c184 > c168 + r184){
            d184 = d168;
            c184 = c168 + r184;
        }

        if(c184 > c170 + r184){
            d184 = d170;
            c184 = c170 + r184;
        }

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


        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;
        int dist56 = Math.max(Math.abs(cx+11)*49 + c56, Math.abs(cy - 3)*49+c56);
        if(dist56 < cmin){
            cmin= dist56;
            ans = d56;
        }

        int dist71 = Math.max(Math.abs(cx+11)*49 + c71, Math.abs(cy - 4)*49+c71);
        if(dist71 < cmin){
            cmin= dist71;
            ans = d71;
        }

        int dist72 = Math.max(Math.abs(cx+12)*49 + c72, Math.abs(cy - 4)*49+c72);
        if(dist72 < cmin){
            cmin= dist72;
            ans = d72;
        }

        int dist87 = Math.max(Math.abs(cx+12)*49 + c87, Math.abs(cy - 5)*49+c87);
        if(dist87 < cmin){
            cmin= dist87;
            ans = d87;
        }

        int dist102 = Math.max(Math.abs(cx+12)*49 + c102, Math.abs(cy - 6)*49+c102);
        if(dist102 < cmin){
            cmin= dist102;
            ans = d102;
        }

        int dist117 = Math.max(Math.abs(cx+12)*49 + c117, Math.abs(cy - 7)*49+c117);
        if(dist117 < cmin){
            cmin= dist117;
            ans = d117;
        }

        int dist132 = Math.max(Math.abs(cx+12)*49 + c132, Math.abs(cy - 8)*49+c132);
        if(dist132 < cmin){
            cmin= dist132;
            ans = d132;
        }

        int dist147 = Math.max(Math.abs(cx+12)*49 + c147, Math.abs(cy - 9)*49+c147);
        if(dist147 < cmin){
            cmin= dist147;
            ans = d147;
        }

        int dist161 = Math.max(Math.abs(cx+11)*49 + c161, Math.abs(cy - 10)*49+c161);
        if(dist161 < cmin){
            cmin= dist161;
            ans = d161;
        }

        int dist162 = Math.max(Math.abs(cx+12)*49 + c162, Math.abs(cy - 10)*49+c162);
        if(dist162 < cmin){
            cmin= dist162;
            ans = d162;
        }

        int dist168 = Math.max(Math.abs(cx+3)*49 + c168, Math.abs(cy - 11)*49+c168);
        if(dist168 < cmin){
            cmin= dist168;
            ans = d168;
        }

        int dist169 = Math.max(Math.abs(cx+4)*49 + c169, Math.abs(cy - 11)*49+c169);
        if(dist169 < cmin){
            cmin= dist169;
            ans = d169;
        }

        int dist175 = Math.max(Math.abs(cx+10)*49 + c175, Math.abs(cy - 11)*49+c175);
        if(dist175 < cmin){
            cmin= dist175;
            ans = d175;
        }

        int dist176 = Math.max(Math.abs(cx+11)*49 + c176, Math.abs(cy - 11)*49+c176);
        if(dist176 < cmin){
            cmin= dist176;
            ans = d176;
        }

        int dist184 = Math.max(Math.abs(cx+4)*49 + c184, Math.abs(cy - 12)*49+c184);
        if(dist184 < cmin){
            cmin= dist184;
            ans = d184;
        }

        int dist185 = Math.max(Math.abs(cx+5)*49 + c185, Math.abs(cy - 12)*49+c185);
        if(dist185 < cmin){
            cmin= dist185;
            ans = d185;
        }

        int dist186 = Math.max(Math.abs(cx+6)*49 + c186, Math.abs(cy - 12)*49+c186);
        if(dist186 < cmin){
            cmin= dist186;
            ans = d186;
        }

        int dist187 = Math.max(Math.abs(cx+7)*49 + c187, Math.abs(cy - 12)*49+c187);
        if(dist187 < cmin){
            cmin= dist187;
            ans = d187;
        }

        int dist188 = Math.max(Math.abs(cx+8)*49 + c188, Math.abs(cy - 12)*49+c188);
        if(dist188 < cmin){
            cmin= dist188;
            ans = d188;
        }

        int dist189 = Math.max(Math.abs(cx+9)*49 + c189, Math.abs(cy - 12)*49+c189);
        if(dist189 < cmin){
            cmin= dist189;
            ans = d189;
        }

        int dist190 = Math.max(Math.abs(cx+10)*49 + c190, Math.abs(cy - 12)*49+c190);
        if(dist190 < cmin){
            cmin= dist190;
            ans = d190;
        }

        if(cmin<=nomove) return ans;

        int dist70 = Math.max(Math.abs(cx+10)*49 + c70, Math.abs(cy - 4)*49+c70);
        if(dist70 < cmin){
            cmin= dist70;
            ans = d70;
        }

        int dist85 = Math.max(Math.abs(cx+10)*49 + c85, Math.abs(cy - 5)*49+c85);
        if(dist85 < cmin){
            cmin= dist85;
            ans = d85;
        }

        int dist86 = Math.max(Math.abs(cx+11)*49 + c86, Math.abs(cy - 5)*49+c86);
        if(dist86 < cmin){
            cmin= dist86;
            ans = d86;
        }

        int dist101 = Math.max(Math.abs(cx+11)*49 + c101, Math.abs(cy - 6)*49+c101);
        if(dist101 < cmin){
            cmin= dist101;
            ans = d101;
        }

        int dist116 = Math.max(Math.abs(cx+11)*49 + c116, Math.abs(cy - 7)*49+c116);
        if(dist116 < cmin){
            cmin= dist116;
            ans = d116;
        }

        int dist131 = Math.max(Math.abs(cx+11)*49 + c131, Math.abs(cy - 8)*49+c131);
        if(dist131 < cmin){
            cmin= dist131;
            ans = d131;
        }

        int dist145 = Math.max(Math.abs(cx+10)*49 + c145, Math.abs(cy - 9)*49+c145);
        if(dist145 < cmin){
            cmin= dist145;
            ans = d145;
        }

        int dist146 = Math.max(Math.abs(cx+11)*49 + c146, Math.abs(cy - 9)*49+c146);
        if(dist146 < cmin){
            cmin= dist146;
            ans = d146;
        }

        int dist154 = Math.max(Math.abs(cx+4)*49 + c154, Math.abs(cy - 10)*49+c154);
        if(dist154 < cmin){
            cmin= dist154;
            ans = d154;
        }

        int dist155 = Math.max(Math.abs(cx+5)*49 + c155, Math.abs(cy - 10)*49+c155);
        if(dist155 < cmin){
            cmin= dist155;
            ans = d155;
        }

        int dist159 = Math.max(Math.abs(cx+9)*49 + c159, Math.abs(cy - 10)*49+c159);
        if(dist159 < cmin){
            cmin= dist159;
            ans = d159;
        }

        int dist160 = Math.max(Math.abs(cx+10)*49 + c160, Math.abs(cy - 10)*49+c160);
        if(dist160 < cmin){
            cmin= dist160;
            ans = d160;
        }

        int dist170 = Math.max(Math.abs(cx+5)*49 + c170, Math.abs(cy - 11)*49+c170);
        if(dist170 < cmin){
            cmin= dist170;
            ans = d170;
        }

        int dist171 = Math.max(Math.abs(cx+6)*49 + c171, Math.abs(cy - 11)*49+c171);
        if(dist171 < cmin){
            cmin= dist171;
            ans = d171;
        }

        int dist172 = Math.max(Math.abs(cx+7)*49 + c172, Math.abs(cy - 11)*49+c172);
        if(dist172 < cmin){
            cmin= dist172;
            ans = d172;
        }

        int dist173 = Math.max(Math.abs(cx+8)*49 + c173, Math.abs(cy - 11)*49+c173);
        if(dist173 < cmin){
            cmin= dist173;
            ans = d173;
        }

        int dist174 = Math.max(Math.abs(cx+9)*49 + c174, Math.abs(cy - 11)*49+c174);
        if(dist174 < cmin){
            cmin= dist174;
            ans = d174;
        }

        if(cmin<=nomove) return ans;

        int dist84 = Math.max(Math.abs(cx+9)*49 + c84, Math.abs(cy - 5)*49+c84);
        if(dist84 < cmin){
            cmin= dist84;
            ans = d84;
        }

        int dist99 = Math.max(Math.abs(cx+9)*49 + c99, Math.abs(cy - 6)*49+c99);
        if(dist99 < cmin){
            cmin= dist99;
            ans = d99;
        }

        int dist100 = Math.max(Math.abs(cx+10)*49 + c100, Math.abs(cy - 6)*49+c100);
        if(dist100 < cmin){
            cmin= dist100;
            ans = d100;
        }

        int dist115 = Math.max(Math.abs(cx+10)*49 + c115, Math.abs(cy - 7)*49+c115);
        if(dist115 < cmin){
            cmin= dist115;
            ans = d115;
        }

        int dist129 = Math.max(Math.abs(cx+9)*49 + c129, Math.abs(cy - 8)*49+c129);
        if(dist129 < cmin){
            cmin= dist129;
            ans = d129;
        }

        int dist130 = Math.max(Math.abs(cx+10)*49 + c130, Math.abs(cy - 8)*49+c130);
        if(dist130 < cmin){
            cmin= dist130;
            ans = d130;
        }

        int dist140 = Math.max(Math.abs(cx+5)*49 + c140, Math.abs(cy - 9)*49+c140);
        if(dist140 < cmin){
            cmin= dist140;
            ans = d140;
        }

        int dist141 = Math.max(Math.abs(cx+6)*49 + c141, Math.abs(cy - 9)*49+c141);
        if(dist141 < cmin){
            cmin= dist141;
            ans = d141;
        }

        int dist143 = Math.max(Math.abs(cx+8)*49 + c143, Math.abs(cy - 9)*49+c143);
        if(dist143 < cmin){
            cmin= dist143;
            ans = d143;
        }

        int dist144 = Math.max(Math.abs(cx+9)*49 + c144, Math.abs(cy - 9)*49+c144);
        if(dist144 < cmin){
            cmin= dist144;
            ans = d144;
        }

        int dist156 = Math.max(Math.abs(cx+6)*49 + c156, Math.abs(cy - 10)*49+c156);
        if(dist156 < cmin){
            cmin= dist156;
            ans = d156;
        }

        int dist157 = Math.max(Math.abs(cx+7)*49 + c157, Math.abs(cy - 10)*49+c157);
        if(dist157 < cmin){
            cmin= dist157;
            ans = d157;
        }

        int dist158 = Math.max(Math.abs(cx+8)*49 + c158, Math.abs(cy - 10)*49+c158);
        if(dist158 < cmin){
            cmin= dist158;
            ans = d158;
        }

        if(cmin<=nomove) return ans;

        int dist98 = Math.max(Math.abs(cx+8)*49 + c98, Math.abs(cy - 6)*49+c98);
        if(dist98 < cmin){
            cmin= dist98;
            ans = d98;
        }

        int dist113 = Math.max(Math.abs(cx+8)*49 + c113, Math.abs(cy - 7)*49+c113);
        if(dist113 < cmin){
            cmin= dist113;
            ans = d113;
        }

        int dist114 = Math.max(Math.abs(cx+9)*49 + c114, Math.abs(cy - 7)*49+c114);
        if(dist114 < cmin){
            cmin= dist114;
            ans = d114;
        }

        int dist126 = Math.max(Math.abs(cx+6)*49 + c126, Math.abs(cy - 8)*49+c126);
        if(dist126 < cmin){
            cmin= dist126;
            ans = d126;
        }

        int dist127 = Math.max(Math.abs(cx+7)*49 + c127, Math.abs(cy - 8)*49+c127);
        if(dist127 < cmin){
            cmin= dist127;
            ans = d127;
        }

        int dist128 = Math.max(Math.abs(cx+8)*49 + c128, Math.abs(cy - 8)*49+c128);
        if(dist128 < cmin){
            cmin= dist128;
            ans = d128;
        }

        int dist142 = Math.max(Math.abs(cx+7)*49 + c142, Math.abs(cy - 9)*49+c142);
        if(dist142 < cmin){
            cmin= dist142;
            ans = d142;
        }
        return ans;
    }
    static Direction BFSSouthWest(MapLocation target, Direction prev) throws GameActionException {
        if(c127 > c112 + r127 && prev != Direction.SOUTH){
            d127 = Direction.SOUTH;
            c127 = c112 + r127;
        }

        if(c128 > c112 + r128 && prev != Direction.SOUTHEAST){
            d128 = Direction.SOUTHEAST;
            c128 = c112 + r128;
        }

        if(c126 > c112 + r126 && prev != Direction.SOUTHWEST){
            d126 = Direction.SOUTHWEST;
            c126 = c112 + r126;
        }

        if(c126 > c127 + r126){
            d126 = d127;
            c126 = c127 + r126;
        }

        if(c96 > c112 + r96 && prev != Direction.NORTHWEST){
            d96 = Direction.NORTHWEST;
            c96 = c112 + r96;
        }

        if(c111 > c96 + r111){
            d111 = d96;
            c111 = c96 + r111;
        }

        if(c111 > c127 + r111){
            d111 = d127;
            c111 = c127 + r111;
        }

        if(c111 > c112 + r111 && prev != Direction.WEST){
            d111 = Direction.WEST;
            c111 = c112 + r111;
        }

        if(c142 > c127 + r142){
            d142 = d127;
            c142 = c127 + r142;
        }

        if(c142 > c126 + r142){
            d142 = d126;
            c142 = c126 + r142;
        }

        if(c142 > c128 + r142){
            d142 = d128;
            c142 = c128 + r142;
        }

        if(c143 > c128 + r143){
            d143 = d128;
            c143 = c128 + r143;
        }

        if(c143 > c127 + r143){
            d143 = d127;
            c143 = c127 + r143;
        }

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

        if(c144 > c128 + r144){
            d144 = d128;
            c144 = c128 + r144;
        }

        if(c140 > c126 + r140){
            d140 = d126;
            c140 = c126 + r140;
        }

        if(c140 > c141 + r140){
            d140 = d141;
            c140 = c141 + r140;
        }

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

        if(c80 > c96 + r80){
            d80 = d96;
            c80 = c96 + r80;
        }

        if(c95 > c80 + r95){
            d95 = d80;
            c95 = c80 + r95;
        }

        if(c95 > c111 + r95){
            d95 = d111;
            c95 = c111 + r95;
        }

        if(c95 > c96 + r95){
            d95 = d96;
            c95 = c96 + r95;
        }

        if(c157 > c142 + r157){
            d157 = d142;
            c157 = c142 + r157;
        }

        if(c157 > c141 + r157){
            d157 = d141;
            c157 = c141 + r157;
        }

        if(c157 > c143 + r157){
            d157 = d143;
            c157 = c143 + r157;
        }

        if(c158 > c143 + r158){
            d158 = d143;
            c158 = c143 + r158;
        }

        if(c158 > c142 + r158){
            d158 = d142;
            c158 = c142 + r158;
        }

        if(c158 > c144 + r158){
            d158 = d144;
            c158 = c144 + r158;
        }

        if(c156 > c141 + r156){
            d156 = d141;
            c156 = c141 + r156;
        }

        if(c156 > c140 + r156){
            d156 = d140;
            c156 = c140 + r156;
        }

        if(c156 > c142 + r156){
            d156 = d142;
            c156 = c142 + r156;
        }

        if(c156 > c157 + r156){
            d156 = d157;
            c156 = c157 + r156;
        }

        if(c159 > c144 + r159){
            d159 = d144;
            c159 = c144 + r159;
        }

        if(c159 > c143 + r159){
            d159 = d143;
            c159 = c143 + r159;
        }

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

        if(c160 > c144 + r160){
            d160 = d144;
            c160 = c144 + r160;
        }

        if(c154 > c140 + r154){
            d154 = d140;
            c154 = c140 + r154;
        }

        if(c154 > c155 + r154){
            d154 = d155;
            c154 = c155 + r154;
        }

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

        if(c64 > c80 + r64){
            d64 = d80;
            c64 = c80 + r64;
        }

        if(c79 > c64 + r79){
            d79 = d64;
            c79 = c64 + r79;
        }

        if(c79 > c95 + r79){
            d79 = d95;
            c79 = c95 + r79;
        }

        if(c79 > c80 + r79){
            d79 = d80;
            c79 = c80 + r79;
        }

        if(c172 > c157 + r172){
            d172 = d157;
            c172 = c157 + r172;
        }

        if(c172 > c156 + r172){
            d172 = d156;
            c172 = c156 + r172;
        }

        if(c172 > c158 + r172){
            d172 = d158;
            c172 = c158 + r172;
        }

        if(c173 > c158 + r173){
            d173 = d158;
            c173 = c158 + r173;
        }

        if(c173 > c157 + r173){
            d173 = d157;
            c173 = c157 + r173;
        }

        if(c173 > c159 + r173){
            d173 = d159;
            c173 = c159 + r173;
        }

        if(c171 > c156 + r171){
            d171 = d156;
            c171 = c156 + r171;
        }

        if(c171 > c155 + r171){
            d171 = d155;
            c171 = c155 + r171;
        }

        if(c171 > c157 + r171){
            d171 = d157;
            c171 = c157 + r171;
        }

        if(c171 > c172 + r171){
            d171 = d172;
            c171 = c172 + r171;
        }

        if(c174 > c159 + r174){
            d174 = d159;
            c174 = c159 + r174;
        }

        if(c174 > c158 + r174){
            d174 = d158;
            c174 = c158 + r174;
        }

        if(c174 > c160 + r174){
            d174 = d160;
            c174 = c160 + r174;
        }

        if(c170 > c155 + r170){
            d170 = d155;
            c170 = c155 + r170;
        }

        if(c170 > c154 + r170){
            d170 = d154;
            c170 = c154 + r170;
        }

        if(c170 > c156 + r170){
            d170 = d156;
            c170 = c156 + r170;
        }

        if(c170 > c171 + r170){
            d170 = d171;
            c170 = c171 + r170;
        }

        if(c175 > c160 + r175){
            d175 = d160;
            c175 = c160 + r175;
        }

        if(c175 > c159 + r175){
            d175 = d159;
            c175 = c159 + r175;
        }

        if(c169 > c154 + r169){
            d169 = d154;
            c169 = c154 + r169;
        }

        if(c169 > c155 + r169){
            d169 = d155;
            c169 = c155 + r169;
        }

        if(c169 > c170 + r169){
            d169 = d170;
            c169 = c170 + r169;
        }

        if(c176 > c160 + r176){
            d176 = d160;
            c176 = c160 + r176;
        }

        if(c168 > c154 + r168){
            d168 = d154;
            c168 = c154 + r168;
        }

        if(c168 > c169 + r168){
            d168 = d169;
            c168 = c169 + r168;
        }

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

        if(c153 > c138 + r153){
            d153 = d138;
            c153 = c138 + r153;
        }

        if(c153 > c139 + r153){
            d153 = d139;
            c153 = c139 + r153;
        }

        if(c153 > c169 + r153){
            d153 = d169;
            c153 = c169 + r153;
        }

        if(c153 > c154 + r153){
            d153 = d154;
            c153 = c154 + r153;
        }

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

        if(c48 > c64 + r48){
            d48 = d64;
            c48 = c64 + r48;
        }

        if(c63 > c48 + r63){
            d63 = d48;
            c63 = c48 + r63;
        }

        if(c63 > c79 + r63){
            d63 = d79;
            c63 = c79 + r63;
        }

        if(c63 > c64 + r63){
            d63 = d64;
            c63 = c64 + r63;
        }

        if(c187 > c172 + r187){
            d187 = d172;
            c187 = c172 + r187;
        }

        if(c187 > c171 + r187){
            d187 = d171;
            c187 = c171 + r187;
        }

        if(c187 > c173 + r187){
            d187 = d173;
            c187 = c173 + r187;
        }

        if(c188 > c173 + r188){
            d188 = d173;
            c188 = c173 + r188;
        }

        if(c188 > c172 + r188){
            d188 = d172;
            c188 = c172 + r188;
        }

        if(c188 > c174 + r188){
            d188 = d174;
            c188 = c174 + r188;
        }

        if(c186 > c171 + r186){
            d186 = d171;
            c186 = c171 + r186;
        }

        if(c186 > c170 + r186){
            d186 = d170;
            c186 = c170 + r186;
        }

        if(c186 > c172 + r186){
            d186 = d172;
            c186 = c172 + r186;
        }

        if(c186 > c187 + r186){
            d186 = d187;
            c186 = c187 + r186;
        }

        if(c189 > c174 + r189){
            d189 = d174;
            c189 = c174 + r189;
        }

        if(c189 > c173 + r189){
            d189 = d173;
            c189 = c173 + r189;
        }

        if(c189 > c175 + r189){
            d189 = d175;
            c189 = c175 + r189;
        }

        if(c185 > c170 + r185){
            d185 = d170;
            c185 = c170 + r185;
        }

        if(c185 > c169 + r185){
            d185 = d169;
            c185 = c169 + r185;
        }

        if(c185 > c171 + r185){
            d185 = d171;
            c185 = c171 + r185;
        }

        if(c185 > c186 + r185){
            d185 = d186;
            c185 = c186 + r185;
        }

        if(c190 > c175 + r190){
            d190 = d175;
            c190 = c175 + r190;
        }

        if(c190 > c174 + r190){
            d190 = d174;
            c190 = c174 + r190;
        }

        if(c190 > c176 + r190){
            d190 = d176;
            c190 = c176 + r190;
        }

        if(c184 > c169 + r184){
            d184 = d169;
            c184 = c169 + r184;
        }

        if(c184 > c168 + r184){
            d184 = d168;
            c184 = c168 + r184;
        }

        if(c184 > c170 + r184){
            d184 = d170;
            c184 = c170 + r184;
        }

        if(c184 > c185 + r184){
            d184 = d185;
            c184 = c185 + r184;
        }

        if(c152 > c138 + r152){
            d152 = d138;
            c152 = c138 + r152;
        }

        if(c152 > c168 + r152){
            d152 = d168;
            c152 = c168 + r152;
        }

        if(c152 > c153 + r152){
            d152 = d153;
            c152 = c153 + r152;
        }

        if(c122 > c108 + r122){
            d122 = d108;
            c122 = c108 + r122;
        }

        if(c122 > c138 + r122){
            d122 = d138;
            c122 = c138 + r122;
        }

        if(c122 > c123 + r122){
            d122 = d123;
            c122 = c123 + r122;
        }

        if(c137 > c122 + r137){
            d137 = d122;
            c137 = c122 + r137;
        }

        if(c137 > c123 + r137){
            d137 = d123;
            c137 = c123 + r137;
        }

        if(c137 > c153 + r137){
            d137 = d153;
            c137 = c153 + r137;
        }

        if(c137 > c138 + r137){
            d137 = d138;
            c137 = c138 + r137;
        }

        if(c92 > c78 + r92){
            d92 = d78;
            c92 = c78 + r92;
        }

        if(c92 > c108 + r92){
            d92 = d108;
            c92 = c108 + r92;
        }

        if(c92 > c93 + r92){
            d92 = d93;
            c92 = c93 + r92;
        }

        if(c107 > c92 + r107){
            d107 = d92;
            c107 = c92 + r107;
        }

        if(c107 > c93 + r107){
            d107 = d93;
            c107 = c93 + r107;
        }

        if(c107 > c123 + r107){
            d107 = d123;
            c107 = c123 + r107;
        }

        if(c107 > c108 + r107){
            d107 = d108;
            c107 = c108 + r107;
        }

        if(c62 > c48 + r62){
            d62 = d48;
            c62 = c48 + r62;
        }

        if(c62 > c78 + r62){
            d62 = d78;
            c62 = c78 + r62;
        }

        if(c62 > c63 + r62){
            d62 = d63;
            c62 = c63 + r62;
        }

        if(c77 > c62 + r77){
            d77 = d62;
            c77 = c62 + r77;
        }

        if(c77 > c63 + r77){
            d77 = d63;
            c77 = c63 + r77;
        }

        if(c77 > c93 + r77){
            d77 = d93;
            c77 = c93 + r77;
        }

        if(c77 > c78 + r77){
            d77 = d78;
            c77 = c78 + r77;
        }

        int cx = l112.x - 7 - target.x; //also kinda fricked cuz (0, 0) isnt top left
        int cy = l112.y + 7 - target.y;
        int nomove = Math.max(Math.abs(cx + 7) * 49, Math.abs(cy - 7) * 49); //make it <=
        int cmin = Integer.MAX_VALUE;
        int dist48 = Math.max(Math.abs(cx+3)*49 + c48, Math.abs(cy - 3)*49+c48);

        if(dist48 < cmin){
            cmin= dist48;
            ans = d48;
        }

        int dist62 = Math.max(Math.abs(cx+2)*49 + c62, Math.abs(cy - 4)*49+c62);
        if(dist62 < cmin){
            cmin= dist62;
            ans = d62;
        }

        int dist63 = Math.max(Math.abs(cx+3)*49 + c63, Math.abs(cy - 4)*49+c63);
        if(dist63 < cmin){
            cmin= dist63;
            ans = d63;
        }

        int dist77 = Math.max(Math.abs(cx+2)*49 + c77, Math.abs(cy - 5)*49+c77);
        if(dist77 < cmin){
            cmin= dist77;
            ans = d77;
        }

        int dist92 = Math.max(Math.abs(cx+2)*49 + c92, Math.abs(cy - 6)*49+c92);
        if(dist92 < cmin){
            cmin= dist92;
            ans = d92;
        }

        int dist107 = Math.max(Math.abs(cx+2)*49 + c107, Math.abs(cy - 7)*49+c107);
        if(dist107 < cmin){
            cmin= dist107;
            ans = d107;
        }

        int dist122 = Math.max(Math.abs(cx+2)*49 + c122, Math.abs(cy - 8)*49+c122);
        if(dist122 < cmin){
            cmin= dist122;
            ans = d122;
        }

        int dist137 = Math.max(Math.abs(cx+2)*49 + c137, Math.abs(cy - 9)*49+c137);
        if(dist137 < cmin){
            cmin= dist137;
            ans = d137;
        }

        int dist152 = Math.max(Math.abs(cx+2)*49 + c152, Math.abs(cy - 10)*49+c152);
        if(dist152 < cmin){
            cmin= dist152;
            ans = d152;
        }

        int dist153 = Math.max(Math.abs(cx+3)*49 + c153, Math.abs(cy - 10)*49+c153);
        if(dist153 < cmin){
            cmin= dist153;
            ans = d153;
        }

        int dist168 = Math.max(Math.abs(cx+3)*49 + c168, Math.abs(cy - 11)*49+c168);
        if(dist168 < cmin){
            cmin= dist168;
            ans = d168;
        }

        int dist169 = Math.max(Math.abs(cx+4)*49 + c169, Math.abs(cy - 11)*49+c169);
        if(dist169 < cmin){
            cmin= dist169;
            ans = d169;
        }

        int dist175 = Math.max(Math.abs(cx+10)*49 + c175, Math.abs(cy - 11)*49+c175);
        if(dist175 < cmin){
            cmin= dist175;
            ans = d175;
        }

        int dist176 = Math.max(Math.abs(cx+11)*49 + c176, Math.abs(cy - 11)*49+c176);
        if(dist176 < cmin){
            cmin= dist176;
            ans = d176;
        }

        int dist184 = Math.max(Math.abs(cx+4)*49 + c184, Math.abs(cy - 12)*49+c184);
        if(dist184 < cmin){
            cmin= dist184;
            ans = d184;
        }

        int dist185 = Math.max(Math.abs(cx+5)*49 + c185, Math.abs(cy - 12)*49+c185);
        if(dist185 < cmin){
            cmin= dist185;
            ans = d185;
        }

        int dist186 = Math.max(Math.abs(cx+6)*49 + c186, Math.abs(cy - 12)*49+c186);
        if(dist186 < cmin){
            cmin= dist186;
            ans = d186;
        }

        int dist187 = Math.max(Math.abs(cx+7)*49 + c187, Math.abs(cy - 12)*49+c187);
        if(dist187 < cmin){
            cmin= dist187;
            ans = d187;
        }

        int dist188 = Math.max(Math.abs(cx+8)*49 + c188, Math.abs(cy - 12)*49+c188);
        if(dist188 < cmin){
            cmin= dist188;
            ans = d188;
        }

        int dist189 = Math.max(Math.abs(cx+9)*49 + c189, Math.abs(cy - 12)*49+c189);
        if(dist189 < cmin){
            cmin= dist189;
            ans = d189;
        }

        int dist190 = Math.max(Math.abs(cx+10)*49 + c190, Math.abs(cy - 12)*49+c190);
        if(dist190 < cmin){
            cmin= dist190;
            ans = d190;
        }

        if(cmin<=nomove) return ans;

        int dist64 = Math.max(Math.abs(cx+4)*49 + c64, Math.abs(cy - 4)*49+c64);
        if(dist64 < cmin){
            cmin= dist64;
            ans = d64;
        }

        int dist78 = Math.max(Math.abs(cx+3)*49 + c78, Math.abs(cy - 5)*49+c78);
        if(dist78 < cmin){
            cmin= dist78;
            ans = d78;
        }

        int dist79 = Math.max(Math.abs(cx+4)*49 + c79, Math.abs(cy - 5)*49+c79);
        if(dist79 < cmin){
            cmin= dist79;
            ans = d79;
        }

        int dist93 = Math.max(Math.abs(cx+3)*49 + c93, Math.abs(cy - 6)*49+c93);
        if(dist93 < cmin){
            cmin= dist93;
            ans = d93;
        }

        int dist108 = Math.max(Math.abs(cx+3)*49 + c108, Math.abs(cy - 7)*49+c108);
        if(dist108 < cmin){
            cmin= dist108;
            ans = d108;
        }

        int dist123 = Math.max(Math.abs(cx+3)*49 + c123, Math.abs(cy - 8)*49+c123);
        if(dist123 < cmin){
            cmin= dist123;
            ans = d123;
        }

        int dist138 = Math.max(Math.abs(cx+3)*49 + c138, Math.abs(cy - 9)*49+c138);
        if(dist138 < cmin){
            cmin= dist138;
            ans = d138;
        }

        int dist139 = Math.max(Math.abs(cx+4)*49 + c139, Math.abs(cy - 9)*49+c139);
        if(dist139 < cmin){
            cmin= dist139;
            ans = d139;
        }

        int dist154 = Math.max(Math.abs(cx+4)*49 + c154, Math.abs(cy - 10)*49+c154);
        if(dist154 < cmin){
            cmin= dist154;
            ans = d154;
        }

        int dist155 = Math.max(Math.abs(cx+5)*49 + c155, Math.abs(cy - 10)*49+c155);
        if(dist155 < cmin){
            cmin= dist155;
            ans = d155;
        }

        int dist159 = Math.max(Math.abs(cx+9)*49 + c159, Math.abs(cy - 10)*49+c159);
        if(dist159 < cmin){
            cmin= dist159;
            ans = d159;
        }

        int dist160 = Math.max(Math.abs(cx+10)*49 + c160, Math.abs(cy - 10)*49+c160);
        if(dist160 < cmin){
            cmin= dist160;
            ans = d160;
        }

        int dist170 = Math.max(Math.abs(cx+5)*49 + c170, Math.abs(cy - 11)*49+c170);
        if(dist170 < cmin){
            cmin= dist170;
            ans = d170;
        }

        int dist171 = Math.max(Math.abs(cx+6)*49 + c171, Math.abs(cy - 11)*49+c171);
        if(dist171 < cmin){
            cmin= dist171;
            ans = d171;
        }

        int dist172 = Math.max(Math.abs(cx+7)*49 + c172, Math.abs(cy - 11)*49+c172);
        if(dist172 < cmin){
            cmin= dist172;
            ans = d172;
        }

        int dist173 = Math.max(Math.abs(cx+8)*49 + c173, Math.abs(cy - 11)*49+c173);
        if(dist173 < cmin){
            cmin= dist173;
            ans = d173;
        }

        int dist174 = Math.max(Math.abs(cx+9)*49 + c174, Math.abs(cy - 11)*49+c174);
        if(dist174 < cmin){
            cmin= dist174;
            ans = d174;
        }

        if(cmin<=nomove) return ans;

        int dist80 = Math.max(Math.abs(cx+5)*49 + c80, Math.abs(cy - 5)*49+c80);
        if(dist80 < cmin){
            cmin= dist80;
            ans = d80;
        }

        int dist94 = Math.max(Math.abs(cx+4)*49 + c94, Math.abs(cy - 6)*49+c94);
        if(dist94 < cmin){
            cmin= dist94;
            ans = d94;
        }

        int dist95 = Math.max(Math.abs(cx+5)*49 + c95, Math.abs(cy - 6)*49+c95);
        if(dist95 < cmin){
            cmin= dist95;
            ans = d95;
        }

        int dist109 = Math.max(Math.abs(cx+4)*49 + c109, Math.abs(cy - 7)*49+c109);
        if(dist109 < cmin){
            cmin= dist109;
            ans = d109;
        }

        int dist124 = Math.max(Math.abs(cx+4)*49 + c124, Math.abs(cy - 8)*49+c124);
        if(dist124 < cmin){
            cmin= dist124;
            ans = d124;
        }

        int dist125 = Math.max(Math.abs(cx+5)*49 + c125, Math.abs(cy - 8)*49+c125);
        if(dist125 < cmin){
            cmin= dist125;
            ans = d125;
        }

        int dist140 = Math.max(Math.abs(cx+5)*49 + c140, Math.abs(cy - 9)*49+c140);
        if(dist140 < cmin){
            cmin= dist140;
            ans = d140;
        }

        int dist141 = Math.max(Math.abs(cx+6)*49 + c141, Math.abs(cy - 9)*49+c141);
        if(dist141 < cmin){
            cmin= dist141;
            ans = d141;
        }

        int dist143 = Math.max(Math.abs(cx+8)*49 + c143, Math.abs(cy - 9)*49+c143);
        if(dist143 < cmin){
            cmin= dist143;
            ans = d143;
        }

        int dist144 = Math.max(Math.abs(cx+9)*49 + c144, Math.abs(cy - 9)*49+c144);
        if(dist144 < cmin){
            cmin= dist144;
            ans = d144;
        }

        int dist156 = Math.max(Math.abs(cx+6)*49 + c156, Math.abs(cy - 10)*49+c156);
        if(dist156 < cmin){
            cmin= dist156;
            ans = d156;
        }

        int dist157 = Math.max(Math.abs(cx+7)*49 + c157, Math.abs(cy - 10)*49+c157);
        if(dist157 < cmin){
            cmin= dist157;
            ans = d157;
        }

        int dist158 = Math.max(Math.abs(cx+8)*49 + c158, Math.abs(cy - 10)*49+c158);
        if(dist158 < cmin){
            cmin= dist158;
            ans = d158;
        }

        if(cmin<=nomove) return ans;

        int dist96 = Math.max(Math.abs(cx+6)*49 + c96, Math.abs(cy - 6)*49+c96);
        if(dist96 < cmin){
            cmin= dist96;
            ans = d96;
        }

        int dist110 = Math.max(Math.abs(cx+5)*49 + c110, Math.abs(cy - 7)*49+c110);
        if(dist110 < cmin){
            cmin= dist110;
            ans = d110;
        }

        int dist111 = Math.max(Math.abs(cx+6)*49 + c111, Math.abs(cy - 7)*49+c111);
        if(dist111 < cmin){
            cmin= dist111;
            ans = d111;
        }

        int dist126 = Math.max(Math.abs(cx+6)*49 + c126, Math.abs(cy - 8)*49+c126);
        if(dist126 < cmin){
            cmin= dist126;
            ans = d126;
        }

        int dist127 = Math.max(Math.abs(cx+7)*49 + c127, Math.abs(cy - 8)*49+c127);
        if(dist127 < cmin){
            cmin= dist127;
            ans = d127;
        }

        int dist128 = Math.max(Math.abs(cx+8)*49 + c128, Math.abs(cy - 8)*49+c128);
        if(dist128 < cmin){
            cmin= dist128;
            ans = d128;
        }

        int dist142 = Math.max(Math.abs(cx+7)*49 + c142, Math.abs(cy - 9)*49+c142);
        if(dist142 < cmin){
            cmin= dist142;
            ans = d142;
        }
        System.out.println(d111);
        System.out.println(r111);
        System.out.println(c111);
        System.out.println(cmin);
        System.out.println(ans);
        return ans;
    }
}
