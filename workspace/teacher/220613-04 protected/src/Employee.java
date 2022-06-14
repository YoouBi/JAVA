public class Employee {
	public String name;
	protected int salary;
	String address;
	private int RRN;
	
	public Employee() {}
	
	public Employee(String name, String address, int salary, int RRN) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}

	public String toString() {
		return name + ", " + address
					+ ", " + RRN + ", " + salary;
	}
}
