import java.util.Arrays;
import java.util.Comparator;

// 멤버 관리 프로그램
// 키 순(오름차순)으로 멤버를 조회하기
//----------------------------
// 몸무게 순(오름차순)으로 멤버를 조회하기 << 어제거랑 위에거 다 하고 난 후~~
class WeightComparator implements Comparator<Member> {
	@Override
	public int compare(Member o1, Member o2) {
		return o1.weight - o2.weight;
	}
}

public class OrderByWeightMember {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60)
				, new Member("키작은놈", 130, 30)
				, new Member("중간쯔음", 176, 65)
		};
		
		WeightComparator comparator = new WeightComparator();
		int result = comparator.compare(members[0], members[1]);
//		System.out.println(result);
		
		Arrays.sort(members, comparator);
		System.out.println(members[0].weight);
		System.out.println(members[1].weight);
		System.out.println(members[2].weight);
		
		Arrays.sort(members, new Comparator<Member>() { // 익명 클래스 (anonymous class)
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(members[0].name);
		System.out.println(members[1].name);
		System.out.println(members[2].name);
		

	}
}






