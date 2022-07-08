import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {
	public static void main(String[] args) {
		FileReader inputStream = null; // 스트링으로 읽어주는 객체
		// 이름에 Reader가 들어가면 문자 단위로 한글자씩 읽어줌
		FileWriter outputStream = null; // Writer도 문자단위, 한글자씩 출력해줌
		
		try {
			inputStream = new FileReader("input.txt"); // 생성은 똑같이 파일 이름과 경로로
			outputStream = new FileWriter("output.txt");
			
//			한 글자는 char타입이지만 캐릭터 타입으로 표현하기엔(특히 파일의 끝을 알려주고 그런 것) 모자라다
//			그래서 문자열을 읽을 때 조금 더 큰 공간으로 인트형으로 반환해서 알려준다			
			int c;
			while ( (c = inputStream.read()) != -1 ) {
				System.out.println("읽은 문자 확인 : " + (char) c);
				// 잘 읽어오고 있는지 확인하고싶다면 캐릭터 타입으로 형변환해서 확인해보면 됨
				// 띄워진건 줄바꿈까지 읽어온 것
				
				outputStream.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
