// Fizz Buzz
// 1 2 Fizz 4 Buzz ... 15라면 Fizz Buzz
// 35까지

public class FizzBuzz {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 35; i++) {
			
			if (i % 15 == 0) {
				System.out.print("Fizz Buzz ");
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