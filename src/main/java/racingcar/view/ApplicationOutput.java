package racingcar.view;

import java.util.List;
import racingcar.Car;
import racingcar.view.message.SystemMessage;

public class ApplicationOutput {

    private static final String NAME_POSITION_DELIMITER = " : ";
    private static final String POSITION_MARKER = "-";
    private static final String WINNER_NAME_PARSER = ", ";

    private void print(String message) {
        System.out.println(message);
    }

    public void printBlankLine() {
        System.out.println();
    }

    public void printInputCarName() {
        print(SystemMessage.INPUT_CAR_NAME.getMessage());
    }

    public void printInputTryCount() {
        print(SystemMessage.INPUT_TRY_COUNT.getMessage());
    }

    public void printRaceResult() {
        print(SystemMessage.OUTPUT_RACE_RESULT.getMessage());
    }

    public void printTurnResult(List<Car> cars) {
        for (Car car : cars) {
            String name = car.getName();
            int position = car.getPosition();
            print(name + NAME_POSITION_DELIMITER + POSITION_MARKER.repeat(Math.max(0, position)));
        }
        printBlankLine();
    }

    public void printWinner(List<String> winnerNames) {
        print(SystemMessage.OUTPUT_RACE_WINNER.getMessage() + String.join(WINNER_NAME_PARSER, winnerNames));
    }
}
