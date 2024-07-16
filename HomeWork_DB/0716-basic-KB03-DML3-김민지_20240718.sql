use shop7;

select * from emp_data;
select * from dept_data;

---------------------- DML3 ----------------------
--------- Q1
-- 1. DEPTNO컬럼을 기준으로 두 개의 테이블을 조인 후,  EMPNO, JOB, SAL, COMM, DNAME, LOC를 검색하여 출력하시오.(INNER JOIN)
SELECT e.EMPNO, e.JOB, e.SAL, e.COMM, d.DNAME, d.LOC FROM emp_data e
JOIN dept_data d ON e.DEPTNO = d.DEPTNO;

-- 2. EMP테이블 내에는 일반 직원과 매니저가 함께 저장되어있다. 일반 직원의 EMPNO, JOB, SAL과 일반직원을 관리하는 MGR의 EMPNO, JOB을 함께 검색하여 출력하시오.(SELF JOIN)
SELECT e.EMPNO, e.JOB, e.SAL, m.EMPNO, m.JOB FROM emp_data e
JOIN emp_data m ON e.MGR = m.EMPNO;

-- 3. 모든 DEPT_DATA 테이블의 항목이 출력되고, 두 테이블 간 DEPTNO가 일치하는 것을 찾아 EMP_DATA테이블의 DEPTNO, EMPNO, ENAME 항목을 추가 출력되도록 조인하시오.(OUTER JOIN)
SELECT * FROM dept_data d
LEFT JOIN emp_data e ON d.DEPTNO = e.DEPTNO;

--------- Q2
-- 1. 최고 연봉을 받는 직원의 이름과 그의 부서명 찾기
SELECT e.ename, d.dname FROM emp_data e
JOIN dept_data d ON e.deptno = d.deptno
WHERE sal = (SELECT MAX(sal) FROM emp_data);

-- 2. 각 부서의 평균 연봉보다 더 많은 연봉을 받는 직원들의 목록
select e.ename, e.sal, d.dname, d.deptno from emp_data e
join dept_data d on e.deptno = d.deptno
where e.sal > (select avg(sal) from emp_data where deptno = e.deptno);

-- 3. 부서별로 최고 연봉을 받는 직원의 정보 찾기
select e.ename, e.sal, d.dname, d.deptno from emp_data e
join dept_data d on e.deptno = d.deptno
WHERE e.sal in (SELECT MAX(sal) FROM emp_data GROUP BY deptno);

-- 4. 부서 위치가 'CHICAGO'인 모든 직원들의 정보
select e.ename, e.sal, d.dname, d.deptno, d.loc from emp_data e
join dept_data d on e.deptno = d.deptno
where d.loc = 'CHICAGO';

-- 5. 모든 매니저 (MGR) 아래에서 일하는 직원들의 목록
select e2.ename as 직원, e1.ename as 매니저 from emp_data e1
join emp_data e2 on e1.empno = e2.mgr;

--------- Q3
-- 1. SALES와 RESEARCH부서 직원 목록 합치기(UNION)
select e.ename, e.job, d.dname from emp_data e
join dept_data d on e.deptno = d.deptno
where d.dname = 'SALES'
union
select e.ename, e.job, d.dname from emp_data e
join dept_data d on e.deptno = d.deptno
where d.dname = 'RESEARCH';

-- 2. 연봉이 2000 이상인 직원과 관리자 목록 합치기(UNION)
select e.ename, e.job, e.sal from emp_data e
where sal >= 2000
union
select ename, job, sal from emp_data
where empno in (select distinct mgr from emp_data where mgr is not null);

-- 3. 보스턴과 댈러스에 위치한 부서의 직원 목록 합치기(UNION)
select e.ename, e.sal, d.dname, d.deptno, d.loc from emp_data e
join dept_data d on e.deptno = d.deptno
where d.loc = 'BOSTON'
union
select e.ename, e.sal, d.dname, d.deptno, d.loc from emp_data e
join dept_data d on e.deptno = d.deptno
where d.loc = 'DALLAS';