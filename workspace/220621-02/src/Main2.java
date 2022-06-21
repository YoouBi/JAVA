import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 학생 : 이름, 나이

// (학생은 이름과 나이가 같으면 동일 학생입니다)

// 홍길동 15
// 둘리 22
// 도우너 33

// 위의 학생을 원소로 가지는 리스트를 생성하고
// (도우너 33) 학생의 인덱스를 찾아보세요.
class Student implements Comparable<Student> { // Comparable 안의 compareTo를 오버라이드 해줘야 class Student에 붙은 빨간 줄이 사라짐
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public int getScore() {
		return score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Student o) {
		return score - o.score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
}

public class Main2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("홍길동", 15, 90));
		list.add(new Student("둘리", 22, 80));
		list.add(new Student("도우너", 33, 95));
		
		System.out.println("(도우너, 33) 학생이 들어간 인덱스의 번호는 " + list.indexOf(new Student("도우너", 33)) + "이다.");
		// 점수가 추가되었어도 우리가 이름과 나이 비교하는것만 정의했으니까 여전히 점수 없이 (도우너, 33)찾기로 찾을 수 있다
		
		// 정렬
		Collections.sort(list); // 대소의 기준, 정렬의 기준이 없기 때문에 컴파일러 단계에서 에러가 남
		System.out.println(list);
		
		// 익명 클래스 선언과 생성
		Comparator<Student> comparator = new Comparator<Student>() { // 구현을 중괄호 영역 안에서 하겠다
			// Comparator에 추상 메소드를 오버라이드
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
		Collections.sort(list, comparator); // 비교할 수 있는 Comparator가 있으면 정렬할 때 같이 던져줄 수 있음
		System.out.println(list);
		
//		Collections.sort(list, new Comparator<Student>() { // 객체만 던져주면 되니까 파라미터에 바로 넣는 방식도 가능하다
//			@Override
//			public int compare(Student o1, Student o2) {
//			return o1.getAge() - o2.getAge();
//			}
//		});
//		System.out.println(list);
	}
}