import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
	오늘:2022-06-03 금
	일  월   화   수   목   금   토
	         01 02 03 04 
	05 06 07 08 09 10 11 
	12 13 14 15 16 17 18 
	19 20 21 22 23 24 25 
	26 27 28 29 30
 */
// 달력의 마지막 날 구하는 거...?
// 이번 달
// 1일의 요일
// 마지막 일(한달에 몇 일이나 있는지)

// 응용으로 다음달, 3년전...? 가능한가...?ㅠㅠ

public class PrintCalendar {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		LocalDate nw = LocalDate.now();		
		Date date = now.getTime();
		
		int x;
		
//		String weekInt = now.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.KOREAN);
		
				
		do {
			System.out.println("날짜 변경을 하시겠습니까?");
			System.out.println("1.오늘의 날짜 그대로 출력 2.날짜 변경 3.종료");
			x = scan.nextInt();
		
			if (x == 2) {
				System.out.println("변경할 날짜의 년월일을 입력해주세요.");
				int y = scan.nextInt();
				int m = scan.nextInt();
				int d = scan.nextInt();
				now.set(y, m, d);
			} else if (x == 3) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else if (x >= 4) {
				System.out.println("번호 입력이 잘못되었습니다.");
			}

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E", Locale.KOREAN);
			String result = dateFormat.format(date);
			int year = nw.getYear();
			int month = nw.getMonth().getValue();
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

			System.out.println("오늘: " + result);
			System.out.println("일　월　화　수　목　금　토");
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
			
			now.clear();
			
		} while (x != 3);
	}
}
