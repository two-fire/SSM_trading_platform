USE ssm;
CREATE TABLE product(  
id INT  PRIMARY KEY AUTO_INCREMENT,  
productNum VARCHAR(50) NOT NULL,  
productName VARCHAR(50),  
tradeTime timestamp,  
productPrice DOUBLE,  
productDesc VARCHAR(500),  
productStatus INT 
);
 
INSERT INTO `product`(`id`, `productNum`, `productName`, `tradeTime`, `productPrice`, `productDesc`, `productStatus`) VALUES (1, 'itcast-002', '书本', '2000-12-17 12:32:03', 1200, '红色新', 1);
INSERT INTO `product`(`id`, `productNum`, `productName`, `tradeTime`, `productPrice`, `productDesc`, `productStatus`) VALUES (2, 'itcast-003', '个人志', '2000-12-22 11:22:02', 1800, '颓大出品', 0);
INSERT INTO `product`(`id`, `productNum`, `productName`, `tradeTime`, `productPrice`, `productDesc`, `productStatus`) VALUES (3, 'itcast-001', '《软件工程》', '2001-12-01 13:10:00', 1200, '全新', 1);
INSERT INTO `product`( `productNum`, `productName`, `tradeTime`, `productPrice`, `productDesc`, `productStatus`) VALUES ( 'itcast-101', 'Nike', '2001-12-01 13:10:00', 1200, '全新', 1);
INSERT INTO `product`( `productNum`, `productName`, `tradeTime`, `productPrice`, `productDesc`, `productStatus`) VALUES ('itcast-011', 'Nike', '2001-12-01 13:10:00', 1200, '全新', 1);

