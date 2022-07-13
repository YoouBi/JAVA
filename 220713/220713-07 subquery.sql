USE hr;

-- hr 부서(departments) 테이블 모든 행과 열 조회
SELECT * FROM departments;

-- 부서 명이 'IT%'로 시작하는 부서들 조회
SELECT * FROM departments WHERE DEPARTMENT_NAME LIKE 'IT%';

-- 60, 210, 230
-- 직원 테이블
-- SELECT * FROM employees WHERE DEPARTMENT_ID IN (60, 210, 230);
SELECT * FROM employees WHERE DEPARTMENT_ID IN
(SELECT  DEPARTMENT_ID FROM departments WHERE DEPARTMENT_NAME LIKE 'IT%'); -- 하나의 작업 안에 위치한 SQL 명령문을 '서브 쿼리' 라고 하는데 지금처럼 WHERE 절의 조건문에 작성할 수도 있다

-- 연봉 내림차순 정렬
-- 연봉 상위 10명
-- 연봉을 오름차순으로 조회
SELECT * FROM (SELECT * FROM employees ORDER BY SALARY DESC LIMIT 10) AS A ORDER BY SALARY ASC; -- FROM 절 안에 셀렉을 수행하는 서브 쿼리 하나가 들어있고 그 결과로 다시 셀렉 수행
-- 서브 쿼리로 만든 테이블로 값 조회를 할 때 테이블에 별명이 없으면 오류가 나기 때문에 AS A로 별명을 붙임

-- SELECT (SELECT 1), 2, 3, 4;
-- David Austin의 연봉과 같은 연봉을 받는 직원들 조회
SELECT * FROM employees WHERE FIRST_NAME = 'David' AND LAST_NAME = 'Austin';
SELECT * FROM employees WHERE SALARY = (
	SELECT SALARY FROM employees WHERE FIRST_NAME = 'David' AND LAST_NAME = 'Austin'
);