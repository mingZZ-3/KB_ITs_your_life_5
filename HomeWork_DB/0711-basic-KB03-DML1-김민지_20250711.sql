---------------------------- Q1 ----------------------------
drop schema shop6;
create schema shop6;
use shop6;

create table product3 (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30),
    content VARCHAR(30),
    price INT,
    company VARCHAR(30),
    img VARCHAR(30)
);

select * from product3 order by price;
select name, content, price from product3 order by company desc;
select distinct company from product3;
select (price * 5) as price5 from product3;
select name, company from product3 where price = 5000;
select name, price, company from product3 where price between 3000 and 6000;
select company, name from product3 where not company = 'c100';
select * from product3 where name like '%4';
select * from product3 where content like '%food%';
update product3 set content = 'sold out' where price = 5000;
update product3 set img = 'o.png', price = 10000 where id = '100' or id = '102';
delete from product3 where company = 'c100';
delete from product3;
drop table product3;

------------------------------------------------------------
---------------------------- Q2 ----------------------------
create table productOrder (
	id VARCHAR(100) PRIMARY KEY COMMENT '아이디',
    title VARCHAR(100) NOT NULL COMMENT '제품 이름',
    price INT COMMENT '제품 가격',
    buydate DATETIME default now() COMMENT '제품 구매일',
    addr VARCHAR(200) default 'home' NOT NULL COMMENT '제품 배송 주소'
);

INSERT INTO productOrder VALUES('100', 'hat', 1000, default, 'office');
INSERT INTO productOrder VALUES('200', 'mouse', 2000, default, null);	-- 주소 값 not null
INSERT INTO productOrder VALUES('300', 'pen', null, default, null);	-- 주소 값 not null

select * from productOrder;
