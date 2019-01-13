package com.fsms.task.dao;

import com.fsms.task.model.Orders;

/**
 * Created by Abu on 13.01.2019.
 */
public interface OrdersDao {

    Orders findById(int id);

    void saveOrder(Orders order);

    public void saveOrUpdate(Orders order);


}
