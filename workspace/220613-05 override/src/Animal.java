public class Animal {
	public void sound() {
		System.out.println("동물은 제각각의 소리를 냅니다");
	}
}

class Dog extends Animal {
//	public void bark() { 로 만들면 새 메소드가 생겼을 뿐...
	@Override // method override 메소드 이름 똑바로 적었는지 검사해줄 수 있음 이걸 annotation이라고 함
	public void sound() { // 부모에 있던 메소드 헤더와 완벽하게 같은 이름으로 자식 쪽에서 재정립 하는 걸 method override
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void sound() { // 동일한 사운드라 하더라도 부모의 것이 아니라 자식의 것이 호출됨
		System.out.println("냐옹");
	}
}