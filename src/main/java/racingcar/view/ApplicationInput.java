package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class ApplicationInput {

    private static final String CAR_NAME_SPLITTER = ",";

    private String input() {
        return Console.readLine();
    }

    public List<String> inputCarName() {
        String inputCarNames = input();
        return List.of(inputCarNames.split(CAR_NAME_SPLITTER));
    }

    public long inputTryCount() {
        return Long.parseLong(input());
    }
}
