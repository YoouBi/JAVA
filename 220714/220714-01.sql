-- 부서 ID 90
SELECT COUNT(*) FROM employees WHERE DEPARTMENT_ID = 90;

-- 부서 ID 60
SELECT COUNT(*) FROM employees WHERE DEPARTMENT_ID = 60;

-- 부서 ID 30
SELECT COUNT(*) FROM employees WHERE DEPARTMENT_ID = 30;

-- 부서별로 직원들의 인원 수
SELECT DEPARTMENT_ID, COUNT(*) FROM employees GROUP BY DEPARTMENT_ID; -- GROUP BY는 집계 함수를 쓸 때 씀

-- 부서별 최고 연봉, 최저 연봉, 평균 연봉, 연봉 합
SELECT DEPARTMENT_ID, MAX(SALARY), MIN(SALARY), AVG(SALARY), SUM(SALARY) FROM employees GROUP BY DEPARTMENT_ID;

SELECT JOB_ID, LAST_NAME FROM employees GROUP BY JOB_ID; -- 혹은 이렇게 JOB_ID를 볼 때 중복을 제거하고 볼 수 있음
-- GROUP BY는 뭘 그룹지을지 명시해줘야하는데 그룹을 지을 때 다른 컬럼과 함께 검색한다면 다른 컬럼에는 가장 먼저 나오는 값을 보여주고 그룹 짓기로 한 값은 중복 제거해준다
SELECT DISTINCT JOB_ID, LAST_NAME FROM employees; -- DISTINCT도 중복을 제거하는데
-- 조회를 할 때 컬럼 값이 완벽하게 똑같아야지 중복을 제거해주기 때문에 컬럼의 값 하나가 중복이 되더라도 다른 컬럼의 이름값이 다르다면 따로따로 조회된다
-- 컬럼이 여러개라면 완벽하게 동일해야 중복되는 걸 제거해주는 것이다

-- 직원 테이블 LAST_NAME을 중복 제거하고 조회
SELECT DISTINCT LAST_NAME FROM employees;

-- 직원 테이블 LAST_NAME 그룹 별로 인원 수 조회
SELECT LAST_NAME, COUNT(*) FROM employees GROUP BY LAST_NAME;

-- 같은 LAST_NAME 그룹의 카운트가 2이상인 행들만 조회
SELECT LAST_NAME, COUNT(*) FROM employees GROUP BY LAST_NAME HAVING COUNT(*) > 1;
-- 모든 행을 다 가져와서 분류를 하고 그룹을 짓고나서 조건을 걸고싶은거라면 HAVING

-- 위의 성을 가지는 직원 목록 조회
SELECT * FROM employees WHERE LAST_NAME IN (
	-- "Cambrault", "Grant", "King", "Smith", "Taylor"
    SELECT LAST_NAME FROM employees GROUP BY LAST_NAME HAVING COUNT(*) > 1
);

-- 5번째로 적게 받는 직원들 목록
SELECT * FROM employees WHERE SALARY = (
	SELECT DISTINCT SALARY FROM employees ORDER BY SALARY LIMIT 1 OFFSET 4
);

-- 상위 연봉 50명에 대해서 부서별로 몇 명씩 있는지, 첫번째 기준은 연봉 두번째 기준은 FIRST_NAME
SELECT DEPARTMENT_ID, COUNT(*) FROM  (
	SELECT * FROM employees ORDER BY SALARY DESC, FIRST_NAME ASC LIMIT 50
) AS A GROUP BY DEPARTMENT_ID;