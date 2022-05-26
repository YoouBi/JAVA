public class TestMethod2 {
	// 메소드의 이름. 영소문자. 여러 단어가 있으면 다음 단어의 첫번째 글자를 대문자로
	public static int calSum() { // 대문자, 한글, a_d_s도 되는데 일반적으로 영소문자를 씀
	// 기능에 대해서 이름을 짓다보니 동사로 많이 지음
	// return type : void 공허. 없음. 메소드의 리턴 타입이 비어있다. 보이드를 반환하니까 반환이 없다.
	// 내가 뭔가 리턴하고자하면 보이드를 쓰면 안됨. 뱉고싶은 타입을 써줘야함.
	// 정수 타입으로 뱉어내고 싶다 하면 public static int sum() 라고 쓰는데 컴파일하면 에러가 난다
	// 이건 하나의 약속으로 int를 쓰면 기계가 언제나 정수 하나를 뱉어내야 한다
		int a = 10;
		int b = 20;
		int sum = a + b; // 변수랑 메소드 이름이랑 같아도 메소드의 뒤에는 ()가 따라오기 때문에 컴파일러가 구분 가능
		
		return sum; // 뱉어내려면 리턴 써줘야함
		// 이 값을 가지고 호출한 sum();로 가는데 정수 '값'이기 때문에 바로 출력되지는 않고 따로 변수를 설정해서 프린트해야한다
		// 다만 이 int 값 자체는 메소드로 만들어졌기 때문에 지역 변수로 치지 않고 메소드로 쳐서 가져갈 수 있다
	}
	
	// pi 메소드 { 3.14 실수값을 반환하는 메소드 }
	public static double piMethod() {	
		return 3.14;
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		
		int result = calSum(); // 30을 만들어내는 기계 동작
		System.out.println(result);
		
		double piPrint = piMethod();
		System.out.println(piPrint);
		
		System.out.println("끝");
	}
}