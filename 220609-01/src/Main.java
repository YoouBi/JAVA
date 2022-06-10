import java.util.Arrays;
import java.util.Scanner;

/*
 * 도서 관리 프로그램
 * 
 * 목록 보기
 * 1. 가격순으로 오름차순, 내림차순 선택가능 (같을 때는 어떻게?)
 * 2. 분야를 선택해서 해당 분야만 보기
 * 가격순은 스트링 배열 했을 때 문자열의 길이를 먼저 보고, 그다음에 문자열의 앞 번호부터 순서대로 비교해보면 될 듯
 * 가격이 같을땐 책 제목 문자열의 제일 첫번째 인덱스 번호를 기준으로 삼으면 될 것 같은데 그러면 가나다 순 될 것 같다 확인해보자
 * -----------------------------------------------------------------------------------------
 * 3. 상세보기
 * 4. 도서 정보 수정
 * 5. 도서 정보 추가
 * 
 * 책 데이터 기준은 네이버 책의
 * 1) 작별인사 					/ 김영하 / 복복서가 / 장편소설 / 12,600원
 * 2) 불편한 편의점 				/ 김호연 / 나무옆의자 / 장편소설 / 12,600원
 * 3) 지금 알고 있는 걸 그때도 알았더라면 / 류시화 / 열림원 / 시집 / 8,100원
 * 4) 코스모스 					/ 칼 세이건 / 사이언스북스 / 과학 공학 / 16,650원
 * 5) 여행의 이유					/ 김영하 / 문학동네 / 에세이 / 12,150원
 */

public class Main {
	public static void main(String[] args) {
		Classification start = new Classification();
		start.main();
	}
}