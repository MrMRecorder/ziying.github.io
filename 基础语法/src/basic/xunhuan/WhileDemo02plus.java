package basic.xunhuan;

import java.util.Scanner;

public class WhileDemo02plus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start_num; //范围左边界
        int end_num; //范围有边界
        int mod;    //倍数

        System.out.println("please enter start number:");
        start_num = sc.nextInt();
        System.out.println("please enter end number:");
        end_num = sc.nextInt();
        System.out.println("please enter mod:");
        mod = sc.nextInt();
        System.out.println("from\t" + start_num + "\tto\t" + end_num +"\thas:");
        while (start_num <= end_num) {
            if (start_num % mod == 0) {
                System.out.println(start_num);
            }
            start_num++;

        }
    }

}
