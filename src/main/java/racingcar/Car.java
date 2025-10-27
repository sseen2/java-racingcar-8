package racingcar;

import racingcar.view.message.ErrorMessage;

public class Car {

    private static final int NAME_MAX_LENGTH = 5;
    private static final String NAME_PATTERN = "^[a-zA-Z가-힣0-9 ]+$";
    private static final int MOVE_CONDITION = 4;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;

        validateName();
    }

    public void move(int randomValue) {
        if (randomValue >= MOVE_CONDITION) {
            position++;
        }
    }

    public boolean isPositionEqual(int position) {
        return this.position == position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void validateName() {
        validateNameLength();
        validateNamePattern();
    }

    private void validateNameLength() {
        if (name.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_NOT_EMPTY.getMessage());
        }

        if (name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_TOO_LONG.getMessage());
        }
    }

    private void validateNamePattern() {
        if (!name.matches(NAME_PATTERN)) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_NOT_MATCH_PATTERN.getMessage());
        }
    }
}
