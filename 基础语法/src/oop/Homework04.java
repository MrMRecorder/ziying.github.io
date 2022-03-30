package oop;

public class Homework04 {

    public static void main(String[] args) {

        int[] arr = {10,6,5};
        A03 a03 = new A03();
        int []newArr=a03.arrCopy(arr);
        for (int i = 0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }

    }

}

class A03{

    public int[] arrCopy(int [] arr){

        int [] newArr=new int[arr.length];
        for (int i =0;i<arr.length;i++){

            newArr[i]=arr[i];
        }
       return newArr;
        }

}
