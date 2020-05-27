use ssm;
-- 用户表
CREATE TABLE users(
id INT  PRIMARY KEY AUTO_INCREMENT,  
email varchar(50) NOT NULL UNIQUE,
username varchar(50),
PASSWORD varchar(50),
phoneNum varchar(20),
STATUS INT
);
insert into users(email,username,password,phoneNum,status) values('1@cn','si','123','12333',1)
-- 角色表
CREATE TABLE role(
id INT NOT NULL UNIQUE AUTO_INCREMENT,  
roleName varchar(50) ,
roleDesc varchar(50)
);

-- 用户角色关联表
CREATE TABLE users_role(
userId INT ,
roleId INT ,
PRIMARY KEY(userId,roleId),
FOREIGN KEY (userId) REFERENCES users(id),
FOREIGN KEY (roleId) REFERENCES role(id)
);

-- 资源权限表
CREATE TABLE permission(
id INT  PRIMARY KEY AUTO_INCREMENT,  
permissionName varchar(50) ,  -- 权限名
url varchar(50) -- 资源路径
);

-- 角色权限关联表
CREATE TABLE role_permission(
permissionId INT,
roleId INT,
-- 复合主键，同一角色不能对同一权限拥有多次
PRIMARY KEY(permissionId,roleId), 
FOREIGN KEY (permissionId) REFERENCES permission(id),
FOREIGN KEY (roleId) REFERENCES role(id)
)
insert into users values(1,'zhangsan@NJUPT.edu.cn','张三','123','12123212121',1);
insert into users values(2,'lisi@NJUPT.edu.cn','李四','123','12113212121',1);
insert into users values(3,'wangwu@NJUPT.edu.cn','王五','123','1211321288',0);
insert into role values(2,'ADMIN','普通用户');
insert into role values(1,'ROOT','管理员');
insert into users_role values(1,2);
insert into users_role values(2,1);
insert into users_role values(3,2);
select * from role where id in (select roleId from users_role where userId=2);
select * from role where id in (select roleId from users_role where userId=3);
-- update users set password='$2a$10$tJHudmJh6MRPdiL7mv0yfe0nZJbDHuhl7sSTnqNC4DauMik9ppi4K' where id = '3';

insert into permission(permissionName, url) values('user findAll', '/user/findAll.do');
insert into permission(permissionName, url) values('user findById', '/user/findById.do');
select * from permission;
insert into role_permission values(1,1);
insert into role_permission values(2,1);
insert into role_permission values(2,2);
select * from role_permission;
-- select * from permission where id in (select permissionId from role_permission where roleId=1)