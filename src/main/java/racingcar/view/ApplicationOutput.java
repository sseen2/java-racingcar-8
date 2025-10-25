package racingcar.view;

import racingcar.view.message.SystemMessage;

public class ApplicationOutput {

    private void print(String message) {
        System.out.println(message);
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

    public void printWinner() {
        print(SystemMessage.OUTPUT_RACE_WINNER.getMessage());
    }
}
