SELECT * FROM employees;

SELECT RTRIM('a        b');
SELECT LTRIM('          a        ');
SELECT TRIM('          a        ');

SELECT LOWER('ABCDE'); -- 소문자로 변환
SELECT UPPER('abcde'); -- 대문자로 변환

SELECT REVERSE('qwer'); -- 뒤집기

SELECT CONCAT('문자열', '결합', '함수'); -- CONCAT () 안에 ,로 문자열을 나열하면 문자열 합연산이 이루어짐
SELECT CONCAT('결합', NULL, '값이 있으면?'); -- 하나라도 null이 있으면 널 값을 반환함

SELECT CHAR_LENGTH('문자열길이'); -- 문자열 길이를 연산해서 int로 치환

SELECT REPLACE('원본 문자열에서 변환합니다', '변환', 'REPLACE'); -- 변경하고자하는 원본에서 찾고자하는 중간 문자를 마지막 새 문자로 대체
SELECT REPLACE(1234, '1', '5'); -- int 값이 문자열 나열로 변환됨

SELECT SUBSTRING('employees', 5); -- 문자열에서 자르고싶은 구간의 시작 위치인데 자바와는 다르게 시작위치부터 잘라준다
SELECT SUBSTRING('employees', 5, 2); -- (문자열, 자를 시작 위치, 개수) 마지막은 몇 개의 문자를 보여줄 것인지
SELECT SUBSTRING('employees', -3); -- 음수를 넣는다면 우측에서부터 위치를 센다
SELECT SUBSTRING('employees', -3, 2);

SELECT LPAD(123, 5, 0); -- 왼쪽의 문자열을 중간의 자릿수만큼 빈 공간을 뒤의 문자로 채움
SELECT RPAD(456, 5, '*'); -- RPAD는 빈공간 우측을 채움
SELECT REPEAT("반복결합", 3); -- 숫자만큼 문자열을 반복해서 결합함

SELECT LOCATE('D', 'ABCDEFG');
SELECT LOCATE('위치', '문자열의 위치를 찾는데 SQL의 문자 순서는 1부터임 2번째 위치를 찾고 싶다면 첫번째 위치 다음 위치 숫자를 써주면 됨' , 7);

-- "515.123.4567" 문자열을 .을 기준으로 각각 자르기
SELECT SUBSTRING("515.123.4567", (SELECT LOCATE('.', '515.123.4567')));

SELECT SUBSTRING("515.123.4567", 1, 3);
SELECT SUBSTRING("515.123.4567", 5, 3);
SELECT SUBSTRING("515.123.4567", -4, 4);

-- 직원 테이블 전화번호 앞자리 3자리를 분류해서 개수
SELECT SUBSTRING(PHONE_NUMBER, 1, 3), COUNT(*) FROM employees GROUP BY (
	SELECT SUBSTRING(PHONE_NUMBER, 1, 3)
);

SELECT RAND(); -- 0 ~ 1 범위 안에서의 랜덤한 숫자
SELECT ROUND(123.123, 2); -- 반올림
SELECT FLOOR(1.555); -- 제일 작은 수
SELECT CEIL(1.222); -- 적어놓은 수보다 큰 정수

SELECT ABS(-55); -- 절대값
SELECT POW(2, 8);

SELECT PI(); -- 파이 값...

-- 주사위 1 ~ 6 사이의 난수(정수) 생성
SELECT CEIL(RAND() * 6); -- 함수는 찾아보면 됨
