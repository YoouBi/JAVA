CREATE TABLE persons_copy LIKE persons; -- 컬럼만 복사

INSERT INTO persons_copy (firstName, lastName, age, email) -- 내용 복사하는데 필요한 정보만 복사하고싶다면 WHERE절로
SELECT firstName, lastName, age, email FROM persons;

CREATE TABLE persons_copy2 -- 셀렉으로 조회한 결과 자체를 테이블로 만드는 것이라
SELECT * FROM persons; -- 이렇게 만들면 '제약 사항이 없어진다'

SELECT * FROM persons_copy;
SELECT * FROM persons_copy2;

CREATE TEMPORARY TABLE mytable ( -- 이렇게 만든 '임시테이블'은 왼쪽 시그마에서는 안보이지만 조회할 때엔 보인다
	myNum int
    , myStr VARCHAR(1000)
);

SELECT * FROM mytable;
INSERT INTO mytable VALUES (1, 'a'); -- 세션 만들 때처럼 서버의 접속을 끊었다가 다시 들어오면 사라진다

-- 이런식으로 변수처럼 쓸 수 있다
-- CREATE PROCEDURE `new_procedure` ()
-- BEGIN
-- 	CREATE TEMPORARY TABLE datas(
-- 		number int
--         , today DATE
-- 	);
--     
--     INSERT INTO data (number, today) VALUES (10, curdate());
--     
--     SELECT * FROM datas;
-- END