package basic.method;

public class Monkey {
    //猴子吃桃问题----猴子每天吃总数一般的桃子再多吃一个,
    // 第十天想吃的时候发现只剩一个,问一开始有多少桃子
    // 第n天=(第n+1天+1)*2  第十天=1 递归九次 
    public static void main(String[] args) {

        System.out.println(peach(11));
    }

    public static int peach(int day){
        
        if (day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return (peach(day +1 )+1)*2;
        }else{
            System.out.println("没桃子了!");
            return -1;
        }

        
    }
    
}
