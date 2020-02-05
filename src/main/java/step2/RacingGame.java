package step2;

import java.util.Random;

public class RacingGame {
    int monsterNumber;
    String[] monster;

    public RacingGame(int monsterNumber) {
        this.monsterNumber = monsterNumber;
        this.monster = new String[monsterNumber];
    }

    public void racing(int trialNumber) {
        for (int i = 0; i < monster.length; i++) {
            this.monster[i] = getMoveResult(trialNumber);
        }
    }

    public String getMoveResult(int trialNumber) {
        String moveResult = "";
        for (int j = 0; j < getMoveCnt(trialNumber); j++) {
            moveResult += "-";
        }

        return moveResult;
    }

    public int getMoveCnt(int trialNumber) {
        int moveCnt = 0;

        for (int i = 0; i < trialNumber; i++) {
            moveCnt += checkMove();
        }

        return moveCnt;
    }

    public int checkMove() {
        Random rd = new Random();
        int random = rd.nextInt(10);
        int move = 0;

        if (!(random >= 4)) return 0;
        move++;

        return move;
    }
}

