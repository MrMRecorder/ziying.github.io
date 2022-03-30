package basic.xunhuan;

public class WhileDemo02 {
    public static void main(String[] args) {
//        输出40-200中的偶数
        int i = 40;
        while (i <= 200){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
