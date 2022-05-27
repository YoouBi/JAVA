public class StaticVariableAndConst2 {
	public static void printTest(final int param) {
		// param++; 전달받는 값 또한 상수로 써두면 변화시킬 수 없게 된다
		System.out.println(param);
	}
	
	public static void main(String[] args) {
		int inner = 10;
		// System.out.println(TEST_SCOPE);
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		
		/* {
			System.out.println(inner);
			System.out.println(TEST_SCOPE);
			
			// final int TEST_SCOPE;
			final int BLOCK = 100;
		}
		System.out.println(BLOCK); */
	}
}