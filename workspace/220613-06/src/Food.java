public class Food {
	int kcal;
	int price;
	int kg;
	
	public Food(int kcal, int price, int kg) {
		this.kcal = kcal;
		this.price = price;
		this.kg = kg;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getKg() {
		return kg;
	}
	
	public void setKg(int kg) {
		this.kg = kg;
	}
	
	public String toString() {
		return kcal + "와 " + kg + "의 중량을 가졌으며 가격은 " + price + "원이다.";
	}
}

class Melon extends Food {
	String plantation;

	public Melon(int kcal, int price, int kg, String plantation) {
		super(kcal, price, kg);
		this.plantation = plantation;
	}

	public String toString() {
		return "이 멜론은 " + plantation + " 농원에서 재배되어 " + super.toString();
	} 
}