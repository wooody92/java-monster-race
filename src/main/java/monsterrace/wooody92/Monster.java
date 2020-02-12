package monsterrace.wooody92;

import java.util.Random;

abstract class Monster {
    String name;
    String type;

    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract int getMove();

    public int getRandom(int range) {
        Random rd = new Random();
        return rd.nextInt(range);
    }
}
