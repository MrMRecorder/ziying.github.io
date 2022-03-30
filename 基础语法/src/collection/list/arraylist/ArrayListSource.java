package collection.list.arraylist;

import java.util.ArrayList;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class ArrayListSource {
    public static void main(String[] args) {
        //使用无参构造器创建arraylist对象
       // ArrayList list = new ArrayList();

        //使用有参构造器创建arraylist对象
        ArrayList list = new ArrayList(8);
        //使用for循环添加第1-10个数据
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //使用for循环添加第11-15个数据

        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }

        list.add(100);
        list.add(200);

    }
}
