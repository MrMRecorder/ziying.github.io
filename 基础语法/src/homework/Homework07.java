package homework;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author 紫英
 * @version 1.0
 * @discription 名字格式化
 */
public class Homework07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.nextLine();
        nameformat(name);


    }

    public static void nameformat(String name) {
        if (name==null){
            System.out.println("名字为空！");
            return;
        }
        String[] sname = name.split(" ");
        if (sname.length!=3){
            System.out.println("名字格式不正确！（Xxx xxx Xxx）");
            return;
        }
        System.out.println(String.format("%s,%s .%c",sname[2] ,sname[0],sname[1].toUpperCase(Locale.ROOT).charAt(0)));
    }
}
