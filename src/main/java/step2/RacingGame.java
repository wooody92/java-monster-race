package step2;

import java.util.ArrayList;
import java.util.Random;

public class RacingGame {
    int monsterNumber;
    int trialNumber;
    ArrayList<String> monster;

    public RacingGame(int monsterNumber, int trialNumber) {
        this.monsterNumber = monsterNumber;
        this.trialNumber = trialNumber;
        this.monster = new ArrayList<>();
    }

    public void racing() {
        for (int i = 0; i < monsterNumber; i++) {
            this.monster.add(getMoveResult());
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