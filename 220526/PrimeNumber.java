// 소수 목록 만들기
// 정수 1개를 소수인지 아닌지 판별 할 수 있다면 모든 정수 또한 알 수 있을 것. 판별할 정수를 바꾸면 되니까...?

public class PrimeNumber {
	public static boolean isPrime(int i) {
		int count = 0;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false; // return을 하겠다고 하면 리턴은 무조건 됨
		}
	}
	
	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++) { // 2 ~ 10000
			boolean result = isPrime(i); // 소순지 알아볼거다. 참, 거짓
			if (result) { // 참이면
				System.out.println(i); // 출력
			}
		}
	}
}