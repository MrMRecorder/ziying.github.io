package collection.homework;

import java.util.ArrayList;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework02 {
    public static void main(String[] args) {
        Car car = new Car("宝马",400000);
        Car car2 = new Car("宾利",5000000);
        ArrayList list = new ArrayList();
        list.add(car);
        list.add(car2);
        System.out.println(list);
//        list.remove(car2);
        System.out.println(list.contains(car2));
        System.out.println(list.isEmpty());
        list.addAll(list);
        System.out.println(list.containsAll(list));
        for (Object o : list) {
            System.out.println(o);
        }

    }
}

class Car {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "name:'" + name + '\'' +
                ", price:" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
