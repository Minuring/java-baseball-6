package baseball.view;

import baseball.error.ErrorType;

public class RestartInputView extends InputViewTemplate<Boolean>{

    @Override
    public void printHeader() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    @Override
    public Boolean bind(String userInput) {
        if (userInput.matches("[12]")) {
            return userInput.equals("1");
        }
        throw new IllegalArgumentException(ErrorType.INVALID_INPUT.message());
    }
}
