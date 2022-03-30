package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 紫英
 * @version 1.0
 * @discription list接口三种遍历方式
 */
public class Col02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        1.迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
//        2.增强for
        for (Object o :list) {
            System.out.println(o);
        }
//        3.普通for
        for (int i = 0; i < list.size(); i++) {
            Object o= list.get(i);
            System.out.println(o);

        }
    }
}
