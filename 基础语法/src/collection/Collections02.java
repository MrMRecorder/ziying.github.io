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
public class Collections02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("jack");
        list.add("recorder");
        list.add("tom");
        System.out.println("=====原list：=====");
        System.out.println(list);
        System.out.println("=====list自然排序最大值：=====");
        System.out.println(Collections.max(list));
        System.out.println("=====list最大值（比较器）：=====");
        Object max = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照字符串长度排序
                return ((String)o1).length()-((String) o2).length();
            }
        });
        System.out.println(max);
        System.out.println("=====list自然排序最小值：=====");
        System.out.println(Collections.min(list));
        System.out.println("=====list排序最小值（比较器）：=====");
        Object min = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照字符串长度排序
                return ((String)o1).length()-((String) o2).length();
            }
        });
        System.out.println(min);
        System.out.println("=====list指定元素出现次数：=====");
        System.out.println(Collections.frequency(list,"tom"));
        System.out.println("=====复制的dest：=====");
        List dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            //为了保持两list大小一致来满足copy的条件
            // if (srcSize > dest.size())
            //            throw new IndexOutOfBoundsException("Source does not fit in dest");
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println(dest);
        System.out.println("=====元素替换：=====");
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println(list);
    }
}
