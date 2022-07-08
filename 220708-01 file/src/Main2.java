import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		File file = new File(".\\"); // .은 현재 경로인데 현재 경로는 프로젝트 경로
		// 이렇게 표현하는 방식을 상대적 경로(내 기준)

		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath());
		try {
			System.out.println(file.getCanonicalPath());
			// .getCanonicalPath()를 트라이 캐치로 잡지 않고 그냥 쓰게 되면
			// 예외라는게 발생을 하고 이 예외는 무조건 처리를 해야하는 checked예외
			// 파일이라는 존재는 외부에 존재하는데 외부의 상황에 따라서 언제 오류가 날지 몰라서
			// 자바에서는 무조건 예외 처리하도록 강제하고 있음
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File fileParent = new File("..\\"); // ..은 부모경로
		
		System.out.println(fileParent.getAbsolutePath());
		try {
			System.out.println(fileParent.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		try { // Path는 문자열 반환 File는 경로를 나타낼 수 있는 파일 객체를 반환
			File file3 = file.getCanonicalFile().getParentFile();
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3));
			System.out.println(fileParent.compareTo(file3));
			System.out.println(fileParent.getCanonicalFile().equals(file3));
			System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
