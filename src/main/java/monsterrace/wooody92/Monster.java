package monsterrace.wooody92;

import java.util.Random;

abstract class Monster {
    String name;
    String type;
    int trialNumber = 10;

    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getMoveResult() {
        String moveResult = "";
        int move = getMoveCnt();

        for (int i = 0; i < move; i++) {
            moveResult += "-";
        }
        return moveResult;
    }

    public int getMoveCnt() {
        int moveCnt = 0;
        System.out.println("type이 모니? " + type);
        for (int i = 0; i < trialNumber; i++) {
            moveCnt += checkMove();
        }
        System.out.println("결과값은? " + moveCnt);
        return moveCnt;
    }

    abstract int checkMove();

    public int getRandom() {
        Random rd = new Random();
        return rd.nextInt(10);
    }
}
