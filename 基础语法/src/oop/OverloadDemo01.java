package oop;

public class OverloadDemo01 {
//方法重载

    public static void main(String[] args) {
        Method m1 = new Method();
//        m1.m(5);
//        m1.m(5, 6);
//        m1.m("shabi");

        m1.max(5.6, 9.7, 45.8);

    }

}


class Method {

    public void m(int i) {
        System.out.println(i * i);
    }

    public void m(int i, int j) {
        System.out.println(i * j);
    }

    public void m(String s) {
        System.out.println(s);
    }

    public void max(int i, int j) {
//return i>j ? i :j; 老师方法
        if (i > j) {
            System.out.println("max:" + i);
        } else if (i < j) {
            System.out.println("max:" + j);
        } else {
            System.out.println("i=j");
        }
    }

    public void max(double i, double j) {

        if (i > j) {
            System.out.println("max:" + i);
        } else if (i < j) {
            System.out.println("max:" + j);
        } else {
            System.out.println("i=j");
        }
    }

    public void max(double i, double j, double k) {

        double d1 = swap(i, j);
        double d2 = swap(d1, k);
        System.out.println("max:" + d2);


    }

    public int swap(int i, int j) {
        if (i < j) {
            int temp;
            temp = j;
            j = i;
            i = temp;
        }
        return i;
    }

    public double swap(double i, double j) {
        if (i < j) {
            double temp;
            temp = j;
            j = i;
            i = temp;
        }
        return i;
    }


}