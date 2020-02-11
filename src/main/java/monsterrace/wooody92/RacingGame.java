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
            this.result.add(monster[i].name + "[" + monster[i].type + "]: " + getMoveResult(i));
        }
    }

    public String getMoveResult(int idx) {
        String moveResult = "";
        int move = monster[idx].getTotalMove(trialNumber);

        for (int i = 0; i < move; i++) {
            moveResult += "-";
        }
        return moveResult;
    }

    public void getWinner() {
        int temp = 0;
        String tempS = "";

        for (int i = 0; i < monster.length; i++) {
            System.out.println("total move: " + monster[i].totalMove);

            if (monster[i].totalMove > temp) {
                temp = monster[i].totalMove;
                tempS = monster[i].name;
            }
        }
        System.out.println("우스자는 " + tempS);
    }

}