CREATE TABLE persons (
	-- 이름, 성, 나이
    personId INT PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(10) NOT NULL, -- 컬럼 우측에 제약 사항으로 NOT NULL을 붙여줌으로써 각 컬럼들은 널 값을 허용하지 않게 된다
    lastName VARCHAR(10) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE -- 이메일은 고유하게(UNIQUE) 가질 것이다
);
DROP TABLES persons;

-- NOT NULL인 컬럼들이 있어서 INSERT INTO persons (firstName, lastName, age) VALUES (null, null, null);가 안됨
INSERT INTO persons (firstName, lastName, age, email) VALUES ("길동", "홍", 20, "honggilldong@gmail.com"),
															("길동", "고", 20, "gogilldong@gmail.com");
-- INSERT INTO persons (firstName, lastName, age, email) VALUES ("길동", "양", 20, "honggilldong@gmail.com");
-- 처럼 이메일 주소가 같은 사람이 있으면 추가되지 않는다

SELECT * FROM persons;

-- 테이블 이름
-- 각 열 (이름, 타입, 제약)
-- Key 열
-- 이런 형태로 만들면 좋을 것이다