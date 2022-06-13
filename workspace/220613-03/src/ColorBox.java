public class ColorBox extends Box {
	String color;
	
	// 부모껄 먼저 초기화하고 자기껄 초기호하는데 명시적으로 생성해놓지 않으면 부모의 값으로 생성해서 기본값으로 초기화
	public ColorBox() { // 자식 클래스를 생성할때 부모 클래스의 생성자부터 생성이 된다
//		super(); // 부모의 빈 파라미터를 받는 기본 생성자가 없다
		// 즉 자식은 생성자를 하나라도 만들면 기본 파라미터가 없어져서 호출할 수 없게되니 컴파일 에러가 나는 것
		// super();를 아예 비워둬도 컴파일 에러가 난다
		super(10, 50 ,870); // 임의의 값으로 초기화하는 생성자를 만들거나 
		this.color = null;
	}
	
	public ColorBox(int length, int width, int heigth) {
		super(length, width, heigth); // 전달받고 싶다면 전달받는 생성자를 만들면 된다
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}