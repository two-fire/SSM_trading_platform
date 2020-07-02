package com.itheima.ssm.service;

import com.itheima.ssm.domain.Order;
import com.itheima.ssm.domain.Orders;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface IOrdersService {
    //List<Orders> findAll() throws Exception;

    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(Integer ordersId) throws Exception;

    //void placeOrder(String orderNum, Timestamp orderTime, String orderDesc, Integer productId, Integer orderStatus, Integer memberId) throws Exception;
    void placeOrder(Order order) throws Exception;
}
