package com.fsms.task.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Abu on 13.01.2019.
 */
@Entity
@Table(name="orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min=1, max=11)
    @Column(name = "order_number", nullable = false)
    private int order_number;

    @NotNull
    @Size(min=3, max=50)
    @Column(name = "author", nullable = false)
    private String author;

    @NotNull
    @Size(min=1, max=11)
    @Column(name = "status", nullable = false)
    private int status;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_number() {
        return order_number;
    }
    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

}
