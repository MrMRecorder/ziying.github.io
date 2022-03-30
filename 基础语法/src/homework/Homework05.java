package homework;

import java.util.Scanner;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入id：");
        String id = scanner.next();
        System.out.println("请输入password：");
        String password = scanner.next();
        System.out.println("请输入email：");
        String email = scanner.next();
        try {
            userRig(id, password, email);
            System.out.println("success!");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    public static void userRig(String id, String password, String email) {
        if (!(email != null && password != null && email!=null)){
            throw new RuntimeException("参数不能为空");
        }

        if (!(id.length() >= 2 && id.length() <= 4)) {
            throw new RuntimeException("用户名长度需为2-4个字符！");
        }
        if (!((password.length() == 6) && isNum(password))) {
            throw new RuntimeException("密码格式有误");
        }
        if (isEmail(email) == false) {
            throw new RuntimeException("email格式有误");
        }


    }


    public static boolean isNum(String password) {
//        检测是否为数字
        char[] p = password.toCharArray();
        for (int i = 0; i < p.length; i++) {
//            这个我没想到
            if (p[i] < '0' || p[i] > '9') {
                return false;
            }

        }
        return true;
    }

    public static boolean isEmail(String email) {
//        检测@是否在.前面
        StringBuffer sb = new StringBuffer(email);
        if (!(sb.indexOf("@") - sb.indexOf(".") < 0)) {
            return false;
        }
        return true;
    }
}








