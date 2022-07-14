SELECT * FROM my_db.pktest;

-- PK를 두개 이상 만들 수는 있는데
INSERT INTO pktest (myCol1, myCol2) VALUE ('1', '1');
INSERT INTO pktest (myCol1, myCol2) VALUE ('1', '2');
INSERT INTO pktest (myCol1, myCol2) VALUE ('2', '1');
INSERT INTO pktest (myCol1, myCol2) VALUE ('1', '1'); -- X
-- 여러 컬럼에 대해서 PK를 주게 된다면 그 컬럼들의 값이 '모두' 같으면 안된다
-- 얘네들도 인덱스가 생기는데 PK는 두개지만 INDEX는 한개다
-- ORDER BY 때 정렬의 기준 순서를 정해줄 수 있었는데 이와 똑같이 동작한다
-- 다만 PK가 여러가지가 있다면 첫번째 PK의 기준을 수행한 후에 두번째 PK의 기준을 수행한다
-- 이 순서 또한 필요하다면 변경이 가능하다

-- DB에는 서버가 있고 우리가 쓰고 있는 이 워크벤치가 하나의 클라이언트라고 할 수 있는데
-- 자바에서 데이터베이스를 응용해서 쓰려면 서버에 접속해서 데이터로 조작해서 자바로 받아와야하는데
-- SQL 명령어를 하는 건 똑같은데 직접 JAVA에서 만들고 결과를 봐야하는 것...?