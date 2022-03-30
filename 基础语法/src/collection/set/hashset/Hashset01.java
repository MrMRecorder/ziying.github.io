package collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Hashset01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(set.add("111"));//true
        System.out.println(set.add("111"));//false
        System.out.println(set.add("222"));//true
        System.out.println(set.add("333"));//true
        System.out.println(set.add(new Dog("tom")));//true
        System.out.println(set.add(new Dog("tom")));//true
        System.out.println(set.add(new String("jack")));//true
        System.out.println(set.add(new String("jack")));//false
    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }
}
