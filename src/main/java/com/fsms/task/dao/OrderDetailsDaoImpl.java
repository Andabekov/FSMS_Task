package com.fsms.task.dao;

import com.fsms.task.model.OrderDetails;
import org.springframework.stereotype.Repository;

/**
 * Created by Abu on 13.01.2019.
 */
@Repository("orderDetailsDao")
public class OrderDetailsDaoImpl extends AbstractDao<Integer, OrderDetails> implements OrderDetailsDao {

    public OrderDetails findById(int id) {
        return getByKey(id);
    }

    public void saveOrderDetails(OrderDetails orderDetails) {
        persist(orderDetails);
    }

    public void saveOrUpdate(OrderDetails orderDetails){
        super.saveOrUpdate(orderDetails);
    }

}
