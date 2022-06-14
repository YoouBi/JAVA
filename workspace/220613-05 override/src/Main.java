public class Main {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		
		Dog d = new Dog();
		d.sound();
		
		Cat c = new Cat();
		c.sound();
		
		Object o = new Dog(); // 오브젝트 클래스가 상위 클래스이기 때문에 형변환이 오류없이 일어날 수 있다
		// 자바는 오브젝트 클래스가 최상단에 위치하도록 자동으로 만든다
		// 우리가 만드는 모든 것들이 객체이기 때문에 객체의 성질을 띌 수 있게끔 최상단으로 만들어서 그 형과 행동을 상속받게끔
		// 자바 개발자들이 생각한 객체의 공통적인 필드란 무엇인가?
		// o. 로 보면
		// 동등하게 표현, 문자열로 표현, ...
		// toString은 원래 있었으니까 우리는 오버라이딩으로 쓰고 있었다
		
		System.out.println(o.toString());
		// 평소에 우리가 보던 Dog@6108b2d7으로 나오는게 객체의 기본 행동인 toString의 정의가 이렇게 나오고 있었던 것이다
		// 우리가 명시적으로 적진 않았지만 오브젝트 클래스에 있는 toString을 꺼내온 것이다
	}
}