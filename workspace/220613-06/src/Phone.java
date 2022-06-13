public class Phone {
	String made;
	int price;
	String type;
	
	public Phone(String made, int price, String type) {
		this.made = made;
		this.price = price;
		this.type = type;
	}
	
	public String getMade() {
		return made;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return made + "에서 만들어진 이 휴대폰은 " + price + "의 가격을 가졌으며 통신타입은 " + type + "다.";
	}
}

class SmartPhone extends Phone {
	String operatingType;
	double operatVer;
	int memory;
	boolean camera;
	boolean bluetooth;
	
	public SmartPhone(String made, int price, String type, String operatingType, double operatVer, int memory,
			boolean camera, boolean bluetooth) {
		super(made, price, type);
		this.operatingType = operatingType;
		this.operatVer = operatVer;
		this.memory = memory;
		this.camera = camera;
		this.bluetooth = bluetooth;
	}

	public String getOperatingType() {
		return operatingType;
	}

	public void setOperatingType(String operatingType) {
		this.operatingType = operatingType;
	}

	public double getOperatVer() {
		return operatVer;
	}

	public void setOperatVer(double operatVer) {
		this.operatVer = operatVer;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getCamera() {
		return camera? "있고 " : "없고 ";
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public String getBluetooth() {
		return bluetooth? "있다." : "없다.";
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public String toString() {
		return super.toString() + "\n운영체제 타입은 " + operatingType + "(Ver." + operatVer 
				+ ") 으로 내부 메모리는 " + memory + "GB, 카메라는 "  + camera + "블루투스 기능은 " + bluetooth;
	} 
}