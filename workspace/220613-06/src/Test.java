public class Test {
	public static void main(String[] args) {
		Book b = new Book("와앙", 500, "으웡");
		Book m = new Magazine("으아", 600, "으아악", 20220613); // 와 이게 되네! 내가 원하는 형태로 변환하는 다형성!
		// 객체는 다향한 형태를 가질 수 있는데 자식이 부모의 형태를 가질 수는 있지만 그렇게되면 틀 자체가 부모의 틀이기 때문에
		// 자식만 가진 필드를 없애버리는...?
		// 자동적으로 상향 형변환up-casting이 일어난것
		
		System.out.println(b.toString());
		System.out.println(m.toString());
//		System.out.println(m.getDate()); // 근데 이렇게 만들면 Book 형을 가지고있기 때문에  Magazine의 발매일자는 출력 불가능!
		
		Magazine m2 = (Magazine) m; // 원래의 형을 가질 수 있게 된다 // 하향 형변환 down-casting
		System.out.println(m2.toString());
		System.out.println(m2.getDate());
		
		if (b instanceof Magazine) { // 왼쪽에 있는 인스턴스를 우측에 있는 인스턴스로 (변환하고자하는 자식 형태가 맞는지) 확인하는 메소드 있다!
			Magazine m3 = (Magazine) b;
		} // 는 문법적으로는 맞지만 그냥 일반 Book은 잡지가 될 수 없기 때문에 실행 도중에 에러가 난다
		// 다운 캐스팅을 모든 부모가 모든 자식으로 될 수는 없다는 것
		// 인스턴스가 잡지(즉 변환하고자하는 형태의 자식 형태)가 맞는지부터 확인을 하고 다운 캐스팅을 해야한다
		
		Novel n = new Novel("소설", 100, "작가", 10);
		
		Book b2 = n;
		n.getRating();
//		book.getRating();
		
//		Novel otherRef = (Magazine) book;
//		otherRef.getRating();
		
		if (b2 instanceof Magazine) { // 이렇게 만들면 원래의 형태를 찾아갈 수 있을 것
			Magazine otherRef = (Magazine) b2;
			otherRef.getDate();
		} else if (b2 instanceof Novel) {
			Novel n2 = (Novel) b2;
			n2.getRating();
		}
	}
}