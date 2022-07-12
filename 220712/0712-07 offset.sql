SELECT * FROM country;
SELECT * FROM country LIMIT 1 OFFSET 2; -- OFFSET으로 몇칸을 건너뛸지도 지정해줄 수 있음
SELECT * FROM country LIMIT 2, 1; -- 줄임도 가능한데 줄일 때는 OFFSET이 먼저 나온다

-- page 나누기
SELECT * FROM country LIMIT 10 OFFSET 0;
SELECT * FROM country LIMIT 10 OFFSET 10;
SELECT * FROM country LIMIT 10 OFFSET 20;