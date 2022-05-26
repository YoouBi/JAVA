// 3. 전달받은 두 문자열의 길이 값의 합을 반환하는 메소드.

import java.util.Scanner;

public class StringLength {
	public static int sumLength(String i, String j) {
		int one = i.length();
		int two = j.length();
		
		return one + two;
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 문장을 써주세요.");
		String oneString = scan.nextLine();
		String twoString = scan.nextLine();
		
		System.out.printf("두 문장의 문자의 총 합은 %d입니다.(공백 포함)\n", sumLength(oneString, twoString));
	}
}