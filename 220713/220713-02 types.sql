-- SQL에서 볼 수 있는 문자열 타입은 CHAR와 VARCHAR 두가지인데 둘 다 () 안에 얼만큼의 자리를 가지는지 표시할 수 있다 
-- CHAR(5) -- CHAR는 '고정된 길이 값'을 가진다 만약 5개의 자리값을 줬는데 A 한 문자만 집어넣었다면 A____로 나머지 4공간에 공백이 생기는 것
-- VARCHAR(5) -- VARCHAR는 '가변 길이'를 가지기 때문에 들어온 문자만큼의 길이 값을 준다

CREATE TABLE testChar (
	fixLength CHAR(5),
    varLength VARCHAR(5)
);

SELECT * FROM testChar;
DELETE FROM testChar;

INSERT INTO testChar (fixLength, varLength) VALUES ('A', 'A');
-- SET sql_mode = 'PAD_CHAR_TO_FULL_LENGTH'; -- SQL이 공간을 비효율적으로 쓰다보니 MySQL이 공간 효율을 위해 자동으로 최적화가 되어서 잠시 푼 것
SELECT char_length(fixLength), char_length(varLength) FROM testChar;
SELECT CONCAT(fixLength,'B') FROM testChar;
-- SELECT CONCAT(fixLength,'B'), CONCAT(varLength,'B') FROM testChar;
SELECT * FROM testChar WHERE fixLength = 'A';

-- 만약 다른 DB 시트템에서 이상하게 빈 공간이 생겨서 검색이 안된다 등의 일이 생긴다면 빈 공간을 없애야하니까 한번 삭제해보자!
SELECT RTRIM('A                '); -- RTRIM은 우측에 있는 공란을 없애고
SELECT LTRIM('                A'); -- LTRIM은 좌측에 있는 공란을 없앤다

-- -----------------------------------------------------------------------------------------------------------------------------

-- 학생
-- 이름 : 가변길이 문자열(10자)
-- 학점 : 실수

CREATE TABLE students (
	name VARCHAR(10),
    age INT, -- 정수 또한 LONG, BIGINT로 큰 정수값을 표현할 수 있는데 SQL 시스템마다 표현 방식이 다를 수 있다
    score DOUBLE -- DOUBLE과 FLOAT 둘 다 쓸 수 있지만 여기서도 부동소수점 표현 방식을 사용하기 때문에(근사값) 똑같은 문제점을 가지고 있다
);

DESC students;

INSERT INTO students (name, age, score) VALUES ("길동", 20, 3.3), ("길동", 21, 2.6);
INSERT INTO students (name, age, score) VALUES ("둘리", 20.5, 3); -- MySQL의 특징으로 소수점을 넣을 수 없는 정수 자리에 실수를 반올림해서 넣는다

SELECT * FROM students;

DELETE FROM students WHERE name = '둘리';
-- 그런데 여기서 둘리를 삭제하는게 아니라 길동을 하나 없애고자 할 때, 모든 값이 같다면 우리가 지금껏 만든 테이블은 로우를 특정시킬 수 있는 방법이 없었기 때문에 하나만 삭제하기 힘들 것이다
-- 그렇다면 뭔가 고유하게 기준이 될 수 있는 걸 하나 세워야하는데 만약 길동의 나이와 점수가 모두 같다면, 어떻게 특정시킬 수 있을까?
-- 맵에서는 중복되지 않는 '키'가 있었기 때문에 '고유함'을 가질 수 있었다
-- 그럼 이 고유함을 가진 키를 만들어서 진짜 테이블을 만들어보자