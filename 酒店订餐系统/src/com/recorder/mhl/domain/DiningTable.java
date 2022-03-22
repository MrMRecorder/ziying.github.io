package com.recorder.mhl.domain;

/**
 * @author 紫英
 * @version 1.0
 * @discription 餐桌JavaBean类
 */

/**
 * id int primary key auto_increment, #自增, 表示餐桌编号
 * state varchar(20) not null default '',#餐桌的状态
 * orderName varchar(50) not null default '',#预订人的名字
 * orderTel varchar(20) not null default ''
 */
public class DiningTable {

    private int id;
    private String state;
    private String orderName;
    private String orderTel;

    public DiningTable(int id, String state, String orderName, String orderTel) {
        this.id = id;
        this.state = state;
        this.orderName = orderName;
        this.orderTel = orderTel;
    }

    @Override
    public String toString() {
        return "\t\t" + id + "\t\t"+state;
    }

    public DiningTable() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderTel() {
        return orderTel;
    }

    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel;
    }
}
