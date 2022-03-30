package test;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Test02 {
    public static void main(String[] args) {
        Cang cang = new Cang();
        new Xiaofei(cang,400).start();
        new Shengchan(cang,300).start();

    }
}
