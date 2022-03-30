package basic.xunhuan;

import java.time.Year;
import java.util.Scanner;

public class DoWhile01 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char answer = ' ';
            do {
                System.out.println("还不还钱！(y/n)");

                answer = sc.next().charAt(0);
                System.out.println("你的回答：" + answer);

            } while (answer != 'y');

            System.out.println("放你一马");
    }

}



