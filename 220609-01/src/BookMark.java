import java.util.Arrays;
import java.util.Scanner;

public class BookMark { // private 쓸거면 getter setter 쓰기!
	String title;
	String author;
	String genre;
	String publisher;
	int price;
	
	public BookMark(String title, String author, String genre, String publisher, int price) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.price = price;
	}
}

class Classification {
	Scanner scan = new Scanner(System.in);
	BookMark[] bookShelf = new BookMark[5];
	
	public void main() {
		bookShelf[0] = new BookMark("작별인사", "김영하", "장편소설", "복복서가", 12600);
		bookShelf[1] = new BookMark("불편한 편의점", "김호연", "장편소설", "나무옆의자", 12600);
		bookShelf[2] = new BookMark("지금 알고 있는 걸 그때도 알았더라면", "류시화", "시집", "열림원", 8100);
		bookShelf[3] = new BookMark("코스모스", "칼 세이건", "과학 공학", "사이언스북스", 16650);
		bookShelf[4] = new BookMark("여행의 이유 ", "김영하", "에세이", "문학동네", 12150);
				
		System.out.println("도서 관리 프로그램에 접속하였습니다.");
		while(true) {
			System.out.println("----------------------관리 목록----------------------\n"
				+ "1. 가격순 정렬\n2. 분야순 정렬\n3. 상세보기\n4. 도서 정보 수정\n5. 도서 정보 추가\n6. 도서 정보 삭제\n7. 프로그램 종료\n"
				+ "-----------확인하고 싶은 정보의 번호를 입력해주세요-----------");
			int i = scan.nextInt();
			
			if(i > 7) System.out.println("없는 번호입니다.");
			else if(i == 1) topAndDownList();
			else if(i == 2) genreList();
			else if(i == 3) detail();
			else if(i == 4) edit();
			else if(i == 5) add();
			else if(i == 6) minus();
			else {
				System.out.println("< 7. 프로그램 종료 >를 선택하셨습니다.\n프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	/////////////////가격순 정렬/////////////////
	public void topAndDownList() {
		BookMark[] bookCopy = Arrays.copyOf(bookShelf, bookShelf.length);
		System.out.println("< 1. 가격순 정렬 >을 선택하셨습니다.\n오름차순을 원하신다면 1번을, 내림차순을 원하신다면 2번을 눌러주세요.");
		int i = scan.nextInt();
		
		// 가격 오름차순으로는 코스모스- 작별인사/불편한 편의점 - 여행의 이유 - 지금 알고 있는 걸
		if(i > 2 || i < 1) System.out.println("없는 번호입니다.");
		else if(i == 1) { // 오름차순
			for(int j = 0; j < bookCopy.length; j++) {
				for(int k = j + 1; k < bookCopy.length; k++) {
					if(bookCopy[j].price >= bookCopy[k].price) {
						BookMark temp = bookCopy[j];
						bookCopy[j] = bookCopy[k];
						bookCopy[k] = temp;
					}
				}
			}
		} else { // 내림차순
			for(int j = 0; j < bookCopy.length; j++) {
				for(int k = j + 1; k < bookCopy.length; k++) {
					if(bookCopy[j].price <= bookCopy[k].price) {
						BookMark temp = bookCopy[j];
						bookCopy[j] = bookCopy[k];
						bookCopy[k] = temp;
					}
				}
			}
		}
		if(i == 1 || i == 2)
			for(int j = 0; j < bookCopy.length; j++)
				System.out.println(bookCopy[j].title + "(정가 " + bookCopy[j].price + "원)");
	}
	
	/////////////////분야순 정렬/////////////////
	public void genreList() {
		System.out.println("< 2. 분야순 정렬 >을 선택하셨습니다.\n검색하고 싶은 분야를 입력해주세요.");
		scan.nextLine();
		String genreInput = scan.nextLine();
		int count = 0;
		
		for (int i = 0; i < bookShelf.length; i++) {
			if(genreInput.equals(bookShelf[i].genre)) count++;
		}
		
		if(count > 0) {
			System.out.print("검색하신 " + genreInput + " 분야의 책에는");
			for (int i = 0; i < bookShelf.length; i++)
				if(genreInput.equals(bookShelf[i].genre))
					System.out.print(" '" + bookShelf[i].title + "'");
			System.out.println("이 있습니다.");
		} else System.out.println("검색하신 " + genreInput + " 분야의 책은 없습니다.");
	}
	
	/////////////////상세보기/////////////////
	public void detail() {
		System.out.println("< 3. 상세보기 >를 선택하셨습니다.\n현재 검색할 수 있는 책의 목록에는");
		for (int i = 0; i < bookShelf.length; i++)
			System.out.println((i + 1) + ". " + bookShelf[i].title);
		System.out.println("책이 있습니다.\n상세보기 하고싶은 책의 번호를 입력해주세요.");
		int j = scan.nextInt() - 1;

		if(j < 0 || bookShelf.length <= j) System.out.println("없는 번호입니다.");
		else {
			System.out.println(bookShelf[j].title + "/저자:" 
					+ bookShelf[j].author + "/출판사:" + bookShelf[j].publisher 
					+ "(정가 " + bookShelf[j].price + "원)");
		}
	}
	
	/////////////////도서 정보 수정/////////////////
	public void edit() {
		System.out.println("< 4. 도서 정보 수정 >를 선택하셨습니다.\n현재 검색할 수 있는 책의 목록에는");
		for (int i = 0; i < bookShelf.length; i++)
			System.out.println((i + 1) + ". " + bookShelf[i].title);
		System.out.println("책이 있습니다.\n수정하고싶은 책의 번호를 입력해주세요.");
		int j = scan.nextInt() - 1;

		if(j < 0 || bookShelf.length <= j) System.out.println("없는 번호입니다.");
		else {
			System.out.println("수정하고 싶은 정보의 번호를 선택하고 수정할 정보를 입력해주세요.\n1.도서 이름 2.저자 3.장르 4.출판사 5.정가");
			int k = scan.nextInt() - 1;
			scan.nextLine();
			
			if(5 < k) System.out.println("없는 번호입니다.");
			else if(k == 0) bookShelf[j].title = scan.nextLine();
			else if(k == 1) bookShelf[j].author = scan.nextLine();
			else if(k == 2) bookShelf[j].genre = scan.nextLine();
			else if(k == 3) bookShelf[j].publisher = scan.nextLine();
			else bookShelf[j].price = scan.nextInt();
		}
	}
	
	/////////////////도서 정보 추가/////////////////
	public void add() {
		System.out.println("< 5. 도서 정보 추가 >를 선택하셨습니다.\n몇 권의 도서를 추가하시겠습니까?");
		int i = scan.nextInt();
//		Arrays.fill(bookCopy, null);
		
		bookShelf = addBook(i);
	}
	
	private BookMark[] addBook(int i) {
		BookMark[] bookCopy = Arrays.copyOf(bookShelf, bookShelf.length + i);
		for (int j = bookShelf.length; j < bookCopy.length; j++) {
			bookCopy[j] = new BookMark(null, null, null, null, 0);
		}
		
		for(int j = bookShelf.length; j < bookCopy.length; j++) {
			System.out.println("책장에 들어갈 책의 제목, 저자, 분야, 출판사와 가격을 순서대로 기입해주세요.");
			scan.nextLine();
			bookCopy[j].title = scan.nextLine();
			bookCopy[j].author = scan.nextLine();
			bookCopy[j].genre = scan.nextLine();
			bookCopy[j].publisher = scan.nextLine();
			bookCopy[j].price = scan.nextInt();
		}
		
		return bookCopy;
	}
	/////////////////도서 정보 삭제/////////////////
	public void minus() {
		System.out.println("< 6. 도서 정보 삭제 >를 선택하셨습니다.\n현재 검색할 수 있는 책의 목록에는\n");
		for (int i = 0; i < bookShelf.length; i++)
		System.out.println((i + 1) + ". " + bookShelf[i].title);
		System.out.println("책이 있습니다.\n몇 권의 도서를 삭제하시겠습니까?");
		int i = scan.nextInt();
		
		bookShelf = minusBook(i);
	}
	
	private BookMark[] minusBook(int i) {
		BookMark[] bookCopy = Arrays.copyOf(bookShelf, bookShelf.length - i);
		
		System.out.println("책장에서 꺼낼 책의 번호를 번호가 큰 순서대로 기입해주세요.");
		for(int j = 0; j < i; j++) {
			scan.nextLine();
			int k = scan.nextInt();
			
			for (int l = k; l < bookShelf.length; l++) {
				bookShelf[l - 1] = bookShelf[l];
			}
		}
		bookCopy = Arrays.copyOf(bookShelf, bookShelf.length - i);
		
		return bookCopy;
	}
}