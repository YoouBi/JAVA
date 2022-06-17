public class Main3 {
	public static void main(String[] args) {
		try {
			System.out.println("try 블록 안");
			
			System.out.println("문장1");
			
			Object o = new Object();
			String s = (String) o;

			System.out.println("문장2");
			
			System.out.println("문장3");
//		} catch (Exception e) {
		} catch (NullPointerException e) {
			System.out.println("catch 블록 안");
			System.out.println(e.getMessage()); // 예외를 처리할 수 있게끔 사유서를 보는 것
			e.printStackTrace();
		} finally { // 예외가 발생하던지 말던지간에 무조건 실행되는 문장들
			System.out.println("finally 블록 안");
		}
		
		System.out.println("정상 종료");
	}
}