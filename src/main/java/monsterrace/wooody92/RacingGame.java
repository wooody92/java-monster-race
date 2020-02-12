package monsterrace.wooody92;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int trialNumber;
    private List<Monster> monster;
    private List<Integer> move;
    public ArrayList<String> result;

    public RacingGame(List<Monster> monster, int trialNumber) {
        this.trialNumber = trialNumber;
        this.monster = monster;
        this.move = new ArrayList<>();
        this.result = new ArrayList<>();
    }

    public void racing() {
        for (int i = 0; i < monster.size(); i++) {
            //this.result.add(monster.get(i) + getMoveResult(i));
            System.out.println(monster.get(i) + getMoveResult(i));
        }
    }

    private String getMoveResult(int idx) {
        String moveResult = "";
        int move = getTotalMove(idx);

        for (int i = 0; i < move; i++) {
            moveResult += "-";
        }
        return moveResult;
    }

    private int getTotalMove(int idx) {
        int totalMove = 0;
        for (int i = 0; i < trialNumber; i++) {
            totalMove += monster.get(idx).getMove();
        }
        move.add(totalMove);
        return totalMove;
    }

    public String getWinner() {
        int idx = 0;
        for (Integer value : move) {
            if (value > move.get(idx)){
                idx = move.indexOf(value);
            }
        }
        return monster.get(idx).getName();
    }
}