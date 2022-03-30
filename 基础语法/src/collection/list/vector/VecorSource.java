package collection.list.vector;

import java.util.Vector;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class VecorSource {
    public static void main(String[] args) {
//        使用无参构造器初始化Vector
        Vector vector = new Vector(10);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector="+vector);

    }
}
