package oop.Homework.Homework02;

public class Employee {

    private String name;
    private int day;
    private double salary;

    public Employee(String name, int day, double salary) {
        this.name = name;
        this.day = day;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double  sum(){
        return day*salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", day=" + day +
                ", salary=" + salary +
                '}';
    }
}
