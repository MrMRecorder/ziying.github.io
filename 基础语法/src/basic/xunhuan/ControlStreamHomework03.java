package basic.xunhuan;

import java.util.Scanner;

public class ControlStreamHomework03 {

    public static void main(String[] args) {

        //判断水仙花数 —— 三位数的各位数字之和等于它本身
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数字：");
//        int num = sc.nextInt();

        int i = 100;
        while ( i < 1000){
            int n1 = i / 100;
            int n2 = i  /10% 10;
            int n3 = i % 10;
            if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3*n3 ==i){
                System.out.println(i + "是水仙花数");
            }
//            else{
//                System.out.println(i + "不是水仙花数");
//            }
            i++;

        }






    }



}
