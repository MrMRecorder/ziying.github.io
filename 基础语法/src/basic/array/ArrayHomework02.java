package basic.array;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class ArrayHomework02 {
//数组插入数据，并保持 插入后数组保持升序
    public static void main(String[] args) {

        int [] array = new int[10];
        int sum = 0;
        int max = 0;
        int index = 0;
        boolean flag = true;
        for (int i=0;i<array.length;i++){
            array[i]=(int) (Math.random()*100+1);
            sum += array[i];
            if (max < array[i]){
                max = array[i];
                index = i;
            }
        }

        System.out.println("原数组：");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] +"\t");
        }
        System.out.println();
        System.out.println("原数组和为："+sum+"平均数为："+sum/10+"最大值为："+max + "最大值下标"+ index);
        System.out.println("原数组倒序：");
        int [] num2 = new int[array.length];
        for ( int i = array.length-1;i >= 0;i--){
            num2[i]=array[array.length-1-i];
        }
        array=num2;//将num指向num2
        for (int i=0;i<array.length;i++){
            if (array[i]==8)flag=false;
            System.out.print(array[i] +"\t");
        }
        if (flag) System.out.println("数组不含8");

    }
}
