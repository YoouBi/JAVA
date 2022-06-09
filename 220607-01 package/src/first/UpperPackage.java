package first;

import first.second.AnotherClass;

public class UpperPackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass(); // 큰 패키지 안에 있는 패키지인데도 찾을 수 없다
		a.number = 11;
		a.mySecret = 22;
		a.test = 33;
	}
}