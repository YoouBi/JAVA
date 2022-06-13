public class Author extends Person {
//	private String name;
//	private int age;
	private String bookList;
	
	public Author(String name, int age, String bookList) {
		super(name, age);
		this.bookList = bookList;
	}
	
//	public String getName() {
//		return name;
//	}
	
	public String getBookList() {
		return bookList;
	}
}