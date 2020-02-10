package monsterrace.wooody92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputView {
    private BufferedReader br;

    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int getMonsterNumber() throws IOException {
        System.out.println("< 스릴만점 건전한 몬스터 경주 >");
        System.out.println("몬스터는 모두 몇 마리 인가요? ");
        int monsterNumber = Integer.parseInt(br.readLine());
        return monsterNumber;
    }

    public Monster[] getMonster() throws IOException {
        ArrayList<String> monsterInfo = new ArrayList<>();
        int monsterNumber = getMonsterNumber();
        Monster[] monster = new Monster[monsterNumber];
        System.out.println("경주할 몬스터 이름과 종류를 입력하세요 (쉼표(,)를 기준으로 구분)");

        for (int i = 0; i < monsterNumber; i++) {
            monsterInfo.add(br.readLine());
            monster[i] = parseMonsterInfo(monsterInfo.get(i));
        }
        return monster;
    }

    public Monster parseMonsterInfo(String monsterInfo) {
        String[] monster = monsterInfo.split(",");
        String name = monster[0].trim();
        String type = monster[1].trim();
        return new Monster(name, type);
    }

    public int getTrialNum() throws IOException {
        System.out.println("시도할 회수는 몇 회 인가요? ");
        int trialNumber = Integer.parseInt(br.readLine());
        br.close();
        return trialNumber;
    }

}

