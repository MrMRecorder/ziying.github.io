package xunhuan;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.*;

public class DemoStar {
    public static void main(String[] args) {
        JFrame f=new JFrame("zhang cao de tian kong");//新建了一个窗口
        f.setSize(1000, 1000);//设置了窗体的大小
        MyPanel t=new MyPanel();//新建了一个面板
        f.add(t);//将面板加到了窗体上
        Thread td2=new Thread(t);//新建了一个线程对象
        td2.start();//激发线程
        f.setVisible(true);//显示窗体
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyPanel extends JPanel implements Runnable{//MyPanel继承了这个面板类，实现线程这个接口
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);//给下面的矩形区域上颜色
        g.fillRect(0, 0,1000, 1000);
        for(int i=1;i<=250;i++){
            g.setColor(Color.white);//给星星上颜色
            int x=(int )(Math.random()*1000);//星星在屏幕上的位置坐标取随机数
            int y=(int )(Math.random()*1000);
            g.drawString("*", x, y);//调用这个函数将星星画在画板上
        }
        g.fillOval(650, 200,75,75);//画一个黑圆，一个白园相交成一个白色的月亮
        g.setColor(Color.BLACK);
        g.fillOval(675, 200, 75, 75)	;
    }

    public void run() {
        while(true){
            try {
                Thread.sleep(1000);//让图像休眠x毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();//重新画出图片
        }


    }
}
