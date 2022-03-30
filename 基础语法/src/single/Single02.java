package single;

public class Single02 {
    //单例模式——懒汉式
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}
class Cat{
    private String name;

    private Cat(String name) {
        this.name = name;
    }
    private static Cat cat;

    public static Cat getInstance(){
//        判断没有被创建再创建
        if (cat==null){
            cat=new Cat("小花");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
