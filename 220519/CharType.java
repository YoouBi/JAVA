public class CharType {
	public static void main(String[] args) {
		char a = 'a'; // 값을 적을 때 "쌍따옴표"가 아닌 한글자, 문자 하나를 쓰는 '홑따옴표'를 쓴다
		char b = 'b';
		char ga = '가'; // 자바에서는 유니코드를 지원하기 때문에 한글같은 경우도 문자로 표현 가능
		char num1 = '1';
		
		char what = 65; // 문자열 선언하고 정수형 값 65를 넣으면 숫자가 아니라 대문자 A가 출력되는데
		// 65이라는 정수를 표현하는게 아니라 65번째에 약속되어있는 문자를 알려주는 것이다
		
		char linefeed = '\n';
		char tab = '\t'; // tab처럼 공간 띄우는 것
		// System.out.print("qwer\n"); 문자열은 문자를 여러개 가지고 있는 객체기 때문에 \n을 가진 문자열로 수행가능
		System.out.print("qwer\n" + linefeed);
		System.out.println(tab + "다음줄인가??");
		//'\n' 두글자로 이어졌지만 하나의 문자로 인식하는 대행문자
		
		System.out.println('\'');
		System.out.println("\"");
		System.out.println("\\");
		// ' " \ 자바에서 이 셋을 하나의 문자로 출력하려고 하면 \를 붙여주면 된다
		
		System.out.println(what + a); // 캐릭터 타입을 연산하면 달라붙는게 아니라 숫자로 인식하여 결과값 해당 숫자의 문자로 달라진다
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(ga);
		System.out.println(num1);
		
		// string에는 " ' " 표현이 가능하지만 안정적이게 " \' " 로 써주는게 좋다
	}
}