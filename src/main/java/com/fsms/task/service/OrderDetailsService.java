package com.fsms.task.service;

import com.fsms.task.model.OrderDetails;

/**
 * Created by Abu on 13.01.2019.
 */
public interface OrderDetailsService {

    OrderDetails findById(int id);

    void saveOrderDetails(OrderDetails orderDetails);
}
