package test;

public class Sum {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100){
            sum+=i;
            System.out.println("sum:"+sum);
            i++;
            System.out.println("i:"+i);


        }
        System.out.println(sum);
    }
}
