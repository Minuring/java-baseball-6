package baseball.domain;

import baseball.error.ErrorType;
import java.util.List;

public class BaseballNumbers {

    private final List<Integer> numbers;

    public BaseballNumbers(List<Integer> numbers) {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException(ErrorType.INVALID_SIZE.message());
        }
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
