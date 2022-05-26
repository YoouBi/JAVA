// Fibonacci 수열
// 1 1 2 3 5 8 13 21 34 ...
// 100 이하

public class Fibonacci {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 1; ; i += j) {
			System.out.print(i +" ");
			j += i;
			if (j >= 100){
				break;
			}
			System.out.print(j +" ");
		}
		// while문으로도
		// 코드는 이해하기 쉬우면서 연산 빠르면서 '정확'하면서
	}
}