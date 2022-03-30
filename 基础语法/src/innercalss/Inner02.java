package innercalss;

//成员内部类

public class Inner02 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.out();
        //外部其他类使用成员内部类第一种方法
        Outer1.Inner1 inner1 = outer1.new Inner1();

        //外部其他类使用成员内部类第二种方法
        outer1.getInner1().say();
    }
}


class Outer1 {

    private int age = 18;
    private int n1 = 10;
    private String name = "zhansgan";

    class Inner1 {
        private int n1 = 20;
        public void say() {
            System.out.println("age:" + age + " name:" + name+
                    " inner.n1="+n1+" outer.n1="+Outer1.this.n1);
        }
    }

    public void out() {
        Inner1 inner1 = new Inner1();
        inner1.say();
    }
    //外部其他类使用成员内部类第二种方法
    public Inner1 getInner1(){
        return new Inner1();
    }


}