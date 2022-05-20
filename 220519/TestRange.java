public class TestRange {
	public static void main(String[] args) {
		// 0 ~ 100 사이??
		// 숫자가 0 이상'이고' 100이하인가?
		int number = 333;
		
		// System.out.println(0 <= number <= 100); 자바 언어는 한번에 하나씩밖에 처리를 못한다
		// 따라서 0 <= number를 먼저 처리하고 불연값으로 true가 된 연산값을 true <= 100 비교를 하게 되기 때문에 컴파일 에러가 난다
		System.out.println(number <= 100); 
		System.out.println(0 <= number); // 논리연산자 boolean으로 자동으로 바뀌는게 아니라
		// 관계연산자로서 대소나 동등을 비교해서 true와 False 값을 낼 수 있는 연산자(네 말이 맞다... 틀렸다...)
		// 그렇기때문에 두번을 따로 물어봐서 논리값끼리 연산을 할 수 있는 논리연산을 한다
		
		System.out.println((number <= 100) && (0 <= number));
	}
}