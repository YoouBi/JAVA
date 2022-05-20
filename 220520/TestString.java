// 기초형 타입이 아닌 참조형 타입의 문자열
public class TestString {
	public static void main(String[] args) {
		String str; // 참조형 타입의 클래스로 불러왔기 때문에 대문자
		// int, double같은 기초형은 소문자로 시작했지만 참조형 친구들은 대문자로 시작
		str = "Hello World";
		
		System.out.println(str);
		
		String s2 = "다음 문자열";
		System.out.println(s2); // 모든 변수는 초기화되지 않으면 사용할 수 없다
		
		String concat = str + 1 + 2 + "\n" + true + s2 + 3.0;
		// 숫자끼리 계산을 먼저 해주고 싶다면 괄호로 (1 + 2) int 계산을 먼저 이뤄주면 된다
		System.out.println(concat);
	}
}