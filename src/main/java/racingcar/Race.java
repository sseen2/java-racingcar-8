package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Race {

    private static final int RANDOM_START_NUMBER = 0;
    private static final int RANDOM_END_NUMBER = 9;

    private final List<Car> cars;

    public Race(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> start() {
        for (Car car : cars) {
            int randomValue = Randoms.pickNumberInRange(RANDOM_START_NUMBER, RANDOM_END_NUMBER);
            car.move(randomValue);
        }

        return cars;
    }

    public List<String> winner() {
        int maxPosition = getMaxPosition();

        return cars.stream()
                .filter(car -> car.isPositionEqual(maxPosition))
                .map(Car::getName)
                .toList();
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }
}
