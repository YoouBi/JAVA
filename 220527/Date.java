// 2번
// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드(기능) : "2022-05-27"
//			   "05/27/22" 같은 값이어도 서식을 선택적으로 다양하게 출력

class Date {
	int years;
	int month;
	int days;
	int select;
	
	public void Select() {
		if (select == 1) {
			System.out.printf("%d-%02d-%02d", years, month, days);
		} else if (select == 2) {
			System.out.printf("%02d/%02d/%d", month, days, years % 100);
		}
	}
}