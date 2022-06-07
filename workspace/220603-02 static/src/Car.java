class Car {
	private String color; // static을 붙이면 자동차 각각의 색을 변환할 수 있는 변수가 아니라
							// 하나의 색깔을 표현하는 정적인 변수만 남게 됨
	private int speed;
	private int gear;
	// 자동차의 시리얼 번호
	private int id;
	// 실체화된 Car 객체의 개수를 위한 정적 변수
	
	public static final int SHARE_NUMBER = 22;
	private static int numberOfCars = 0; // 객체 외부에 존재하고 있는 다른 값으로 필드가 아님
	// public한 static 변수는 만들면 편하긴 하지만(클래스 이름을 바로 쓸 수 있으니까)
	// 어느곳에서나 다 바꿀 수 있는 변수가 되어버리면 누가 어떻게 바꾸었는지 확인하기 어렵게 됨
	// 그래서 나중을 고려해서 private한 변수로 만드는 것이다
	// 또는 내가 공유를 하고싶은 하나의 변수, 값이 있다면
	// 상수로 만들면 어디서든지 접근이 가능하지만 변경은 안되기 때문에 공유의 목적에 있어서 좋음
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		// 자동차의 개수를 증가하고 id 번호를 할당한다.
		
		numberOfCars++;
		id = numberOfCars;
	}
	
//	public static void printColor() {
//		System.out.println(color); // 스태틱으로 불러낸다면 필드 안에 뭔가 값을 가져야 한다
//	}
	
//	public void printStaticNumber() { // 객체의 행동으로 만들어뒀다면
//		// Car.printStaticNumber(); 처럼 쓰는게 아니라
//		// c1.printStaticNumber(); 처럼 객체를 만들어두고 그 객체의 행동으로 불러내야
//		System.out.println(numberOfCars);
//	}
	
	// 정적 메소드
	public static int getNumberOfCars() { // 인스턴스 생성과는 무관하게 불러낼 수 있어야함
											// 그래서 static으로 정적인 메소드를 만든 것
		return numberOfCars; // ok!
	}
}
