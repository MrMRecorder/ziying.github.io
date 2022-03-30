package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class SetMethod {
    public static void main(String[] args) {
        //以Set接口的实现类HashSet来演示Set接口的方法
        Set hashset = new HashSet();
        hashset.add("111");
        hashset.add("222");
        hashset.add("222");
        hashset.add("333");
        hashset.add(null);
        hashset.add(null);
        System.out.println("hashset = "+hashset);

        //遍历
        // 1.迭代器遍历
        System.out.println("===迭代器遍历===");
        Iterator iterator = hashset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);

        }

        //2.增强for遍历
        System.out.println("===增强for遍历===");
        for (Object o : hashset) {
            System.out.println(o);
        }


    }
}
