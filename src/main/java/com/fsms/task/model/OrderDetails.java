package com.fsms.task.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Abu on 13.01.2019.
 */
@Entity
@Table(name="order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min=1, max=11)
    @Column(name = "month", nullable = false)
    private int month;

    @NotNull
    @Size(min=1, max=11)
    @Column(name = "count", nullable = false)
    private int count;

    @NotNull
    @Size(min=1, max=11)
    @Column(name = "order_id", nullable = false)
    private int order_id;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
}
