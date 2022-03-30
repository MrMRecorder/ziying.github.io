package oop.override;

public class Euqals {

//    重写equals方法,判断两对象是否相等（属性完全一致）
public static void main(String[] args) {
    Person person = new Person("jack",23);
    Person dperson = new Person("jack",23);
    System.out.println(person.equals(dperson));
}


}



