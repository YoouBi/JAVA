// 직사각형
// 중심점(x, y)
// 가로
// 세로

// 넓이를 구해서 알려줄 수 있음.

// 원
// 중심점(x, y)
// 반지름

// 넓이를 구해서 알려줄 수 있음.
public class Main { // 일반적인 클래스는 인스턴스화 가능
	public static void main(String[] args) {
//		Shape s1 = new Shape(); // 추상 클래스는 추상적인 메소드만 있어서 미완성, 덜 구체적인 클래스니까 구체적인 인스턴스화 불가능
//		Shape s2 = new Shape(10, 20); // 도형이란 도형은 인스턴스화 불가능
		
		Shape r = new Rectangle(0, 0, 10, 10);
		System.out.println(r.getArea());
		
		Shape c = new Circle(0, 0, 5);
		System.out.println(c.getArea());
		
		Triangle t = new Triangle(0, 0, 5, 5);
		System.out.println(t.getArea());
		
		Shape s = t; // 자동적으로 업캐스팅이 일어남
		System.out.println(s.getArea()); // 그래도 자식에게 구현해놓은 동작이 실행됨
		// 부모 클래스를 참조를 하고 있어도 실제 인스턴스보고 그 동작을 하라고하면 오버라이딩이 되어있는 자식 메소드가 호출이 됨
		// 삼각형이란 자식을 참조해서 도형의 형태로 사용할 수 있게 되는 것!
	}
}
