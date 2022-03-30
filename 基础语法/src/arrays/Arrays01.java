package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Arrays01 {
    public static void main(String[] args) {
        Integer[] a= {0,-1,45,56,34};
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
            System.out.println(Arrays.toString(a));
    }
}
