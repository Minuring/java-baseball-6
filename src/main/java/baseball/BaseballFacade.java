package baseball;

import baseball.domain.BaseballNumbers;
import baseball.domain.BaseballNumbers.Result;
import baseball.view.BaseballNumbersInputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class BaseballFacade {

    public static void start() {
        OutputView.printWelcomeMessage();
        List<Integer> computerNumbers = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        BaseballNumbers computer = new BaseballNumbers(computerNumbers);

        while (true) {
            BaseballNumbers user = new BaseballNumbersInputView().readOnce();
            Result result = user.compare(computer);
            OutputView.printResult(result);

            if (result.strike() == 3) {
                OutputView.printWinningMessage();
                return;
            }
        }
    }
}
