SELECT count(*) AS USERS
FROM USER_INFO
WHERE TO_CHAR(JOINED, 'YYYY') = 2021 
AND 20<= AGE AND AGE<=29
