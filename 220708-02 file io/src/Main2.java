import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String line = "Hello";
		try {
			fos = new FileOutputStream(new File("d:\\filetest\\practice.txt"));
			// FileOutputStream fos = new FileOutputStream(new File("d:\\filetest\\practice.txt")); 를
			// try 구조 안에 넣으면 지역변수로 finally 안에서 fos를 못찾음
			
//			fos.write(); // Hello를 넣고 싶어도 문자열을 못 넣고 쓰고자하는 형식을 바이트로만 넣을 수 있음
			fos.write(line.getBytes()); // 바이트 '배열'의 형태로도 넣을 수 있음
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close(); // 또 빨간줄이 뜨는데 초기화가 안이뤄져서 그런 것이니 FileOutputStream fos = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
