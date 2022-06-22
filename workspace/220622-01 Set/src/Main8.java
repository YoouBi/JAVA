import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
	private String title;
	private int price;
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() { // 오브젝트 클래스에 해시 코드를 만들 수 있는 정의가 정의되어 있음
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + price;
//		result = prime * result + ((title == null) ? 0 : title.hashCode());
//		return result; // 이클립스 자체에서 곱연산을 만들어준 것
		return Objects.hash(title, price); // 오브젝트에 정의되어있는 hashCode()를 재정의
		// Objects...+ 이게 고유한지 알려주는 hash라는 스태틱한 메소드
		// 자바 1.7부터 가능
		// 동일한 필드값을 가지고 있으면 똑같은 숫자값으로 뱉어줌
	} // 뭐든 편한 방법으로 기준만 세워서 만들면 됨
	// 이런 해시 값을 만드는 걸 해시 함수라고 함 활용해서 암호까지 만들어낼 수 있음
	// 아주 커다란 함수든 작은 함수든 동일한 크기의 값으로 만들려고 함

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
}

public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("책1", 5000); // 책1, 5000원은 77번이야 처럼 하나의 고유한 숫자로 객체를 표현한다면
		Book b2 = new Book("책1", 6000); // 필드들을 살펴보는 동작을 하기 전에 쉽게 동등한지를 알 수 있겠더라는 아이디어를
		Book b3 = new Book("책2", 7000); // Hash(각 객체마다 가지고 있는 고유한 숫자값)라고 부름
		Book b4 = new Book("책3", 4000); // 각 책을 나타낼 수 있는 고유한 숫자값을 만들되 똑같은 책이라면 동등한 숫자값이 나오도록
		
		Set<Book> tree = new TreeSet<>(); // 대소 비교(정렬)의 기준이 없음
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		tree.add(b4);
		
		System.out.println(tree);
		
		Comparator<Book> com = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		Set<Book> treeByPrice = new TreeSet<>(com); // 생성자한테 이거가지고 비교하라고 알려줌
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		
		System.out.println(treeByPrice);
		
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		Set<Book> set = new HashSet<>();
//		// hash라는 숫자값이 다르면 다르구나, 하고 인식
//		set.add(b1);
//		set.add(b2); // 근데 b1과 b2가 다르다고 인식해서 원소값을 추가해버린 것
//		set.add(b3);
//		// 1차적으로 해시를 검사하고 같으면 진짜 같은지를 보려고 2차에서 이퀄스를 쓴다
//		// 1차에서 알 수 있게끔 구현을 해보자(이걸 계산하는건 결국 필드로 하는 것)
//		
//		System.out.println(set.size());
//		System.out.println(set);
	}
}
