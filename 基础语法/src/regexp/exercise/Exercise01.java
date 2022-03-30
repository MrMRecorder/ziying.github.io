package regexp.exercise;

import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Exercise01 {

    public static void main(String[] args) {
        //String content = "jshdkf3566546adaskhjb";

        //正则表达式
        //String regStr = "^[\u0391-\uffe5]+$]";//全是汉字
        //String regStr = "^[\u0391-\uffe5]+$]";//全是汉字
        //创建表达式对象
        String content = "zzoo.zz.kk";
        String regStr = "[\\w.]+";
        Pattern pattern= Pattern.compile(regStr);
        //创建匹配器
        Matcher matcher = pattern.matcher(content);
        //开始匹配
        while (matcher.find()) {
            System.out.println("【找到】:" + matcher.group(0));
        }

    }
    @Test
    public void t() throws UnknownHostException {
        InetAddress baidu = InetAddress.getByName("www.cnblogs.com");
        System.out.println("根据域名https://www.cnblogs.com/recorderM/获取InetAddress对象: " + baidu);
    }

}
