package oop.override;

public class Test {

    public static void main(String[] args) {
//        Person p1= new Person("张三",56);
//        System.out.println(p1.say());
//        Student s1 = new Student("Along",21,"180950107",100);
//        System.out.println(s1.say());

        Person p1=new Student();
        Student p = (Student) p1;
        System.out.println(p.a);
//        属性看编译类型

    }

}
