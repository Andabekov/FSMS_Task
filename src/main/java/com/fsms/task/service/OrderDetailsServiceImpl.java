package com.fsms.task.service;

import com.fsms.task.dao.OrderDetailsDao;
import com.fsms.task.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Abu on 13.01.2019.
 */
@Service("orderDetailsService")
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsDao dao;

    public OrderDetails findById(int id) {
        return dao.findById(id);
    }

    public void saveOrderDetails(OrderDetails orderDetails) {
        dao.saveOrderDetails(orderDetails);
    }
}
