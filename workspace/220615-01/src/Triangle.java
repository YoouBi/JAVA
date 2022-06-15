// 삼각형 // 중심점(x, y) // 밑변 // 높이 // 넓이를 구해서 알려줄 수 있음.

public class Triangle extends Shape { // 일반적인 클래스는 추상적인걸 가질수가 없다 부모가 가진 추상적인걸 체계화시켜서 정의, 구체화시켜야한다
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public int getArea() { // 추상적인 기능을 구체적으로 새롭게 정의시키려는 메소드 ->구현한다
		return base * height / 2;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
