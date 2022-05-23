import java.util.Scanner;

public class CircleArea {
public static void main(String[] args) {
	double radius; // double은 실수형 타입으로 소수점 표현 가능
	double area;
	Scanner input = new Scanner(System.in);
	System.out.print("반지름을 입력하시오: ");
	radius = input.nextDouble(); // input이라는 이름으로 스캐너 기능 사용. 정수가 아닌 실수형으로 받을 수 있는 메소드 호출...
	/* int와 double을 용도에 맞게끔 골라쓰자!
	radius = input.nextDouble(); 일 때 정수 값을 넣으면 정수는 5.0 같은 식으로도 표기가 되기 때문에 오류가 뜨지 않지만
	radius = input.nextInt(); 일 때 실수 값을 넣으면 뒤의 소수점 단위를 떼지 않는 이상 정수가 되지 않기 때문에
	컴퓨터가 자료 값에 에러가 날까봐 오류로 띄운다 */
	area = 3.14 * radius * radius;
	
	System.out.println(area);
    }
}