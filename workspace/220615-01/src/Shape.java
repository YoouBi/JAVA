// 2차원 평면 상의 도형(삼각형, 직사각형, 반지름)이라서 이런 공통적인 특징(중심점과 넓이를 구해서 알려줄 수 있는 메소드 중복)을 가지는구나
// 도형
// x좌표
// y좌표

// 넓이 구할 수 있음.
public abstract class Shape { // 일반적인 클래스는 인스턴스화시켜서 사용할 수 있는데 그 객체가 동작이란걸 가지고 있는데 추상적이니까
	// 인스턴스화 했을 때 메소드의 구현이 없다보니까 구현성?이? 객체가 된다
	// 그래서 얘는 똑같이 추상적인 값을 가져야하는 추상 클래스가 된다
	private int x;
	private int y;
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
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
	public abstract int getArea(); // abstract는 추상메소드로써 동작에 대한 구체적인 동작은 없다
	// 구체적인 동작은 메소드의 Body에 적는건데 없으니까 이 도형이란 애의 바디는 없는거라 ();로 바디를 없애고 메소드의 Head만 존재하도록 만든다
	// 도형이란 도형은 추상적이라서 실제로는 넓이 구하는 걸 할 수 없고 원, 네모, 세모와 같이 확실한 도형만 넓이 계산 가능
}

