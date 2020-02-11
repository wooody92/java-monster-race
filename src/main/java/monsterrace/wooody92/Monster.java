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
        int move = getTotalMove();

        for (int i = 0; i < move; i++) {
            moveResult += "-";
        }
        return moveResult;
    }

    public int getTotalMove() {
        int totalMove = 0;
        System.out.println("type이 모니? " + type);
        for (int i = 0; i < trialNumber; i++) {
            totalMove += getMove();
        }
        System.out.println("결과값은? " + totalMove);
        return totalMove;
    }

    abstract int getMove();

    public int getRandom(int range) {
        Random rd = new Random();
        return rd.nextInt(range);
    }
}
