package monsterrace.wooody92;

public class Fly extends Monster {
    public Fly(String name, String type) {
        super(name, type);
    }

    @Override
    public int getMove() {
        final int MINIMUM_NUM = 6;
        final int RANGE = 10;
        final int ABILITY = 3;
        int move = 0;

        if (!(getRandom(RANGE) >= MINIMUM_NUM)) return 0;
        move += ABILITY;

        return move;
    }
}
