package collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Treeset01 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeSet.add("jack");
        treeSet.add("a");
        treeSet.add("sda");
        treeSet.add("AAA");
        treeSet.add("66");
        treeSet.add("45");
        treeSet.add("bacf");
        System.out.println(treeSet);
    }
}
