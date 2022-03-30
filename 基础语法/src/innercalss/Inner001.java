package innercalss;

//基于类的匿名内部类

public class Inner001 {

    public static void main(String[] args) {
        Test test = new Test();
        test.f1();
    }
}

class Test{
    private int a=100;
    public void f1(){
        new Father("jack"){
            private int a=200;

            @Override
            public void say() {
                System.out.println(Test.this.a);
            }
        }.say();
    }
}

class Father{
    private String name;


    public Father(String name) {
        this.name = name;
    }
    public void say(){
        System.out.println("name="+this.name);
        System.out.println("a="+this.name);
    }


}