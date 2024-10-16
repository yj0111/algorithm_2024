-- 코드를 입력하세요
SELECT FH.FLAVOR 
FROM FIRST_HALF FH, ICECREAM_INFO II
WHERE FH.FLAVOR = II.FLAVOR
AND FH.TOTAL_ORDER >= 3000
AND INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC;