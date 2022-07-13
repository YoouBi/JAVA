-- 주요 키(PRIMARY KEY) : NOT NULL, UNIQUE
DROP DATABASE my_db; -- 데이터베이스 날리기

CREATE DATABASE my_db;

USE my_db;

DROP TABLE students;
CREATE TABLE students (
	number INT PRIMARY KEY, -- 학생 하나하나를 고유한 키로써 관리하겠다는걸 명시해줘야하는데 그게 PRIMARY KEY(주요키 PK)
	name VARCHAR(10),
    age INT,
    score DOUBLE
);

DESC students;
-- 키도 하나의 컬럼으로써 존재하는데 desc로 확인해보면 PK가 붙었다는 걸 확인할 수 있다

INSERT INTO students (number, name, age, score) VALUES (1234, "길동", 20, 3.3); -- 다른 칼럼은 널 값을 넣을 수 있지만
INSERT INTO students (number, name, age, score) VALUES (1235, "둘리", 30, 4.4);
-- PK의 특징 1. 널 값을 허용하지 않기 때문에 무조건 값이 있어야한다
--  	특징 2. 같은 값을 가진 PK가 존재할 수 없다 중복X, 고유함, 유니크

SELECT * FROM students;