package step2;

import java.io.IOException;

public class MonsterRace {
    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        int monsterNumber = inputView.getMonsterNum();
        int trialNumber = inputView.getTrialNum();

        RacingGame racingGame = new RacingGame(monsterNumber);
        racingGame.racing(trialNumber);

        ResultView.printResult(racingGame);
    }
}