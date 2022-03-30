package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//仓库
public class Cang {
    int  d=500;
    Lock s = new ReentrantLock();
    public synchronized void zengjia(int b) {
        System.out.println("仓库有" + d + "，增加了" + b);
        while ((d + b) > 500) {
            try {
                System.out.println("仓库装不下！");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        d = d + b;
        System.out.println("仓库一共有"+d);
        notify();
    }


    public  synchronized  void  xiaofei(int b){
        System.out.println("仓库有"+d+"消费了"+b);

        while (d<b){
            try {
                System.out.println("仓库没有那么多货");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        d-=b;
        System.out.println("仓库还有"+d);
        notify();


    }
}
