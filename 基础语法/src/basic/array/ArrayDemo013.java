package basic.array;

import java.util.Scanner;

public class ArrayDemo013 {

    public static void main(String[] args) {
//数组扩容
        int [] num = {1,2,3,4,5,6};
        System.out.print("原数组：");
        for (int i = 0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);


        while (true){

            System.out.println("是否继续添加数据(y/n)");
            char c = sc.next().charAt(0);
            if (c=='n')
                break;

            int [] num2 = new int[num.length + 1];
            for ( int i = 0;i <= num.length-1;i++){
                num2[i]=num[i];
            }
            System.out.println("请输入新数据：");
            int newarr = sc.nextInt();
            num2[num.length]= newarr;
            num = num2;

        }


        System.out.println("添加结束");
        System.out.print("新数组：");
        for (int i = 0;i<num.length;i++){
            System.out.print(num[i] + "\t");
        }

    }

}
