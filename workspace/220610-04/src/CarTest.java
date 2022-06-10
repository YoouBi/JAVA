// 184
class Car {
	// 필드 선언
	private int speed;	// 속도
	// 중복 메소드 : 정수 버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}

	// 중복 메소드 : 실수 버전
	public void setSpeed(double s) {
		speed = (int) s; // 굳이 값을 더블로 받고도 인트로 치환한건 손실이 일어나더라도 정수 부분만 필드로 취하겠다는 전략을 취한 것
		System.out.println("실수 버전 호출");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();	// 첫 번째 객체 생성
		
		myCar.setSpeed(100);	// 정수 버전 메소드 호출
		myCar.setSpeed(79.2);	// 실수 버전 메소드 호출
		
		myCar.setSpeed(1000L); // 롱 값은 인트에 못들어가니까 롱 값까지 담을 수 있는 더블쪽으로 들어간 것!
		myCar.setSpeed('A'); // 아스키 코드로 숫자로 인식
		myCar.setSpeed("A"); // 문자열로 인식해서 숫자가 없네?? 하고 컴파일 에러 난다
	}
}