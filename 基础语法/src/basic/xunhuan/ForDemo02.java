package xunhuan;

public class ForDemo02 {
    public static void main(String[] args) {
        int sum=0;
        int flag=0;
        for (int i = 0; i <=1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
                flag++;
                if (flag%3==0){
                    System.out.println("\n");
                }
//                if (i%15==0)
//                {
//                    System.out.println("\n");
//                }
            }

        }
    }
}
