import java.util.Scanner;

// 자판기 메소드
// 정수형1 -> Can 객체 : 콜라
// 정수형 -> 반환Type : Can
// 1 -> field "콜라"
// 2 -> field "사이다"

// 문자열 COLA -> Can 객체 : 콜라
// 문자열 -> 반환Type : Can
// "Cola" -> field "콜라"

class Can {
	private String name;
//	name.toUpperCase();
	public Can(int num) {
		if(num == 1) this.name = "Cola";
		else if(num == 2) this.name = "Sprite";
		else if(num == 3) this.name = "Fanta";
		else this.name = "없는 이름 혹은 번호입니다.";
	}
	
	public Can(String name) {
		this.name = name;
	}

//	public String toString() {
//		if (name.equals("Cola")) return "COLA";
//		else if (name.equals("Sprite")) return "SPRITE";
//		else if (name.equals("Fanta")) return "FANTA";
//		else return "없는 이름 혹은 번호입니다.";
//	}
	
	public void canString() {
		if (name.equals("Cola")) System.out.println("COLA");
		else if (name.equals("Sprite")) System.out.println("SPRITE");
		else if (name.equals("Fanta")) System.out.println("FANTA");
		else System.out.println("없음");
	}
}

public class Main2 {
//	public final int COLA = 1;
//	public final int SPRITE = 2;
//	public final int FANTA = 3;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Can machine = new Can(1);
		Can machine2 = new Can(2);
		Can machine3 = new Can(4);
		Can machine4 = new Can("Fanta");
		
		System.out.println("자판기 번호 혹은 살 음료수의 이름을 입력해주세요.");
		System.out.println("1.Cola 2.Sprite 3.Fanta");
		String name = scan.nextLine();
		
		if (name.equals("1")) name = "COLA";
		else if (name.equals("2")) name = "Sprite";
		else if (name.equals("3")) name = "Fanta";
		else name = "no";
		
		Can machine5 = new Can(name);
		machine5.canString();
		
//		System.out.println(machine.toString());
//		System.out.println(machine2.toString());
//		System.out.println(machine3.toString());
//		System.out.println(machine4.toString());
		
//		machine.canString();
	}
}