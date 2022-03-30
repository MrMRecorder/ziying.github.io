package array;

import java.util.Scanner;

public class ArrayDemo01 {
    public static void main(String[] args) {
//字母表
        double [] alpha = new double[26];
        for (int i = 0; i < alpha.length; i++) {
            alpha[i] ='A' + i;
            System.out.print((char) alpha[i] + "\t");
        }




    }
}
