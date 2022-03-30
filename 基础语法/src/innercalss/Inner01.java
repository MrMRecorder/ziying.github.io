package innercalss;

public class Inner01 {
//    匿名内部类最佳实现——当做实参直接传递

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
//        这里传递的是实现了Bell接口的匿名内部类
//        这个匿名内部类重写了ring()方法
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床啦！");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课啦！");
            }
        });

        A a = new A();
        cellphone.alarmclock(a);//多态 a是实现了bell接口的类的对象

    }

}

interface Bell {

    void ring();
}

class Cellphone {

    public void alarmclock(Bell bell) {
        bell.ring();
    }

}

class A implements Bell{
    @Override
    public void ring() {
        System.out.println("传统方法");
    }
}