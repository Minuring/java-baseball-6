package baseball.view;

import static baseball.domain.BaseballNumbers.Result;

public class OutputView {

    private static final String PREFIX = "[ERROR] ";

    public static void printErrorMessage(String message) {
        System.out.println(PREFIX + message);
    }

    public static void printWelcomeMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printResult(Result result) {
        System.out.println(result);
    }
}
