package monsterrace.wooody92;

import java.util.Random;

abstract class Monster {
    String name;
    String type;

    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract int checkMove();

    public int getRandom() {
        Random rd = new Random();
        return rd.nextInt(10);
    }
}
