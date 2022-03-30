package single;

public class Single01 {
    /*
    单例模式——饿汉式
     */
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}
class GirlFriend{
    private String name;
    private GirlFriend(String name) {
//        私有化构造器
        this.name = name;
    }
//    创建对象
    private static GirlFriend gf = new GirlFriend("月月");

    public static GirlFriend getInstance(){
//        公共方法返回对象
        return gf;
    }
    @Override
    public String toString() {
        return "GirlFriend's name=" + name;
    }
}
