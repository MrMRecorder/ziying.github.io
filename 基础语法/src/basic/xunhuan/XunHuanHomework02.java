package basic.xunhuan;

import java.util.Scanner;

public class XunHuanHomework02 {

    public static void main(String[] args) {

//空心金字塔
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入空心金字塔层数：");
        int level = sc.nextInt();
        for (int j = 1; j <= level; j++){

            for (int k = 1; k <= level-j ; k++){
                System.out.print(" ");//每行前面加空格
            }


            for (int i = 1; i <= 2 * j - 1; i ++) {
                if (i == 1 || i == 2*j - 1 ||j == level ){
//                    只在首尾和最后一行打印*
                    System.out.print("*");
                }else{
//                    其余打印空格
                    System.out.print(" ");
                }

            }
            System.out.println();


        }





    }
}
