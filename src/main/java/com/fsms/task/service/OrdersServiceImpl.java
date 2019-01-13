package com.fsms.task.service;

import com.fsms.task.dao.OrdersDao;
import com.fsms.task.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Abu on 13.01.2019.
 */
@Service("ordersService")
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao dao;

    public Orders findById(int id) {
        return dao.findById(id);
    }

    public void saveOrder(Orders order) {
        dao.saveOrder(order);
    }

    public void updateOrderStatus(int id, int status) {
        dao.updateOrderStatus(id,status);
    }
}
