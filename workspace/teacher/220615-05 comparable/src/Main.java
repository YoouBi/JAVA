import java.util.Arrays;

class Member implements Comparable<Member> {
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	
	public Member(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Member o) {
		return height - o.height;
	}
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










