package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    void tryMoveTest() {
        Car car = new Car(CAR_NAME);
        int expectedResult = 1;

        car.tryMove(MOVING_FORWARD);

        int result = car.getPosition();
        assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    @DisplayName("랜덤 생성된 값이 3 이하인 경우 자동차 전진 실패")
    void tryMoveTestNotMove() {
        Car car = new Car(CAR_NAME);
        int expectedResult = 0;

        car.tryMove(STOP);

        int result = car.getPosition();
        assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    @DisplayName("자동차 상태 문자열은 '이름 : 이동거리' 형식으로 반환")
    void toStringTest() {
        Car car = new Car(CAR_NAME);
        car.tryMove(MOVING_FORWARD);
        String expectedResult = "test : -";

        String result = car.toString();

        assertThat(expectedResult).isEqualTo(result);
    }
}
