-- 코드를 입력하세요
SELECT A.FLAVOR FROM FIRST_HALF A
JOIN JULY B
USING (FLAVOR)
GROUP BY A.FLAVOR
ORDER BY SUM(A.TOTAL_ORDER)+SUM(B.TOTAL_ORDER) DESC 
LIMIT 3;
