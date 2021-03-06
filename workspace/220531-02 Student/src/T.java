// 학생 관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록. 3명
// 이름 목록을 볼 수 있어야 하고
// 평균을 볼 수 있고
// 1등 학생의 정보도 볼 수 있는 프로그램.
// 자유롭게

// 기존에 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 '다 기록'

// 학급(반)
// 학생1
// 학생2
// 학생3
// 활용해서 필드로 만들겠다! 와~~~ 짱이다~~~ 천재다~~~

// 1. 3명의 학생의 이름을 콘솔에 출력할 수 있음.
// 2. 학생 3명의 총 평균을 알려줄 수 있음.
// 3. 평균점수가 가장 높은 학생(참조)을 알려줄 수 있음. => 동일 점수일 경우 1 , 2 , 3 순
// 참조를 알고싶은 것. 리턴 타입이 학생이어야 한다.

public class T {
	public static void main(String[] args) {
		Student student1 = new Student("철수", 93, 65, 88);
		Student student2 = new Student("영희", 80, 70, 95);
		Student student3 = new Student("바둑이", 72, 100, 95);

		String name1 = student1.getName();
		String name2 = student2.getName();
		String name3 = student3.getName();
		
		int avg1 = student1.getAverage();
		int avg2 = student2.getAverage();
		int avg3 = student3.getAverage();
		int sum = avg1 + avg2 + avg3;
		
		System.out.printf("%s와 %s와 %s의 평균 점수는 %d점이며 평균 점수가 가장 높은 학생은 %s다.",
				student1.getName(), name2, name3, (sum / 3), firstName(student1, student2, student3));
	}
	
	private static String firstName(Student a, Student b, Student c) {
		if (a.getAverage() >= b.getAverage() && a.getAverage() >= c.getAverage()) {
			return a.getName();
		} else if (b.getAverage() > a.getAverage() && b.getAverage() >= c.getAverage()) {
			return b.getName();
		} else {
			return c.getName();
		}
	}
}
