public class Student extends Person { // 상속받는다는걸 알려주는 건 extends
// 필드의 생성자를 호출할 수 있는 메소드가 하나 있어야한다고 빨간줄이 뜬다
//	private String name;
//	private int age;
	private int score; // 부모 클래스를 그대로 물려받으면서도 자기자신만 가진 속성이 있다

	public Student(String name, int age, int score) {
//		this.name = name; // this는 자기 자신으로 name 필드를 지정해야하는건 자식인 Student가 아니고
//		this.age = age; // 부모 클래스인 Person인데 private한 접근자라면 접근할 수 없다
		super(name, age); // 그래서 퍼블릭한 부모의 생성자를 호출할 수 있는 키워드 super를 써주자
		// super는 생성자의 첫 문장에 적어줘야한다
		this.score = score;
	}
	
//	public String getName() {
//		return name;
//	}

	public int getScore() {
		return score;
	}
}
