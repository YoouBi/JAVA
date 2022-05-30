public class TestCar {
	public static void main(String[] args) {
		// 컴파일 오류 왜 나는가?
		// Car c = new Car();에 해당하는 아무것도 없는 () 생성자는 없어서		
		Car c = new Car("green", 10, 1);
		Car c2 = new Car("yellow");
		Car c3 = new Car("red");
		
		// c.color = "빨강"; // private을 외부 클래스에서 변경할 수 없어서 컴파일 오류 남
		// System.out.println(c.color); // 외부에서는 출력해서 눈에 보이게 하겠다도 안됨
		// 객체 지향이라는 것은 행동이기 때문에 이렇게 두고 사용하는 일이 거의 없음
		
		c.setColor("빨강"); // 필드 값 color에 넣음
		System.out.println(c.getColor());
		
		// c2.setColor(null);
		// c3.setColor("새 색상");
		
		c.setSpeed(600);
		System.out.println(c.getSpeed());
		
		c.setGear(2);
		System.out.println(c.getGear());
	}
}