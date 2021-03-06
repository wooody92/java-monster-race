## STEP4

#### 피드백(step3)
https://github.com/code-squad/java-monster-race/pull/90

1. 몬스터 타입명은 몬스터가 가지고 있으면 좋지 않을까요?
   나중에 수정이 일어날 경우 코드 작성한 본인은 쉽게 찾을 수 있지만 그렇지 않은 분들은 코드를 훑어가면서 찾아야하는 불편함이 생길 것 입니다.

2. RacingGame이 ResultView 역할을 대신하고 있는 것으로 보여요
   만약 result 점수 표시 문자 '-' 에서 다른 문자로 바뀔 경우 위에서 코멘트 한 것과 마찬가지로 코드를 모두 읽어야 바꿀 수 있을 듯 합니다. 클래스 분리의 목적에 대해서 잘 생각해주세요~!

3. getMove 메소드 이름보다는 move 라는 이름이 더 어울려보입니다.
   그리고 RacingGame 클래스에 있는 getTotalMove()가 Monster에 있는 것이 어울려보이는데 한번 고민 해보시길 권해드립니다.

-----
# 몬스터 레이스 4단계 구현하기

## 기능 요구사항

- 몬스터 데이터 입력부를 분리한다.
- 입력받은 몬스터 데이터를 monster.txt 에 저장한다.
- 몬스터 데이터에 대한 입력 / 수정 / 삭제를 구현한다.

## 프로그래밍 요구사항

- junit을 활용한 단위 테스트 코드를 추가한다.
- 파일 입출력을 이용해서 데이터를 저장한다.

## 실행결과

```txt
<신나는 몬스터 경주>
1. 몬스터 정보
2. 게임 시작
원하는 메뉴를 선택해 주세요(1 - 2)
1

<몬스터 정보 메뉴>
1. 전체 몬스터 정보 보기
2. 몬스터 정보 수정
3. 새로운 몬스터 정보 입력
4. 몬스터 정보 삭제
5. 이전 메뉴로
원하는 메뉴를 선택해 주세요 (1 - 5)

//이하 생략
코드복사
```

## 힌트

- 자바지기 TDD 영상을 먼저 시청한다.
- 콘솔 UI와 연결된 코드는 단위 테스트하기 힘들다. 따라서 콘솔 UI와 연결된 코드는 단위 테스트 대상에서 제외한다.
- 몬스터를 이동(move 메소드)하는 메소드에 대한 테스트 코드를 추가한다.
  - 이동조건에 따라 적절히 이동했는가?
- 몬스터 목록의 위치 값이 가장 큰 값을 찾는 메소드에 대한 테스트 코드를 추가한다.
- 몬스터 목록에서 가장 큰 위치 값에 해당하는 몬스터 목록을 구하는 메소드에 대한 테스트 코드를 추가한다.
- 몬스터 정보를 처리하는 메소드가 정상적으로 동작하는가?