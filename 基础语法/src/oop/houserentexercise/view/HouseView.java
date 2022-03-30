package oop.houserentexercise.view;

import oop.houserentexercise.Utility;
import oop.houserentexercise.domain.House;
import oop.houserentexercise.service.HouseService;

public class HouseView {

    /*              项目界面
    12         1、主菜单---mainMenu
    13         2、新增房源---addHouse
    14         3、查找房源---findHouse
    15         4、删除房源---delHouse
    16         5、修改房源---updateHouse
    17         6、列出房源---listHouse
    18         7、退出程序---exit
    19         */
    boolean loop = true;
    String menuHead = "编号\t\t" + "房主姓名\t\t" + "联系电话\t\t" + "地址\t\t" + "月租费\t\t" + "状态(已出租/未出租)\t";
    House[] houses = new House[3];

    HouseService houseService = new HouseService(1, 1);

    public void mainMenu() {
        houses[0] = new House(1, "jack", "13703259980", "四社区C-417", 1500, "未出租");


        do {
            System.out.println("-------------------房屋出租系统--------------------");
            System.out.println("                   1、新增房源");
            System.out.println("                   2、查找房源");
            System.out.println("                   3、删除房源");
            System.out.println("                   4、修改房源");
            System.out.println("                   5、列出房源");
            System.out.println("                   6、退出程序");
            System.out.println("------------------------------------------------");
            System.out.print("请输入你的选择：");
            switch (Utility.readMenuSelection()) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }


        } while (loop);
        System.out.println("您已成功退出系统！");


    }

    public void exit() {
        char choice = ' ';
        while (true) {
            System.out.println("是否确认退出?（y/n）");
            choice = Utility.readChar();
            if (choice == 'n' || choice == 'y')
                break;
        }
        if (choice == 'y') {
            loop = false;
            return;
        }
        return;
    }

    public void listHouse() {

        System.out.println("=============房屋列表============");
        System.out.println(menuHead);
        houseService.list(houses);//得到所有房屋信息

        System.out.println("=============房屋列表显示完毕============");

    }

    public void addHouse() {
        System.out.println("===================添加房屋====================");
        System.out.print("编号：");
        int id = Utility.readInt();
        System.out.print("房主姓名：");
        String name = Utility.readString(4);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(20);
        System.out.print("月租：");
        int rentByMonth = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3, "未表明");
        House houseNew = new House(id, name, phone, address, rentByMonth, state);
        houses = houseService.add(houses, houseNew);//记得要把添加后的新数组重新赋值回去

    }

    public void delHouse() {


        System.out.print("请输入你要删除的房源的id号：");
        int id = Utility.readInt(10);
        houses = houseService.del(houses, id);


    }

    public void findHouse() {
        System.out.println("请输入你要查找的房源的id号");
        House houseFound = houseService.findById(houses, Utility.readInt());
        System.out.println("房源信息如下：\n" + menuHead + "\n" + houseFound);
    }

    public void updateHouse() {

        System.out.println("===================修改房屋====================");
        System.out.print("请输入你要修改的id编号");
        int updateNum = Utility.readInt(10);
        int updateIndex = houseService.findById_int(houses, updateNum);
        System.out.println("房源信息如下：+\n" + menuHead + "\n" + houses[updateIndex]);

        System.out.println("编号(" + houses[updateIndex].getId() + ")：");
        int id = Utility.readInt();
        System.out.print("房主姓名(" + houses[updateIndex].getName() + ")：");
        String name = Utility.readString(4);
        System.out.print("电话(" + houses[updateIndex].getPhone() + ")：");
        String phone = Utility.readString(11);
        System.out.print("地址(" + houses[updateIndex].getAddress() + ")：");
        String address = Utility.readString(20);
        System.out.print("月租(" + houses[updateIndex].getRentByMonth() + ")：");
        int rentByMonth = Utility.readInt();
        System.out.print("状态(" + houses[updateIndex].getState() + ")：");
        String state = Utility.readString(3, "未表明");
        houses[updateIndex] = new House(id, name, phone, address, rentByMonth, state);

    }


}


