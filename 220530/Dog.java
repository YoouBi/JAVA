// 강아지 Dog 클래스
// name : 이름
// breed : 종
// age : 나이
public class Dog {
	private String name;
	private String breed;
	private int age;
	
	// 강아지 3개의 모든 필드를 전달받아 초기화 할 수 있는 생성자
	public Dog(String n, String b, int a) {
		name = n; // name = name; 필드 이름과 파라미터를 전달받는 메소드의 이름은 동일해도 된다
				  // 다만 자기 자신에게서 가까운 걸 선택하는 경향이 있어서
				  // 왼쪽 오른쪽 둘 다 name을 위에 있는 public Dog(String name에서 가져오는 것이다
				  // private String name; 은 초기화되지 않아서 기본값인 null이 되는 것
				  // 따라서 자기자신 필드를 나타내기 위해 앞에 this를 붙여
				  // this.name = name;으로 쓸 수 있다
		breed = b;
		age = a;
	}
	
	// 강아지 이름, 종을(2개만 전달받은 값) 초기화하고
	// 나이는 1살로 초기화 할 수 있는 생성자
	public Dog(String n, String b) {
		this(n, b ,1);
	}
	
	// 모든 필드를 private 접근 제한자로 정보은닉(캡슐화)하고
	// 각 필드의 public한 getter/setter를 작성해보세용~~~
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void print() {
		System.out.printf("%s %s %d살", name, breed, age);
	}
	
}