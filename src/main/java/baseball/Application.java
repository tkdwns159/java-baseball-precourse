package baseball;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
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

		public int compareEach(int num, int pos) {
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

		public void validateNumbers() {
			String input = Console.readLine();
			int[] output = new int[] {0, 0};
			for (int i = 0; i < 3; i++) {
				int number = input.charAt(i) - '0';
				int res = compareEach(number, i);
				if (res > -1) {
					output[res] += 1;
				}
			}
			if (output[1] == 3) {
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				done = true;
			} else if (output[0] == 3) {
				System.out.println("낫싱");
			} else {
				String ballMsg = "";
				String strikeMsg = "";
				if (output[0] > 0) {
					ballMsg += String.format("%d볼", output[0]);
				}
				if (output[1] > 0) {
					strikeMsg += String.format("%d스트라이크", output[1]);
				}
				if (!ballMsg.equals("")) {
					ballMsg += " ";
				}
				System.out.println(ballMsg + strikeMsg);
			}
		}

	}

	public static void main(String[] args) {
	}
}
