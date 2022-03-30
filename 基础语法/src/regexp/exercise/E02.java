package regexp.exercise;

/**
 * @author 紫英
 * @version 1.0
 * @discription 整体匹配
 */
public class E02 {
    public static void main(String[] args) {
        String content = "hsp@tsinghua.org.cn kkk" ;
        //String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";//是否是整数或者小数

        if (content.matches(regStr)){
            System.out.println("success");
        }else {
            System.out.println("failed");
        }

    }
}
