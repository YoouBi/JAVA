// 도형
// x좌표
// y좌표

// 넓이 구할 수 있음.
public abstract class Shape { // 추상 클래스
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	// 추상 메소드 - 메소드 Body X
	public abstract int getArea(); // 메소드 Head만 존재
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
}












