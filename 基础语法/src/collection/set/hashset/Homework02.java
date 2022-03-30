package collection.set.hashset;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework02 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Employee02("jack", new MyDate(2000, 12, 26)));
        set.add(new Employee02("marry", new MyDate(2000, 12, 26)));
        set.add(new Employee02("jack", new MyDate(2000, 12, 26)));
        System.out.println(set);
    }
}

class Employee02 {
    private String name;
    private MyDate birthday;

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Employee02(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee02 that = (Employee02) o;
        return Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    int year;
    int month;
    int day;

    @Override
    public String toString() {
        return "{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}