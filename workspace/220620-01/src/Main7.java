import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		List<Integer> two = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			two.add(i * 2);
		}
		
		System.out.println(two);
	
		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
		List<Integer> saven = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			saven.add(i * 7);
		}
		
		System.out.println(saven);
		
		// 위의 리스트의 원소들을 모두 다 가지는 리스트
		List<Integer> twoSaven = new ArrayList<>(saven);
		twoSaven.addAll(0, two);
		
		System.out.println(twoSaven);
		
		// 모두 다 가지는 리스트를 오름차순으로 정렬된 원소를 가지는 리스트
		List<Integer> upTwoSaven = new ArrayList<>(twoSaven);
		Collections.sort(upTwoSaven);
		
		System.out.println(upTwoSaven);
		
		// --
		// (Random 객체를 사용하여) 0 ~ 10사이의 난수를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야 함)
		Random random = new Random();
		List<Integer> randomTen = new ArrayList<>();
		
		// iterator.hasNext() 쓸 수 있을 것 같은데... Main4
		while (randomTen.size() < 6) { // int bound는 0부터 '몇 개' 까지의 숫자 사이에서 선택해줄까? 묻는 것
			if () {
				randomTen.add(random.nextInt(11));
			}
		}
		System.out.println(randomTen);
	}
}



///////////////////쌤꺼//////////////////////



//public class Main7 {
//	public static void main(String[] args) {
//		// 2의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
//		List<Integer> listTwos = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
//		// 7의 배수를 5개 가지는 정수형 리스트 생성 및 초기화해보기
//		List<Integer> listSevens = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
//		// 3번. 위의 리스트의 원소들을 모두 다 가지는 리스트
//		List<Integer> listAll = new ArrayList<>();
//		listAll.addAll(listTwos);
//		listAll.addAll(listSevens);
//		// 3번의 리스트를 오름차순으로 정렬된 원소를 가지는 리스트
//		List<Integer> ordered = new ArrayList<>(listAll);
//		Collections.sort(ordered);
//		
////		System.out.println(listAll);
////		System.out.println(ordered);
//		// --
//		// (Random 객체를 사용하여) 0 ~ 10사이의 난수(정수형)를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야 함)
//		List<Integer> listRandom = new ArrayList<>();
//		Random random = new Random();
////		for (int i = 0; i < 6; i++) { // 중복되는 걸 제거하면 길이값이 줄어들것
//		while (listRandom.size() < 6) { // 그래서 사이즈가 6이 될때까지 반복으로
//			int result = random.nextInt(11);
//			if (!listRandom.contains(result)) {
//				listRandom.add(result);
//			}
//		}
//		System.out.println(listRandom);
//	}
//}

