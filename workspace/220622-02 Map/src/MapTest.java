import java.util.HashMap;
import java.util.Map;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
}

public class MapTest {
	public static void main(String[] args) {
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "구준표")); // 짝을 이루고 있는 값은 학생 객체
		st.put("20090002", new Student(20090002, "금잔디"));
		st.put("20090003", new Student(20090003, "윤지후"));
		
		System.out.println(st);
		
		st.remove("20090002");
		
		st.put("20090003", new Student(20090003, "소이정"));
		
		System.out.println(st.get("20090003"));
		
		for (java.util.Map.Entry<String, Student> s : st.entrySet()) { // java.util(패키지).Map(인터페이스).Entry(인터페이스)
			// 지역적으로 클래스를 사용했던 것처럼 클래스안에 클래스, 인터페이스 안에 인터페이스를 만들 수 있다
			// 왜 이렇게 만들었냐면 Map과 Entry는 아주아주 관련있는 인터페이스다 해서 따로 만들지 않고 안에 만든 것 -> 내부 인터페이스, 외부 인터페이스
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key=" + key + ", value=" + value);
		}
	}
}
