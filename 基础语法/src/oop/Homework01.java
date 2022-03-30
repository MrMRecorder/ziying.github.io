package oop;

public class Homework01 {

    public static void main(String[] args) {
        double[] array = {};
        A01 a = new A01();
        Double res = a.max(array);
        if (res != null) {
            System.out.println("最大值为：" + res);
        } else {
            System.out.println("数组类型有误！");
        }
    }
}

class A01 {

    public Double max(double[] array) {
        if (array != null && array.length > 0) {

            double max = 0;
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        } else {
            return null;
        }
    }

}
