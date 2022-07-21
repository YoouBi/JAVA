SELECT * FROM new_view
WHERE employee_id = 100;

SELECT COUNT(*) FROM new_view;

SELECT * FROM new_view A
LEFT JOIN locations B ON A.LOCATION_ID = B.LOCATION_ID;

SELECT * FROM sumavgcountemp;