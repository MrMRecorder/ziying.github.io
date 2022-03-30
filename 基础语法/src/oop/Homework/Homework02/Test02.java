package oop.Homework.Homework02;

public class Test02 {

    public static void main(String[] args) {

        Woker woker = new Woker("jack",30,5000);
        System.out.println(woker.toString());
        System.out.println(woker.sum());

        Manager manager = new Manager("tom",25,12000,20000);
        System.out.println(manager.toString());
        System.out.println(manager.sum());
    }

}
