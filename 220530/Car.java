public class Car {
	private int speed; // 속도
	private int gear; // 기어
	private String color; // 색상
	
	// public int speed;
	// int gear;
	// private String color; // private 자기 자신의 범위 안(Car 클래스)에서만 변경 가능
	// 장점은 원치 않는 접근을 방지함으로써 정보를 '보호'할 수 있다는 것
	// 자기자신만 보게끔 만들고 외부에서는 볼 수 없게 만들어서 바깥에선 보지 않아도 되는 정보를 숨겨놓음
	
	// 첫 번째 생성자
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
	}
	
	// public Car(String c, int s, int g) {
		// System.out.println("sadsads");
	// } // 컴파일 오류가 남
	// 메소드 호출이나 생성자 호출은 모양이 똑같은걸 찾아간다고 했는데
	// 위에 이미 똑같은 (String c, int s, int g)가 있고
	// 내보낼 c, s, g가 없어서...?
	
	// 색상만 주어진 생성자
	public Car(String c) {
		this(c, 0, 1); // 첫 번째 생성자를 호출한다
		// Car(c, 0, 1)은 메소드를 호출하는 것이기 때문에 안됨
		// this는 자기자신의 참조 호출, ()는 생성자를 호출
		// this 앞에도 뭔가 올 수 있는데 class도 올 수 있고...
		// class가 여러개일땐 파라미터의 갯수와 종류를 구분해서
		// 참조는 보러가는거, 읽는 것
		// 호출은 메소드처럼 흐름이 중괄호 안에 있기 때문에 흐름을 따라가게 만드는 것 
		// this 키워드는 언제나 생성자의 첫줄에 있어야한다
		System.out.println("초기화 과정 중~~");
	}
	//public Car(String c) {
		// color = c;
		// speed = 0;
		// gear = 1;
	// }
	
	// getter << 접근자
	public int getSpeed() { // 값이 정해져있는 건 get set을 씀
		return speed; // bean...게터 세터...?
	}
	
	// setter << 설정자
	public void setSpeed(int s) {
		speed = s;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int g) {
		gear = g;
	}
	
	// 접근(색상)
	public String getColor() {
		// 접근을 위해서... 외부에서도 가능하게 public 색상을 바꿀 것이니 String 
		// 행동을 위해서 get 파라미터는 정보를 알려주기 위해서지만 외부의 입력이 없을 것이므로 비워놓음
		return color; // 반환만
	}
	
	// 설정(색상) 값 변경
	public boolean setColor(String c) {
		if (c != null) {
			color = c;
			return true;
		}
		return false;
	}
	// 메소드를 만들면 논리적 흐름을 만들 수 있다
}