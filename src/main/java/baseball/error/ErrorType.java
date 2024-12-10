package baseball.error;

public enum ErrorType {

    INVALID_INPUT("잘못된 입력입니다."),
    INVALID_SIZE("숫자는 반드시 3자리여야 합니다.")
    ;

    private final String message;

    ErrorType(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
