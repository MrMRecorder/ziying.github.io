package method;

public class Demo02 {
    public static void main(String[] args) {
        int max = max(99, 99);
        double max2 = max(1.6, 3.4);
        System.out.println(max);
        System.out.println(max2);
    }

    public static int max(int num1, int num2) {
        int result = 0;
        if (num1 < num2) {
            result = num2;
        } else {
            result = num1;
        }
        if (num1 == num2) {
            System.out.println("两数相等");
            return 0;
        }

        return result;

    }

    //方法重载
    public static double max(double num1, double num2) {
        double result = 0;
        if (num1 < num2) {
            result = num2;
        } else {
            result = num1;
        }
        if (num1 == num2) {
            System.out.println("两数相等");
            return 0;
        }

        return result;

    }
}
