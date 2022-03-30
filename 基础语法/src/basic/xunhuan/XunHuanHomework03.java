package basic.xunhuan;

import java.util.Scanner;

public class XunHuanHomework03 {

    public static void main(String[] args) {

//空心菱形
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入空心菱形塔层数：");
        int level = sc.nextInt();
        for (int j = 1; j <= level; j++){

            for (int k = 1; k <= level-j ; k++){
                System.out.print(" ");
            }


            for (int i = 1; i <= 2 * j - 1; i ++) {
                if (i == 1 || i == 2*j - 1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();


        }
        for (int j = level-1; j >= 0; j--){

            for (int k = 0; k <= level-1-j ; k++){
                System.out.print(" ");
            }


            for (int i = 1; i <= 2 * j - 1; i ++) {
                if (i == 1 || i == 2*j - 1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();


        }





    }
}
