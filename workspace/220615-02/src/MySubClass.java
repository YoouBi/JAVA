public abstract class MySubClass extends MyClass { // 내가 생각했을 때 자식 또한 추상적이라고 생각한다면 추상 클래스로 만들 수 있음

	@Override
	public final void myMethod() {
		System.out.println("자식 클래스에서 구현되었습니다.");
	}
	
	public abstract void myMethod2(); // 자기만의 특징
}
