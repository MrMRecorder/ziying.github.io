package collection.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        treeMap.put(null,"杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("smith","史密斯");
        treeMap.put("yigeiwoligiao","小阿giao");
        System.out.println(treeMap);
    }
}
