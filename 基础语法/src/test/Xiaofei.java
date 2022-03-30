package test;
public class Xiaofei extends Thread {
    Cang a ;
    int b;

    public Xiaofei(Cang a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        a.xiaofei(b);
    }
}
