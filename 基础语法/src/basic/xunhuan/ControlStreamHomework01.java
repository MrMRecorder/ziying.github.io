package basic.xunhuan;

import test.While;

public class ControlStreamHomework01 {

    public static void main(String[] args) {
//初始10 0000元，>5 0000时没过一个路口扣 5% <= 5 0000 每个路口扣1000 输出通过的路口数
        double money = 100000;
        byte count = 0;
        while (true) {
            if (money > 50000) {
                money *= .95;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            }else{
                System.out.println("余额不足！");
                break;
            }
        }
        System.out.println("可以通过路口数：" + count + "剩：" + money);



    }


}
