public class TestTypes {
	public static void main(String[] args) {
		/*int i = 100;
		double d = i;
		System.out.println(d); // 자동적으로 확장이 일어나 100.0으로 출력됨
		그런데 역수형으로
		double d = 123.456;
		int i = (int) d; // 라고 쓰면 자료의 손실이 일어날 수 있기 때문에 일부러 형을 바꿔주지 않는 이상 컴파일 에러가 난다
		System.out.println(d); // int로 바꿔 출력할 수는 있지만 소수점 아래의 부분들이 사라진다 */
		
		double o = (double)65;
		System.out.println(o); // 형변환했을 때 컴파일 오류가 난다
		
		char c = (char)65;
		System.out.println(c); // 문자...를 나타내기 때문에 형변환해도 오류가 뜨지 않는다
		
		// int num = (int) x;
		// System.out.println(num);
		
		
		byte b = 10;
		
		short s = 100;
		int i = 1000;
		long l = 10000;
		
		//int sum = b + s; // byte, short는 특이해서 특별한 변수를 주지 않으면 값을 int'형'으로 취급한다(형변환: 형이 변함)
						 // 그래서 byte, short로는 출력되지 않고 int, long으로만 출력이 된다
						 // byte, short가 int처럼 큰 통에 넣으려는 것을 자료형의 확장이라고 하는데 자동으로 이뤄진다
		int sum = (short) b + s; //처럼 개발자가 short 박스에 구겨넣을 수 있으나 다른 값 출력
		// int il = 1000L; 처럼 큰 통에 있는 걸 작은 통에 넣으려는 걸 자료형의 축소라고 하는데
		// 손실이 일어나려고 하기 때문에 하려는 행동이 잘못됐다고 컴파일 에러가 난다
		// 개발자가 작은 통으로 넣는 것에 문제가 없다고 생각했을 때 명시적 형변환(Explicit Conversion)으로
		int im = (int) 1000L; // 처럼 표기해서 int로 표기해도 문제가 생기지 않는 값은 제대로 나오지만
		int in = (int) 32147483647L; // 처럼 int 안에 다 담기지 않는 값은 전혀 다른 값이 출력된다
		// 언제나 손실의 가능성을 유념해서 개발자가 판단했을 때 문제가 없다고 생각될 때 축소해야한다
		
		System.out.println(in);
	}
}