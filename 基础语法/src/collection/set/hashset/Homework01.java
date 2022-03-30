package collection.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Employee("jack",15));
        set.add(new Employee("jack",15));
        set.add(new Employee("jack",16));
        set.add(new Employee("marry",15));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
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
}


