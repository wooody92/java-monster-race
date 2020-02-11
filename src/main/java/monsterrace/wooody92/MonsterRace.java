package monsterrace.wooody92;

import java.io.IOException;
import java.util.ArrayList;

public class MonsterRace {
    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        Monster[] monster = inputView.getMonster();
        int trialNumber = inputView.getTrialNumber();

        RacingGame racingGame = new RacingGame(monster, trialNumber);
        racingGame.racing();

        ResultView.printResult(racingGame);
    }
}