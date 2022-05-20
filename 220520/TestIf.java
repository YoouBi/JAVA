// 제어문의 제어하려는 대상은 프로그램의 흐름이다

public class TestIf {
	public static void main(String[] args) {
		// if (조건식(논리값)) { // if문은 ()와 {}가 함께하는데 중괄호 안에 있는 조건식을 검색
		// 이 조건식은 불변의 논리를 가진 조건문인데 
		// (참)일 때 {문장1 문장2}-then절(참일때 실행되는{})을 실행하고 다시 원래의 흐름으로 돌아간다
		// (거짓)일 때 {문장1 문장2}를 건너뛰고 원래의 흐름으로 돌아간다
		// }
		
		boolean condition = false;
		if (condition) {
			System.out.println("조건문 블록 안입니다.");
		}
		System.out.println("프로그램 종료");
	}
}