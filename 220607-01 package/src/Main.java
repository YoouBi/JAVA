// package는 폴더. 디렉터리다.
// 관련 있는 것들끼리 분류해서 폴더에 집어넣어 찾을 때 쉽게 찾을 수 있게 된다
import first.InPackageClass;
import first.second.AnotherClass;

public class Main {
	public static void main(String[] args) {
		InPackageClass test = new InPackageClass();
		// 자바에서는 클래스를 찾을 때 '같은 패키지' 안에서 먼저 찾고 없으면 없다고 컴파일 에러가 난다
		
		AnotherClass test2 = new AnotherClass();
		test2.number = 10; // 접근이 퍼블릭이어서 변경 가능
//		test2.mySecret = 2; // 프라이빗이라 안됨
		test.test = 33; // 일반 int도 변경이 불가능하다는건 뭔가 의미가 있는 접근제한자다
					// 앞에 아무것도 없이 시작하는 int는 디폴트, 혹은 패키지 접근제한자라고 한다
	}
}
