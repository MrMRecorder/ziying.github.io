package oop.program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOop {

    boolean loop = true;//判断循环是否结束
    Date date = new Date();//显示日期
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-mm");//格式化日期
    Scanner scanner = new Scanner(System.in);
    String note = " ";//明细
    String detail ="-------------零钱明细----------------";
    double balance = 0; //余额
    double money = 0; //金额

    public void main(){
        do {

            System.out.println("=======欢迎使用记账本oop======");
            System.out.println("1.账单明细");
            System.out.println("2.进账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.println("请输入您的选择：1-4");
            System.out.println();
            char c = scanner.next().charAt(0);//用于接收用户选项
            switch (c) {

                case '1'://账单明细
                    this.detail();
                    break;

                case '2':
                    this.income();
                    break;
                case '3':
                    this.xiaofei();
                    break;
                case '4':
                    this.exit();

            }
        } while (loop);
        System.out.println("您已退出账本!");
    }

    public void detail(){
        System.out.println(detail);
        return;

    }
    public void income(){
        System.out.println("进账金额：");
        money = scanner.nextDouble();
        if (money<=0){
            System.out.println("请输入正确的金额！");
            return;
        }
        balance += money;
        System.out.println("明细：");
        note = scanner.next();
        detail += "\n收益入账:\t+"+money + "\t" + simpleDateFormat.format(date) + "\t" + note + "\t" + "余额：" + balance;
        return;
    }
    public void xiaofei(){
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        if (money>balance){
            System.out.println("余额不足");
            return;
        }
        balance -= money;
        System.out.println("明细：");
        note = scanner.next();
        detail += "\n 消费 :\t-"+money + "\t" + simpleDateFormat.format(date) + "\t" + note + "\t" + "余额：" + balance;
        return;

    }

    public void exit(){
        char choice=' ';
        while (true) {
            System.out.println("是否确认退出?（y/n）");
            choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'y')
                break;
        }
        if (choice == 'y') {
            loop = false;
            return;
        }
        return;
    }

}
