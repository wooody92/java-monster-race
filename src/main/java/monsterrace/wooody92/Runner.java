package monsterrace.wooody92;

public class Runner extends Monster{
    public Runner(String name, String type) {
        super(name, type);
    }

    @Override
    int checkMove() {
        final int MINIMUM_NUM = 4;
        int move = 0;

        if (!(getRandom() >= MINIMUM_NUM)) return 0;
        System.out.println("러너임");
        move++;

        return move;
    }
}
