SET @rowCount := 239;
SET @pageNumber := 1;
SET @pagePer := 10;
SET @totalPage := @rowCount / @pagePer; -- 총 페이지 수가 몇개가 되는지 계산하는 수식을 작성

-- 239행을 가지는 country 테이블을 각 페이지별 행의 개수와 보고자하는 페이지 번호를 청하면
-- 해당 row들을 조회할 수 있는 SELECT 문을 작성해보기
PREPARE STMT FROM 'SELECT * FROM country LIMIT ? OFFSET ?'; -- 변수를 쓰려면 쿼리문을 써야하는데 변수가 들어갈 자리에 ?를 작성시켜놓고 순서대로 나열
SELECT (@pageNumber - 1) * 10;
EXECUTE STMT USING @pagePer, @pageNumber;