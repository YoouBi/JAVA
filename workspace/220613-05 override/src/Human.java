public class Human {
	private String name; // 1. 클래스 휴먼의 네임, 에이지 필드 정의
	private int age;
	private String profession;

	public Human(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}
	
//    public Human(String name, int age){ // 2. 생성자 작성
//    	// 매개 변수의 값으로 필드를 초기화한다.
//    	this.name = name;
//    	this.age = age;
//    }

	// 3. 각 필드에 대하여 접근자와 설정자 작성
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String toString() { // 4. 객체 현재값을 문자열로 반환
		return name + "의 나이는 " + age + "살이다.";
	}

	public static void main(String[] args) { // 5. 춘향전 객체 생성과 toString 호출하여 출력
		Human chun = new Human("춘향", 18);
		Human mong = new Human("몽룡", 21);
		Human satto = new Human("사또", 50);

		System.out.println(chun.toString());
		System.out.println(mong.toString());
		System.out.println(satto.toString());

		Student st1 = new Student("명진", 21, "컴퓨터"); // 10. 객체 생성과 toString 호출하여 출력
		Student st2 = new Student("미현", 22, "경영");
		Student st3 = new Student("용준", 24, "경제");

		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
	}
}
