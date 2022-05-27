public class StaticVariableAndConst3 {
	public static final int number = 100; // public static int number = 100; 전역 변수
	// 많아지면 많아질수록 변할 가능성이 있는 변수들을 넓은 범위에 존재할테니 개발자가 관리 측면에서 힘들어짐
	// 그래서 현대인들은 전역 변수를 만들어서 사용하는 걸 극도로 싫어함
	// public은 접근 제한자로서 이 클래스 범위를 벗어나서도 사용할 수 있게 static은 전역 범위
	// 나중에 개발할 때 여러개의 인스턴스끼리 소통을 위해 만들어둔 기능과 상수들을 퍼블릭, 어떤 곳에서든 접근하여 사용할 수 있게 할 것
	// ex) nextInt();처럼
	
	// 자바 개발진들이 만들어둔 전역 상수 (final) 에는
	// Math. 가 있는데 수학적 계산이 필요한 상수들을 모아둠
	
	// 클래스 안에는 멤버라는게 존재하는데 * ? 객체지향. 필드. 메소드.
	// 우리가 쓰는 친구들에는 static이라는 키워드가 붙어있는데 정적메소드로서 객체를 다루는....?
	
	// 외부에서 StaticVariableAndConst3.number(클래스 이름) 라는 이름으로 접근하면 사용할 수 있다
	
	// * 패러다임 : 정답이 없고 시대에 따라 바뀜
	// 지금 가장 널리 사용되고 있는 것은 객체 지향으로서 자바는 이를 따르고 있는 언어체계를 가짐
	
	public static void test() {
		// number++;
		System.out.println("테스트메소드에서 : " + number);
	}
	
	public static void main(String[] args) {
		// number++;
		System.out.println("메인메소드에서 : " + number);
		
		test();
		
		// System.out.println(Math.PI);
		// Math.PI++;
		
		double a = Math.abs(-372); // 절대값으로 반환해주는 메소드
		System.out.println(a);
		
		double r = Math.random(); // 실수 랜덤 메소드
		r = (int) (r * 100);
		System.out.println((int)r);
		
		/* int i = Math.random();
		System.out.println(i); 와 int 랜덤은 안된다!*/
	}
}