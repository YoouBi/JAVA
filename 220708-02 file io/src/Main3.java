import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\filetest\\practice.txt");
			// 파일의 용량, 크기를 알기 위해서 .length로 호출하면 얼마의 byte를 가지고 있는지 알려줌
//			long length = file.length; // long 값을 그대로 쓰지 않고
			int length = (int) file.length(); // int 값으로 하향 형변환을 해서
			byte[] buf = new byte[length]; // 배열로 만들어줄 것
			
//			fis = new FileInputStream(new File("d:\\filetest\\practice.txt"));
			fis = new FileInputStream(file); // file을 읽을 것인데 얼만큼 읽을 것인가?
			fis.read(buf); // 얼마만큼 읽을 것인지 read에 바이트 배열만 집어넣으면 알아서 읽어줌
			
			String result = new String(buf); // 그리고 문자열로 변환을 해주려고 스트링 객체를 만들어서 바이트 배열을 집어넣어주면
			// 해당 바이트를 문자열로 변환해서 객체를 만들어줌
			
			System.out.println(result); // 그걸 읽은 것
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close(); // 다 됐으면 통로를 닫아주기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
