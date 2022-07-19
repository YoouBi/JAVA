SELECT * FROM my_db.books;

INSERT INTO books (title, price) VALUES ("테스트합니다잉", 4040);
INSERT INTO books (title, price) VALUES ("파란불껐음", 3333); -- 상단의 번개와 체크가 같이 있는 버튼을 끄고 실행시켜보자(GUI로 하는 방법)
-- 그 다음 옆의 X 버튼을 누르면 파란불껐음의 책이 사라진다

UPDATE books SET price = '1'; -- 혹은 이렇게 모든 책의 가격을 1로 만든 후에 my_db.books를 확인해보고 X로 롤백을 한 뒤에 다시 확인해보자
-- 모든 가격들이 원래대로 돌아간 것을 볼 수 있을 것이다
-- '커넥션'으로 시작점을 지정하고 작업을 한 뒤에 '롤백'을 할건지 적용해서 실행할건지
-- DB 시스템마다 이런 식으로 백업할 수 있는 시스템들이 있다

SELECT * FROM restaurant;
SELECT * FROM menu;

-- CREATE TABLE zxcv (
-- 	, PRIMARY KEY (asdf)
--     , FOREIGN KEY 'fk_zxcv_ref_retcol12' fkkkk REFERENCE tableName (refcol) -- 참조하고 있는 컬럼 이름과 몇번째인지 번호
-- );

-- ALTER TABLE asdfasdf ADD CONSTRAINT	'asd';