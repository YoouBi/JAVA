public class Car {
	int speed; // 속도
	int gear; // 기어
	public String color; // 색상, 테스트를 위하여 공용 필드로 만들자.

	public void speedUp(int increment) { // 속도 증가 메소드
		speed += increment;
	}

	public void speedDown(int decrement) { // 속도 감소 메소드
		speed -= decrement;
	}
}

class SportsCar extends Car { // car를 상속받는다.
	boolean turbo;

	public void setTurbo(boolean newValue) { // 터보 모드 설정 메소드
		turbo = newValue;
	}
}