import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

		// 두개의 set 원소들을 모두 포함하는 set을 만들고싶다 (합집합)
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA); // 원소들을 한꺼번에 다 집어넣는 메소드
		setUnion.addAll(setB); // 원소들을 한꺼번에 다 집어넣는 메소드
		System.out.println(setUnion);

		// 이런 집합 연산에 아주 특화되어있어서 다 메소드로 제공
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB); // '중복되는 원소만 남기고' 지워준다!(교집합)
		System.out.println(setDuplicate); // 다 지워버리면 사이즈 0인 [] 빈...공간...

		// 차집합
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB);
		System.out.println(setLeftOuter);

		Set<Integer> setSame = new HashSet<>(Arrays.asList(7, 6, 5, 4, 3, 2, 1));
		System.out.println(setSame.equals(setUnion)); // 인덱스가 없기 때문에 '원소가 다 있는지만' 보고 동등함을 비교
	}
}