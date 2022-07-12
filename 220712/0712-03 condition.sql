select * from country where name in ('South Korea', 'Japan', 'China'); -- in을 사용하면 여러개의 값 중에서 하나라도 포함된다면 참으로 인식함
-- 제외하는 건 not in

-- 범위를 나타내는 것도 SQL에서 많이 하다보니까 특정한 값 사이에 있는지 물어보는 between을 만들어뒀다 사이를 나타내는 건 and
select * from country where Population between 40000000 and 50000000; -- 얘도 마찬가지로 제외하는 건 not between

-- Continent 컬럼 값이 North America, Europe, Asia를 제외한 국가들 중
-- GNP 값이 100 이상 1000 이하인 국가 목록 조회하기
select *
 from country
 where
	Continent not in ('North America', 'Europe', 'Asia')
	and GNP between 100 and 1000;
-- 이 때 American Samoa(name)의 IndepYear컬럼에 해당 국가의 정보값이 없으면 null로 표현

select *
 from country
 where IndepYear is null; -- 널값은 <>로 찾지 않고 특이하게 is not null라는 키워드로 찾는다 널값을 찾을 땐 is null
-- where IndepYear != ('null'); DB를 쓸 때 SQL을 쓰는데 쓰는 업체들(지금 우리가 쓰는 건 MySQL)마다 자기가 편한 기능을 넣는다고 문법이 다 다르다(사투리로 생각하면 됨)
-- 우리는 지금 MySQL에서 되는 게 있어도 다른 곳에서 안될 수 있으니 표준어로 배울 것
