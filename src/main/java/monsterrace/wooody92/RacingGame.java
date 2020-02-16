package monsterrace.wooody92;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int trialNumber;
    private List<Monster> monster;
    private List<Integer> move;
    public List<String> result;

    public RacingGame(List<Monster> monster, int trialNumber) {
        this.trialNumber = trialNumber;
        this.monster = monster;
        this.move = new ArrayList<>();
        this.result = new ArrayList<>();
    }

    public void racing() {
        for (int i = 0; i < monster.size(); i++) {
            this.result.add(monster.get(i) + getMoveResult(i));
        }
    }

    private String getMoveResult(int idx) {
        StringBuilder sb = new StringBuilder();
        int move = getTotalMove(idx);
        for (int i = 0; i < move; i++) {
            sb.append("-");
        }
        return sb.toString();
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
            idx = (value > move.get(idx)) ? move.indexOf(value) : idx;
        }
        return monster.get(idx).getName();
    }
}