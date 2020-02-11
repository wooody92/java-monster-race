package monsterrace.wooody92;

public class MonsterRace {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        Monster[] monster = inputView.getMonster();
        int trialNumber = inputView.getTrialNumber();

        RacingGame racingGame = new RacingGame(monster, trialNumber);
        racingGame.racing();

        ResultView.printResult(racingGame);
    }
}