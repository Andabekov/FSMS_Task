package com.fsms.task.dao;

import com.fsms.task.model.OrderDetails;

/**
 * Created by Abu on 13.01.2019.
 */
public interface OrderDetailsDao {

    OrderDetails findById(int id);

    void saveOrderDetails(OrderDetails orderDetails);

    public void saveOrUpdate(OrderDetails orderDetails);
}
