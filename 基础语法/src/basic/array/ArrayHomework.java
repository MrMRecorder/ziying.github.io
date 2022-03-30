package basic.array;

import java.util.Scanner;

public class ArrayHomework {
//数组插入数据，并保持 插入后数组保持升序
    public static void main(String[] args) {

        int [] num = {1,6,99};
        System.out.print("原数组：");
        for (int i = 0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新数据：");
        int newNum = sc.nextInt();
        int index = -1;

        for (int i = 0; i< num.length;i++){
            if (newNum <= num[i]){
                index = i;
                break;
            }
        }
        if (index ==-1)index=num.length;
        int [] newarr = new int[num.length+1];

        for (int i = 0,j=0;i < newarr.length;i++){
            if (i!= index){
                newarr[i]=num[j];
                j++;
            }else{
//                这里如果走else则j就不++了，所以在newNum插入之后i比j大1   666
                newarr[i]=newNum;
            }



        }
        num=newarr;
        System.out.print("新数组：");
        for (int i = 0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }
    }
}
