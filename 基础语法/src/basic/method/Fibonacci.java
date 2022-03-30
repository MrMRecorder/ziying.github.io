package basic.method;

public class Fibonacci {
//斐波那契数列
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            System.out.println("第"+i+"个斐波那契数为:" + fibonacci(i) + "\t");
        }

    }


    public static  int fibonacci(int i){
        if (i==1||i==2){
            return  1;
        }else{
            return fibonacci(i-2)+fibonacci(i-1);

        }

    }

}


