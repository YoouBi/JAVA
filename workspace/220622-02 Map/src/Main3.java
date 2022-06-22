import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

// 중국집 주문 가격 계산기

// 짜장면 : 2500
// 짬뽕 : 4000
// 볶음밥 : 4000

// 메뉴를 '추가'
// 탕수육 : 10000

// 계산 결과 출력 가능
class Chinese {
	private String menu;
	private int number;
	
	public Chinese(String menu, int number) {
		super();
		this.menu = menu;
		this.number = number;
	}
	
	public Chinese(String menu) {
		this.menu = menu;
		number = number;
	}
	
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return menu + number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(menu);
	}
}

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Chinese blackNoodle = new Chinese("짜장면"); // 제일처음 했던대로 이름, 가격, 번호 쓰고
		Chinese spicyNoodleSoup = new Chinese("짬뽕");
		Chinese friedRice = new Chinese("볶음밥");
		
		Map<Chinese, Integer> menu = new HashMap<>();
		menu.put(blackNoodle, 2500); // 클래스와 갯수로 해서 해시코드...? 아니다 각각 들어가는건 이게 맞을듯
		menu.put(spicyNoodleSoup, 4000);
		menu.put(friedRice, 4000);
		
		Set<Chinese> keySet = menu.keySet();
		
		while (true) {
			System.out.println("△△중국집 프리오더입니다.\n1.계산서 발행\n2.메뉴 추가");
			int button = scan.nextInt();
			
			if(button == 1) {
				System.out.println("주문하실 메뉴의 이름을 입력해주시고 갯수를 입력해주세요.\n주문을 끝내고싶다면 20000을 입력해주세요.");

				int sum = 0;
				
				for (Chinese key : keySet) { // Set이니까 for-each문도 된다
					System.out.println(key);
				}
				
				while (true) {
					String menuKey = scan.nextLine();
					scan.nextLine();
					int menuValue = scan.nextInt();
					scan.nextLine();
					
					
					/////////////////////////////////////////////////////
					Set<Chinese> hashSet = new HashSet<>();
					
					// 이름값이 같은걸 같은 해시코드로 인식해서 새로운 new Chinese("같은 이름", 덮어씌울 갯수);로 비교
					hashSet.add(new Chinese(menuKey, menuValue)); // 해시코드 쓰는거니까 덮어씌우는...건가...?
					
					
					if (menu.containsKey(Chinese)) { // menu에
						menu.put(Chinese, menuValue);
					}
					
					
					hashSet.add(blackNoodle);
					hashSet.add(spicyNoodleSoup);
					hashSet.add(friedRice);
					
					//////////////////////////////////////////////////////
					
					
					System.out.println(hashSet);
					
					if(menuKey.equals("20000") || menuValue == 20000) break;
				}
				
				System.out.println("계산서를 발행하겠습니다.\n주문하신 음식들의 값은 " + sum + "입니다.");
			}
		}
	}
}