public class Employee {
	public String name;
	String address;
	protected int salary;
	private int RRN;
	
	public Employee() {}

	public Employee(String name, String address, int salary, int RRN) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.RRN = RRN;
	}
	
	public String toString() {
		return name + ", " + address + ", " + RRN + ", " + salary;
	}	
}

class Manager extends Employee {
	private int bonus;
	
	public Manager() { 
		super();
	}

	public Manager(String name, String address, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	}
	
	public void printSalary() {
		System.out.println(name + "(" + address + "):" + (salary + bonus));
	}

	public void printRRN() {
//			System.out.println(RRN); 부모 클래스에서 접근제한자가 private로 설정되어있기 때문에 컴파일 오류
	}
}

class ManagerTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.printRRN();
	}
}