package scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入若干数字：\n");
        double sum=0;
        int n=0;
        while (scanner.hasNextDouble()){
            double d=scanner.nextDouble();
            sum+=d;
            n++;
        }
        //接受非double类型时停止
        System.out.println("总数为："+sum);
        System.out.println("平均数为："+(sum/n));
        scanner.close();

    }
}
