package com.recorder.mhl.domain;

/**
 * @author 紫英
 * @version 1.0
 * @discription 账单类
 */

import java.util.Date;

/**
 * id int primary key auto_increment, #自增主键
 * billId varchar(50) not null default '',#账单号可以按照自己规则生成 UUID
 * menuId int not null default 0,#菜品的编号, 也可以使用外键
 * nums SMALLINT not null default 0,#份数
 * money double not null default 0, #金额
 * diningTableId int not null default 0, #餐桌
 * billDate datetime not null ,#订单日期
 * state varchar(50) not null default '' # 状态 '未结账' , '已经结账', '挂单'
 */
public class Bill {

    private int id;
    private String menuId;
    private String billId;
    private int nums;
    private double money;
    private int diningTableId;
    private Date billDate;
    private String state;

    public Bill() {
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", menuId='" + menuId + '\'' +
                ", billId='" + billId + '\'' +
                ", nums=" + nums +
                ", money=" + money +
                ", diningTableId=" + diningTableId +
                ", billDate=" + billDate +
                ", state='" + state + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getDiningTableId() {
        return diningTableId;
    }

    public void setDiningTableId(int diningTableId) {
        this.diningTableId = diningTableId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Bill(int id, String menuId, String billId, int nums, double money, int diningTableId, Date billDate, String state) {
        this.id = id;
        this.menuId = menuId;
        this.billId = billId;
        this.nums = nums;
        this.money = money;
        this.diningTableId = diningTableId;
        this.billDate = billDate;
        this.state = state;
    }
}
