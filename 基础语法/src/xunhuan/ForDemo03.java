package xunhuan;

public class ForDemo03 {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {

            for (int i = 1; i <= j; i++) {
                /*
                i<=j 去掉重复项
                 */
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println("");

        }

    }
}
