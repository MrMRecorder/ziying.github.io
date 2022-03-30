package generic;

import java.util.HashSet;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Generic03 {
    public static void main(String[] args) {
        HashSet<Animal> animals = new HashSet<>();
        //在给泛型制定具体类型后可以传入该类型或其子类型
        animals.add(new Pig<String>("pig"));
        HashSet<Pig> pigs = new HashSet<>();
        //右边可以省略
    }
}
class Animal{}
class Pig <E>extends Animal{
    E e;

    public Pig(E e) {
        this.e = e;
    }
}
