package JohnnyPoint1;
public class zone {
   int lead, gold, rubble;
   int enemyStatus;
   int x, y;
   public zone(int x, int y) {
      lead = 0; //-1;
      gold = 0;
      rubble = 0;
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