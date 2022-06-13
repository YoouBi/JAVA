// 쌤 꺼...
class Can {
	private String name;
	
	public Can(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

class VendingMachine {
	public static final int COLA = 1; // 스테틱이 있어야 객체와 무관하게 정적으로 프로그램 시작할때부터 끝까지 접근해서 사용 가능
	public static final int SPRITE = 2; // 이 값은 클래스 안에 적혀있으니 클래스 이름으로 불러내야
	public static final int FANTA = 3;
	
	public Can makeCan(int choice) {
		if (choice == COLA) {
			return new Can("콜라");
		} else if (choice == SPRITE) {
			return new Can("사이다");
		} else {
			return new Can("환타");
		}
	}
	
	public Can makeCan(String choice) {
		if (choice.equals("Cola")) {
			return new Can("콜라");
		} else if (choice.equals("Sprite")) {
			return new Can("사이다");
		} else {
			return new Can("환타");
		}
	}
}

public class Main3 {
	// 자판기 메소드
	// 정수형 -> 반환Type : Can
	// 1 -> field "콜라"
	// 2 -> field "사이다"
	
	// 문자열 -> 반환Type : Can
	// "Cola" -> field "콜라"
	
	public static void main(String[] args) {
		VendingMachine m = new VendingMachine();
		Can can1 = m.makeCan(VendingMachine.COLA);
		
		Can can2 = m.makeCan("Cola");
		
		System.out.println(can1);
		System.out.println(can2.toString());
	}
}

