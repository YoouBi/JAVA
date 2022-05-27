public class StaticVariableAndConst {
	public static void main(String[] args) {
		int i = 10;
		i++;
		
		final int ASDF;
		ASDF = 10;
		// ASDF = 15; 최초의 대입연산은 상수도 일어날 수 있다 하지만 그 후에는 다른 값으로 변경될 수 없다
		
		final int MY_NUMBER = 22; // 변하지 않는 변수의 값
		// 이름을 만들때는 상수로써 대문자로만 쓰여진다
		// 구분자는 소문자로 쓰기엔 가시성이 떨어지니 _을 쓴다
		
		// MY_NUMBER++; MY_NUMBER의 값에 변화를 주려고하면 컴파일 에러가 난다
		
		final double PI = 3.14;
		System.out.println(5 * 5 * PI);
	}
}