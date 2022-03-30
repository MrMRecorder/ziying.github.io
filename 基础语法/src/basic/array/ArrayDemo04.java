package array;

import java.util.Arrays;

//Arrays类
public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] a = {5, 874, 9, 4, 7, 1, 73, 45, 8};
        System.out.println(Arrays.toString(a));//toString方法打印数组
        Arrays.sort(a);//排序
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 2,4,0);//数组填充
        System.out.println(Arrays.toString(a));
    }
}

