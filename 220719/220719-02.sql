START TRANSACTION; -- 명령어, 커맨드로 하는 방법

UPDATE books SET price = 50000;

SELECT * FROM books;

ROLLBACK; -- 근데 DROP TABLE은 롤백이 안됨... _._.)_
-- 이건 DB의 깊은 부분인데...
-- 트랜젝션의 'ROCK'이라는 부분이 DB 시스템마다 다 다르다
-- MySQL의 락은 행마다 거는게 있고... ...너무 깊은 부분이니까 사용법이랑 개념까지만 배워두장!
COMMIT;