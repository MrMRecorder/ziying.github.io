package homework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 紫英
 * @version 1.0
 * @discription 定制冒泡排序
 */
public class Homework06 {
    public static void main(String[] args) {
        int[] array = {56, 63, 54, 2, 89, 1};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(array));
        b_sort(array, new Comparator() {
            //升序
            @Override
            public int compare(Object o1, Object o2) {
                Integer n1 = (Integer) o1;
                Integer n2 = (Integer) o2;
                return n1-n2;
            }
        });
        System.out.println("排序后：");
        System.out.println(Arrays.toString(array));
        b_sort(array, new Comparator() {
            //降序
            @Override
            public int compare(Object o1, Object o2) {
                Integer n1 = (Integer) o1;
                Integer n2 = (Integer) o2;
                return n2-n1;
            }
        });
        System.out.println("排序后：");
        System.out.println(Arrays.toString(array));
    }

    public static void b_sort(int[] array,Comparator c) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { //这里一开始写的是j<array.length-1 看了老师的发现可以再-i 因为比较此水依次减少
                if (c.compare(array[j],array[j + 1])>0) {
                    //如果后面的大 就和前面的交换
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

}