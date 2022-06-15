public final class MyImpleClass extends MySubClass { // 할아버지와 부모가 추상적이니까 인스턴스화 할 손자 클래스를 만든 것
	// 클래스 선언에 final을 붙이면 종단 클래스로서 더이상 상속이 이루어지지 않는다
	// class Test extends MyImpleClass 가 안되는 것 final class부터 확장이 불가능
	
//	@Override
//	public void myMethod() { // 메소드에도 final을 붙이면 상속 자체가 안되니까 자식 클래스에서 더이상 Override를 할 수가 없어서 컴파일 에러가 난다
//		System.out.println("새롭게 재정의를 하였습니다.");
//	}
	
	@Override
	public void myMethod2() {
		System.out.println("마이메소드2 오버라이드 구현");
	}
	
//	public void myMethod() { // 이걸 부모가 오버라이딩하지 않았다면 손자가 다 오버라이딩 해야 했을 것
//	}
	
	public static void main(String[] args) {
		MyClass m = new MyImpleClass();
		m.myMethod(); // 실제 구현은 여기
		
		MySubClass sub = (MySubClass) m; // 서브 클래스로 다운캐스팅
		sub.myMethod();
		
		sub.myMethod2();
	}
}
