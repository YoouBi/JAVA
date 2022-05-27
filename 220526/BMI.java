// 4. 키(실수, 미터단위)와 몸무게(실수, kg단위)를 전달받아
// 한국기준 BMI 지수(실수) 구해 반환하는 메소드.
// BMI = (몸무게) / (키)^2

import java.util.Scanner;

public class BMI {
	public static double bmi(double i, double j) {
		return i / (j * j);
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키(m)와 몸무게(kg)를 순서대로 적어주세요.");
		double m = scan.nextDouble();
		double kg = scan.nextDouble();
		
		double cm = m * 100;
		
		System.out.printf("키 %.2fcm 몸무게 %.2fkg으로 한국기준 BMI 지수 %.2f가 산출되었습니다.", cm, kg, bmi(kg, m));
	}
}