import java.util.Arrays;

// 멤버 관리 프로그램
// 키 순(오름차순)으로 멤버를 조회하기
//----------------------------
// 몸무게 순(오름차순)으로 멤버를 조회하기 << 어제거랑 위에거 다 하고 난 후~~
class Member implements Comparable<Member> {
	String name;
	int height;
	int weight;
	// 대소 비교를 하고 싶다 -> 하나의 동작으로서 기준을 만들자면 키, 몸무게, 이름의 가나다 순 등

	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
}

class 

public class Main {
	public static void main(String[] args) {
		Member[] members = { 
				new Member("와앙", 190, 60), 
				new Member("크앙", 130, 30), 
				new Member("으앙", 176, 65),
				new Member("으잉", 186, 69)
				};
		
		Arrays.sort(members);
		System.out.println(members[0].toString());
		System.out.println(members[1].toString());
		System.out.println(members[2].toString());
		System.out.println(members[3].toString());
	}
}