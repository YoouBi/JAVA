// 1번
// 책 클래스 (class Book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콘솔에 출력 가능

class Book {
	String title;
	String author;
	void print() {
		System.out.printf("%s%s%s%s%s", "저자 \"", author, "\"이 집필한 \"", title, "\" 책을 찾으시는게 맞습니까?");
	}
}

