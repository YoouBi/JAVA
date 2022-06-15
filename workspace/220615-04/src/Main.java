import java.util.Arrays;

class Member implements Comparable<Member> { // 제너레이션 : <Member>으로 비교할 대상을 넣고 대소 비교를 한다
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	// 대소 비교를 하고 싶다 -> 하나의 동작으로서 기준을 만들자면 키, 몸무게, 이름의 가나다 순 등
	
	public Member(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	// 키
	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}
	
	// 키~를 기준
//	public ?? 비교(대상 다른멤버) {
//	public int compare(Member member) {
////		if(this.height > member.height) {
////			return 내가 큼 /양수
////			return 쟤가 큼 /음수
////					return 똑같음 /0
////		}
//		return height - member.height; // 이런식으로 대소 비교를 할 수 있다고 자바 개발진들이 미리 인터페이스를 만들어뒀다
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (!(obj instanceof Member)) {
//			return false;
//		}
//		Member other = (Member) obj;
//		if (height != other.height) {
//			return false;
//		}
//		if (name == null) {
//			if (other.name != null) {
//				return false;
//			}
//		} else if (!name.equals(other.name)) {
//			return false;
//		}
//		if (weight != other.weight) {
//			return false;
//		}
//		return true;
//	}

	
}

public class Main {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60)
				, new Member("키작은놈", 130, 30)
				, new Member("중간쯔음", 176, 65)
		};
//		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
	}
}