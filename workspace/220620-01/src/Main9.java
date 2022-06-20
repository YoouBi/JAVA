import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main9 {
	// 캐릭터 한개를 전달받아서 숫자 범위에 있는 캐릭터인지 알려줄 것
	public static boolean isNumberChar(char c) { // 문자에 대한 숫자 범위 아스키 코드로 확인
		return c >= '0' && c <= '9';
	}
	
	public static boolean isNumberStr(String s) { // 하나하나의 문자가 숫자인지를 알아볼 수 있으니까
		for (int i = 0; i < s.length(); i++) {
			if (!isNumberChar(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "carrot", "donut", "egg"));
		
		// 위의 리스트에서 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
		Iterator<String> iterator = list.iterator();
		List<String> fiveList = new ArrayList<>();
		
		while (iterator.hasNext()) {
			String str = iterator.next();
			if(str.length() == 5) {
				fiveList.add(str);
			}
		}
		
		//////////////////////////쌤꺼///////////////////////////
//		List<String> copy = new ArrayList<>(list);
//		Iterator<String> iterator = copy.iterator();
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			if (str.length() != 5) {
//				iterator.remove();
//			}
//		}
//		System.out.println(copy);
		
		System.out.println("문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트는 " + fiveList + "이다.");
		
		// 문자열 중에 'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
		List<String> eList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if(str.contains("e")) { // 아직도 contains를 잘 모르나봐...공부해야...
				eList.add(str);
			}
		}

		System.out.println("'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트는 " + eList + "이다.");
		
		// 아래 리스트에서 '정수 형태의 값'을 가지는 문자열을 찾아 해당 원소를 가지는 정수형 리스트 생성 
		List<String> list2 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나"));
		List<Integer> intList = new ArrayList<>();
//		if () 안에 Integer 검색하는거 하면 될 거 같은데...???
		
		for (int i = 0; i < list2.size(); i++) {
			String str = list2.get(i);
			
			if (isNumberStr(str)) {
				intList.add(Integer.valueOf(str));
			}
		}
		
		System.out.println("'정수 형태의 값'을 가지는 문자열을 원소로 가지는 리스트는 " + intList + "이다.");
		
		// '정수 형태의 값'을 가지는 문자열을 -> Integer 형으로
//		Integer i = Integer.valueOf("1234"); // => 1234 Integer 반환
//		Integer exp = Integer.valueOf("숫자아니면?"); // => NumberFormatException 예외 발생
		List<Integer> integerList = new ArrayList<>();
		
		for (int i = 0; i < list2.size(); i++) {
			String str = list2.get(i);
			try {
				Integer value = Integer.valueOf(str);
				integerList.add(value);
			} catch (NumberFormatException e) {  // 예외의 가능성이 있을 때 프로그램이 종료되어버리니까 catch로 잡음
				System.out.println("문자열을 정수형으로 변환하는데 실패하여 예외가 발생했으나 정상흐름으로 돌아가기를 원해 예외처리를 하였습니다.");
			}
		}
		System.out.println("'정수 형태의 값'을 가지는 문자열을 Integer형 리스트로 받은 리스트는 " + integerList + "이다.");
		
		// 아스키 코드로 접근하는게 더 베스트라고 하니까 한번 해보기!
		
		// 인스턴스오브라는 애는 형을 따지는 친군데 스트링을 따지는...
//		Integer i = (Integer) j;? 였던가 함튼 j는 String형 리스트 // 다운 캐스팅을 하려는건데 스트링과 인티저는 연관 자체가 없다
	}

}
