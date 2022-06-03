import java.time.LocalDate;
import java.util.Calendar;

public class Main {
//	static {
//		System.out.println("스태틱 블록안입니다.");
//	} // static한 애들은 이렇게 블록으로 만들 수도 있고
	// 정적이라 클래스를 로드하는 시점에서 만들어진다
	// java는 JVm이라는 애가 만들어주는데 우리 프로그램 실행시켜줘, 하면 발급 코드를 들고온다
	// 그리고 그게 제대로 됐는지 검사하고, 프로그램이 돌아가기 위해 필요한 것들(이런 클래스들이 있네)을 살펴본다
	// 클래스를 사용하는 시점(메인 메소드가 프로그램 시작 시점)이 코드를 사용할 수 있게 가져오는 걸 로드하는 시점으로 보고
	// 이때 스태틱이라는 친구들이 프로그램 시작 전에 쭉 만들어둔다
	// 그래놓고 보니까 참조를 해야하는데 위치가 애매하다, 하면 java에서는 main이라는 클래스에 적혀있네 해서 main으로 써라
	// static을 쓰면 객체 지향이 아니라 절차 지향...
//	
//	public static void main(String[] args) {
//		System.out.println("프로그램 시작");
//		
//		System.out.println("프로그램 끝");
//	}
	
	public static void main(String[] args) {
		// java.util.Calender
		// 1.8 ~~ java.date.LocalDate
		Calendar now = Calendar.getInstance(); // 객체를 만들어내지 않고도 쓸 수 있는 static 메소드라는게 있는데
		// 메소드 안에서 뉴 메소드를 만들어서 그 참조를 반환했다
		// getInstance는 객체의 표현이 아니고 클래스 이름을 만든 것
		
		// 캘린더의 get() 안에는 숫자 정수를 넣게 되어있다
//		System.out.println(now.get(1)); // 년
//		System.out.println(now.get(2) + 1); // 월 표시로 왜 +1을 하는가 하면 1월을 0으로 만들어놨다 2월이 1인것
//		System.out.println(now.get(5)); // 일
		
		System.out.println("상수값 확인: " + Calendar.YEAR);
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // 일요일 1 기준으로 숫자로 나타남
		
		LocalDate nw = LocalDate.now();
		System.out.println(nw.getYear()); // 년도는 숫자로 표현이 가능하다고 생각해서 int값으로 표현
		
		System.out.println(nw.getMonth()); // 달을 하나의 객체를 봐서 Month라는 객체를 줌(june이기도 하고 6이기도 하고 30일도 가졌고...)
		System.out.println(nw.getMonth().getValue()); // 객체가 자기 숫자 알고 있으니까 알려달라고 함
		System.out.println(nw.getMonthValue());
		
		System.out.println(nw.getDayOfMonth());
		
		System.out.println(nw.getDayOfWeek());
		System.out.println(nw.getDayOfWeek().getValue()); // 요일이 월요일 기준 1부터 시작
//		int number;
//		static int staticNumber;
//		
//		public void print() {
//			System.out.println("non-static");
//		}
//		
//		public static void printStatic() {
//			System.out.println("static");
//		}
//		
//		public static void main(String[] args) { // static은 메인이라는 클래스 이름으로 접근이 가능한데
//			Main.staticNumber = 10;
//			Main.printStatic();
			
//			Main main = new Main(); // 동적이기 때문에 중간에 if절을 넣으면
//			Main.staticNumber = 20;
//			Main main2 = new Main();
//			Main.staticNumber = 30;
//			Main main3 = new Main();
//			Main.staticNumber = 40;
//			Main main4 = new Main();
//		}
			
	}
}