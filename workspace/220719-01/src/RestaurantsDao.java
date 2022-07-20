import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao { // 인터페이스만으로는 동작하는 객체를 만들 수 없으니까 구현 클래스를 만들어줘야겠다
	int create(String tradename, String callNumber, String address) throws SQLException;
	
	List<Restaurant> read() throws SQLException;
	Restaurant read(int id) throws SQLException; // PK값인 인트형 정수 하나(id)를 받아서
	
	int update(int id, String tradename, String callnumber, String address) throws SQLException;
	
	int delete(int id) throws SQLException;
}