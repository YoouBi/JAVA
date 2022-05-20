public class StringEquals {
	public static void main(String[] args) {
		String a = "Hello"; // a라는 클래스가 메소드 안의 동작을 수행하여 hello라는 인스턴스를 문자열 a가 참조
		String b = "Hello"; // 컴파일러가 같은 참조를 만든다
		String llo = "llo"; 
		
		System.out.println(a == b); // 값을 확인하는게 아니라 참조하는 대상이 같은지 확인하는 것
		
		System.out.println(a == ("He" + llo)); // He와 문자열 llo 변수를 합쳤을 때 값은 같지만 false가 뜬다
		// 실행 때 He라는 문자열과 llo라는 문자열이 결합을 한 새로운 문자열 객체가 생긴다 그래서 다루는(참조하는) 대상이 다르다
		
		System.out.println("----------문자열 값 동등 확인---------");
		System.out.println(a.equals("He" + llo));
		// 이퀄스 메소드는 자기 자신과 괄호 안에 전달받은 문자열 값이 같은지를 확인하고 같으면 트루라고 알려준다
		// 따라서 문자열 비교를 할때엔 관계연산자를 하지말고 equals를 쓰자!
	}
}