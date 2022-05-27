class Car {
	// 필드 정의
	String color; // 색상
	int speed;	  // 현재 속도
	int gear;	  // 현재 기어
	void print() { // public은 접근제한자로 있어도 되고 없어도 됨 그냥 접근이 달라지는거지 메소드의 기능이 달라지는 건 아님
		System.out.println("(" + color + ", " + speed + ", " + gear + ")");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car(); // 뭔갈 호출한다? '인스턴스화'해야함 근데 이걸 할때는 new를 꼭 적어줘야함!
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();
		
		// 색상:blue 속도:60 기어:3
		Car yourCar = new Car();
		yourCar.color = "blue";
		yourCar.speed = 60;
		yourCar.gear = 3;
		yourCar.print();
	}	
}

public class CarTest {
	public static void main(String[] args) {
		int a = 100;
		Car someCar = new Car();
	}
	// someCar라는 참조변수 같은 경우 변수 선언을 한 {}안을 벗어나면 쓰레기(garbage)가 되기 때문에
	// 이런 하나하나가 쌓이면 관리하기가 garbage collection라는 친구가 자동으로 치워준다
	// 딱 하나의 단점이 있다면
	// 공간이라는 것은 프로그램의 흐름에 따라 계속 바뀐다
	// 근데 쓰레기의 위치가 옮겨졌다면 쓰레기 수집을 하기 위해 프로그램 전체를 멈추게 되는데 이를 월드 스톱이라고 한다
}	// 밀리세컨드 단위로 멈춤