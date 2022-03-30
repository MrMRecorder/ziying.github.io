package homework;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework01 {

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calc() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 1, 20);

        cellphone.testWork(new Calc() {
            @Override
            public double work(double n1, double n2) {return n1 * n2;}
        },6,9);
    }
}

interface Calc {
    double work(double n1, double n2);

}


class Cellphone {

    public double testWork(Calc calc, double n1, double n2) {
        double res = calc.work(n1, n2);
        System.out.println("结果：" + res);
        return res;

    }
}