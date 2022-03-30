package sb;

import java.util.Scanner;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class SbDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入价格：");
        String s = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(s);
        for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer = stringBuffer.insert(i, ',');
        }
        System.out.println("价格格式化后为："+"\n"+stringBuffer);
    }
}
