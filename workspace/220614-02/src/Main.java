import java.util.Scanner;

// 컵라면
// 제조사
// 이름
// 가격

// 생성자, 게터세터

// Override
// toString
// equals - 제조사와 이름이 같으면

class CupRamen {
	String made;
	String name;
	int price;
	
//	public CupRamen() {}

	public CupRamen(String made, String name, int price) {
		this.made = made;
		this.name = name;
		this.price = price;
	}

	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

//	public static CupRamen input() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("제조사 이름 가격 넣으세요");
//		String made = scan.nextLine();
//		String name = scan.nextLine();
//		int price = scan.nextInt();
//		return new CupRamen(made, name, price);
//	}

	public String toString() {
		return made + "에서 만들어진 " + name + "(" + price + "원)";
	}

	@Override
	public boolean equals(Object obj) { // 다른 기준을 만들고 싶은데 이퀄스 메소드는 하나밖에 가질 수 없을 땐 컵라면 두개를 보는 심판을 가지게 해서 비교하게 한다
		if (obj instanceof CupRamen) {
			CupRamen otherCupRamen = (CupRamen) obj;
			return made.equals(otherCupRamen.made) && name.equals(otherCupRamen.name);
		} else {
			return false;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		CupRamen ramen1 = new CupRamen("농심", "육개장", 1600);
		CupRamen ramen2 = new CupRamen("농심", "육개장", 2000);
		CupRamen ramen3 = new CupRamen("삼양", "육개장", 1600);

//		Scanner sacnScanner = new Scanner(System.in);
//		for(char = 'A'; char <= 'Z'; char++);

		if (ramen1.equals(ramen2)) {
			System.out.println(ramen1.toString() + "과 " + ramen2.toString() + "은 동일한 종류의 컵라면입니다.");
		} else {
			System.out.println(ramen1.toString() + "과 " + ramen2.toString() + "은 동일한 종류의 컵라면이 아닙니다. ");
		}

		if (ramen1.equals(ramen3)) {
			System.out.println(ramen1.toString() + "과 " + ramen3.toString() + "은 동일한 종류의 컵라면입니다.");
		} else {
			System.out.println(ramen1.toString() + "과 " + ramen3.toString() + "은 동일한 종류의 컵라면이 아닙니다. ");
		}
		
		System.out.println(ramen1.hashCode());
		// 기본 toString에는 해시코드가 들어가있다
		
//		CupRamen ramen4 = new CupRamen();
//		ramen4.input();
	}
}
