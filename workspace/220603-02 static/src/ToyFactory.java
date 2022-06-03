public class ToyFactory {
	// 공장의 각 부지가 있다면 각각의 공장에 따라서 인형들도 다를테니 static을
	private String location;
	
	public ToyFactory(String locatoin) {
		this.location = locatoin;
	}
	
	public Toy makeToy() {
		return new Toy("처키인형, 생산지: " + location, 10000);
	}
	// 동작이 아니라 기능 하나만 사용하겠다, 하면 static으로 사용해도 괜찮다
}