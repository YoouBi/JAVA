public class Main {
	public static void someMethod(int param) {
		
	}
	
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}
	
//	public static double sum(int asdadsadsad, int asdsadsadsad) { 
//		// 파라미터의 이름은 변수 지정만 해주는거기 때문에 같은 메소드 이름에 같은 파라미터 타입과 순서로 넣는다면
//		// 동작할때 어디로 넣어야하는지를 모르기 때문에 오류가 뜬다
//	}
	
	// 그래서 다양한 타입에 대응할 수 있도록 메소드 오버로딩을 할건데
	public static void sum(double a, double b) { // 메소드 이름이 아니라 파라미터로 같이 따져서
		System.out.println(a + b); // 타입과 갯수와 순서가 다르면 다른 메소드로 인식한다
		// 여기서는 숫자가 들어갈 수 있는 변수형 타입으로 되는 듯 그럼 float랑 long도 되겠다
	}
	
	public static void main(String[] args) {
//		someMethod(3873.03736);
//		someMethod("asdf");
		
		// Method Overloading 다양한 타입에 동작하게끔
		System.out.println(123123);
		System.out.println(123.123);
		System.out.println("123.123"); // println 안에는 실수, 정수, 문자열까지 다 들어가서 동작한다 이걸 메소드 오버로딩이라고 한다
		sum(50, 20);
		sum(10.0, 40.0); // 실수에는 동작하지 않는다 들어가는게 int 타입이니까
//		sum("asdf", "qwer");
	}
}
