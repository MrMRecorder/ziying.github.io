package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("01",new Employee("jack","01",19000));
        map.put("02",new Employee("marry","02",14000));
        map.put("03",new Employee("jack","03",17000));
        System.out.println(map);
        Set set = map.entrySet();
        System.out.println("工资>18000的员工(第一种方式——entrySet)");
        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            Employee e1 = (Employee)m.getValue();
            if (e1.salary>18000){
                System.out.println(m.getKey() + "-" + m.getValue());
            }
        }
        System.out.println("工资>18000的员工(第一种方式——entrySet.迭代器)");
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Object o = iterator1.next();
            Map.Entry m = (Map.Entry) o;
            Employee e = (Employee)m.getValue();
            if (e.salary>18000){
              System.out.println(m.getKey() + "-" + m.getValue());
            }
        }

        System.out.println("工资>18000的员工(第二种方式——keyset)");
        Set keyset = map.keySet();
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Employee e = (Employee)map.get(key);
            if (e.salary>18000){
                System.out.println(key + "-" +map.get(key) );
            }

        }

    }
}

class Employee{
    String name;
    String id;
    public double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
