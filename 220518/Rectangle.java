// 사용자의 사각형의 밑변과 높이를 정수로 입력
// 사각형의 둘레와 넓이를 출력

// 넓이는 (밑변 * 높이)

/*import java.util.Scanner;

public class Rectangle { // 클래스 이름은 세, 네단어가 와도 되기때문에 Rectangle도 잘 지은 이름
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int length;
		int height;
		int round;
		int area;
		
		System.out.print("밑변의 값을 적으시오: ");
		length = input.nextInt
		System.out.print("밑변의 값을 적으시오: ");
		length = input.nextInt
		
		System.out.print("이 사각형의 둘레는 ");
		System.out.println(round);
		
	}
} */

import java.util.Scanner; 

public class Rectangle {
	public static void main(String[] args) {
		System.out.println("사각형 둘레, 넓이 구하기~");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("밑변을 입력하세요: ");
		int length = scanner.nextInt();
		System.out.print("높이를 입력하세요: ");
		int height = scanner.nextInt();
		
		System.out.println("둘레: " + (length + height) * 2);
		System.out.println("넓이: " + length * height);
	}
}