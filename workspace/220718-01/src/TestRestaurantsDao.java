import java.sql.SQLException;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDaoImpl(); // 이런 식으로 하는게 보안상 유리하다
		// 왜냐하면 다른 사람들이 쿼리문까지 작성해서 넣을 수 있다면
		// 악의적인 사람이 drop문으로 테이블을 아예 삭제하려고 할 수 있으니까...
		// 이런 공격을 SQL indextion이라고 한다
		// 이걸 막기 위해 PreparedStatement를 쓰는건데 PreparedStatement를 쓰면 문자열로 입력이 되어서
		// SQL의 DROP 같은 명령문들이 실행어가 되지 않고 문자열('안에 들어가서 문자열로 인식되는 것처럼!')로 인식 된다!
		
		try {
//			int result = dao.create("테스트중1", "1234-5555", "부산 어쩌구");
//			System.out.println(result == 1);
			
//			System.out.println(dao.read());
//			System.out.println(dao.read(1));
			
//			int result = dao.update(8, "탄탄면공방", "1234-5678", "부산 부산진구 가야대로 772 롯데백화점부산본점 지하1층");
//			System.out.println(result == 1);
//			System.out.println(dao.read(8));
			
//			int result = dao.delete(7);
//			System.out.println(result == 1);
//			System.out.println(dao.read());
			
			RestaurantsDaoImpl impl = (RestaurantsDaoImpl) dao;
			int[] result = impl.create(Arrays.asList(
					new Restaurant(0, "배치1", "0101-0202", "배치주소1")
					,new Restaurant(0, "배치2", "0102-0202", "배치주소2")
					,new Restaurant(0, "배치3", "0103-0202", "배치주소3")
					,new Restaurant(0, "배치4", "0104-0202", "배치주소4")
					));
			// 이런 방법으로 했을 때의 문제점은
			// 지금 구분되어있는 문장들은 네개의 배치가 되어있는데
			// 만약 3번째 구문에 문제가 생기면 1,2까진 수행이 되겠지만 3,4는 수행이 안될 것
			// 트랜잭션...?
			System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

/* public class 레스토랑 로직을 가지고 있는 객체 { // 레스토랑 로직을 가지고 있는 객체에 dao(data acess object)에 대한 의존성을 주입시킨다
 	private RestauranteDao dao; // (1) 그 로직을 따라 DB 작업을 할 수 있는게 dao다 (2)
 	
 	public 레스토랑로직을가지고있는객체(RestaurantsDao dao) {
		super();
		this.dao = dao;
	}

	public void setDao(RestaurantsDao dao) { // (2) 이 dao를 필드에 객체로 넣어서 만들고 삭제하고 하는 것
		this.dao = dao;
	}
	
	public void 로직1() { // 로직을 가졌다는 말은 사용자의 입력이 있었고 그 요청에 따라서 DB의 흐름에 따라서 작업을 해줘야 한다는 것 (1)
		// 로직 흐름
		// dao.메소드호출();
		dao.create(tradeName, callNumber, address);
*/