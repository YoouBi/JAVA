select * from country
 where name like '%Korea%'; -- like '%포함단어%'로 검색하면 포함된 문자들은 다 참으로 하는 패턴 검색
 
select * from country
 where name like '%k%';
 
select * from country
 where name like '%k'; -- %가 앞에만 붙으면 k로 끝나는 문자만 참으로 친다
 
select * from country
 where name like 'k%';
 
-- 국가 이름이 'A'로 시작하고 'A'로 끝나는 국가 조회
select * from country
 where name like 'A%A';
 
-- 국가 이름이 'A'로 시작하고 'A'로 끝나는 국가 조회 (6자)
select * from country
 where name like 'A____A'; -- _는 한글자를 대신해주는 문자
 
-- 국가명이 ~ria로 끝나는 국가 조회
select * from country
 where name like '%ria';
 
-- Region 컬럼이 North~~로 시작하는 국가 조회
select * from country
 where region like 'north%';
 
-- Region 컬럼에 A로 시작해서 a로 끝나는 명칭을 포함하지 않는 국가
select * from country
 where region not like '%a%a' and region not like 'a%a%';