package collection.map;

import java.util.Properties;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Properties01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("name",null);
        properties.put("password","123456");
        System.out.println(properties);
        System.out.println(properties.get("name"));
    }
}
