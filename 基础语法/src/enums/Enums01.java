package enums;

/**
 * @author 紫英
 * @version 1.0
 * @discription 自定义枚举类
 */
public class Enums01 {

    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
    }
}

class Season {

    private String name;//季节名称
    private String desr;//季节名称

    private Season(String name, String desr) {
        this.name = name;
        this.desr = desr;
    }

    public String getName() {
        return name;
    }

    public String getDesr() {
        return desr;
    }

    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desr='" + desr + '\'' +
                '}';
    }
}
