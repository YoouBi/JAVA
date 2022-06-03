//import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.Date;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String result = dateFormat.format(date);
		System.out.println(result);
		
//		Calendar cal = Calendar.getInstance();
//		Date date = cal.getTime(); // Date는 (컴퓨터??? 혹은 보통 표준시니까...아무튼)기준시간으로 millisecond 단위로 시간을 표현한 객체
		
		// 이 날짜를 문자열 형태로 변환하게끔 한 게 
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // month는 M이고 시간에서 분이 Minite이니 그걸 소문자 m으로 표현
		// 2022년도를 yy면 22로 표기하고, y면 자체를 아예 다 나타내고
		// M와 d는 
//		String result = dateFormat.format(date);
//		System.out.println(result);
	}
}