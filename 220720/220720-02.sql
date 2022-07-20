-- SELECT * FROM my_db.files;

-- --------------------------

-- SELECT 1, 2, 3
-- UNION
-- SELECT 4, 5, 6
-- UNION
-- SELECT 7, 8, 9
-- UNION ALL -- UNION ALL 은 중복을 신경쓰지 않고 합친다
-- SELECT 1, 2, 3; -- UNION은 중복되면 사라지는데

-- SELECT * FROM my_db.books;
-- SELECT * FROM books WHERE price BETWEEN 1000 AND 10000
-- UNION ALL -- 컬럼의 갯수나 순서, 타입이 중요하다
-- SELECT * FROM books WHERE title LIKE '책%';

SELECT * FROM test, persons; -- 컬럼 순서는 나열된 순서대로
-- 행은 cross(1-1, 1-2, 1-3, 2-1, 2-2, 2-3)로
