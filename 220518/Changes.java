// 73쪽 2번(잔돈 계산)

import java.util.Scanner;

public class Changes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 이 위의 한줄을 띄울거면 public class Changes { 아래와 
		// System.out.print("구입한 물품의 부가세는 " + vat + "원. 잔돈은 " + changes + "원 입니다."); 아래도 띄워야한다
		
		System.out.print("얼마를 받았습니까?");
		int money = input.nextInt();
		System.out.print("구입한 상품의 가격은 얼마입니까?");
		int price = input.nextInt();
		
		double vat = price / 10; // 정수와 실수를 같이 연산시키면 표기법이 더 넓은 실수의 표기법을 따라간다
		int changes = money - price;
		
		System.out.print("구입한 물품의 부가세는 " + vat + "원. 잔돈은 " + changes + "원 입니다.");
	}
}