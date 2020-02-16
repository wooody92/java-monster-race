package monsterrace.wooody92;

import java.util.Random;

abstract class Monster {
    private String name;
    private String type;

    public Monster(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return name + "[" + type + "]: ";
    }

    abstract int move();

    public int getRandom(int range) {
        Random rd = new Random();
        return rd.nextInt(range);
    }
}
