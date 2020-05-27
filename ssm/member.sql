use ssm;
CREATE TABLE member(
	id INT PRIMARY KEY AUTO_INCREMENT,   
	NAME VARCHAR(20),       
	nickname VARCHAR(20),       
	phoneNum VARCHAR(20),       
	email VARCHAR(20)   
	); 
insert into MEMBER (id, name, nickname, phonenum, email) values (1, '张三', '小三', '18888888888', 'zs@163.com');
insert into MEMBER (id, name, nickname, phonenum, email) values (2, '李四', '小二', '16666688888', 'ls@163.com');