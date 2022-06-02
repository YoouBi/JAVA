import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	int diceFace;
	int userGuess;

	private void rollDice() {
		Random random = new Random();
//		diceFace = (int) (Math.random() * 6) + 1;
		diceFace = random.nextInt(6) + 1;
	}

	private void printPrompt(String prompt) {
		System.out.println(prompt);
	}
	
	private int getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private boolean checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("맞았습니다");
			return true;
		} else {
			System.out.println("틀렸습니다");
			return false;
		}
	}

	public void startPlaying() {
		while (true) {
			printPrompt("예상값을 입력하시오: ");
			userGuess = getUserInput();
			rollDice();
			boolean result = checkUserGuess();
			if (result) {
				break;
			}
		}
	}
}
