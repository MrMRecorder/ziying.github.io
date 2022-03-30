package homework;

import java.util.Scanner;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符：");
        String s=scanner.next();
        judge(s);

    }
    public static void judge(String s){
        int up=0;
        int down=0;
        int num=0;
        int other=0;
        char[] c=s.toCharArray();
        for (char c1 : c) {
            if (c1>='a'&&c1<='z'){
                down++;
            }
            else if (c1>='A'&&c1<='Z'){
                up++;
            }
            else if (c1>='0'&&c1<='9'){
                num++;
            }else {
                other++;
            }
        }
        System.out.println("大写字母:"+up+"个"+"\n"+"小写字母:"+down+"个"+"\n"+"数字:"+num+"个"+"\n"+"其他字符:"+other+"个");

    }
}
