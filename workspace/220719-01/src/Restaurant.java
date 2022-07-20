
public class Restaurant {
	private int id;
	private String tradeName;
	private String callNumber;
	private String address;
	public Restaurant(int id, String tradeName, String callNumber, String address) {
		super();
		this.id = id;
		this.tradeName = tradeName;
		this.callNumber = callNumber;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public String getCallNumber() {
		return callNumber;
	}
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Restaurant [id =" + id + ", tradeName =" + tradeName + ", callNumber =" + callNumber + ", address =" + address
				+ "]";
	}
}
