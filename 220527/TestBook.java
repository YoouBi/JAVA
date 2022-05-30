public class TestBook {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "Power Java";
		book1.author = "천인국";
		book1.printAll(); 
		// book1 보고 네가 가진 메소드를 출력해다오라고 메세지를...
		// book1.printAll(); 말고
		// System.out.println(book1.title); 로도 가능한데 주체가 달라짐
		// 예를 들어 칠판에 숫자 1을 적는데 직접 가서 쓸 수도 있고 누군가에게 부탁해서 쓸 수도 있다
		// 결과 자체는 똑같지만 누가 수행했는지의 뉘앙스가 다른 느낌
		// 사실 이렇게 수행하면 메소드 필요없이 프린트하면 되니까
		
		book1.author = "천인국, 하상호";
		book1.printAll();
		
		Book book2 = new Book();
		book2.title = "무기여 잘 있거라";
		book2.author = "어니스트 허밍웨이";
		book2.printAll();
	}
}