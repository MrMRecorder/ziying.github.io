package basic.sort;

public class BubbleSort {

//    冒泡排序

    public static void main(String[] args) {
        int [] array = {56  , 63 , 54 , 2, 89,1};
        System.out.println("排序前：");

        for(int  i = 0; i< array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        for(int  i = 0; i< array.length-1;i++){
            for (int j =0 ; j<array.length-1-i;j++){ //这里一开始写的是j<array.length-1 看了老师的发现可以再-i 因为比较次数依次减少
                if (array[j]<array[j+1]){
                    //如果后面的大 就和前面的交换
                    int temp = array[j+1];
                    array[j+1] =array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("排序后：");
        for(int  i = 0; i< array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }




}
