package collection.map;

import java.util.Hashtable;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Hashtable01 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("01","jack");
        hashtable.put("02","marry");
        hashtable.put(null,"jack");
        System.out.println(hashtable);
    }
}
