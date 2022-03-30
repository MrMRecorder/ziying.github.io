package oop;

public class HanoiTower {
    //汉诺塔问题
    public static void main(String[] args) {

        Tower tower = new Tower();
        tower.move(3,'A','B','C');
        System.out.println("需要"+tower.count+"次");
    }
}

class Tower {
    int count = 0;
    public void move(int num,char a,char b, char c){
        if (num == 1){
            count ++;
            System.out.println(a+" - >" + c);//递归最内层
        }else{
            move(num - 1,a,c,b);//先将a上面的num-1个移动到b上面

            System.out.println(a+" - >" + c); //将a上面的一个移动到c
            count ++;
            move(num-1 ,b,a,c);//先将b上面的num-1个移动到c上面


        }
    }
}
