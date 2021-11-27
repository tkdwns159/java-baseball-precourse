package baseball;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static class Game {
        public List<Integer> answer;
        public boolean done;
        Game() {
			startGame();
            done = false;
		}

		private void startGame(){
			answer = Randoms.pickUniqueNumbersInRange(1, 9, 3);
		}
    }

    public static void main(String[] args) {}
}
