package baseball.view;

public class OutputView {

    private static final String PREFIX = "[ERROR] ";

    public static void printErrorMessage(String message) {
        System.out.println(PREFIX + message);
    }
}
