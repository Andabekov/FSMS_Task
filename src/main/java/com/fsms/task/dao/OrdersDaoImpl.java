package com.fsms.task.dao;

import com.fsms.task.model.Orders;
import org.springframework.stereotype.Repository;

/**
 * Created by Abu on 13.01.2019.
 */
@Repository("ordersDao")
public class OrdersDaoImpl extends AbstractDao<Integer, Orders> implements OrdersDao{

    public Orders findById(int id) {
        return getByKey(id);
    }

    public void saveOrder(Orders order) {
        persist(order);
    }

    public void saveOrUpdate(Orders order){
        super.saveOrUpdate(order);
    }

}
