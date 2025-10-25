package racingcar.view.message;

public enum SystemMessage {

    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_TRY_COUNT("시도할 횟수는 몇 회인가요?"),
    OUTPUT_RACE_RESULT("실행 결과"),
    OUTPUT_RACE_WINNER("최종 우승자 : ");

    private final String message;


    SystemMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
