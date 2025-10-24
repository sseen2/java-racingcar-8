package racingcar.message;

public enum SystemMessage {

    CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    TRY_COUNT("시도할 횟수는 몇 회인가요?"),
    RACE_RESULT("실행 결과"),
    RACE_WINNER("최종 우승자 : ");

    private final String message;


    SystemMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
