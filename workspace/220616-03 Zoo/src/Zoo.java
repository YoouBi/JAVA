// 동물원 관리

// 동물Animal - 종, 나이, 무게

// 직원employee - 역할(조련사, 경영 등등), 이름
// 조련사는 동물들을 담당합니다.

// 동물은 육식/초식으로 나누어서 관리됩니다.
// 주식으로 분류하여 동물 목록을 볼 수 있음.
// 조련사 담당에 따라 동물 목록을 볼 수 있음. (담당자가 없는 동물도 볼 수 있어야 함)

// 다른 동물이 들어와도 똑같은 동착 출력이 될 수 있게...

interface Breaker {
	void Breaker(); // 힘내
}

class Zoo {
	String zoo = "JAVA 동물원";
}

class Animal extends Zoo {
	String breed;
	int age;
	double weight;
}

class Meat extends Animal {
	String meat;
}

class Grass extends Animal {
	String grass;
}

///////////////////////////////////////////

class Employee extends Zoo {
	String role;
	String name;
}

class Breaker extends Employee{
	
}

//class Lion extends Meat implements Breaker {
//	String lion = "사자는";
//
//	@Override
//	public void Breaker() {
//		System.out.println(zoo + meat + lion + " A 조련사가 담당한다.");
//	}
//}
//
//class Monkey extends Grass implements Breaker {
//	String monkey = "원숭이는";
//
//	@Override
//	public void Breaker() {
//		System.out.println(zoo + grass + monkey + " 담당하는 조련사가 없다.");
//	}
//}