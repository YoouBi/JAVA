import java.util.Arrays;
import java.util.Scanner;

// 회원 관리 프로그램
// 회원을 콘솔 입력으로 등록할 수 있게. 최대 10명
// 중복 등록이 되면 안됨 (이름, 키, 몸무게가 동일하면 중복입니다)
// 기준에 따라 집계를 해서 목록을 보여줘야합니다.
// 총 인원...???

// 회원
// 이름
// 키
// 몸무게

// BMI 지수
// BMI = 몸무게(Kg) / 키^2(m)

// 고도 비만 : 35 이상
// 중도 비만 (2단계 비만) : 30 - 35 미만
// 경도 비만 (1단계 비만) : 25 이상 - 30 미만
// 과체중 : 23 이상 - 25 미만
// 정상 : 18.5 이상 23 미만
// 저체중 : 18.5 미만

class Member {
	String[] member = new String[5];
	String name;
	double kg;
	double cm;
	double BMI = 0.01;
	String management;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름와 몸무게(kg기준), 키(cm기준)을 순서대로 입력해주세요.");
		String name = scan.nextLine();
		kg = scan.nextDouble();
		cm = scan.nextDouble();
		BMI = (kg / ((cm * 0.01) * (cm * 0.01)));
			
		for (int i = 0; i < member.length; i++) {
			if(i == 0) member[i] = name;
			else if(i == 1) member[i] = kg + ""; 
			else if(i == 2) member[i] = cm + "";
			else if(i == 3) member[i] = BMI + "";
			else {
				if(BMI < 18.5) member[i] = "저체중";
				else if(BMI < 23) member[i] = "정상";
				else if(BMI < 25) member[i] = "과체중";
				else if(BMI < 30) member[i] = "경도 비만";
				else if(BMI < 35) member[i] = "중도 비만";
				else member[i] = "고도 비만";
			}
		}
		scan.nextLine();
	}
}

class Group extends Member {
	String[][] group = new String[10][5];
	
	public void group() {
		for (int i = 0; i < group.length; i++) {
			boolean twin = false;
			input();
			
			for (int j = 0; j < member.length; j++) {
				group[i][j] = member[j];
				
				for (int k = 0; k < i; k++) {
					if(0 < i && group[i].equals(group[k])) twin = true;
				}
				
				if(twin) {
					System.out.println("중복되는 회원이 있습니다.");
					i--;
				}
			}
			Arrays.fill(member, null);
			twin = false;
		}
	}
	
	public String toString() {
		return member[0] + "회원님은 몸무게 " + member[1] + "kg" + ", 키 " + member[2] + "cm(BMI지수 " + member[3] + ")로 " + member[4] + "입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof String[]) {
			String[] otherMember = (String[]) obj;
			return (member[0].equals(otherMember[0])) && (member[1].equals(otherMember[1])) && ((member[2].equals(otherMember[2])));
		} else {
			return false;
		}
	}
	
	public void bmiList() {
		System.out.println("이 그룹에 저체중(BMI지수 18.5이하)인 사람은 ");
		for (int i = 0; i < group.length; i++) {
			if("저체중".equals(group[i][5])) ; // 이퀄스가 새로 정의되어서 안될거같은데...???
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Group mem = new Group();
		
		mem.group();
		mem.toString();
		mem.bmiList();
	}
}
