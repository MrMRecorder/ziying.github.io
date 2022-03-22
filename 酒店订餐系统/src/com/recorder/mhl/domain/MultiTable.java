package com.recorder.mhl.domain;

import java.util.Date;

/**
 * @author 紫英
 * @version 1.0
 * @discription bill和menu的联合查询javabean
 */
public class MultiTable {

    private int id;
    private String menuId;
    private String billId;
    private int nums;
    private double money;
    private int diningTableId;
    private Date billDate;
    private String state;
    private String name;
    private String type;
    private double price;

    @Override
    public String toString() {
        return "MultiTable{" +
                "id=" + id +
                ", menuId='" + menuId + '\'' +
                ", billId='" + billId + '\'' +
                ", nums=" + nums +
                ", money=" + money +
                ", diningTableId=" + diningTableId +
                ", billDate=" + billDate +
                ", state='" + state + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MultiTable(int id, String menuId, String billId, int nums, double money, int diningTableId, Date billDate, String state, String name, String type, double price) {
        this.id = id;
        this.menuId = menuId;
        this.billId = billId;
        this.nums = nums;
        this.money = money;
        this.diningTableId = diningTableId;
        this.billDate = billDate;
        this.state = state;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public MultiTable() {
    }
}
