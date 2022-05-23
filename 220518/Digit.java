// 사용자가 입력한 5자리의 정수를 역순으로 출력하는 프로그램 ex) 12345 -> 54321

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("역순으로 바꾸고싶은 5자리의 정수를 적어주세요.");
		int num = input.nextInt();
		
		int tenth = num / 10000;
		int thous = (num - tenth * 10000) / 1000;
		int hund = (num - tenth * 10000 - thous * 1000 ) / 100;
		int tens = (num - (tenth * 10000) - (thous * 1000) - (hund * 100)) / 10;
		int unit = num % 10;
		
		/* int x = num / 10000;
		int y = num % 10000 / 1000;
		int z = num % 1000 / 100;
        int a = num % 10 / 10;
		int b = num % 10; 
		System.out.print(num + " 정수를 역순으로 출력하면 " + x + y + z + a + b + "입니다.");

        int tet = num / 10000;
		int tho = num / 1000 % 10;
		int hun = num / 100 % 10;
        int ten = num / 10 % 10;
		int uni = num % 10;
		System.out.print(num + " 정수를 역순으로 출력하면 " + x + y + z + a + b + "입니다.");		*/
		
		System.out.print(num + " 정수를 역순으로 출력하면 " + unit + tens + hund + thous + tenth + "입니다.");
	}
}