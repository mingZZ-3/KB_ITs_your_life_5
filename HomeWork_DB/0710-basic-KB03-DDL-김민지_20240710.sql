----------------------- Q1 -----------------------
-- DROP SCHEMA shop4;
CREATE SCHEMA shop4;
USE shop4;

CREATE TABLE member (
	id VARCHAR(100) PRIMARY KEY NOT NULL,
    pw VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    tel VARCHAR(100)
);

INSERT INTO member VALUES('1', '1234', '김민지', '010-1234-5678');
INSERT INTO member VALUES('2', '5678', '김현진', '010-1234-5678');
INSERT INTO member VALUES('3', '9012', '김하늘', '010-1234-5678');

CREATE TABLE bbs (
	no INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(100),
    content VARCHAR(100),
    writer VARCHAR(100),
    FOREIGN KEY(writer) REFERENCES member(id) ON DELETE SET NULL
);

INSERT INTO bbs VALUES(default, 'haha', 'hohohohooh', '1');
INSERT INTO bbs VALUES(default, '하하', '호호호호호', '2');

CREATE TABLE reply (
	id VARCHAR(100) PRIMARY KEY NOT NULL,
	oriid INT,
	content VARCHAR(100),
	writer VARCHAR(100),
    FOREIGN KEY(oriid) REFERENCES bbs(no) ON DELETE CASCADE,
    FOREIGN KEY(writer) REFERENCES member(id) ON DELETE SET NULL
);

INSERT INTO reply VALUES('1', 1, 'what\'s funny?', '2');
INSERT INTO reply VALUES('2', 2, '뭐가 웃겨티비', '3');

----------------------- Q2 -----------------------
ALTER TABLE member MODIFY tel VARCHAR(50);
ALTER TABLE bbs DROP pwd;
ALTER TABLE bbs ADD (pwd VARCHAR(100) NOT NULL default '0000');

DESC member;
SELECT * FROM Information_schema.table_constraints WHERE table_schema = 'shop4';

SHOW TABLES;
SHOW DATABASES;

DROP TABLE reply;
DROP TABLE bbs;
DROP TABLE member;