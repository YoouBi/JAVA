USE my_db;
DESC books;

-- 컬럼에 대한 제약 사항을 만들어보자
ALTER TABLE books CHANGE COLUMN title title VARCHAR(30) NOT NULL; -- title 다음에 들어갈건 새 이름, 그다음은 타입인데
-- 이름과 타입은 그대로 두고 NOT NULL만 사용할거니까 나머지는 똑같이 하고 NOT NULL만 붙임
-- 이런 복잡한 작업을 GUI로 할 수 있는데 왼쪽 원하는 테이블에서 스패너 모양을 클릭하면 GUI로 수정이 가능한데 수정하고 APPLY를 눌러주면 자동으로 쿼리를 만들어주니까 확인하고 수정하면 된다
-- 디폴트 값 또한 GUI에서 수정할 수 있는데
INSERT INTO books (title) VALUES ('디폴트값 확인');
SELECT * FROM books;

CREATE TABLE myPractice(
	colname1 VARCHAR(50) DEFAULT '39839o'
);
-- GUI에서 순서 또한 드래그로 바꿀 수 있다
-- 새 컬럼 생성은 더블 클릭, 삭제는 우클릭 후 DELETE SELECTED
-- 테이블도 우클릭으로 create table 생성 가능!

-- 테이블 자체에서 바꾸고 Apply도 되는데
-- 이 모든 작업CRUD을 다 할 줄 알아야하지만 모른다면 바꿔보고 쿼리문을 외워서 작성하자