import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest"); // 확장자가 없으니까 디렉토리가 있는지 물어보는 것
		
		System.out.println("있냐?" + file.exists());
		System.out.println("폴더임?" + file.isDirectory());
		System.out.println("파일임?" + file.isFile());
		
		boolean result = file.mkdir();
		System.out.println("디렉토리 생성여부 : " + result);
		
		// d 드라이브에 filetest 폴더(디렉토리) 안에 abc 폴더를 생성해보세요
//		File abc = new File("d:\\filetest\\abc");
//		abc.mkdir(); // 파일 생성
		
		File file2 = new File("d:\\filetest\\abc\\..\\def");
//		file2.mkdir();
//		try {
//			System.out.println(file2.getAbsolutePath());
//			System.out.println(file2.getCanonicalPath());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		File file3 = new File("d:\\filetest\\def");
		
		try {
			File file4 = new File(file2.getCanonicalFile() + "\\fff");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			boolean result2 = textFile.createNewFile();
			System.out.println("생성됨? " + result2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}