package com.itheima.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.itheima.ssm.dao.IOrdersDao;
import com.itheima.ssm.domain.Order;
import com.itheima.ssm.domain.Orders;
import com.itheima.ssm.service.IOrdersService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;

    @Override
//    public void placeOrder(String orderNum, Timestamp orderTime, String orderDesc, Integer productId, Integer orderStatus, Integer memberId) throws Exception {
//        ordersDao.placeOrder(orderNum,orderTime,orderDesc,productId,orderStatus,memberId);
//    }
    public void placeOrder(Order order) throws Exception{
        ordersDao.placeOrder(order);
    }

    @Override
    public List<Orders> findAll(int page,int size) throws Exception {

        //pageNum页码值，pageSize每页显示条数
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }


    @Override
    public Orders findById(Integer ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}
