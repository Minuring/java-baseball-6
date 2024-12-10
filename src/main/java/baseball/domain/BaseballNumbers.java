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

    public Result compare(BaseballNumbers other) {
        int strike = 0;
        int ball = 0;
        for (int seq = 0; seq < 3; seq++) {
            int myNumber = numbers.get(seq);
            int otherNumber = other.numbers.get(seq);

            if (myNumber == otherNumber) {
                strike++;
            } else if (other.numbers.contains(myNumber)) {
                ball++;
            }
        }
        return new Result(strike, ball);
    }

    public record Result(int strike, int ball) {

        @Override
        public String toString() {
            if (ball == 0 && strike == 0) {
                return "낫싱";
            }

            String text = "";
            if (ball > 0) {
                text += String.format("%d볼 ", ball);
            }
            if (strike > 0) {
                text += String.format("%d스트라이크 ", strike);
            }
            return text;
        }
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
