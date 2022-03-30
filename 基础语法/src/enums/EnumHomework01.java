package enums;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class EnumHomework01 {

    public static void main(String[] args) {
        Week[] week =Week.values();
        for (Week week1 : week) {
            System.out.println(week1.toString());
        }
    }


}

enum Week{
    MONADAY("星期一"),TUESDAY("星期二"),WDENESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五");

    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
