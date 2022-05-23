import java.util.Scanner;

public class Inha1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("세자리 수를 적으시오.");
		int x = input.nextInt();
		System.out.print("세자리 수를 적으시오.");
		int y = input.nextInt();
		
		int xa = x / 100;
		int xb = x / 10 % 10;
		int xc = x % 10;
		
		int ya = y / 100;
		int yb = y / 10 % 10;
		int yc = y % 10;
		
		System.out.print("일의 자리 수 곱셈으로 나온 값은 " + (x * yc) + ", ");
		System.out.print("십의 자리 수 곱셈으로 나온 값은 " + (x * yb) + ", ");
		System.out.print("백의 자리 수 곱셈으로 나온 값은 " + (x * ya) + ", ");
		System.out.print("두 수의 곱은 " + (x * yc + x * yb * 10 + x * ya * 100)  + "이다.");
	}
}