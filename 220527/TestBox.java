// 클래스라는 개념으로 가상의 박스를 '객체화' 시켜보자
public class TestBox {
	public static void main(String[] args) {
		// Box none = null; // 참조형 변수는 null(지금 참조하는게 없다)을 참조할 수 있다
		// none.width = 10; // 컴파일러는 none 박스의 가로가 있다고 생각해서 될거라 생각함
		// 실행하면 none을 찾아가보자 근데 null이네 없는 박스니 가로가 없네! 해서 실행 중 오류 남
		
		// 클래스로 만들어둔 Box로 변수를 만듦
		Box box1; // 하나의 타입으로 사용되어서 Box를 참조하는 참조 변수가 선언된 것
		box1 = new Box(); // 인스턴스화. 초기화 선언
		// *인스턴스는 값을 적기 위한 공간 그런데 그 값이라는 것은 결국 개체라 인스턴스 또한 객체라고 표현할 수 있는 것
		// class는 객체의 단위인데 결국 표현하고자 하는 것은 객체이다
		// int는 밸류로 값은 있지만 객체가 아님
		box1.width = 3; // 상태값 초기화
		box1.length = 3;
		box1.height = 3;
		
		// System.out.println(box1.color); // color라는 필드가 없다고 컴파일 오류 남
		
		Box box2 = new Box();
		box2.width = 10;
		box2.length = 10;
		box2.height = 10;
		
		// System.out.println("부피: " + box1.volume);
		System.out.println(box1.getVolume());
		System.out.println(box2.getVolume());
		
		// 모든 상태값을 확인하려면
		// System.out.println(box1.width);
		// System.out.println(box1.length);
		// System.out.println(box1.height);
		// 동작에 이름을 붙여둘 수 있으니 그걸 활용해보자
		box1.printAllState(); // 상태라는 값은 인스턴스마다 고유하게 가지고 있으므로 box1와 box2의 값이 다르다
		box2.printAllState(); // 모든 Box는 가로세로높이 값이 있지만 box1과 box2라는 인스턴스의 자기자신만의 고유한 값이 있는 것
		
		// System.out.println(box1.width);
		// System.out.println(box2.width);
		
		// box1.width = 5;
		// System.out.println(box1.width);
	}
}