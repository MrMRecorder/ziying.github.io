package oop;

import java.util.Scanner;

public class Method01 {

    public static void main(String[] args) {

//        int [] array = {1,2,3,4,5};
//
//        Person zhangsan = new Person();
//        zhangsan.speak();
//        System.out.println(zhangsan.cal01());
//        System.out.println(zhangsan.cal02(1000));

//        System.out.println(zhangsan.getSum(5,6));
//        zhangsan.tool(array);
//        AA a = new AA();
//        if (a.ifOdd(51)){
//            System.out.println("奇数");
//        }else {
//            System.out.println("偶数");
//        }
        AA b = new AA();
        Swap sp = new Swap();

        sp.a = 10;
        sp.b = 20;
        System.out.println("num1:" + sp.a + "\t" + "num2:" + sp.b);
        b.swap(sp);
        System.out.println("num1:" + sp.a + "\t" + "num2:" + sp.b);


    }


}


class Swap {
    int a;
    int b;

}

class AA {


    public void swap(Swap sp) {
        //通过返回对象的方式来实现真正的交换
        int temp = sp.b;

        sp.b = sp.a;
        sp.a = temp;


    }

    public boolean ifOdd(int n) {

        return n % 2 != 0;
    }

    public void print(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print('c');
            }
            System.out.println();
        }
    }

}


class Person {

    int age;
    String name;



    public void speak() {
        System.out.println("hello!");
    }

    public int cal01() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        return sum;
    }

    public int cal02(int a) {
        int sum = 0;
        int i = 1;
        while (i <= a) {
            sum += i;
            i++;
        }
        return sum;
    }

    public int getSum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    //    遍历数组
    public void tool(int[] arrays) {

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "\t");
        }
    }


}

