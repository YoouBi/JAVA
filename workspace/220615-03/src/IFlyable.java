public interface IFlyable { // interface는 클래스처럼 하나의 타입으로 사용할 수 있다
	// 그러나 클래스처럼 인스턴스화시켜서 사용하는게 아니라 추상적인 개념으로 객체들의 소통을 위한 통로로 마련
	// 만들 때 클래스로 만들어서 인터페이스로 바꿀 수도 있지만 아예 인터페이스로 생성할 수 있음
	// 인터페이스의 이름은 '~할 수 있음' 같은 동작의 이름으로 표현된다!
	// 대문자로 시작하는게 클래스와 헷갈릴수도 있으니까 앞에 대문자 I를 붙이기도 한다
//	public abstract void fly();
	void fly(); // interface는 접근제한자와 abstract를 생략해도
	// 동작에 추상메소드만 받고 있기 때문에 자동적으로 public과 abstract가 생략되어있다
	
//	public void print() { // 인터페이스는 일반적인 인스턴스를 못받고 추상적인 메소드만 받을 수 있다
//		System.out.println("안녕하세요.");
//	}
}

class Animal {}
class Bird extends Animal {}

class Eagle extends Bird implements IFlyable { // 인터페이스는 구현한다(implements)
	// 그래서 구현하고자하는 인터페이스를 우측에 붙여주면 된다
	// 독수리는 '날 수 있는' 새다
	
	@Override
	public void fly() { // Eagle은 인터페이스에서 추상적 개념을 받았기 때문에 재정의 해줘야한다
		System.out.println("독수리가 푸드득 푸드득 납니다.");
	}
}

class Penguin extends Bird {}

class FlyingFish extends Animal implements IFlyable {
	@Override
	public void fly() {
		System.out.println("날치가 물 위로 납니다.");
	}
}

class Plane implements IFlyable {
	@Override
	public void fly() {
		System.out.println("비행기가 납니다.");
	}
}