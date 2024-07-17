-- 코드를 입력하세요
-- 2022년 10월에 작성된 
-- 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일
-- 작성일 기준 오름차순, 댓글 작성일이 같다면 게시글 제목 기준 오름차순
SELECT a.TITLE, a.BOARD_ID, b.REPLY_ID, b.WRITER_ID, b.CONTENTS, DATE_FORMAT(b.CREATED_DATE, "%Y-%m-%d") AS CREATED_DATE
FROM USED_GOODS_BOARD as a
INNER JOIN USED_GOODS_REPLY as b 
ON a.BOARD_ID = b.BOARD_ID
WHERE a.CREATED_DATE like '2022-10%'
ORDER BY b.CREATED_DATE ASC, a.TITLE ASC;
