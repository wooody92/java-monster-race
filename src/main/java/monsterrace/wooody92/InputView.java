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

    public int getMonsterNumber() {
        System.out.println("< 스릴만점 건전한 몬스터 경주 >");
        System.out.println("몬스터는 모두 몇 마리 인가요? ");
        return getNumber();
    }

    public int getTrialNum() {
        System.out.println("시도할 회수는 몇 회 인가요? ");
        return getNumber();
    }

    public int getNumber() {
        int inputNumber;
        try {
            inputNumber = Integer.parseInt(br.readLine());
            if (inputNumber < 0) throw new NumberFormatException();
            return inputNumber;
        } catch (NumberFormatException | IOException e) {
            System.out.println("양의 정수만 입력 가능합니다. 다시 입력 해주세요.");
            return getNumber();
        }
    }

    public Monster[] getMonster() {
        ArrayList<String> monsterInfo = new ArrayList<>();
        int monsterNumber = getMonsterNumber();
        Monster[] monster = new Monster[monsterNumber];
        System.out.println("경주할 몬스터 이름과 종류를 입력하세요 (쉼표(,)를 기준으로 구분)");

        for (int i = 0; i < monsterNumber; i++) {
            monsterInfo.add(inputStr());
            monster[i] = parseMonsterInfo(monsterInfo.get(i));
        }
        return monster;
    }

    public String inputStr() {
        String inputStr = null;
        try {
            inputStr = br.readLine();
        } catch (IOException e) {
            System.out.println("여기서 발생1");
            e.printStackTrace();
        }
        return inputStr;
    }

    public Monster parseMonsterInfo(String monsterInfo) {
        String[] monster = monsterInfo.split(",");
        String name = monster[0].trim();
        String type = monster[1].trim();

        switch (type) {
            case "1": return new Runner(name, type);
            case "2": return new Flyer(name, type);
            case "3": return new Esper(name, type);
        }
        return new Runner(name, type);
    }
}

