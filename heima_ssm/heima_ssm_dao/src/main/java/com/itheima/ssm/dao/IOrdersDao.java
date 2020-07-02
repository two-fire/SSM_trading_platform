package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import com.itheima.ssm.domain.Order;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface IOrdersDao {

    @Select("select * from orders")
    @Results({
            @Result(id = true, property = "id",column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productID",javaType = Product.class,one  = @One(select = "com.itheima.ssm.dao.IProductDao.findById"))
    })
    public List<Orders> findAll() throws Exception;

    //多表操作
    @Select("select * from orders where id=#{ordersId}")
    @Results({
            @Result(id = true, property = "id",column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "product", column = "productID",javaType = Product.class,one  = @One(select = "com.itheima.ssm.dao.IProductDao.findById")),
            @Result(property = "member", column = "memberId",javaType = Member.class,one = @One(select = "com.itheima.ssm.dao.IMemberDao.findById"))
    })
    public Orders findById(Integer ordersId) throws Exception;


    @Insert("insert into orders(orderNum,orderTime,orderDesc,productId,orderStatus,memberId) values(#{orderNum},#{orderTime},#{orderDesc},#{productId},#{orderStatus},#{memberId})")
    //void placeOrder(String orderNum, Timestamp orderTime, String orderDesc, Integer productId, Integer orderStatus, Integer memberId);
    void placeOrder(Order order);
}
