public class Main {
	public static void main(String[] args) {
//		IFlyable f = new IFlyable(); // 인터페이스도 인스턴스화 할 수 없다
		
		Penguin penguin = new Penguin();
//		IFlyable test = penguin; // 날 수 있는 동작을 구현한 구현체가 아니라서 컴파일 에러가 남
		
		Eagle e = new Eagle();
		Bird b = e;
		Animal a = e;
		IFlyable f = e; // 날 수 있는 애도 참조 가능
		
		Eagle downCasting = (Eagle) f;
		downCasting.fly();
		
		f.fly(); // f는 독수리를 참조하고 있으니 (자식 독수리가 오버라이딩 되어있는)독수리가 날 것
		
		IFlyable p = new Plane();
		Eagle test = (Eagle) p; // 실행은 되지만 실행 중 에러가 나서 종료된다
		// 비행기는 날 수 있는 형태는 취할 수 있지만 독수리와 아무 관련이 없기 때문에 다운캐스팅을 할 때 에러가 난다
		// 그래서 이런 곳에서 instanceof로 확인을 하고 실행을 해야하는 것이다
		
		IFlyable fish = new FlyingFish();
		
		p.fly();
		fish.fly();
	}
}