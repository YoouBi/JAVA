public class Book {
	private String title;
	private int page;
	private String author;
	
	
	public Book(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return author + "저자가 만든 " + title + " 책의 총 페이지 수는 " + page + "쪽이다.";
	}
}

class Magazine extends Book {
	private int date;

	public Magazine(String title, int page, String author, int date) {
		super(title, page, author);
		this.date = date;
	}
	
	public String getDate() {
		int year = date / 10000 % 100;
		int month = date % 10000 / 100;
		int days = date % 100;
		String dateString = year + "." + month + "." + days;
		return dateString;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String toString() {
		return getDate() + "에 발매된 " + super.toString();
	}
}

class Novel extends Book {
	private int rating;

	public Novel(String title, int pages, String author, int rating) {
		super(title, pages, author);
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
