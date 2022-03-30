package homework;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework04 {
    public static void main(String[] args) {
        String s="abcdef";
        System.out.println("交换前："+s);
        try {
            s=reverse(s,1,4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("交换后："+s);

    }
    public static String reverse(String str,int start,int end){
        char [] chars = str.toCharArray();
        char temp = ' ';
        if (!(str!=null && start < end && start>=0 && end<str.length())){
            throw new RuntimeException("参数错误！");
        }
        for (int i =start,j = end;i < j;i++,j--){
            temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }

        return new String(chars);
    }
}
