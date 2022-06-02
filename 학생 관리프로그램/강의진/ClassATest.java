import java.util.Scanner;

public class ClassATest {

	public static void main(String[] args) {
//		Student kang = new Student("kang", 100, 100, 100);
//		Student park = new Student("park", 100, 90, 80);
//		Student kim = new Student("kim", 90, 80, 70);
//		ClassA members = new ClassA(kang, park, kim);
//
//		members.printAll();
//		members.totalAvg();
//		members.bestOne();
		// 인스턴스 수정 => 파라미터 값을 받을 필요가 없이 스캐너로 받음.
		Scanner scan = new Scanner(System.in);

		System.out.println("학생관리프로그램 실행");

		System.out.println("이름을 입력하세요");
		Student kang = new Student();
		System.out.println("평균 " + kang.getAverage());
		System.out.println("이름을 입력하세요");
		Student park = new Student();
		System.out.println("평균 " + park.getAverage());
		System.out.println("이름을 입력하세요");
		Student kim = new Student();
		System.out.println("평균 " + kim.getAverage());
		ClassA members = new ClassA(kang, park, kim);
		members.bestOne();

		boolean a = true;
		while (a) {
			System.out.println(
					"press 1: 학생명단, press 2: 국어총평균, press 3: 영어총평균, press 4: 수학총평균, press 5: 학생총평균, press 0: 종료");
			int num = scan.nextInt();
			if (num == 1) {
				members.printAll();
			} else if (num == 2) {
				members.korAvg();
			} else if (num == 3) {
				members.engAvg();
			} else if (num == 4) {
				members.mathAvg();
			} else if (num == 5) {
				members.totalAvg();
			} else if (num == 0) {
				a = false;
				System.out.println("종료되었습니다.");
			}
		}
	}
}
