package oop.houserentexercise.domain;

public class House {

    private int id;//编号
    private String name;//房主姓名
    private String phone;//电话
    private String address;//地址
    private int rentByMonth;//月租
    private String state;//状态

    public House(int id, String name, String phone, String address, int rentByMonth, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rentByMonth = rentByMonth;
        this.state = state;
    }


    @Override
    public String toString() {
        return (getId() + "\t\t"
                + getName() + "\t"
                + getPhone() + "\t\t"
                + getAddress() + "\t"
                + getRentByMonth() + "\t\t"
                + getState());
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRentByMonth() {
        return rentByMonth;
    }

    public void setRentByMonth(int rentByMonth) {
        this.rentByMonth = rentByMonth;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
