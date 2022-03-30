package collection.set.linkedhashset;

import java.util.LinkedHashSet;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class LinkedHashset01 {
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(new String("AAA"));
        ls.add(456);
        ls.add(456);
        ls.add(new Dog("tom"));
        ls.add("hello world");
        System.out.println(ls);
    }
}
class Dog{
    String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public Dog(String name) {
        this.name = name;
    }
}