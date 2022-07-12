-- Ctrl + Shift + Enter 는 모든 문장을 실행
-- Ctrl + Enter 는 한 문장만 실행
show databases;

use world; -- use 뒤에 사용할 데이터베이스의 이름을 쓴다

show tables; -- show table로 현재 쓰고 있는 DB의 행과 열을 보여준다

-- 조회도 하나의 명령어로써 실행할 수 있다
select 1 + 1; -- 산수 명령을 수행하고 그 결과를 보여줌

select 'Hello World' + "concat??"; -- 문자열 표현은 똑같이 쌍따옴표도 되지만 홑따옴표도 인식
-- 그런데 SQL은 일반적인 문자열 합연산은 수행되지 않음

select 10 = 10;
-- SQL에서는 관계연산자로 같냐고 물어보는건 = 등호를 하나로 표시, 값이 같다면 논리값 1을 다르다면 0을 반환
select 10 <> 10;
-- 둘이 다르냐고 물어보는건 MySQL에서는 !=도 되지만 <> 부등호를 사용해서 물어봄