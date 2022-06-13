public class Person {
	private String name;
	protected int age; // protected라는 접근제한자는 자식들이 접근할 수 있게끔 만들어놓은 접근제한자
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}