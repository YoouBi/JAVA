import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt");
//		System.out.println(diaryFile.exists());
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(diaryFile);

			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}
