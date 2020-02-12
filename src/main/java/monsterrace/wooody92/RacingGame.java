package monsterrace.wooody92;

import java.util.ArrayList;

public class RacingGame {
    private int trialNumber;
    private Monster[] monster;
    public ArrayList<String> result;

    public RacingGame(Monster[] monster, int trialNumber) {
        this.trialNumber = trialNumber;
        this.monster = monster;
        this.result = new ArrayList<>();
    }

    public void racing() {
        for (int i = 0; i < monster.length; i++) {
            this.result.add(monster[i].getName() + "[" + monster[i].getType() + "]: " + getMoveResult(i));
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
        System.out.println("type이 모니? " + monster[idx].getType());
        for (int i = 0; i < trialNumber; i++) {
            totalMove += monster[idx].getMove();
        }
        System.out.println("결과값은? " + totalMove);
        return totalMove;
    }

//    public void getWinner() {
//        int temp = 0;
//        String tempS = "";
//
//        for (int i = 0; i < monster.length; i++) {
//            System.out.println("total move: " + totalMove);
//
//            if (totalMove > temp) {
//                temp = totalMove;
//                tempS = monster[i].name;
//            }
//        }
//        System.out.println("우스자는 " + tempS);
//    }

}