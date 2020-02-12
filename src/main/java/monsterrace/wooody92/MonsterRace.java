package monsterrace.wooody92;

import java.util.List;

public class MonsterRace {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        List<Monster> monster = inputView.getMonster();
        int trialNumber = inputView.getTrialNumber();

        RacingGame racingGame = new RacingGame(monster, trialNumber);
        racingGame.racing();

        ResultView.printResult(racingGame);
    }
}