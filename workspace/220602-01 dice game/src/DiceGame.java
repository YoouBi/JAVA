
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	int diceFace;
	int userGuess;

	private void rollDice() { // 외부에서 호출하면 diceFace의 상태라는게 변하기 때문에 퍼블릭으로 만들면 문제가 생김
		Random random = new Random();
		// diceFace = (int) (Math.random() * 6) + 1; // Math 안에는 스태틱한 메소스들이 들어있다고 기울어져있다
		// 난수, 즉 랜덤값을(random()) 호출하면 더블 값을 주기 때문에 int로 바꾼것
		diceFace = random.nextInt(6) + 1;
	} // 굳이 퍼블릭으로 만들겠다면 public int로 반환하고
	// return random.nextInt(6) + 1; 으로 바꾸고 밑에서 대입연산이 일어나게끔 변경

	private int getUserInput(String prompt) { // 메소드 머리
		System.out.println(prompt); // 출력도 하고
		Scanner s = new Scanner(System.in);
		return s.nextInt(); // int 값도 돌려주겠다
	} // void로 출력값을 낸게 아니라 굳이 int 값으로 받은 건 앞으로도 활용을 하겠다는 의도에 맞게끔 만든 것

	private void checkUserGuess() {
		if (diceFace == userGuess)
			System.out.println("맞았습니다");
		else
			System.out.println("틀렸습니다");
	}

	public void startPlaying() {
		userGuess = getUserInput("예상값을 입력하시오: ");
		rollDice();
		checkUserGuess();
		// boolean result = cheakUserGuss();
		// if(result) {
		// break;
		// }
	}
}