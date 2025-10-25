package racingcar.view.message;

public enum ErrorMessage {

    CAR_NAME_NOT_EMPTY("자동차 이름의 길이는 1자 이상이어야 합니다."),
    CAR_NAME_TOO_LONG("자동차 이름의 길이는 5자 이하여야 합니다."),
    CAR_NAME_LETTER("자동차 이름은 한글/영어로 이루어져야 합니다."),
    TRY_COUNT_NOT_NUMBER("시도 횟수 입력 값은 숫자여야 합니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
