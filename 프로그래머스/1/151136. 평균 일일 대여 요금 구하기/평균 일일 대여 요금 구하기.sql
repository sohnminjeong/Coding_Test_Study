-- 코드를 입력하세요
-- CAR_TYPE : '세단', 'SUV', '승합차', '트럭', '리무진' 
-- OPTIONS :  '주차감지센서', '스마트키', '네비게이션', '통풍시트', '열선시트', '후방카메라', '가죽시트' 
-- 자동차 종류가 SUV인 자동차들의 AVG(DAILY_FEE) as AVERAGE_FEE
SELECT ROUND(AVG(DAILY_FEE),0) as AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV';