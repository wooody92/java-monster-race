package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private BufferedReader br;
    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int getMonsterNum() throws IOException {
        System.out.println("< 스릴만점 건전한 몬스터 경주 >");
        System.out.println("몬스터는 모두 몇 마리 인가요? ");
        int monsterNumber = Integer.parseInt(br.readLine());

        return monsterNumber;
    }

    public int getTrialNum() throws IOException {
        System.out.println("시도할 회수는 몇 회 인가요? ");
        int trialNumber = Integer.parseInt(br.readLine());

        return trialNumber;
    }
}
