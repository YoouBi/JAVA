public class Main2 {
	public static void main(String[] args) {
		String s = null;
		try {
			String local = "지역변수";
			
			int[] arr = new int[0];
			arr[1] = 10;
			
			int div = 10 / 0;
			
			s.equals("asdf");
			
			System.out.println("실행되나??");
//		} catch (Exception e) { // 예를 들어 이렇게 부모형 예외가 위에 정의되어있으면 자식쪽으로 내려갈 일이 없어서 컴파일러가 알려준다
//			System.out.println("모든 예외는 여기서 잡힙니다");
		} catch (ArithmeticException e) { // 상속 구조를 가지고 있을 때 catch의 순서에 유의해야한다
//			System.out.println(local);
			
			System.out.println("수 익셉션 처리"); // try 블록과 catch 블록은 해당 블록을 빠져나가면 지역변수들이 사라진다
		} catch (NullPointerException e) {
			System.out.println("널 포인트 익셉션 처리");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외 처리");
		} catch (Exception e) { // 쓰려면 밑에!
			System.out.println("모든 예외는 여기서 잡힙니다");
		}
//		System.out.println(local);
		
		System.out.println("정상 종료");
	}
}