import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

// 응용으로 다음달, 3년전...? 가능한가...?ㅠㅠ

public class NextMonth {
	public static void main(String[] arg) {		
		Calendar now = Calendar.getInstance();
		LocalDate nw = LocalDate.now();
		now.add(Calendar.MONTH, -1);
		nw = nw.plusMonths(-1);
		
Date date = now.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String result = dateFormat.format(date);
		int year = nw.getYear();
		int month = nw.getMonth().getValue();
		
		int weekInt = nw.getDayOfWeek().getValue();
		String weekKor = null;
		switch (weekInt) {
		case 1: weekKor = "월"; break;
		case 2: weekKor = "화"; break;
		case 3: weekKor = "수"; break;
		case 4: weekKor = "목"; break;
		case 5: weekKor = "금"; break;
		case 6: weekKor = "토"; break;
		case 7: weekKor = "일"; break;
		}
		
		LocalDate firstDay = nw.withDayOfMonth(1);
		int zero = firstDay.getDayOfWeek().getValue();
		
		int lastDay = 0;
		switch (month) {
			case 1:		case 3:		case 5:		case 7:
			case 8:		case 10:	case 12:
				lastDay = 31;
				break;
			case 4:		case 6:		case 9:		case 11:
				lastDay = 30;
				break;
			case 2:
				if(((year % 4 == 0 ) && (year % 100 != 0)) || (year % 400 != 0)) {
					lastDay = 29;
				} else {
					lastDay = 28;
				}
		}
		System.out.println("오늘: " + result + " " + weekKor);
		System.out.println("일　월　화　수　목　금　토");
		// 마지막날 구하는거 스위치 써야함ㅠ
		int k = 1;
		int i = 0;
		for (int j = 1; j <= 6; j++) {
				for(i = 1; i <= 7; i++) {
					if (zero == 7) {
						System.out.printf("%02d ", k);
						k++;
					} else if (zero > 0) {
						System.out.print("   ");
						zero--;
					} else {
						System.out.printf("%02d ", k);
						k++;
					}
					if (k > lastDay) break;
				}
				System.out.println();
				if (k > lastDay) break;
		}
	}
}
