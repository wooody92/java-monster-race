package monsterrace.wooody92;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public int getTrialNumber() {
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
        int monsterNumber = getMonsterNumber();
        Monster[] monster = new Monster[monsterNumber];
        System.out.println("경주할 몬스터 이름과 종류를 입력하세요 (쉼표(,)를 기준으로 구분)");

        for (int i = 0; i < monsterNumber; i++) {
            monster[i] = createMonster();
        }
        return monster;
    }

    public Monster createMonster() {
        String monsterInfo = inputStr();
        try {
            String[] monster = monsterInfo.split(",");
            String name = monster[0].trim();
            String type = monster[1].trim();
            if (monster.length > 2) throw new ArrayIndexOutOfBoundsException();

            switch (type) {
                case "1":
                    return new Runner(name, type);
                case "2":
                    return new Flyer(name, type);
                case "3":
                    return new Esper(name, type);
            }
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("입력 형식은 다음과 같아요. [몬스터 이름, 몬스터 종류]");
            return createMonster();
        } catch (IllegalArgumentException e) {
            System.out.println("몬스터 종류는 다음 중 골라주세요. [달리기, 비행, 에스퍼]");
            return createMonster();
        }
    }

    public String inputStr() {
        String inputStr = null;
        try {
            inputStr = br.readLine();
        } catch (IOException e) {
            System.out.println("IOException" + e.toString());
        }
        return inputStr;
    }

//    enum MonsterType {
//        RUNNER("달리기"), FLYER("비행"), ESPER("에스퍼");
//        String monsterType;
//
//        MonsterType(String monsterType) {
//            this.monsterType = monsterType;
//        }
//
//        public String getMonsterType() {
//            return monsterType;
//        }
//    }
}

