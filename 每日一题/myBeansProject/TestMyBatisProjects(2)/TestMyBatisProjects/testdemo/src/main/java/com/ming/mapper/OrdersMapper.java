package com.ming.mapper;

import com.ming.po.Orders;
import com.ming.po.OrdersEx;

import java.util.List;

public interface OrdersMapper {

    public List<OrdersEx> queryOrderToUser()throws Exception;

    public List<Orders> queryOrderToUser2()throws Exception;

    public List<Orders> queryOrderToOrderdetail() throws Exception;

    public List<Orders> queryOrderToItems() throws Exception;
}
