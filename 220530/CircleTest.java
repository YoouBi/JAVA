class Point {
	private int x, y; // 디폴트 접근제한자 나중에 패울 패키지, 관련 있는 클래스끼리 같은 폴더 안에 넣으면 같은 폴더끼리는 접근이 가능하게 만드는 것이 디폴트
	//생성자
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

class Circle { // Circle은 Point라는 타입으로 점 1개를 가지고 있다
	private int radius = 0;
	private Point center; // Point 참조 변수가 필드로 선언되어 있다
	// center는 중심점을 나타내기 위해 지은 이름인 것 같다
	// 클래스 안에 다른 클래스를 상태를 표현하기 위해 필드로 사용하고 있는데 이 관계를 has-a 관계라고 한다
	
	// 생성자
	public Circle(Point p, int r) {
		center = p;
		radius = r;
	}
	
	// 중심점을 getter
	public Point getPoint() {
		return center;
	}
	
	public void setPoint(Point p) {
		this.center = p;
	}
}

public class CircleTest {
	public static void main(String args[]) {
		// Circle 객체를 생성하고 초기화한다.
		Point p = new Point(25, 78);
		Circle c = new Circle(p, 10);
		
		System.out.println(p); //p 필드값이 아니라 참조한 문자열의 객체가 가진 문자열로 표현을 해봐라~ 하고 나온 것이 Point@15db9742 
		System.out.println(c.getPoint());
		
		System.out.println(p.getX());
		System.out.println(c.getPoint().getX()); // 값을 안보여주고 싶으면 getter를 없애고 값을 변하지 않게 하고 싶으면 setter를 없앤다
		
		System.out.println(new Point(33, 22));
	}
}