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
            this.result.add(monster[i].name + "[" + monster[i].type + "]: " +getMoveResult());
        }
    }

    public String getMoveResult() {
        String moveResult = "";
        for (int j = 0; j < getMoveCnt(); j++) {
            moveResult += "-";
        }
        return moveResult;
    }

    public int getMoveCnt() {
        int moveCnt = 0;

        for (int i = 0; i < trialNumber; i++) {
            moveCnt += checkMove();
        }
        return moveCnt;
    }

    public int checkMove() {
        Random rd = new Random();
        int random = rd.nextInt(10);
        final int MINIMUM_NUM = 4;
        int move = 0;

        if (!(random >= MINIMUM_NUM)) return 0;
        move++;

        return move;
    }
}