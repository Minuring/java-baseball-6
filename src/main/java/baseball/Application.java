package baseball;

import baseball.view.RestartInputView;

public class Application {

    public static void main(String[] args) {
        while (true) {
            BaseballFacade.start();

            Boolean restart = new RestartInputView().readUntilSuccess();
            if (!restart) {
                return;
            }
        }
    }
}
