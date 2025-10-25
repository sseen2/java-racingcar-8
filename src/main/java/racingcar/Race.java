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

    public List<String> start() {
        List<String> result = new ArrayList<>();
        for (Car car : cars) {
            car.tryMove(Randoms.pickNumberInRange(RANDOM_START_NUMBER, RANDOM_END_NUMBER));
            result.add(car.moveResult());
        }

        return result;
    }
}
