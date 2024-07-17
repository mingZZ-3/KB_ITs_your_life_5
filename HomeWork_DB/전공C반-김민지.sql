CREATE SCHEMA shop8;
DROP SCHEMA shop8;
USE shop8;

CREATE TABLE student (
	StudentID INT PRIMARY KEY NOT NULL,
	StudentName VARCHAR(50),
	PhoneNumber VARCHAR(15),
	Address VARCHAR(100)
);

CREATE TABLE professor (
	ProfessorName VARCHAR(50) PRIMARY KEY NOT NULL,
	Office VARCHAR(50),
	PhoneNumber VARCHAR(15)
);

CREATE TABLE clubapplication (
	StudentID INT PRIMARY KEY NOT NULL,
	ClubName VARCHAR(50),
	ProfessorName VARCHAR(50),
    FOREIGN KEY(ProfessorName) REFERENCES professor(ProfessorName),
    FOREIGN KEY(StudentID) REFERENCES student(StudentID)
);

INSERT INTO student 
			VALUES(101, '이영희', '02-234-5678', '서울시 강남구'),
				  (102, '박철수', '02-345-6789', '서울시 서초구'),
				  (103, '최수민', '02-456-7890', '서울시 송파구');
INSERT INTO professor
			VALUES('김명수', '공학관101호', '02-111-2222'),
				  ('이정민', '공학관202호', '02-333-4444'),
                  ('박지훈', '공학관303호', '02-555-6666');
INSERT INTO clubapplication
			VALUES(101, '음악', '김명수'),
				  (102, '미술', '이정민'),
				  (103, '체육', '박지훈');
                  
SET SQL_SAFE_UPDATES = 0;
SELECT * FROM student;
SELECT * FROM professor;
SELECT * FROM clubapplication;

-- 1. ClubName이 '음악'인 신청 삭제
DELETE FROM clubapplication WHERE ClubName = '음악';

-- 2. StudentID가 103인 학생의 주소를 '서울시 강북구'로 수정
UPDATE student set Address = '서울시 강북구' WHERE StudentID = 103;

-- 3. ProfessorName이 '박지훈'인 교수의 연락처를 '02-777-8888'로 수정
UPDATE professor set PhoneNumber = '02-777-8888' WHERE ProfessorName = '박지훈';

-- 4. 모든 학생의 이름과 그들이 신청한 클럽 이름을 출력(조인)
SELECT s.StudentName, c.ClubName FROM student s 
JOIN clubapplication c ON c.StudentID = s.StudentID;

-- 5. 특정 동아리(예: '체육')를 신청한 학생들의 이름, 전화번호, 그리고 동아리 이름을 출력(조인)
SELECT s.StudentName, s.PhoneNumber, c.ClubName FROM student s 
JOIN clubapplication c ON c.StudentID = s.StudentID
WHERE c.ClubName = '체육';