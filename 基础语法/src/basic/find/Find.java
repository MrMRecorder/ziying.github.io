package basic.find;

import java.util.Scanner;

public class Find {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        Scanner sc = new Scanner( System.in);
        System.out.println("请输入要查询的数字：");
        int num = sc.nextInt();
        int index = 0;
        boolean flag = false;
        for (int i = 0;i<array.length;i++){

            if (num == array[i]){
                index = i;
                System.out.println("找到了下标为：" + index);
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.println("没找到");
        }


    }

}
