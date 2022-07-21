SELECT * FROM hr.employees; -- 이것도 연관 관계로 이루어져있다
SELECT * FROM departments;
SELECT * FROM jobs;
SELECT * FROM locations;

/*
	부서 -- (employees.department_id -참-조-> departments.department_id)
    직책 -- (employees.job_id -참-조-> job.job_id)
    매니저 -- (departments.MANAGER_ID -참-조-> employees.employee_id)
    위치 --(departments_id.location_id -참-조-> locations.location_id)
    
	1. 모든 부서의 부서명과 관리자(외래키 MANAGER_ID -> empoloyees_id 참조)의 이름 조회
    2. 부서명이 IT로 시작하는 부서에서 근무하는 직원들의 이름과 부서명 조회
    3. 모든 직원들의 이름과 직책(JOB_TITLE) 조회
    4. 직원의 해당 직책의 jobs 테이블에 책정된 최대 연봉(MAX_SALARY)을 초과한 연봉을 받는 직원이름, 현재연봉, 최대연봉 조회
    5. 부서의 COUNTRY_ID가 'US'인 부서에서 근무하는 직원과 부서명 조회
*/

-- 1. 모든 부서의 부서명과 관리자(외래키 MANAGER_ID -> empoloyees_id 참조)의 이름 조회
SELECT DEPARTMENT_NAME, FIRST_NAME, LAST_NAME FROM employees AS A
JOIN departments AS B ON A.employee_id = B.MANAGER_ID;

-- 2. 부서명이 IT로 시작하는 부서에서 근무하는 직원들의 이름과 부서명 조회
SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_NAME FROM
		employees AS A
		RIGHT JOIN (SELECT * FROM departments WHERE DEPARTMENT_NAME LIKE 'IT%') AS B ON A.department_id = B.department_id;
        
-- 3. 모든 직원들의 이름과 직책(JOB_TITLE) 조회
SELECT FIRST_NAME, LAST_NAME, JOB_TITLE FROM
	employees AS A
    LEFT JOIN jobs AS B ON A.job_id = B.job_id;
    
-- 4. 직원의 해당 직책의 jobs 테이블에 책정된 최대 연봉(MAX_SALARY) 이상의 연봉을 받는 직원이름, 현재연봉, 최대연봉 조회
SELECT FIRST_NAME, LAST_NAME, SALARY, MAX_SALARY FROM
	employees AS A
    LEFT JOIN jobs AS B ON A.job_id = B.job_id
WHERE SALARY >= MAX_SALARY;

-- 5. 부서의 COUNTRY_ID가 'US'인 부서에서 근무하는 직원과 부서명 조회
-- SELECT FIRST_NAME, LAST_NAME, DEPARTMENT_NAME FROM
-- 	LEFT JOIN employees AS C
-- 		(departments AS A
-- 		LEFT JOIN locations WHERE COUNTRY_ID = 'US' AS B ON A.LOCATION_ID = B.LOCATION_ID)
-- 	AS D ON C.DEPARTMENT_ID = D.DEPARTMENT_ID;
SELECT * FROM employees A
LEFT JOIN departments B ON A.DEPARTMENT_ID = B.DEPARTMENT_ID
LEFT JOIN locations C ON B.LOCATION_ID = c.LOCATION_ID
WHERE COUNTRY_ID = 'US';

