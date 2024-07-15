DROP SCHEMA shop7;
CREATE SCHEMA shop7;
USE shop7;

SELECT * FROM dept_data;
SELECT * FROM emp_data;

-- 1. ENAME의 글자수 검색
SELECT COUNT(ename) FROM emp_data;
-- 2. JOB이 MANAGER인 사람의 ENAME 글자수 검색
SELECT COUNT(ename) FROM emp_data WHERE job = 'MANAGER';
-- 3. COMM이 null인 사람의 ENAME, JOB 검색
SELECT ename, job from emp_data WHERE comm = '';
-- 4. COMM이 null이 아닌 사람의 HIREDATE 검색
SELECT hiredate from emp_data where comm != '';
-- 5. ENAME의 2번째글자부터 끝까지 검색
SELECT substr(ename, 2) FROM emp_data;
-- 6. JOB의 1번째 글자부터 3번째 글자까지 검색
SELECT substr(job, 1, 3) FROM emp_data;
-- 7. ENAME의 글자 중 K를 P으로 변경하여 검색
SELECT REPLACE(ename, 'K', 'P') FROM emp_data;
-- 8. ENAME과 EMPNO을 이용하여 ‘7369번은 SMITH입니다' 형식으로 모든 row 출력
SELECT CONCAT(empno, '번은 ', ename, '입니다') FROM emp_data;
-- 9. HIREDATE 이용하여 입사한 월과 연도를 출력
SELECT EXTRACT(YEAR FROM hiredate) AS 년, EXTRACT(MONTH FROM hiredate) AS 월 FROM emp_data;
-- 10. JOB컬럼과 함께 JOB이 MANAGER이면 level1, SALESMAN이면 level2, 기타이면 level3라고 LEVEL_RESULT컬럼 출력
SELECT empno, ename,
	CASE
		WHEN job = 'MANAGER' THEN 'level1'
		WHEN job = 'SALESMAN' THEN 'level2'
        ELSE 'level3'
	END AS LEVEL_RESULT
FROM emp_data;