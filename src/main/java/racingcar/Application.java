package racingcar;

import java.util.List;
import racingcar.view.ApplicationInput;
import racingcar.view.ApplicationOutput;

public class Application {

    public static void main(String[] args) {
        ApplicationInput inputView = new ApplicationInput();
        ApplicationOutput outputView = new ApplicationOutput();

        outputView.printInputCarName();
        List<Car> cars = inputView.inputCarName()
                .stream()
                .map(Car::new)
                .toList();

        outputView.printInputTryCount();
        long tryCount = inputView.inputTryCount();
        outputView.printBlankLine();

        Race race = new Race(cars);

        outputView.printRaceResult();
        for (int i = 0; i < tryCount; i++) {
            List<Car> turnResult = race.start();
            outputView.printTurnResult(turnResult);
        }

        List<String> winnerNames = race.winner();
        outputView.printWinner(winnerNames);
    }
}
