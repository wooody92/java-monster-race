package monsterrace.wooody92;

import java.util.ArrayList;

public class RacingGame {
    int trialNumber;
    Monster[] monster;
    ArrayList<String> result;

    public RacingGame(Monster[] monster, int trialNumber) {
        this.trialNumber = trialNumber;
        this.monster = monster;
        this.result = new ArrayList<>();
    }

    public void racing() {
        for (int i = 0; i < monster.length; i++) {
            this.result.add(monster[i].name + "[" + monster[i].type + "]: " + monster[i].getMoveResult());
        }
    }
}