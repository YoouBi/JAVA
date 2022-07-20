SELECT * FROM my_db.books;
SELECT * FROM my_db.persons;

SELECT * FROM my_db.books AS A
LEFT JOIN persons AS B ON A.owner = B.personId;

-- SELECT A.*, B.firstName, B.lastName FROM my_db.books AS A
-- LEFT JOIN persons AS B ON A.owner = B.personId
-- WHERE A.price >= 10000;