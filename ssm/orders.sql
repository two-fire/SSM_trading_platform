-- 订单
use ssm;
CREATE TABLE orders(
  id INT PRIMARY KEY AUTO_INCREMENT,
  orderNum VARCHAR(20) NOT NULL UNIQUE,-- 订单编号
  orderTime timestamp, -- 下单时间
  orderDesc VARCHAR(500),-- 订单描述(其它信息)
  orderStatus INT, -- 订单状态(0 正在交易 1 交易成功)
  productId INT, -- 产品id 外键
  CONSTRAINT fk_ord_pro FOREIGN KEY (productId) REFERENCES product(id),
  memberId INT, -- 联系人id 外键
  CONSTRAINT fk_ord_mem FOREIGN KEY (memberId) REFERENCES member(id)
);
insert into ORDERS (id, ordernum, ordertime, orderdesc,  orderstatus, productid, memberid) VALUES
	(1, '12345', '1999-12-27 12:00:00',   '没什么',  1, 1, 2),
	(2, '54321', '1999-12-27 12:00:00',  '没什么',  1, 2, 2),
	(3, '67890', '1999-12-27 12:00:00',  '没什么', 1, 3, 2),
	(4, '98765', '1999-12-27 12:00:00',  '没什么', 1, 4, 2),
	(5, '11111', '1999-12-27 12:00:00',  '没什么',1, 5, 2),
	(6, '22222', '1999-12-27 12:00:00',  '没什么', 1, 6, 2),
	(7, '33333', '1999-12-27 12:00:00',  '没什么', 1, 7, 2),
	(8, '44444', '1999-12-27 12:00:00',  '没什么', 1, 8, 2),
	(9, '55555', '1999-12-27 12:00:00',  '没什么', 1, 9, 2);


