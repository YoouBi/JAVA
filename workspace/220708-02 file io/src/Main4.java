import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
	
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(new FileWriter(file));// new FilWriter(file) 객체를 포장(랩핑)
			
			pw.println("문자열 한줄을 출력합니다.");
			pw.println(10);
			pw.println(15.15);
			pw.flush(); // 임시 공간이 가득차지 않아서 출력이 이뤄지지 않은 것처럼 보여지기 때문에
			// 명시적으로 파일에 차곡차곡 쌓아둔걸 출력하라고 명령 내리는게 .flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
