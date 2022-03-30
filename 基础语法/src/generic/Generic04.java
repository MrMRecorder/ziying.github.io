package generic;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Generic04 {
    public static void main(String[] args) {
        Employee jack = new Employee("jack", 15000, new MyDate(2000, 12, 26));
        Employee jack1 = new Employee("jack", 14000, new MyDate(2000, 12, 26));
        Employee jack2 = new Employee("jack", 14000, new MyDate(1998, 11, 25));
//        Employee jack3 = new Employee("jack", 14000, new MyDate(2010, 11, 26));
        Employee marry = new Employee("marry", 16000, new MyDate(1999, 1, 4));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(jack1);
        employees.add(jack2);

        employees.add(marry);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1.getName().equals(o2.getName()))) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
        });
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
    @Test
    public void hi(){
        System.out.println("hi");
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "{" +
                year +
                "-" + month +
                "-" + day +
                '}';
    }


    @Override
    public int compareTo(@NotNull MyDate date) {
        //中间变量存储传入的数据
        int year1 = (date).getYear();
        int yearMin = year - year1;
        int month1 = (date).getMonth();
        int monthMin = month - month1;
        int day1 = (date).getDay();
        int dayMin = day - day1;
        if (yearMin != 0) {
            return yearMin;
        } else if (monthMin != 0) {
            return monthMin;
        } else return dayMin;


    }
}