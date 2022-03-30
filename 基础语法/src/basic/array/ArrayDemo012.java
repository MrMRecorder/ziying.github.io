package basic.array;

public class ArrayDemo012 {

    public static void main(String[] args) {
//数组反转
        int [] num = {1,2,3,4,5,6};
        int [] num2 = new int[num.length];
        for ( int i = num.length-1;i >= 0;i--){
            num2[i]=num[num.length-1-i];
        }

        num=num2;//将num指向num2

        for (int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }

}
