package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.view.message.ErrorMessage;

public class ApplicationInput {

    private static final String CAR_NAME_SPLITTER = ",";

    private String input() {
        return Console.readLine().trim();
    }

    public List<String> inputCarName() {
        String inputCarNames = input();
        return List.of(inputCarNames.split(CAR_NAME_SPLITTER));
    }

    public long inputTryCount() {
        long tryCount = parseLong(input());
        validatePositive(tryCount);
        return tryCount;
    }

    private long parseLong(String input) {
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.TRY_COUNT_NOT_NUMBER.getMessage());
        }
    }

    private void validatePositive(long tryCount) {
        if (tryCount <= 0) {
            throw new IllegalArgumentException(ErrorMessage.TRY_COUNT_NOT_POSITIVE.getMessage());
        }
    }
}
