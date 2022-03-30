package test;

import java.io.IOException;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws IOException {
        int score;
        final Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩：");
        score=sc.nextInt();
        final int n=score/10;
        switch(n)
        {
            case 10:
            case 9:System.out.println("成绩为优:"+score);
                break;
            case 8:System.out.println("成绩为良:"+score);
                break;
            case 7:System.out.println("成绩为中:"+score);
                break;
            case 6:System.out.println("成绩为及格:"+score);
                break;
            default:System.out.println("成绩为不及格:"+score);

        }

        }
    }

