package first.second;

public class AnotherClass {
	public int number; // 접근이 퍼블릭이어서 변경 가능
	private int mySecret; // private라 접근, 변경이 안됨
	int test; // default/package access modifier
	// 일반 int도 변경이 불가능하다는건 뭔가 의미가 있는 접근제한자다
	// 앞에 아무것도 없이 시작하는 int는 디폴트 혹은 패키지 접근제한자라고 한다
	// 외부에서 접근은 가능하지만 접근할 수 있는건 '같은 패키지'일 경우
	// 상위 패키지도 예외없이 접근 불가능하다
}