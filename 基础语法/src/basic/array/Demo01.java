package basic.array;

import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args)
    {

        int sum=0;
        int arr[][]={{1,2},{3,4}};
        for (int i[]:arr)
        {
            for (int j:i)
            {
                System.out.println(j+"");
                sum+=j;
            }
            System.out.println();
        }
        System.out.println("数组之和为："+sum);

    }

    /*
    修饰符 返回值类型 方法名（...）{
    方法体
    return 返回值；
    }
     */

    //return 结束方法，返回一个结果 注意和break的区别

//    public String helloWorld(){
//        return "Hello,World!";
//    }
//    public int max(int a,int b){
//        return a>b ? a:b;//三元运算符 a>b返回a否则返回b
//
//    }
}
