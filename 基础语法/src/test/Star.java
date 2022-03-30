package test;

import javax.swing.*;
import java.awt.*;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Star extends JFrame {
    public static void main(String[] args) {
        new Star();

    }
    //初始化窗体

    private void initialize(){

        this.setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗体关闭模式

        setContentPane(new Demo());

        this.setTitle("绘图小Demo");

        this.setLocationRelativeTo(null);//窗体居中

        this.setVisible(true);//设置窗体的可见性



    }

    public Star() throws HeadlessException {
        super();
        initialize();
    }

    static class Demo extends JPanel{

       @Override
       public void paint(Graphics g) {
           BasicStroke basicStroke = new BasicStroke();
           super.paint(g);
           g.drawLine(0,200,100,0);
           g.drawLine(100,0,200,200);
           g.drawLine(0,100,200,200);
           g.drawLine(0,100,200,100);
           g.drawLine(200,100,0,200);
       }
   }

}
