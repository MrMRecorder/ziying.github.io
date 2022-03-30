package xunhuan;

public class ForDemo01 {
    public static void main(String[] args) {
//        int a=0;
//        int b=1;
        int sum1=0;//存放偶数和
        int sum2=0;//存放奇数和
        for (int i = 0; i <= 100; i++) {
            //a+=2;
            if (i%2==0)
            {
                sum1+=i;
            }
            else
                {
                    sum2+=i;
                }
           // System.out.println("偶数："+a);


          //  b+=2;
           // System.out.println("奇："+b);
           // System.out.println("sum2:"+sum2);
        }
        System.out.println("偶数之和："+sum1);
        System.out.println("奇数之和："+sum2);
        System.out.println("总数和："+(sum2+sum1));
    }
}
