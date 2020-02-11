package monsterrace.wooody92;

public class Esper extends Monster {
    public Esper(String name, String type) {
        super(name, type);
    }

    @Override
    int getMove() {
        final int MINIMUM_NUM = 9;
        final int RANGE = 10;
        final int ABILITY = 100;
        int move = 0;

        if (!(getRandom(RANGE) >= MINIMUM_NUM)) return 0;
        move += getRandom(ABILITY);

        return move;
    }
}
