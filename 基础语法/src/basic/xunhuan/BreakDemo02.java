package basic.xunhuan;

import java.util.Scanner;

public class BreakDemo02 {

    public static void main(String[] args) {
//输入用户名和密码 判断是否是 “顶针”“666” 有三次机会
        Scanner sc = new Scanner(System.in);
        String name;
        String password;
        int chance = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            name = sc.next();
            System.out.println("请输入密码：");
            password = sc.next();

            if ("顶针".equals(name) && "666".equals(password)){
                System.out.println("success");
                break;

            }
                chance --;
                System.out.println("错误，剩余机会：" + chance);

        }

    }


}
