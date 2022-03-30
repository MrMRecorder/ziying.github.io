package method;

//递归
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    //阶乘
    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }

}
