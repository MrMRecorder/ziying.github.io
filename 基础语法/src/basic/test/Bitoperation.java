package test;

public class Bitoperation {
    public static void main(String[] args) {
        //2*8怎样算最快
        System.out.println(2<<3);//2左移3位
        //0000 0010  2
        //0010 0000  16
        int a= 10;
        int b= 20;
        System.out.println(a);
        System.out.println(a+b);
        System.out.println(""+a+b);
        System.out.println(a+b+"");

        int score1=59;
        int score2=98;
        String result1=score1>60?"及格":"不及格";
        String result2=score2>60?"及格":"不及格";
        System.out.println(result1);
        System.out.println(result2);

    }
}
