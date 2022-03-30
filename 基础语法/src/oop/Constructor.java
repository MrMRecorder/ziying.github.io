package oop;

public class Constructor {

    public static void main(String[] args) {
        Person01 p1 = new Person01(23,"zhangsan");
        Person01 p2 = new Person01(45,"lisi");
        System.out.println("p1、p2的比较结果："+p1.compareTo(p2));
    }

}

class Person01 {
    int age;
    String name;

    public Person01(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public boolean compareTo(Person01 p){
        return this.name==p.name && this.age ==p.age;
    }
}
