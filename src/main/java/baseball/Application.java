package baseball;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Application {
	public static class Game {
		public List<Integer> answer;
		public boolean done;

		Game() {
			startGame();
			done = false;
		}

		private void startGame() {
			answer = Randoms.pickUniqueNumbersInRange(1, 9, 3);
		}

		public int compareEach(List<Integer> answer, Integer num, int pos) {
			if (answer.get(pos).equals(num)) {
				return 1;
			}
			for (int i = 0; i < 3; i++) {
				if (answer.get(i).equals(num)) {
					return 0;
				}
			}
			return -1;
		}

	}

	public static void main(String[] args) {
	}
}
