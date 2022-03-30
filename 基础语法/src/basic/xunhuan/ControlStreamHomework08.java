package basic.xunhuan;

import java.util.Scanner;

public class ControlStreamHomework08 {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("请输入范围:");
        long num = sc.nextLong();

        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }

        }

    }


}
