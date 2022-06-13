// 학생
// 이름
// 나이
// 점수 // 필드

// 이름 알려주기
// 점수 알려주기 // 메소드

// 작가
// 이름
// 나이
// 작품 목록

// 이름 알려주기
// 작품 목록 알려주기

// 둘 다 사람이라는 공통적인 친구(학생/작가/회사원...등등)가 이름과 나이의 필드, 그리고 이름 알려주기라는 메소드가 중복될 것
// 객체지향은 이러한 상황을 좀 더 쉽게 접근하고자 상하의 계층구조를 만들어놓고 사람이라는 특성을 미리 정리해놓고 이 특성을 모두 다 공유하고 있는 아래의 클래스에 그대로 적용시킬 수 있는 비법이 존재
//       사람(이름, 나이) 		        부모 클래스 // 이름과 나이처럼 중복되는 코드를 줄일 수 있다
//      /   |     |   \
// 개발자      학생      작가      회사원  	자식 클래스
// 이런 상하 계층으로 물려받는 구조를 만들 수 있는데 이를 '상속'이라는 구조라고 한다
// 학생은 사람이다 와 같은 관계를 is-a 관계라고 하는데 상속은 이 is-a관계가 말이 되어야 할 수 있다

public class Main {
	public static void main(String[] args) {
		Person p = new Person("사람이름", 22);
		
		Student s = new Student("학생이름", 17, 90);
		System.out.println(s.getName());
		System.out.println(s.getScore());
		System.out.println(s.getAge());
		
//		p.getScore(); 점수 필드가 없으니까 안됨
		
		Author a = new Author("작가이름", 30, "반지의길");
		System.out.println(a.getName());
		System.out.println(a.getBookList());
		System.out.println(a.getAge());
	}
}
