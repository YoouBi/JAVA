// 3번
// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

class Movie {
	String title;
	int grade;
	String director;
	int nyeondo;
	
	public void MovieGrade() {
		System.out.println("%s(%d년 제작) - %s : 평점 %d점 으로 검색할까요?", title, nyeondo, grade);
	}
}