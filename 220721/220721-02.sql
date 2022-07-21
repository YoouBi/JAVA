USE my_db;

SELECT * FROM RESTAURANT_MENU;

SELECT * FROM my_db.restmenu WHERE 음식점이름 = '텐동황군'; -- 와 별명으로 바꿨다구 별명으로 검색해야하네... tradeName으로 검색이 안된다...;ㅅ;
-- CREATE VIEW `restmenu` AS
-- select a.id, a.tradeName as '음식점이름', callNumber, a.address, b.menuid, b.food as
-- '메뉴이름', b.price from restaurant as a left join menu as b on a.id = b.restID;