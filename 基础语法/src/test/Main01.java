package test;

import java.util.Scanner;


public class Main01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        int zheng = 0;
        int numZheng = 0;
        int fu = 0;
        int numFu = 0;
        for (String s : str) {
            s = scanner.next();
            if ("1".equals(s)) ++zheng;
            if ("-1".equals(s)) ++fu;
        }
        System.out.println(num(zheng,numZheng,fu,numFu,n));

    }

    public static int num(int zheng,int numZheng,int numFu,int fu, int n) {

        numZheng = (int) Math.pow(2, zheng) - 1;
        if (zheng == n) {
            return (int) Math.pow(2, n) - 1;
        } else if (fu % 2 == 0) {
            numFu = (int) Math.pow(2, zheng) - 1;
        } else {
            numFu = (int) Math.pow(2, zheng - 1) - 1;
        }
        return (numZheng + numFu);
    }
}


