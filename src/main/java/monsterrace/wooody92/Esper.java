package monsterrace.wooody92;

import java.util.Random;

public class Esper extends Monster {
    public Esper(String name, String type) {
        super(name, type);
    }

    @Override
    int checkMove() {
        final int MINIMUM_NUM = 9;
        int move = 0;

        if (!(getRandom() >= MINIMUM_NUM)) return 0;
        System.out.println("에스퍼임");
        move+=getRandom2();

        return move;
    }

    public int getRandom2() {
        Random rd = new Random();
        return rd.nextInt(100);
    }
}
