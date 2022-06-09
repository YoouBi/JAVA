package first.second;

public class SamePackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
//		a.mySecret = 22;
		a.test = 33; // 같은 패키지라 접근 가능
	}
}
