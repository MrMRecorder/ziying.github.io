package basic.array;

public class ArrayDemo011 {
    public static void main(String[] args) {
//找出数组元素最大值和对应下标
        double [] num = {5.6 , 56, 88 , -8 ,3.14, 4678 };
        double max = num[0];
        int maxIndex = 0;
        for (int i = 1; i < num.length ; i++){
            if (num[i] > max){
                max = num[i];
                maxIndex = i;
            }
        }
        System.out.println("max:" + max +"index:" + maxIndex);




    }
}
