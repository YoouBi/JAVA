-- SELECT CONCAT("asdf", "zzz"); -- 로직을 가지는 기능 = 함수()
-- 그냥 함수를 만들려면 권한 문제 때문에 안되니까 설정을 건드려야한다

SELECT hello("장영빈");
-- CREATE FUNCTION hello(name VARCHAR(10)) RETURNS varchar(20)
-- BEGIN
-- 	RETURN CONCAT("Hello, ", name);
-- END

CALL usp_countBooks; -- Stored Procedures에서 SELECT COUNT(*)문을 만든 걸 불러왔음
-- CREATE PROCEDURE usp_countBooks()
-- BEGIN
-- 	SELECT COUNT(*) AS '개수' FROM books;
-- END


CALL usp_findbytitle("책1", @count);
SELECT @count;
-- CREATE PROCEDURE usp_findbytitle (IN title VARCHAR(50), OUT count INT)에서 IN은 입력값, OUT은 출력값이다
-- 얘는 특이하게 파라미터로 리턴을 할 수 있기 때문에 OUT을 여러개로 만들어서 여러가지의 값을 내보낼 수도 있다
-- BEGIN
-- 		SELECT * FROM books AS A WHERE A.title = title;
-- 		SELECT count(*) INTO count FROM persons;
-- END

-- 이런식으로 자바에서 하던 것처럼 로직을 만들 수 있다

CALL usp_selectTable();
-- CREATE PROCEDURE usp_selectTable (tableName VARCHAR(50))
-- BEGIN
-- 	CASE WHEN tableName = 'books' THEN
-- 			SELECT * FROM books;
--         WHEN tableName = 'persons' THEN
-- 			SELECT * FROM persons;
-- 		END CASE; -- 이 END가 어디의 끝인지 알려주기 위해서 END CASE로 썼다
-- 					만약 뒤의 CASE를 뺀다면 BEGIN의 END로 인식해서 오류가 날 것

-- 	CASE WHEN 'books' THEN -- 이런식으로 생략도 가능
-- 			SELECT * FROM books;
--         WHEN 'persons' THEN
-- 			SELECT * FROM persons;
-- END

CALL usp_loop (10);
-- CREATE PROCEDURE usp_loop (IN num INT, OUT result INT)
-- BEGIN
-- 		DECLARE i INT; -- PROCEDURE나 FUNCTION도 DECLARE로 지역 변수를 가질 수 있음
--     DECLARE sum INT DEFAULT 0; -- 초기화 바로 해주고싶다면 DEFAULT
--     
--     SET i = 0;
--     
--     REPEAT -- 반복할건데
-- 		SET sum = sum + i;
--         SET i = i + 1;
-- 		UNTIL i > num END REPEAT; -- UNTIL END 사이의 문장이 참이 될때까지
--     

--  WHILE i <= num DO
-- 		SET sum = sum + i;
--         SET i = i + 1;
-- END WHILE;
-- 혹은 이렇게 반복하는 것도 가능하다

--     SELECT sum;
-- END

-- 회사마다 스타일이 다르겠지만 PROCEDURE에서 로직을 SQL문으로 써서 쓰면 PROCEDURE에 모든 정보가 다 담겨있으니까 테스트하기 힘들 것