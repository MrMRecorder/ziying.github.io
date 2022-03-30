package innercalss;
//基于接口的匿名内部类
public class Inner0 {

    public static void main(String[] args) {
//        Car car = new Car();
//        car.m1();
    }
}


class Car{
    public void m1(){
        IA ia=new IA(){
            @Override
            public void say() {
                System.out.println("匿名内部类重写");
            }
        };
        ia.say();
        System.out.println("ia运行类型："+ia.getClass());//class innercalss.Car$1
    }
}

interface IA{
    void say();
}


    /**底层 会分配类名：Car$1
     *
     * class Car$1 implements IA{
     * @Override
     * public void say() {
     *    System.out.println("匿名内部类重写");
     * }
     *     }
     *jdk底层在创建匿名内部类Car$1的时候马上就创建了Car$1实例
     * 并且将地址返回给给 ia
     */

