package monsterrace.wooody92;

public class ResultView {
    public static void printResult(RacingGame racingGame) {
        System.out.println("\n< 실행 결과 >");
//        for (String resultMove : racingGame.result) {
//            System.out.println(resultMove);
//        }
        System.out.println("\n축하합니다! 우승자는 바로: " + racingGame.getWinner());
    }
}