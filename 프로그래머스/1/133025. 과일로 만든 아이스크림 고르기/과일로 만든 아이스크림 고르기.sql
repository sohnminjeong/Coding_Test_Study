-- 코드를 입력하세요
-- TOTAL_ORDER>3000
-- INGREDIENT_TYPE == 'fruit_based'
-- ORDER BY TOTAL_ORDER DESC
SELECT F.FLAVOR as FLAVOR
FROM FIRST_HALF as F
JOIN ICECREAM_INFO as I 
ON (F.FLAVOR = I.FLAVOR)
WHERE TOTAL_ORDER>3000 AND I.INGREDIENT_TYPE = 'fruit_based'
ORDER BY F.TOTAL_ORDER DESC;