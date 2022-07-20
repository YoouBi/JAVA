SELECT * FROM menu AS A
RIGHT JOIN restaurant AS B ON A.restID = B.id; -- 오른쪽 기준으로 하면 우측에서 좌측에 붙일게 없는 행이 있더라도 조회가 된다

SELECT * FROM restaurant AS A
-- LEFT JOIN menu AS B ON A.iD = B.restId; -- LEFT OUTER JOIN를 줄여서 LEFT JOIN
JOIN menu AS B ON A.iD = B.restId; -- INNER JOIN은 아예 JOIN으로만 쓸 수 있는데 결합이 가능한 애들만 조회가 되고 결합이 안일어나면 없어진다