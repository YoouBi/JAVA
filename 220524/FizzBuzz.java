// Fizz Buzz
// 1 2 Fizz 4 Buzz ... 15라면 Fizz Buzz
// 35까지

public class FizzBuzz {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 35; i++) {
			
			if (i % 15 == 0) { // if절의 특징으로 위쪽의 조건이 참이면 아래쪽의 조건은 쳐다보지도 않는다
				System.out.print("Fizz Buzz "); // 그래서 (i % 15 == 0) 조건을 세번째가 아닌 가장 첫번째로 수행하게 만든 것
			} else if (i % 3 == 0) {
				System.out.print("Fizz ");
			} else if (i % 5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}