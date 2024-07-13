------------------------------------------------
---------------------- Q2 ----------------------
CREATE SCHEMA kbdb;
-- DROP SCHEMA kbdb;
USE kbdb;

CREATE TABLE product (
	productName VARCHAR(4) NOT NULL COMMENT '제품 이름',
	cost INT NOT NULL COMMENT '가격',
	makeDate DATE COMMENT '제조일자',
	company VARCHAR(5) COMMENT '제조회사',
	amount INT NOT NULL COMMENT '남은 수량'
);

CREATE TABLE member2 (
	memberID VARCHAR(8) NOT NULL COMMENT '아이디',
    memberName VARCHAR(5) NOT NULL COMMENT '회원 이름',
    memberAddress VARCHAR(20) COMMENT '주소'
);

------------------------------------------------
---------------------- Q3 ----------------------

CREATE SCHEMA shop2;
-- DROP SCHEMA shop2;
USE shop2;

CREATE TABLE member (
	memberID VARCHAR(45) NOT NULL,
	memberPW VARCHAR(45) NOT NULL,
    PRIMARY KEY(memberID)
);

SELECT * FROM member;
INSERT INTO member VALUES('100', '100');
COMMIT;

-- shop3에 백업 --
CREATE SCHEMA shop3;
DROP SCHEMA shop3;
USE shop3;

-- 백업 sql 파일 복사
DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `memberID` varchar(45) NOT NULL,
  `memberPW` varchar(45) NOT NULL,
  PRIMARY KEY (`memberID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `member` WRITE;
INSERT INTO `member` VALUES ('100','100');
UNLOCK TABLES;
----
select * from member;