import java.util.ArrayList;
import java.util.List;

class Point2D { // 이차원 좌표 객체 만드는 클래스
	private int x;
	private int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}

// x좌표, y좌표를 가지는 이차원 좌표를 여러개 관리하고 싶다!
public class Main {
	public static void main(String[] args) {
		List<Point2D> list = new ArrayList<>();
		// 0, 0을 가지는 객체를 추가하고 싶다
		list.add(new Point2D(0, 0));
		// 5, 5
		list.add(new Point2D(5, 5));
		
		Point2D p = list.get(0);
		System.out.println(p);
		
		Point2D p2 = list.get(1);
		System.out.println(p2);
		
		// 리스트에 0,0 좌표 객체가 있는지???
		// 리스트에 0,0 좌표 객체의 인덱스는???
		System.out.println("오버라이드 후: " + new Point2D(0, 0).equals(new Point2D(0, 0)));
		System.out.println(list.contains(new Point2D(0, 0))); // 있는지 없는지를 비교할때 이퀄스를 씀
		// 두개가 새롭게 만들어진 각각의 인스턴스다보니까 참조가 같을 때 트루가 되는 이퀄스가 안됨
		// 모든 클래스의 객체는 오브젝트를 상속했기 때문에 동등함을 비교할 수 있는 이퀄스를 가지고 있다
		// 근데 트루값을 반환해야하는 기준이 뭔지 모르기 때문에
		// 이 클래스를 작성한 코더가 Point2D의 뭐가 동등한지 이퀄스를 '재정의'해주면 되겠다
		System.out.println(list.indexOf(new Point2D(0, 0)));
		
		System.err.println(list.remove(new Point2D(5, 5))); // 인스턴스 참조를 알려주면 그 안에 있는 객체도 있으니까...
		
		System.out.println(list);
	}
}
