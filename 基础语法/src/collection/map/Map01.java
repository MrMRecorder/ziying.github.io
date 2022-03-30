package collection.map;

import java.util.*;

/**
 * @author 紫英
 * @version 1.0
 * @discription map遍历方式
 */
@SuppressWarnings("all")
public class Map01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("01","jack");
        map.put("02","marry");
        //遍历方式
        //第一种:先取出所有的key，通过key取出对应的value
        //(1)增强for
        System.out.println("====第一种.(1)====");
        Set keyset = map.keySet();
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        //(2)迭代器
        System.out.println("====第一种.(2)====");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));

        }
        //第二种:先取出所有的value，但是这种不能反向找key
        //因为类型是Collection，所以可以使用对应的遍历方式
        Collection values = map.values();
        //(1)增强for
        System.out.println("====第二种.(1)====");
        for (Object value : values) {
            System.out.println(value);
        }
        //(2)迭代器
        System.out.println("====第二种.(2)====");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            System.out.println(next);

        }
        //第三种:通过EntrySet来获取kv值
        //(1)增强for
        System.out.println("====第三种.(1)====");
        Set entrySet = map.entrySet();

        for (Object o : entrySet) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey()+ "-" + m.getValue());
        }
        //(2)迭代器
        System.out.println("====第三种.(2)====");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object o =  iterator3.next();
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey()+ "-" + m.getValue());
        }



    }

}
