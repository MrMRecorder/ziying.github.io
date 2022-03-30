package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Collection01 {
    public static void main(String[] args) {
       List list = new ArrayList();
       list.add("a1");
       list.add("c22");
       list.add("b333");
       list.add("f4444");
        System.out.println("=====原list：=====");
        System.out.println(list);
        System.out.println("=====反转list：=====");
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("=====随机排序list：=====");//可以抽奖啥的
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(list);
            System.out.println(list);
        }
        System.out.println("=====自然排序list：=====");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("=====指定compartor：=====");
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照字符串长度排序
                return ((String)o1).length()-((String) o2).length();
            }
        });
        System.out.println(list);
        System.out.println("=====交换list：=====");
        Collections.swap(list,0,1);
        System.out.println(list);




    }
}
