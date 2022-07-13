
CREATE TABLE books ( -- 문자열 형태도 PK 가능
	bookId INT PRIMARY KEY AUTO_INCREMENT, -- 일일이 PK를 작성하는게 힘드니까 자동으로 생성되도록 해주는 AUTO_INCREMENT는 정수형 타입에 대응 가능
	title VARCHAR(30),
    price INT
);

DESC books; -- 부가 설명에 AUTO_INCREMENT가 적혀져있다

INSERT INTO books (title, price) VALUES ("책1", 2000), ("책2", 3000), ("중복이름", 2500), ("중복이름", 3000);

SELECT * FROM books;
DELETE FROM books WHERE bookId = 3;

INSERT INTO books (title, price) VALUES ("새로운이름", 3500); -- AUTO_INCREMENT는 이름대로 증가만 하고 감소가 안되기 때문에
-- 아이디는 고유하니까 바뀌면 문제가 생길 수 있기 때문에 PK의 값을 변경하는 건 자주 있는 일이 아니다
-- 그래서 지금 삭제한 3은 쓸 수는 있지만 아예 안쓴다고 생각하는게 좋다
-- 지금은 단순한 테이블이지만 데이터가 방대해지면 나중에 key로 서로서로를 가리키기 때문에 참조가 꼬일 수 있기 때문