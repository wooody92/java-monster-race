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
            this.result.add(monster[i].name + "[" + monster[i].type + "]: " +getMoveResult(monster[i].type));
        }
    }

    public String getMoveResult(String monsterType) {
        String moveResult = "";
        int move = getMoveCnt(monsterType);

        for (int i = 0; i < move; i++) {
            moveResult += "-";
        }
        return moveResult;
    }

    public int getMoveCnt(String monsterType) {
        int moveCnt = 0;

        for (int i = 0; i < trialNumber; i++) {
            switch (monsterType) {
                case "0" : moveCnt += checkMove0(); break;
                case "1" : moveCnt += checkMove1(); break;
                case "2" : moveCnt += checkMove2(); break;
            }
            System.out.println("monstertype + moveCnt: " + monsterType + moveCnt);
        }
        return moveCnt;
    }

    public int checkMove0() {
        final int MINIMUM_NUM = 4;
        int move = 0;

        if (!(getRandom() >= MINIMUM_NUM)) return 0;
        move++;

        return move;
    }

    public int checkMove1() {
        final int MINIMUM_NUM = 6;
        int move = 0;

        if (!(getRandom() >= MINIMUM_NUM)) return 0;
        move+=3;

        return move;
    }

    public int checkMove2() {
        final int MINIMUM_NUM = 9;
        int move = 0;

        if (!(getRandom() >= MINIMUM_NUM)) return 0;
        move+=getRandom2();

        return move;
    }

    public int getRandom() {
        Random rd = new Random();
        return rd.nextInt(10);
    }

    public int getRandom2() {
        Random rd = new Random();
        return rd.nextInt(100);
    }
}