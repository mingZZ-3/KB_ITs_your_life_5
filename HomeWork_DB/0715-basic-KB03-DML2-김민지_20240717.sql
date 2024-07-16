create schema shop7;
use shop7;

select * from emp_data;
select * from dept_data;

-- 1. 전체 직원수 출력
SELECT COUNT(*) as 직원수 FROM emp_data;

-- 2. DEPTNO가 20이거나 MGR이 7700이하인 직원수 출력
SELECT COUNT(*) as 직원수 FROM emp_data
WHERE deptno = 20 OR mgr <= 7700;

-- 3. DEPTNO가 10 또는 20인 직원의 SAL최저값 출력
SELECT MIN(sal) FROM emp_data
WHERE deptno = 10 OR deptno = 20;

-- 4. 직원의 SAL 최저값, 최고값, 합계 출력
SELECT MIN(sal), MAX(sal), SUM(sal) FROM emp_data
WHERE deptno = 10 OR deptno = 20;

-- 5. DEPTNO별  SAL 평균 출력
SELECT deptno, AVG(sal) FROM emp_data
GROUP BY deptno;

-- 6. DEPTNO별  SAL 합계를 DEPTNO 오름차순으로 출력
SELECT deptno, SUM(sal) FROM emp_data
GROUP BY deptno
ORDER BY deptno;

-- 7. DEPTNO별  SAL 평균이 2000이상인 SAL평균을 DEPTNO역순으로 출력
SELECT deptno, ROUND(AVG(sal)) FROM emp_data
GROUP BY deptno
HAVING AVG(sal) >= 1000
ORDER BY deptno DESC;

-- 8. JOB이 MANAGER인 직원의 전체 수, 월급의 평균 검색
SELECT job, COUNT(*), ROUND(AVG(sal)) FROM emp_data
WHERE job = 'MANAGER';

-- 9. ENAME에 S를 포함하는 직원의 전체 수를 검색
SELECT COUNT(*) FROM emp_data
WHERE ename like '%s%';

-- 10. SAL이 3000이상이고,  COMM이 null이 아닌 직원의 전체 수 검색, SAL의 역순으로 출력
SELECT COUNT(*) FROM emp_data
WHERE sal >= 3000 AND comm IS NOT NULL
ORDER BY sal DESC;