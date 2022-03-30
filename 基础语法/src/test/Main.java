package test;

import java.util.Scanner;

/**
 * 小美现在相信一些数字能给他带来好运。
 *
 * 这些数字至少满足以下两个特征中的一种：
 *
 * 1. 数字是11的整数倍。
 *
 * 2. 数字中至少包含两个1。
 *
 * 小美现在给你若干数字，希望你回答这个数字是不是幸运数。
 * 例如：132是11的12倍，满足条件1，101有两个1，满足条件2。
 * 第一行一个数字n，表示小美有n组询问
 *
 * 接下来每一行一个正整数表示小美询问的数字。
 *
 * 数据保证1 <= n <= 500, 每个询问的数字在 [1, 1e9]范围内
 * 对于每组询问，如果是幸运数，输出yes，不是，输出no。
 * 样例输入
 * 6
 * 22
 * 101
 * 1234
 * 555
 * 10001
 * 132
 * 样例输出
 * yes
 * yes
 * no
 * no
 * yes
 * yes
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = scanner.next();
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(isLucky(s[i]));
        }

    }

    public static String isLucky(String s) {

        int num = Integer.parseInt(s);
        int count = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if ('1' == aChar) {
                ++count;
            }
        }
        if (num % 11 == 0) {
            return "yes";
        } else if (count >= 2) {
            return "yes";
        } else {
            return "no";
        }

    }


}


