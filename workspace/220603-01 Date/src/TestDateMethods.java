import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TestDateMethods {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
//		now.set(2022, Calendar.JUNE, 4);
		now.add(Calendar.DAY_OF_MONTH, 1);
		
		Date date = now.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
//		LocalDate now = LocalDate.now();
//		LocalDate nowPlusOne = LocalDate.now().plusDays(1);
//		
//		// 내일의 날짜 객체
//		LocalDate tomorrow = LocalDate.of(2022, 6, 4);
//		System.out.println(tomorrow.equals(nowPlusOne));
		
		// LocalDate date;
		// window>Pereferences
		// 문서에 클래스에 대한 설명이 나옴 : 언제 나왔는지 버전 언제부터 사용 가능한지
		// 클래스에서 접근 가능한 친구들이 소개되어있음
		// 가지고 있는 필드는 퍼블릭한 것만 적어두고 프라이빗한건 안보여지기 때문에 문서 자체에 안써둠
		// 전체 Method 목록이 나옴 Method and Description 처음 나오는 곳이 이름(의미가 있는 이름) 그 밑으로는 간단 요약한 설명
		// getYear()는 Gets the year field. 라는 설명이 나와있음(클릭하면 자세한 설명)
		// ()는 파라미터로 아무것도 없으니 안써줌. 왼쪽에 쓰여 있는 것이 리턴타입(반환형)으로 getYear의 반환형은 int값
		// 이 내용 전부가...컨트롤 스페이스 하면 그대로 나옴...
	}
}