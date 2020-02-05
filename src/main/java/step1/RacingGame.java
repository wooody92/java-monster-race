package step1;

import java.util.Random;

public class RacingGame {
    int monsterNumber;
    public RacingGame(int monsterNumber) {
        this.monsterNumber = monsterNumber;
    }

    public void racing(int trialNumber) {
        System.out.println("< 실행 결과 >");
        for(int i = 0; i < monsterNumber; i++) {
            for (int j = 0; j < calMove(trialNumber); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public int calMove(int trialNumber) {
        Random rd = new Random();
        int moveCnt = 0;

        for (int i = 0; i < trialNumber; i++) {
            int random = rd.nextInt(10);
            if (!(random >= 4)) {
                random = 0;
            }
            moveCnt += random;
        }
        return moveCnt;
    }
}

