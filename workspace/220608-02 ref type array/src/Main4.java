// 기존에 작성하였던 학생관리 프로그램을 배열을 활용할 수 있는 방법으로 수정해보세용~~~

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] stuName = new String[3];
		int[] stu1 = {0, 0, 0};
		int[] stu2, stu3 = {0, 0, 0};
		Arrays.fill(stu2, 0);
		
		System.out.println("삐약이반에 들어갈 학생 3명의 이름과 국영수 점수를 순서대로 입력해주세요.\n"
				+ "입력 방식 : 한 학생의 이름, 국어점수, 영어점수, 수학점수 입력. 이후 다음 학생 정보 입력.");
		for (int i = 0; i < 3; i++) {
			String name = scan.nextLine();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			
			stuName[i] = name;
			int[] a = {kor, eng, math};
			
			for (int j = 0; j < 3; j++) {
				if(i == 0) stu1[j] = a[j];
				else if(i == 1) stu2[j] = a[j];
				else stu3[j] = a[j];
			}
		}
		
		while(true) {
			System.out.println("열람하고 싶은 정보의 번호를 입력해주세요.\n"
					+ "1.삐약이반 학생 이름 목록 2.삐약이반 전체 평균점수 3.삐약이반 1등 학생 정보  4.삐약이반 정보 열람 종료");
			int i = scan.nextInt();
		
			if (i == 1) {
				System.out.println(stuName);
//			} else if (i == 2) {
//				for (int j = 0; j < 3; j++) {
//				
//				}
//			} else if (i == 3) {
//				pipibest();
			} else if (i == 4) {
				System.out.println("삐약이반 정보 열람을 종료하겠습니다.");
				break;
			} else {
				System.out.println("잘못된 번호가 입력되었습니다.");
			}
		}
	}
}