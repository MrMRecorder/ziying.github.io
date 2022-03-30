package exception;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Exception01 {
    public static void main(String[] args) {
        try {
            int i=10;
            System.out.println(i/0);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("continue...");
    }
}
