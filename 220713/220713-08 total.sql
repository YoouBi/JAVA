-- 집계 함수 : 여러개의 행으로 되어있는 정보들을 다 연산해서 한 개의 결과로 만들어내는 함수
SELECT * FROM employees;

-- employees 테이블에 있는 로우들의 개수를 알고싶다
SELECT COUNT(*) FROM employees; -- COUNT () 안에는 갯수를 세고자하는 컬럼의 이름을 적어주면 하나의 행으로 결과가 나오는데 보통 특정을 시키기보다 *로 모두 집계 시키는데
-- null 값의 영향을 받아서 null 값은 안 세고 넘어갈 수 있기 때문

-- 전화번호가 515~~로 시작하는 직원을 조회하는 쿼리문
SELECT * FROM employees WHERE PHONE_NUMBER LIKE "515%";
-- 전화번호가 515~~로 시작하는 직원의 수를 조회하는 쿼리문
SELECT COUNT(*) FROM employees WHERE PHONE_NUMBER LIKE "515%";

-- 합
SELECT SUM(SALARY) FROM employees; -- 구하고자 하는 합을 SUM이라는 집계 함수 안에 넣어주면 된다
-- 평균
SELECT AVG(SALARY) FROM employees; -- 평균을 구해주는 AVG 집계 함수도 있다
-- 최대
SELECT MAX(SALARY) FROM employees;
-- 최소
SELECT MIN(SALARY) FROM employees;

-- 최대 연봉과 최소 연봉의 차를 구해봅시다
SELECT MAX(SALARY) - MIN(SALARY) FROM employees;
