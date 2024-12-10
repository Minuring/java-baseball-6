package baseball.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import baseball.error.ErrorType;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BaseballNumbersTest {

    @DisplayName("숫자가 3개가 아니면 예외 발생")
    @ParameterizedTest
    @MethodSource("invalidSizeList")
    void createBaseballNumbersWithInvalidSize(List<Integer> numbers) {
        assertThatThrownBy(() -> new BaseballNumbers(numbers))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(ErrorType.INVALID_SIZE.message());
    }

    static List<Arguments> invalidSizeList() {
        return List.of(Arguments.of(
            List.of(1, 2),
            List.of(1, 2, 3, 4)
        ));
    }
}