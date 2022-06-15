
public class Circle extends Shape {
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public int getArea() { // 도형은 넓이를 구해서 int형으로 반환하니까 Override로 double형을 반환할 수가 없다
		return (int) (radius * radius * 3.14); // 그래서 그냥 소수점 자리를 버리는 형식을 취한 것...ㅠ
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
