package monsterrace.wooody92;

public class Flyer extends Monster {
    public Flyer(String name, String type) {
        super(name, type);
    }

    @Override
    int checkMove() {
        final int MINIMUM_NUM = 6;
        int move = 0;

        if (!(getRandom() >= MINIMUM_NUM)) return 0;
        System.out.println("플라이임");
        move+=3;

        return move;
    }
}
