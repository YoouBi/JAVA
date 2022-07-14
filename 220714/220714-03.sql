SELECT * FROM employees;

DESC employees;

-- MySQL 날짜 : DATE
-- 시간 : TIME
-- 날짜 시간 : DATETIME / TIMESTAMP

SELECT CURRENT_DATE(); -- 서버가 응답하고 있는 컴퓨터의 날짜
SELECT CURRENT_TIME();
SELECT CURRENT_TIMESTAMP();

SELECT DATE '2022-07-14'; -- 날짜를 리터럴 상수 값으로 표현하고자 할 때
SELECT TIME '12:05:33';

-- HIRE_DATE가 1987년 6월
SELECT * FROM employees WHERE HIRE_DATE >= '1987-06-01' AND HIRE_DATE <= DATE '1987-06-30';
SELECT * FROM employees WHERE HIRE_DATE BETWEEN DATE '1987-06-01' AND '1987-06-30';
SELECT * FROM employees WHERE HIRE_DATE BETWEEN DATE '1987/06/01' AND '1987/06/30'; -- 모든 SQL이 이렇게 동작하는건 아니지만 /로도 구분 가능

SELECT DATE '1987-06-01' + 40; -- 날짜에 연산이 될까?
-- 날짜 합연산을 지원하는 SQL도 있지만 MySQL은 안된다
SELECT ADDDATE('1987-06-01', 40); -- 함수로 제공함
SELECT SUBDATE('1987-06-01', 1);
SELECT DATE_ADD('1987-06-01', INTERVAL 40 DAY); -- DATE_ADD라는 함수도 있지만 뒤에 정수로 받지 않고 40일간이라는 단위 기간으로 받음
SELECT DATE_SUB('1987-06-01', INTERVAL 1 MONTH);
SELECT '1987-06-01' + INTERVAL 1 YEAR; -- 날짜의 합연산은 정수 형태가 아니라 이런 간격 표현으로 하면 계산할 수 있다
SELECT '1987-06-01' + INTERVAL 1 DAY;

SELECT DAYOFWEEK('2022-07-14'); -- 1이 일요일 2월 3화 4수 5목 6금 7토

SELECT EXTRACT(YEAR FROM '2022-07-14');
SELECT EXTRACT(MONTH FROM '2022-07-14');
SELECT EXTRACT(DAY FROM CURRENT_DATE); -- 오늘 날짜로도 가능

SELECT DATEDIFF('2022-06-13', '2022-06-01'); -- 두 날짜가 있을 때 두 날짜 간의 간격을 구하는 함수로 미래가 먼저여야 양수로 나옴

SELECT STR_TO_DATE('2021/06/13', '%Y/%m/%d'); -- 문자열 형태의 날짜를 날짜 형태로 만들어줌
-- MySQL에서는 이런 서식 문자를 통해서 형태를 알려줘야한다 그때그때마다 문법이 다를수도 있기 때문
SELECT DATE_FORMAT(DATE '2021/06/13', '%y/%M/%D'); -- 반대로 날짜를 문자열로 만들어줌 %y는 년도를 두자리만 잘라서 보여주고 %M는 영문자

-- 직원 테이블 (17일에 고용된 직원)
SELECT * FROM employees WHERE EXTRACT(DAY FROM HIRE_DATE) = 17;
SELECT * FROM employees WHERE HIRE_DATE LIKE '%-17'; -- MySQL에서는 날짜를 문자열 취급해서 패턴 검색도 가능

-- JOB_HISTORY(과거 이력) 각 행 별로 일한 '기간'(일) 조회
SELECT *, DATEDIFF(END_DATE, START_DATE) AS DATEDIFF FROM job_history;
-- 데이터를 미리 만들어두자는 쪽과 그때그때 필요한 자료를 생성하자는 쪽이 있는데 DB 같은 경우에는 후자를 많이 선택하는 편
-- 데이터베이스는 어긋나는게 있으면(결함) 그걸 찾기 너무 어렵다
-- 그래서 계산할 수 있는 자료는 계산하게 만들어두고
-- 수정해야하는 작업이 많이 일어나는 데이터를 컬럼으로 만드는 건 별로 추천하지 않는다

SELECT * FROM job_history;

-- 자료형 숫자, 문자열, 날짜
-- MySQL은 SELECT '34' + 5; 를 자동으로 연산해주지만 다른 SQL에서는 '34'를 시스템으로 인식해서 안될수도 있다 그럴 때 형변환을 해준다
SELECT CAST(10 AS CHAR);
SELECT CAST(10 AS TIME); -- CAST라는 함수는 다루고자하는 문자열을 왼쪽에 두고 바꾸고자하는 형태를 오른쪽에 둔다
-- MySQL은 정수를 시간으로 다루면 초로 다룸
SELECT CAST('10' AS DOUBLE) + 5.5;

SELECT CONVERT(10, TIME); -- 똑같은 함수인데 표현 방법이 다를 뿐
SELECT CONVERT('10', DOUBLE) + 5.5; -- SQL마다 한가지의 함수만 있을 수도 있다
