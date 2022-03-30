package test;
public class Shengchan extends Thread{
   Cang a ;
   int c ;


    public Shengchan(Cang a, int c) {
        this.a = a;
        this.c = c;
    }
    public void run() {
        a.zengjia(c);
    }
}
