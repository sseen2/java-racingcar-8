package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.view.message.ErrorMessage;

public class CarTest {

    private static final String CAR_NAME = "test";
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    @DisplayName("자동차 이름이 정상적으로 초기화")
    void initCarTest() {
        Car car = new Car(CAR_NAME);

        assertThat(CAR_NAME).isEqualTo(car.getName());
    }

    @Test
    @DisplayName("랜덤 생성된 값이 4 이상일 경우 자동차 전진 성공")
    void moveTest() {
        Car car = new Car(CAR_NAME);
        int expectedResult = 1;

        car.move(MOVING_FORWARD);

        int result = car.getPosition();
        assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    @DisplayName("랜덤 생성된 값이 3 이하인 경우 자동차 전진 실패")
    void move() {
        Car car = new Car(CAR_NAME);
        int expectedResult = 0;

        car.move(STOP);

        int result = car.getPosition();
        assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    @DisplayName("자동차 이름이 비어있는 경우 예외 반환")
    void nameEmptyTest() {
        String emptyName = "";

        assertThatThrownBy(() -> new Car(emptyName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.CAR_NAME_NOT_EMPTY.getMessage());
    }

    @Test
    @DisplayName("자동차 이름이 5자 초과인 경우 예외 반환")
    void nameTooLongTest() {
        String tooLongName = "매우 긴 자동차 이름";

        assertThatThrownBy(() -> new Car(tooLongName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.CAR_NAME_TOO_LONG.getMessage());
    }

    @Test
    @DisplayName("자동차 이름이 한글/영어/숫자가 아닌 이름인 경우 예외 반환")
    void namePatternTest() {
        String notMatchName = "특수문자!";

        assertThatThrownBy(() -> new Car(notMatchName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.CAR_NAME_NOT_MATCH_PATTERN.getMessage());
    }
}
