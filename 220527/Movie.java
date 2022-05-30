// 3번
// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

public class Movie {
	String title;
	double grade; // double grade = 5.5; 처럼 필드 내부에서 초기화 선언도 가능
	String director;
	int nyeondo; //publishYear
	String tit;
	
	public Movie(String t
					, double s
					, String d
					, int p
					, String i) { // 생성자도 중괄호로 범위 표현
					// Movie를 표현하기 위해 필요한만큼의 자료들을 써줘야함
					// 파라미터라서 각각의 이름이 필요함
		// 생성자의 목적이 필드를 초기화하는 문장들이 들어가 있다(주 목적)
		// 의도한 값으로 필드를 초기화 하려면<<
		title = t;
		grade = s;
		director = d;
		nyeondo = p;
		tit = i;
	}
	// 생성자라는 친구는 클래스 이름과 똑같이 생김 Movie m = new Movie();
	// 리턴 타입이 존재하지 않음
	
	void MovieGrade() {
		
		if (tit.equals("닥터 스트레인지")) {
			title = "닥터 스트레인지: 대혼돈의 멀티버스";
			grade = 7.78;
			director = "샘 레이미";
			nyeondo = 2022;
		} else if (tit.equals("스파이더맨")) {
			title = "스파이더맨: 노 웨이 홈";
			grade = 9.11;
			director = "존 왓츠";
			nyeondo = 2021;
		} else if (tit.equals("아이언맨")) {
			title = "아이언맨 3";
			grade = 8.86;
			director = "셰인 블랙";
			nyeondo = 2013;
		} else if (tit.equals("트루먼쇼")) {
			title = "트루먼쇼";
			grade = 9.49;
			director = "피터 위어";
			nyeondo = 1998;
		} 

		System.out.printf("%d년 발표된 %s 감독작의 %s(평점 %.02f) 영화가 검색되었습니다.", nyeondo, director, title, grade);
	}
}

// public class Movie {
	// String title;
	// double score;
	// String director;
	// int publishYear;

	// void printAll() {
		// System.out.println("제목: " + title);
		// System.out.println("평점: " + score);
		// System.out.println("감독: " + director);
		// System.out.println("발표연도: " + publishYear);
	// }
// }