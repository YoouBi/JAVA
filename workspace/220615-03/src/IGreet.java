public interface IGreet {
	void greet();
}

class Student {}

interface EngHello extends IGreet { // 처럼 인터페이스 상속도 가능하다
	void howoldru(); // 추상적 구현을 추가
}

class Eng extends Student implements IGreet {
	@Override
	public void greet() {
		System.out.println("Hello");
	}
}

class Kor extends Student implements IGreet {
	@Override
	public void greet() {
		System.out.println("안녕");
	}
}

class Ame implements IGreet {
	@Override
	public void greet() {
		System.out.println("Wassup");
	}
}