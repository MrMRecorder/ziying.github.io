package collection.homework;

import java.util.*;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework03 {

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        m.put("jack", 2600);
        Set set = m.keySet();
        Collection values = m.values();
        for (Object key : set) {
            m.put(key, (Integer) m.get(key) + 100);//注意转换成Interger
        }
        System.out.println("======遍历员工：=====");
        for (Object key : set) {
            System.out.println(key + ":" + m.get(key) + "元");
        }
        System.out.println("======遍历员工(迭代器)：=====");
        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            Map.Entry map = (Map.Entry) o;
            System.out.println(map.getKey() + ":" + map.getValue() + "元");

        }
        System.out.println("======遍历工资：=====");
        for (Object value : values) {
            System.out.println(value + "元");
        }
    }
}


