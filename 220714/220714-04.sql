USE world;

SELECT NAME, LifeExpectancy FROM country;
-- 기대 수명이 null이면 임의의 수 0.0으로 조회하기
SELECT NAME, 
	CASE WHEN LifeExpectancy IS NULL THEN 0.0 -- 이 조건절만 쓰면 아닌 값들은 NULL이 되기 때문에
    ELSE LifeExpectancy -- 나머지 값들은 그대로 쓰겠다는 ELSE 절을 써준다
    END AS Life
FROM country;

-- SELECT문에 그대로 쓰느냐? 아니다
-- 흐름을 가지는 SQL문은 조작 흐름을 만들어낼 수 있다
-- SET @var := 10; -- 변수가 있고
-- CASE WHEN @var = 10 THEN
		-- START
        -- 변수가 있을 때 동작을 해라 이런게 가능하다
        -- END
-- 	END;

-- 직원 이름(이름 + 성) 결합시킨 Full Name
-- 전화번호가 011로 시작하는 경우 '개인전화' 그 외의 경우 '내선 번호'라고 조회하는데 이 컬럼의 별명은 '분류'
USE hr;
SELECT
	CONCAT(FIRST_NAME, ' ',LAST_NAME) AS 'FULL NAME',
    PHONE_NUMBER, 
    CASE WHEN SUBSTRING(PHONE_NUMBER, 1, 3) = '011' THEN '개인전화'
    -- CASE WHEN PHONE_NUMBER LIKE '011%' THEN '개인전화'
    ELSE '내선번호'
    END AS '분류' 
FROM employees;

SELECT IFNULL(NULL, '대체값'); -- 특정한 값에 대해서 IFNULL을 쓸 수 있는데 이 때 왼쪽에 있는 값이 NULL이면 대체값으로 대체할 수 있음
-- 값이 3개일 때 첫번째 값이 NULL이면 두번째 값, 두번째 값도 NULL이면 세번째 값
SELECT IFNULL(IFNULL('첫번째값', '두번째값'), '세번째값');
SELECT COALESCE('첫', '두', '세'); -- 똑같은 개념이지만 한번에 대체할 여러개의 값을 나열할 수 있음

-- 헷갈리는 개념 NULLIF
SELECT NULLIF('A', 'A'); -- 이것도 항이 두 개 올 수 있는데 이건 두개가 같으면 NULL이고
SELECT NULLIF('A', 'B'); -- 다르면 첫번째 값이다

-- SQL에서 로직을 만들어낼 수 있는 표현
SELECT CASE WHEN 10 > 5 THEN '왼쪽이 오른쪽보다 큽니다' -- CASE WHEN 다음에는 조건식이 오고 그 값이 참이면 THEN절을 거짓이면 ELSE절
			ELSE '왼쪽이 오른쪽보다 작거나 같습니다'
            END; -- CASE는 END로 끝을 알려줘야한다
            
SELECT CASE WHEN 10 > 5 THEN "왼쪽" -- else if 절 쓰던거랑 똑같이 쓴다
			WHEN 10 = 5 THEN "같음"
			WHEN 10 < 5 THEN "오른쪽"
            END AS "비교"; -- 이만큼의 표현이 하나의 값이 될거니까 별명 지어줄 수 있음