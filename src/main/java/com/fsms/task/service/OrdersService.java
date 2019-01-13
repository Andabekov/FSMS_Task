package com.fsms.task.service;

import com.fsms.task.model.Orders;

/**
 * Created by Abu on 13.01.2019.
 */
public interface OrdersService {

    Orders findById(int id);

    void saveOrder(Orders order);

    void updateOrderStatus(int id, int status);

}
