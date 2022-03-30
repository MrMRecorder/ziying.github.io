package basic.array;

import java.util.Scanner;

public class ArrayDemo014 {

    public static void main(String[] args) {
//数组缩减
        int [] num = {1,2,3,4,5};
        System.out.print("原数组：");
        for (int i = 0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("是否继续删除数据(y/n)");
            char c = sc.next().charAt(0);
            if (c=='n' ) //如果选择n则推出循环
            {
                break;
            }
            int [] num2 = new int[num.length - 1]; //定义一个长度为圆原数组-1的新数组

            for ( int i = 0;i <= num.length-2;i++){
//                接收0-length-2的数据
                num2[i]=num[i];
            }
            num = num2;
            if (num2.length == 1){
                //赋值完毕后再判断新数组长度是否为1
                System.out.println("无法继续缩减！");
                break;
            }




        }


        System.out.println("删除结束");
        System.out.print("新数组：");
        for (int i = 0;i<num.length;i++){
            System.out.print(num[i] + "\t");
        }

    }

}
