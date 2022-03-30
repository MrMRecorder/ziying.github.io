package ab;

public abstract class Template {
//抽象类的最佳实现——模板模式
    abstract void job();
    public void calTime(){
        long start = System.currentTimeMillis();//获取当前时间
        job();
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间："+(end-start));
    }

}
