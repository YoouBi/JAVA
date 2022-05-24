import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long fact = 1;
		int n;
		
		System.out.printf("정수를 입력하시오:");
		n = input.nextInt();
		
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		
		System.out.printf("%d!은 %d입니다.\n", n, fact);
	}
} 