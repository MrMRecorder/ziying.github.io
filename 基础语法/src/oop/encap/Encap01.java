package oop.encap;

import java.util.Scanner;

public class Encap01 {

//    封装
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Person p1=new Person();
    System.out.println("name:");
    String name = scanner.next();
    p1.setName(name);
    System.out.println("age:");
    int age = scanner.nextInt();
    p1.setAge(age);
    p1.setSalary(12000);

    System.out.println(p1.info());


}


}

