package enums;

/**
 * @author 紫英
 * @version 1.0
 * @discription enum关键字
 */
public class Enums02 {
    public static void main(String[] args) {
//        System.out.println(Season01.AUTUMN);
//        System.out.println(Season01.SPRING);
//        System.out.println(Season01.SUMMER);
        Season01 winter=Season01.WINTER;
        Season01 autumn=Season01.AUTUMN;
        //name()方法——输出枚举对象的名字
        System.out.println(winter.name());//WINTER
        //ordinal()方法——输出枚举对象的序列号（从0开始）
        System.out.println(winter.ordinal());//3

        //values()方法
        Season01 [] values=Season01.values();
        for(Season01 season01:values){
            System.out.println(season01);
        }

        //valueOf()方法
        Season01 winter01 = Season01.valueOf("WINTER");
        System.out.println(winter01==winter);//true

        //compareTo()方法
        System.out.println(autumn.compareTo(winter));//-1

        System.out.println(winter.toString());//WINTER

    }
}
enum Season01 {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"), AUTUMN ("秋天", "凉爽"),WINTER("冬天", "寒冷");

    private String name;//季节名称
    private String desr;//季节名称

    private Season01(String name, String desr) {
        this.name = name;
        this.desr = desr;
    }

    public String getName() {
        return name;
    }

    public String getDesr() {
        return desr;
    }



//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desr='" + desr + '\'' +
//                '}';
//    }
}
