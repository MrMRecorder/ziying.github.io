package collection.homework;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework01 {
    public static void main(String[] args) {
        News news01 = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");//\"圣浴\"或者用中文的”“
        News news02 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");
        ArrayList list = new ArrayList();
        list.add(news01);
        list.add(news02);
        Collections.reverse(list);
        //也可以如下，因为如果没必要不要轻易改变数组
        /*老师方法:
        for(int i = list.size()-1;i>=0;i--){
        News news = (News) list.get(i);
                System.out.println(proTitle(news.getTitle()))
        }
         */
        for (Object o : list) {
            News n = (News) o;
            //下面的if语句可以封装成方法
            if ((n.getTitle().length()) > 15) {
                System.out.println(n.getTitle().substring(0, 15) + "...");//substring获取指定索引的字符串
            }
//            System.out.println(proTitle(((News) o).getTitle()));
        }
    }

//    public static String proTitle(String title) {
//        if (title == null) return "";
//        if ((title.length()) > 15) {
//            title = title.substring(0, 15) + "...";//substring获取指定索引的字符串
//        }
//        return title;
//    }
}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News——" +
                "新闻标题：" + title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
