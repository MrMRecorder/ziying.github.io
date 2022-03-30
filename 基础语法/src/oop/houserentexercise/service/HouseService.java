package oop.houserentexercise.service;

import oop.houserentexercise.domain.House;

public class HouseService {


    private int houseNums = 1; //记录当前有多少个房屋信息
//    private int idCounter = 1; //记录当前的id增长到哪个值

    public HouseService(int houseNums, int idCounter) {
        this.houseNums = houseNums;
//        this.idCounter = idCounter;
    }


    public void list(House[] houses) {
        for (int i = 0; i < houses.length; i++) {//大家想想，这里老韩有什么？雷,坑
            if (houses[i] == null) {//如果为null,就不用再显示了
                break;
            }
            System.out.println(houses[i]);
        }

    }

    public House[] add(House[] houses, House house) {

        if (houseNums == houses.length) {

            House[] num = new House[houses.length + 1];
            for (int i = 0; i < houses.length; i++) {
                num[i] = houses[i];
            }
            num[houses.length] = house;
            houses = num;
            System.out.println(houses[houseNums] + "添加成功！");
            houseNums++;
        } else {
            houses[houseNums] = house;
            houseNums++;
        }
        return houses;

    }

    public House[] del(House house[], int id) {
        House[] delhouse = new House[house.length-1];
        for (int i = id; i < house.length; i++) {
            if (house[i].getId() == id) {
                house[i] = null;
                break;
            }
        }
        for (int i = 0; i < id; i++) {
            delhouse[i]=house[i];
            }
        for (int i = id; i < house.length; i++) {
            delhouse[i-1]=house[i];
        }
            house=delhouse;
        return house;
        }




    public House findById(House[] houses, int id) {
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (id== (houses[i].getId())) {//能用equals就用
                index = i;
                break;
            }
        }
        return houses[index];
    }

    public int findById_int(House[] houses, int updateNum) {
        int index=0;
        for (int i = 0; i < houses.length; i++) {
            if (updateNum== (houses[i].getId())) {//能用equals就用
                index = i;
                break;
            }
        }
        return index;

    }
}





