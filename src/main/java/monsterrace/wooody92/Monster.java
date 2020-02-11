package monsterrace.wooody92;

import java.util.Random;

abstract class Monster {
    String name;
    String type;
    int totalMove;

    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public int getTotalMove(int trialNumber) {
        int totalMove = 0;
        System.out.println("type이 모니? " + type);
        for (int i = 0; i < trialNumber; i++) {
            totalMove += getMove();
        }
        System.out.println("결과값은? " + totalMove);
        this.totalMove = totalMove;
        return totalMove;
    }

    abstract int getMove();

    public int getRandom(int range) {
        Random rd = new Random();
        return rd.nextInt(range);
    }
}
