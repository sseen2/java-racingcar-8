package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    private static final String CAR_NAME = "test";

    @Test
    @DisplayName("자동차 이름이 정상적으로 초기화")
    void initCarTest() {
        Car car = new Car(CAR_NAME);

        assertThat(CAR_NAME).isEqualTo(car.getName());
    }

    @Test
    @DisplayName("자동차 이동 성공")
    void moveTest() {
        Car car = new Car(CAR_NAME);
        car.move();
        int expectedResult = 1;

        int result = car.getPosition();

        assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    @DisplayName("자동차 상태 문자열은 '이름 : 이동거리' 형식으로 반환")
    void toStringTest() {
        Car car = new Car(CAR_NAME);
        car.move();
        String expectedResult = "test : -";

        String result = car.toString();

        assertThat(expectedResult).isEqualTo(result);
    }
}
