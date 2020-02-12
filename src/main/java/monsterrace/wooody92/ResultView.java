package monsterrace.wooody92;

import java.util.stream.Stream;

public class ResultView {
    public static void printResult(RacingGame racingGame) {
        System.out.println("\n< 실행 결과 >");

        Stream<String> stringStream = racingGame.result.stream();
        stringStream.forEach(System.out::println);

        System.out.println("\n축하합니다! 우승자는 바로: " + racingGame.getWinner());
    }
}