CREATE DATABASE my_db; -- 직접 데이터베이스를 CREATE DATABASE로 만들 수도 있음

SHOW DATABASES;

USE my_db;

SHOW TABLES;

-- 사람 테이블
-- 열 1 이름 문자열
-- 열 2 나이 정수
CREATE TABLE persons (
	name VARCHAR(10), -- SQL은 문자열 타입(VARCHAR)을 정의할때 '길이'(괄호 안)도 같이 신경써줘야한다
    age INT
); -- 한번 더 실행하면 빨간 불이 뜰건데 테이블은 고유해야하기 때문에 같은 이름의 테이블을 생성할 수 없기 때문이다

DESC persons;

SELECT * FROM persons;

-- 하나의 정보를 넣는 명령어는 INSERT INTO
INSERT INTO persons (name, age) VALUES ("홍길동", 22); -- () 안에는 열들의 이름을 적어주고 VALUES로 행의 값을 넣어줌
-- '브루스 리', 30살 행 추가
-- '스티븐 킹', 40살
INSERT INTO persons (name, age) VALUES ("브루스 리", 30);
INSERT INTO persons (age, name) VALUES (40, "스티븐 킹"); -- 순서를 바꿔서 집어넣는 것도 가능하다

-- '철수', 20-30-40살
INSERT INTO persons (name, age) VALUES ("철수", 20), ("철수", 30), ("철수", 40); -- 여러 행을 ,로 한번에 집어넣는 것도 가능하다

DELETE FROM persons; -- DELETE로 테이블의 행 삭제

DROP TABLE persons; -- DROP으로 테이블을 삭제

-- 책 테이블 생성
-- 제목 : 문자열
-- 가격 : 정수
CREATE TABLE book (
	title VARCHAR(25),
    price INT
);
SELECT * FROM book;
DELETE FROM book;

-- 파워자바, 25000 | 하늘과 바람과 별과 시, 15000 | 꽃을 보듯 너를 본다, 12000
INSERT INTO book (title, price) VALUES ("파워자바", 25000);
INSERT INTO book (title, price) VALUES ("하늘과 바람과 별과 시", 15000);
INSERT INTO book (title, price) VALUES ("꽃을 보듯 너를 본다", 12000);