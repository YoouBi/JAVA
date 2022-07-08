import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null; // 파일 내용을 바이트 단위로 읽어주는 객체
		FileOutputStream out = null; // 바이트 단위로 읽어서 출력을 담당
		
		try {
			in = new FileInputStream("input.txt");
//			in = new FileInputStream(new File("input.txt")); 이렇게 적는거랑 똑같음
			// 읽고자하는 파일을 찾지 못하면 예외를 발생시킴
			out = new FileOutputStream("output.txt");
			int c;
			
			while ((c = in.read()) != -1) { // .read()가 하나의 바이트를 읽어서 숫자로 담아두는데
				// 인트형으로 가져오기 때문에 인트형 변수 c에 대입연산을 한 것
				// .read()를 여러번 호출하면 다음 바이트를 하나씩 가져옴
				// 파일에 끝이 나오면 end of file이라고 -1을 가져옴
				out.write(c); // OutputStream이라는 참조로 .write(c)를 하고 있다
				// 해당 파일이 없으면 만들고 write, 즉 쓰라고 하면 그대로 전달해준다
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
