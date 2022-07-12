-- 월드 테이블 안에 컨트리라는 데이터가 있었는데 그걸 보고싶다면
select * from country; -- select 뒤에는 뭘 볼건지 form 뒤에는 어디서 볼건지
select * from city;

select name,
population -- 컬럼 명(대소문자 신경쓰지 않음)을 명시하면 보고싶은만큼만 볼 수 있음
from country; -- 문장 끝을 세미콜론;으로 표시하고 있는 친구들은 필요하다면 여러줄로도 작성 가능

desc country; -- desc는 테이블의 구조를 볼 수 있는 명령어
-- 컬럼 이름들이 필드로 나오니 그 중 보고싶은 걸 선택할 수 있음

-- country 테이블에서 code 열과 gnp 열을 조회해보세요.
select code from country;
select gnp from country;

-- 특정한 값을 가지는 행만 보고자할 때 where절
select * from country where name = "South Korea"; -- 이름이 south korea인 행을 찾음

-- 국가 명 'Japen', 'China' 인 행의 모든 컬럼 조회
select * from country where name = 'Japan';
select * from country where name = 'China';

-- continent 값이 'Asia'인 행 조회하기
select * from country where Continent = "Asia";
-- 얘도 논리를 가질 수 있기 때문에 문자열 연산을 해서 Asi가 포함되는 문자로 검색하는 것도 가능함

-- South Korea와 Japan, China를 포함한 모든 컬럼을 찾고자 할 때는
-- 이름을 찾는 논리들을 ||로 결합할 수도 있지만(MySQL은 됨) 보통 or를 쓴다 &&는 and
select * from country where name = 'South Korea' or name = 'Japan' or name = 'China';

-- population(인구) 컬럼 값이 40,000,000 이상인 국가의 모든 컬럼을 조회
select * from country where Population >= 40000000;
--  population(인구) 컬럼 값이 40,000,000 이상이고 50,000,000이하인 국가의 모든 컬럼을 조회
select * from country where Population >= 40000000 and Population <= 50000000;

-- Continent 값 'Asia'를 제외한 국가 목록 조회
select * from country where Continent <> 'Asia';