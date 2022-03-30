package generic;

import java.util.ArrayList;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Generic01 {
    public static void main(String[] args) {

        ArrayList<Dog_> arrayList = new ArrayList<Dog_>();
        arrayList.add(new Dog_("旺财",5));
        arrayList.add(new Dog_("大黄",3));
        //这时如果程序员不小心添加了一只猫
//        arrayList.add(new Cat("咪咪",2));
        //遍历
        for (Dog_ d : arrayList) {
            System.out.println("名字：" + d.getName() +" "+ "年龄："
                    + d.getAge());

        }
    }
}
class Dog_ {
    String name;
    int age;

    @Override
    public String toString() {
        return "Dog_{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog_(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Cat{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
