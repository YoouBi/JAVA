select code as "코드", name as "이름", population as "인구" from country; -- 조회 결과에 대해서 별명을 지어줄 수 있음
-- 이렇게 조회를하면 컬럼 명이 별명으로 뜨는데 MySQL에서는 한글명도 되더라

-- 위의 조회 + SurfaceArea(별명 면적) 컬럼을 추가로 조회
select code as "코드", name as "이름", population as "인구", surfaceArea as "면적"
-- , 15 + 15 as "계산 결과" -- 연산결과가 각 행에 모두 다 적용되는 걸 볼 수 있음 이렇게 만든 컬럼도 별명을 지을 수 있음
-- 이 때 각 행이 가지고 있는 값에 대해서도 각 행별로 따로 연산을 수행할 수 있음
 , round(population / surfaceArea, 1) as "인구밀도" -- 연산 결과에 대한 함수를 지정해줄 수도 있는데
 -- round는 반올림을 해주는 함수로 좌측은 값, 우측은 소수점 자리
	from country
-- surfaceArea가 50,000 이하이면서 population이 10,000,000 이상인 국가의 인구밀도를 조회하세요
	where surfaceArea <= 50000 and population >= 10000000; -- 붙여준 별명으로 못부르는 이유는 순서 때문(기준을 충족하면 select으로 감)

select code as "코드", name as "이름", population as "인구", surfaceArea as "면적"
 , round(population / surfaceArea, 1) as "인구밀도"
 from country
 order by 인구밀도 asc; -- 순서를 가지고 정렬을 하고 싶다면 order by로 오름차순 정렬(asc, 생략가능)을 할 수 있음 내림차순은 desc
 -- 별명으로 부를 수 있는데 그 이유는
 -- order by가 컬럼 이름으로 기준을 세워주면 수행할 수 있는데 셀렉이 이루어지고 난 이후에 이루어지는 작업이라서
 
 -- 아시아 대륙 국가들의 인구 순으로(내림차순) 조회
select * 
	from country 
	where continent = 'Asia' 
    order by population desc;
    
-- LifeExpectancy 오름차순으로 조회 (null 값을 제외한 행)
select *
	from country
    where LifeExpectancy is not null
    order by LifeExpectancy asc;
    
-- 국가의 이름과 인구와 GNP, GNPOld (GNPOld - GNP 차를 구해서 "GNP 변화량" 내림차순) 조회
select name, Population, gnp, gnpold, gnpold - gnp as "GNP 변화량"
    from country
    where gnp is not null and gnpold is not null
    order by `GNP 변화량` desc; -- 컬럼 이름에 스페이스가 들어가면 구분자로 보기 때문에 의미가 달라져서 안됨
    -- 별명 지을 때 스페이스가 넣고 싶으면 사용할 수 있는 특이한 기호 `(그 이름 그 자체로 객체들을 표현하고자 할 때)를 씀
	-- ``가 표현할 수 있는 객체들은 컬럼, 테이블, DB 등등이 있다
    
-- 대륙 순으로 정렬해서 조회
select * from country order by continent, population; -- 정렬에 대한 기준을 추가적으로 제시할 수 있다
-- Asia라는 동일한 기준을 가진 행들끼리 population라는 2차적 기준으로 정렬 됨

-- governmentform 오름차순, GNP 내림차순 정렬 조회
select * from country order by governmentform, gnp desc;