package Pathfinding;

public class zone {
    int lead, gold, rubble;
    int enemyStatus;
    int x, y;
    public zone(int x, int y) {
        lead = -1; //-1;
        gold = -1;
        rubble = -1;
        this.x = x;
        this.y = y;
    }
    void updateEnemyStatus(int enemyStatus) {
        this.enemyStatus = enemyStatus;
    }
    void updateLead(int lead) {
        this.lead = lead;
    }
    void updateGold(int gold) {
        this.gold = gold;
    }
    void updateRubble(int rubble) {
        this.rubble = rubble;
    }
}
