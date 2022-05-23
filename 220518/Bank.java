// 102쪽 6번(저금통)

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("500원의 갯수는 몇개입니까?");
		int fh = input.nextInt();
		System.out.print("100원의 갯수는 몇개입니까?");
		int oh = input.nextInt();
		System.out.print("50원의 갯수는 몇개입니까?");
		int f = input.nextInt();
		System.out.print("10원의 갯수는 몇개입니까?");
		int t = input.nextInt();
		
		int sum = (fh * 500) + (oh * 100) + (f * 50) + (t * 10);
		
		System.out.print("저금한 돈의 총 합은 " + sum + "입니다.");
	}
}

/* public class PigBank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System..out.print("500원의 개수?");
		int won500 = scan.nextInt();
		// int 500won; 변수의 이름은 숫자로 시작할 수 없다 따라서 순서를 바꿔서
		System..out.print("100원의 개수?");
		int won100 = scan.nextInt();
		System..out.print("50원의 개수?");
		int won50 = scan.nextInt();
		System..out.print("10원의 개수?");
		int won10 = scan.nextInt();
		
		int total = (won500 * 500) + (won100 * 100) + (won50 * 50) + (won10 * 10);
		
		System.out.print("총 금액 : " + total);
	}
}