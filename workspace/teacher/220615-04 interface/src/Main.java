public class Main {
	public static void main(String[] args) {
//		Flyable f = new Flyable();
		
		Penguin penguin = new Penguin();
//		Flyable test = penguin;
		
		Eagle e = new Eagle();
		Bird b = e;
		Animal a = e;
		Flyable f = e;
		
		Eagle downCasting = (Eagle) f;
		downCasting.fly();
//		
//		f.fly();
//		
		Flyable p = new Plane();
		Eagle test = (Eagle) p;
		
//		Flyable fish = new FlyingFish();
//		
//		p.fly();
//		fish.fly();
	}
}
