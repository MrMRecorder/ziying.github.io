package oop;

public class Homework05 {

    public static void main(String[] args) {


        Circle c1 = new Circle(3);
        c1.s();
//        Circle c2 = new Circle(3.2);

    }


}

class Circle{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public void d(){

        System.out.println("周长："+Math.PI*2*this.r);


        //一个最接近Π的数值

    }
    public void s(){

        System.out.println("面积："+Math.PI*this.r*this.r);


    }

}
