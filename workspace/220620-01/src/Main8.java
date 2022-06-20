import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 23, 35, 11, 23, 57, 79));
		// 합, 평균
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println("list 원소들의 합은 " + sum + "이고, 평균은 " + sum / list.size() + "이다.");
		
		// 정수 57이 리스트에 있는지? 있으면 몇 번째 index에 위치하는지?
		System.out.println("\nlist에 정수 57이 있나요?");
		if(list.contains(57)) {
			System.out.println("네. " + list.indexOf(57) + "번째 index에 위치하고 있습니다.");
		} else {
			System.out.println("아니오. 없습니다.");
		}
		
		// 정수 23의 개수
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == 23) {
				count++;
			}
		}
		
		System.out.println("\nlist 안에 정수 23는 " + count + "개 있습니다.");
		
		// 중복되는 원소 23을 '하나' 삭제하기
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//			i--;
//		}
//	
//		for (int i : list) {
//			list.remove(Integer.valueOf(i));
//		}
//	
//		Iterator<Integer> iter = list.iterator();
//		while (iter.hasNext()) {
//			iter.next();
//		}
		
		
		///////////////////////////////////////////////
		
//		list.remove(Integer.valueof(23)); // 오브젝트 형태로 받는 건 객체의 동등함을 equals로 비교해서 왼쪽부터 지워줌
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == 23 && count != 1) {
				list.remove(i);
				count--;
			}
		}
		
//		int index = list.indexOf(23); // 오토박싱~
//		int index = list.lastindexOf(23); // 오른쪽부터 찾으려면 라스트
		// 바이너리 서치는 이진검색으로 내 위치가 왼쪽 오른쪽보다 큰지 작은지를 알아내는거라 '정렬'을 먼저 해야 이진검색을 할 수 있다
		// 근데 정렬을 하려면 삽입된 순서가 날아가버리니까...
		
//		list.remove(index);
		System.out.println("\n23 정수 하나를 삭제한 리스트는 " + list + "입니다.");
	}
}
