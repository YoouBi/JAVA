// 의자 클래스
// 제조사
// 생산일자
// 가격
// 모델명

// 초기화 할 수 있는 생성자

// main -> 작성한 생성자를 통해 원하는 필드값으로 초기화 해보세요.

public class Chair {
	String made;
	String builtDate;
	int price;
	String name;
	
	public Chair(String m, String b, int p, String n) {
		made = m;
		builtDate = b;
		price = p;
		name = n;
	}
	
	void printAll() {
		System.out.println(made);
		System.out.println(builtDate);
		System.out.println(price);
		System.out.println(name);
	}
	
	public static void main(String args[]) {
		Chair c = new Chair("시디즈", "16.09.05", 374000, "T50");
		Chair c2 = new Chair("허언밀러", "19.10.21", 2120000, "뉴 에어론");
		System.out.println(c);
		c.printAll();
	}
}