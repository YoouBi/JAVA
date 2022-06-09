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

public class Main2 {
	public static void main(String[] args) {
		Classification start = new Classification();
		start.main();
		
//		//*************************!!!!!!!!!!!!!!!책장 만들기!!!!!!!!!!!!!!!!***************************
		String[] book1 = {"작별인사", "김영하", "복복서가", "장편소설" };
		String[] book2 = {"불편한 편의점", "김호연", "나무옆의자", "장편소설" };
		String[] book3 = {"지금 알고 있는 걸 그때도 알았더라면", "류시화", "열림원", "시집" };
		String[] book4 = {"코스모스", "칼 세이건", "사이언스북스", "과학 공학" };
		String[] book5 = {"여행의 이유", "김영하", "문학동네", "에세이" };
		int[] price = { 12600, 12600, 8100, 16650, 12150 };
//		// 가격 오름차순으로는 코스모스- 작별인사/불편한 편의점 - 여행의 이유 - 지금 알고 있는 걸
//		// 선반 만들면 그 선반길이만큼의 도서,저자,출판사,장르,정가 배열을 만들면 게더세터 안써도 위치로 불러낼 수 있을듯
//		
		while(true) {
			System.out.println("도서 관리 프로그램에 접속하였습니다.\n"
				+ "----------------------관리 목록----------------------\n"
				+ "1. 가격순 정렬\n2. 분야순 정렬\n3. 상세보기\n4. 도서 정보 수정\n5. 도서 정보 추가\n6. 프로그램 종료\n"
				+ "-----------확인하고 싶은 정보의 번호를 입력해주세요-----------");
			int i = scan.nextInt();
		
//		////////////////////////////////////////////////////////////////////////////////////////////////////
			if(i == 1) {
				System.out.println("< 1. 가격순 정렬 >을 선택하셨습니다.\n오름차순을 원하신다면 1번을, 내림차순을 원하신다면 2번을 눌러주세요.");
		
				int l = scan.nextInt();
				int[] priceCopy = Arrays.copyOf(price, price.length);
		
				if(l == 1) {				
					for(int j = 0; j < price.length; j++) {
						for(int k = j + 1; k < price.length; k++) {
							if(priceCopy[j] <= priceCopy[k]) {
								int temp = priceCopy[j];
								priceCopy[j] = priceCopy[k];
								priceCopy[k] = temp;
							}
						}
					}
					for(int j = 0; j < priceCopy.length; j++) {
						for (int k = 0; k < priceCopy.length; k++) {
							if (priceCopy[j] == price[k]) {
								if(k == 0) {
									System.out.println(book1[0]);
								} else if(k == 1) {
									System.out.println(book2[0]);
								} else if(k == 2) {
									System.out.println(book3[0]);
								} else if(k == 3) {
									System.out.println(book4[0]);
								} else if(k == 4) {
									System.out.println(book5[0]);
								}
								break; // 같은 가격일때 뒤에 나오는 책은 앞의 이름을 덮어씌우고 브레이크를 걸어야하는데????
							}
						}
					}
				} else if(l == 2) {				
					for(int j = 0; j < price.length; j++) {
						for(int k = j + 1; k < price.length; k++) {
							if(priceCopy[j] >= priceCopy[k]) {
								int temp = priceCopy[j];
								priceCopy[j] = priceCopy[k];
								priceCopy[k] = temp;
							}
						}
					}
					for(int j = 0; j < priceCopy.length; j++) {
						for (int k = 0; k < priceCopy.length; k++) {
							if (priceCopy[j] == price[k]) {
								if(k == 0) {
									System.out.println(book1[0]);
								} else if(k == 1) {
									System.out.println(book2[0]);
								} else if(k == 2) {
									System.out.println(book3[0]);
								} else if(k == 3) {
									System.out.println(book4[0]);
								} else if(k == 4) {
									System.out.println(book5[0]);
								}
								break; // 같은 가격일때 뒤에 나오는 책은 앞의 이름을 덮어씌우고 브레이크를 걸어야하는데????
							}
						}
					}
				}
//				////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (i == 2) {
				System.out.println("< 2. 분야순 정렬 >을 선택하셨습니다.\n검색하고 싶은 분야를 입력해주세요.");
				scan.nextLine();
				String genre = scan.nextLine();

				System.out.print("검색하신 " + genre + " 분야의 책에는");
				if (genre.equals(book1[3]))
					System.out.print(" " + book1[0]);
				if (genre.equals(book2[3]))
					System.out.print(" " + book2[0]);
				if (genre.equals(book3[3]))
					System.out.print(" " + book3[0]);
				if (genre.equals(book4[3]))
					System.out.print(" " + book4[0]);
				if (genre.equals(book5[3]))
					System.out.print(" " + book5[0]);
				System.out.println("이 있습니다.");
//				////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (i == 3) {
				System.out.println("< 3. 상세보기 >를 선택하셨습니다.\n현재 검색할 수 있는 책의 목록에는\n\n" + "1." + book1[0] + "\n2."
						+ book2[0] + "\n3." + book3[0] + "\n4." + book4[0] + "\n5." + book5[0] + "\n\n책이 있습니다.\n"
						+ "상세보기 하고싶은 책의 번호를 입력해주세요.");
				int j = scan.nextInt();

				if (j == 1) { // 스위치 문 쓰면 될 듯...
					System.out.println(
							book1[0] + " 책의 저자는 " + book1[1] + "이며 " + book1[2] + "에서 " + book1[3] + "원으로 출간되었습니다.");
				} else if (j == 2) {
					System.out.println(
							book2[0] + " 책의 저자는 " + book2[1] + "이며 " + book2[2] + "에서 " + book2[3] + "원으로 출간되었습니다.");
				} else if (j == 3) {
					System.out.println(
							book3[0] + " 책의 저자는 " + book3[1] + "이며 " + book3[2] + "에서 " + book3[3] + "원으로 출간되었습니다.");
				} else if (j == 4) {
					System.out.println(
							book4[0] + " 책의 저자는 " + book4[1] + "이며 " + book2[2] + "에서 " + book4[3] + "원으로 출간되었습니다.");
				} else if (j == 5) {
					System.out.println(
							book5[0] + " 책의 저자는 " + book5[1] + "이며 " + book5[2] + "에서 " + book5[3] + "원으로 출간되었습니다.");
				}
//				////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (i == 4) {
				System.out.println("< 4. 도서 정보 수정 >을 선택하셨습니다.\n현재 검색할 수 있는 책의 목록에는\n\n" + "1." + book1[0] + "\n2."
						+ book2[0] + "\n3." + book3[0] + "\n4." + book4[0] + "\n5." + book5[0] + "\n\n책이 있습니다.\n"
						+ "수정 하고싶은 책의 번호를 입력해주세요.");
				int j = scan.nextInt();
				System.out.println("수정하고 싶은 정보의 번호를 선택하고 수정할 정보를 입력해주세요.\n1.도서 이름 2.저자 3.출판사 4.정가");
				int k = scan.nextInt() - 1;
				scan.nextLine();
				
				if (j == 1) {
					if (k < 4)
						book1[k] = scan.nextLine();
					else if (k == 4)
						price[0] = scan.nextInt();
				} else if (j == 2) {
					if (k < 4)
						book2[k] = scan.nextLine();
					else if (k == 4)
						price[1] = scan.nextInt();
				} else if (j == 3) {
					if (k < 4)
						book3[k] = scan.nextLine();
					else if (k == 4)
						price[2] = scan.nextInt();
				} else if (j == 4) {
					if (k < 4)
						book4[k] = scan.nextLine();
					else if (k == 4)
						price[3] = scan.nextInt();
				} else if (j == 5) {
					if (k < 4)
						book5[k] = scan.nextLine();
					else if (k == 4)
						price[4] = scan.nextInt();
				}
//				////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (i == 5) {
				System.out.println("< 5. 도서 정보 추가 >를 선택하셨습니다.\n몇 권의 도서를 추가하시겠습니까?");
				int j = scan.nextInt();
//				////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (i == 6) {
				System.out.println("< 6. 프로그램 종료 >를 선택하셨습니다.\n프로그램을 종료합니다.");
				break;
			}
		}
	}
}
