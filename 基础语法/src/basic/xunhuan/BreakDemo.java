package basic.xunhuan;

public class BreakDemo {
    public static void main(String[] args) {
        //1-100求和，找出求和结果第一次>20的数
        int i = 1;
        int sum = 0;
        for (; i <= 100; i++) {
            sum += i;
            if (sum>=20){
                break;
            }
        }
        System.out.println(sum + " " + i);
    }
}
