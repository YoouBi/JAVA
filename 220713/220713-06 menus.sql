DROP TABLES Restaurant;
DROP TABLES Menu;

-- 식당 정보 테이블
-- 상호명
-- 전화번호
-- 주소 등
CREATE TABLE Restaurant (
	Id INT PRIMARY KEY AUTO_INCREMENT, -- 키로 사용하기 좋은 단순화된 정수의 열을 추가한다
    TradeName VARCHAR(15) NOT NULL,
    CallNumber VARCHAR(14) NOT NULL UNIQUE,
    Adress VARCHAR(100) NOT NULL UNIQUE
);
-- 키는 간단하게 생겨야 사용하기 편한데 전화번호와 주소는 고유성은 있지만 너무 길다

DESC restaurant;

INSERT INTO Restaurant (TradeName, CallNumber, Adress) VALUES ("달리는 커피", 0518093389, "부산 부산진구 서전로 20"),
															("텐동황군", 050714156340, "부산 부산진구 서전로 37번길 20"),
                                                            ("페이센동", 050713699399, "부산 부산진구 서전로 46번길 6"),
                                                            ("영자면옥", 0518086958, "부산 부산진구 새싹로8번길 29"),
                                                            ("도연정", 0518050071, "부산 부산진구 새싹로 16"),
                                                            ("옥반", 0518029986, "부산 부산진구 서전로37번길 20");
SELECT * FROM Restaurant;
SELECT * FROM Menu;
DESC menu; -- 외래키를 추가했을 때 Key 컬럼에 MUL으로 표기된 걸 볼 수 있음

-- 메뉴 정보 테이블
-- 음식명
-- 가격 등
CREATE TABLE Menu (
	MenuId INT PRIMARY KEY AUTO_INCREMENT,
	Food VARCHAR(15) NOT NULL,
    Price INT NOT NULL
);

INSERT INTO Menu (Food, Price) VALUES ("햄치즈샌드위치", 5900), ("로스트치킨샌드위치", 6500), ("베이컨올리브샌드위치", 6900);
INSERT INTO Menu (Food, Price) VALUES ("올스타텐동", 17000), ("오리지날텐동", 12000), ("새우텐동", 13000);

-- 테이블 구조 변경 명령어는 ALTER
ALTER TABLE Menu ADD COLUMN restId INT; -- 컬럼 추가는 ADD COLUMN
-- 열 추가는 UPDATE
UPDATE menu SET restId = 2 WHERE menuId <> 1; -- 변경하고자하는 컬럼의 값을 SET 뒤에 써줌
-- 임의로 넣은 값 restId를 레스토랑 테이블에 있는 Id라는 키 값이라는 걸 논리적으로 구성할 것
-- restId를 외래키로 만들건데 다른 테이블에 있는, 참조해야하는 키 값이기 때문에 외래키(FOREIGN KEY)라고 부른다
-- 외래키에는 이름을 붙여주는데 보통 앞에는 FK를 붙이고 뒤에는 몇번째에 위치하는지 숫자로 써둠 'FK_RESTAURNT_123' 지금은 생략
ALTER TABLE menu ADD CONSTRAINT FOREIGN KEY (restID) REFERENCES Restaurant (id); -- FOREIGN KEY 뒤에는 () 안에 뭘 외래키로 정할건지 써두고 REFERENCES 뒤에 외래키로 가져올 걸 적는다

-- Database>Reverse Engineer에서 ERD(테이블간의 관계)를 볼 수 있다
-- 회사 가면 이 ERD부터 보면 좋음... 다루는 데이터베이스의 컬럼들이 무슨 관계를 가지고 있는지 유추하기 편해질테니까