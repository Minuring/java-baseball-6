package baseball.view;

import baseball.domain.BaseballNumbers;
import baseball.error.ErrorType;
import java.util.List;

public class BaseballNumbersInputView extends InputViewTemplate<BaseballNumbers> {

    @Override
    public void printHeader() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    @Override
    public BaseballNumbers bind(String userInput) {
        validateDigit(userInput);
        List<Integer> numbers = userInput.chars()
            .map(Character::getNumericValue)
            .boxed()
            .toList();

        return new BaseballNumbers(numbers);
    }

    private static void validateDigit(String input) {
        if (!input.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException(ErrorType.INVALID_INPUT.message());
        }
    }
}
