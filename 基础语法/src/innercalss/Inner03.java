package innercalss;

//静态内部类

public class Inner03 {

    public static void main(String[] args) {
        //因为是静态，所以可以通过类名直接访问
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        inner2.say();

    }
}

class Outer2 {

    private int age = 18;
    static String name = "zhansgan";

    static class Inner2 {
        private int n1 = 20;
        public void say() {
            System.out.println(" name:" + name);
        }
    }

}