// ex) 동물원의(아주 큰 클래스) A 조련사가 담당하는 (인터페이스) 육식(두번째 부모 클래스) 사자
// ex) 동물원의(아주 큰 클래스) B 조련사가 담당하는 (인터페이스) 초식(두번째 부모 클래스) 토끼
// ex) 동물원의(아주 큰 클래스) 초식하는(인터페이스) 원숭이

interface Breaker {
	void Breaker(); // 힘내
}

class Zoo {
	String zoo = "동물원의 ";
}

class Meat extends Zoo {
	String meat = "육식 ";
}

class Grass extends Zoo {
	String grass = "초식 ";
}

class Lion extends Meat implements Breaker {
	String lion = "사자는";

	@Override
	public void Breaker() {
		System.out.println(zoo + meat + lion + " A 조련사가 담당한다.");
	}
}

class Rabbit extends Grass implements Breaker {
	String rabbit = "토끼는";

	@Override
	public void Breaker() {
		System.out.println(zoo + grass + rabbit + " B 조련사가 담당한다.");
	}
}

class Monkey extends Grass implements Breaker {
	String monkey = "원숭이는";

	@Override
	public void Breaker() {
		System.out.println(zoo + grass + monkey + " 담당하는 조련사가 없다.");
	}
}

public class ZooTest {
	public static void main(String[] args) {
		
		new Lion().Breaker();
		new Rabbit().Breaker();
		new Monkey().Breaker();
	}
}