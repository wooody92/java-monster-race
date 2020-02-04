package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MonsterRace {
    public static void display() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("< 스릴만점 건전한 몬스터 경주 >");
        System.out.println("몬스터는 모두 몇 마리 인가요? ");
        int monsterCnt = Integer.parseInt(br.readLine());

        System.out.println("시도할 회수는 몇 회 인가요? ");
        int trial = Integer.parseInt(br.readLine());

        System.out.println("< 실행 결과 >");

        for(int i=0; i<monsterCnt; i++) {
            for (int j = 0; j < trial; j++) {
                calMove();
            }
            System.out.println();
        }
        br.close();
    }

    public static void calMove() {
        Random rd = new Random();
        int random = rd.nextInt(10);

        if (!(random >= 4)) return;
        for (int i = 0; i < random; i++) {
            System.out.print("-");
        }
    }
}