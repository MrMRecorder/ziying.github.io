package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 紫英
 * @version 1.0
 * @discription 正则表达式
 */
public class Regexp {


    public static void main(String[] args) {
        //待处理的文本
        String content = "jshdkf3566546adaskhjb";

        //正则表达式
        String regStr = "\\d+?";
        //创建表达式对象
        Pattern pattern= Pattern.compile(regStr);
        //创建匹配器
        Matcher matcher = pattern.matcher(content);
        //开始匹配
        while (matcher.find()) {
            System.out.println("【找到】:" + matcher.group(0));
        }


    }


}

