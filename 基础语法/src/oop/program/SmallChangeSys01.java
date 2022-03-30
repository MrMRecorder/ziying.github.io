package oop.program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys01 {

    public static void main(String[] args) {

        boolean loop = true;//判断循环是否结束
        Date date = new Date();//显示日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-mm");//格式化日期
        Scanner scanner = new Scanner(System.in);
        String note = " ";//明细
        String detail ="-------------零钱明细----------------";
        double balance = 0; //余额


        do {

            System.out.println("========================");
            System.out.println("=======欢迎使用记账本======");
            System.out.println("========================");
            System.out.println("1.账单明细");
            System.out.println("2.进账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.println("请输入您的选择：1-4");
            System.out.println();


            char c = scanner.next().charAt(0);//用于接收用户选项
            double money = 0; //金额

            switch (c) {

                case '1'://账单明细
                    System.out.println(detail);
                    break;
                case '2':
                    System.out.println("进账金额：");
                    money = scanner.nextDouble();
                    if (money<=0){
                        System.out.println("请输入正确的金额！");
                        break;
                    }
                    balance += money;
                    System.out.println("明细：");
                    note = scanner.next();
                    detail += "\n收益入账:\t+"+money + "\t" + simpleDateFormat.format(date) + "\t" + note + "\t" + "余额：" + balance;
                    break;
                case '3':
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    if (money>balance){
                        System.out.println("余额不足");
                        break;
                    }
                    balance -= money;
                    System.out.println("明细：");
                    note = scanner.next();
                    detail += "\n 消费 :\t-"+money + "\t" + simpleDateFormat.format(date) + "\t" + note + "\t" + "余额：" + balance;
                    break;
                case '4':

                    char choice=' ';
                    while (true) {
                        System.out.println("是否确认退出?（y/n）");
                        choice = scanner.next().charAt(0);
                        if (choice == 'n' || choice == 'y')
                            break;
                    }
                    if (choice == 'y') {
                        loop = false;
                        break;
                    }

            }


        } while (loop);
        System.out.println("您已退出账本!");


    }


}
