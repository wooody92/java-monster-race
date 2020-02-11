package monsterrace.wooody92;

import java.util.ArrayList;
import java.util.Random;

public class RacingGame {
    int trialNumber;
    Monster[] monster;
    ArrayList<String> result;

    public RacingGame(Monster[] monster, int trialNumber) {
        this.trialNumber = trialNumber;
        this.monster = monster;
        this.result = new ArrayList<>();
    }

    public void racing() {
        for (int i = 0; i < monster.length; i++) {
            this.result.add(monster[i].name + "[" + monster[i].type + "]: " +getMoveResult(monster[i].type, i));
        }
    }

    public String getMoveResult(String monsterType, int idx) {
        String moveResult = "";
        int move = getMoveCnt(monsterType, idx);

        for (int i = 0; i < move; i++) {
            moveResult += "-";
        }
        return moveResult;
    }

    public int getMoveCnt(String monsterType, int idx) {
        int moveCnt = 0;

        for (int i = 0; i < trialNumber; i++) {
            moveCnt += monster[idx].checkMove();
            System.out.println("monstertype + moveCnt: " + monsterType + "/" + moveCnt);
        }
        return moveCnt;
    }

}