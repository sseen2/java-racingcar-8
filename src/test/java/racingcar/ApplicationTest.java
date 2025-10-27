package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.view.message.ErrorMessage;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 기능_테스트() {
        assertRandomNumberInRangeTest(
            () -> {
                run("pobi,woni", "1");
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
            },
            MOVING_FORWARD, STOP
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("시도 횟수가 숫자가 아닌 경우 예외 반환")
    void tryCountNotNumberTest() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,java", "일"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage(ErrorMessage.TRY_COUNT_NOT_NUMBER.getMessage())
        );
    }

    @Test
    @DisplayName("시도 횟수가 음수인 경우 예외 반환")
    void tryCountNotPositiveTest() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,java", "-1"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage(ErrorMessage.TRY_COUNT_NOT_POSITIVE.getMessage())
        );
    }

    @Test
    @DisplayName("시도 횟수가 0인 경우 예외 반환")
    void tryCountZeroTest() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,java", "0"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage(ErrorMessage.TRY_COUNT_NOT_POSITIVE.getMessage())
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
