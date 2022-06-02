// 학생 관리 프로그램
// 콘솔 입출력
// 반에 학생을 등록. 3명
// 이름 목록을 볼 수 있어야 하고
// 평균을 볼 수 있고 
// 1등 학생의 정보도 볼 수 있는 프로그램.
// 자유롭게 

// 기존에 만들었던 클래스 << 수정. 수정을 해야하는 이유와 전 후가 어떻게 바뀌었는지 '다 기록';

public class StudentTest {
	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		StudentClass one = new StudentClass(student1, student2, student3);

		one.manageProgram();
	}
}
