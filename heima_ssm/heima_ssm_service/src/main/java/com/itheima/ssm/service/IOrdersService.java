package com.itheima.ssm.service;

import com.itheima.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {
    //List<Orders> findAll() throws Exception;

    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(Integer ordersId) throws Exception;

}
