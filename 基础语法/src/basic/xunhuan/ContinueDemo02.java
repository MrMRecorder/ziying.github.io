package basic.xunhuan;

import java.awt.*;

public class ContinueDemo02 {

    public static void main(String[] args) {

        label1:
        for (int i = 0; i < 4; i++) {
            label2:
            for (int i1 = 0; i1 < 10; i1++) {
                if ( i1 == 2){
                    continue ;//等价于continue label2
                }
                System.out.println(i1);
            }
        }
    }

}
