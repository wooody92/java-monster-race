package monsterrace.wooody92;

public class Run extends Monster{
    public Run(String name, String type) {
        super(name, type);
    }

    @Override
    public int move() {
        final int MINIMUM_NUM = 4;
        final int RANGE = 10;
        final int ABILITY = 1;
        int move = 0;

        if (!(getRandom(RANGE) >= MINIMUM_NUM)) return 0;
        move += ABILITY;

        return move;
    }
}
