package basic.xunhuan;

import java.util.Scanner;

public class XunHuanHomework {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalScore = 0;//总成绩
        int passNum = 0;//及格人数
        for (int i = 1; i <= 3; i++) {
            double sum = 0;//班级总成绩
            int passNum_class = 0;//及格人数
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入"+i+"班第"+j+"名同学的成绩：");
                double score = sc.nextDouble();
                if (score>=60)passNum_class++;
                System.out.println(i+"班第"+j+"名同学的成绩为：" + score);

                sum += score;

            }
            totalScore += sum;
            passNum += passNum_class;
            System.out.println(i+"班总成绩为："+sum+"平均成绩为："+sum/5+"及格人数为：" + passNum_class);
        }
        System.out.println("三个班总成绩为："+totalScore+"平均成绩为："+totalScore/15);
        System.out.println("三个班第及格人数为：" + passNum);




    }
}
