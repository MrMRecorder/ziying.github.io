package xunhuan;

public class ForDemo04 {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        //数组循环写法
        for (int x:num){
            System.out.println(x);
        }

        System.out.println("=========================");

        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }
}
