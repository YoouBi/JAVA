public class LoopFor2 {
	public static void main(String[] args) {
		// 10 ~ 99 사이의 정수 중 10의 자리 수와 1의 자리 수의 합이 7인 수만 출력하기
		// 16 25 34 43 52 61 70
		// 16부터 70까지 9씩 증가하고 있는 반복문도 괜찮지만 조건이 바뀔수도 있으므로!
		for (int i = 10; i <= 99; i++) {
			if ((i / 10) + (i % 10) == 7) {
				System.out.println(i);
			}
		}
		
		/*
		for (int i = 10; i <= 99; i++) {
			int left = i / 10;
			int right = i % 10;
			if (left + right == 7) {
				System.out.println(i);
			}
		} */
	}
}