package basic.array;

public class Test {
    public static void main(String[] args) {


        int [] array1 = {1,2,3};
        int [] array2 = array1;

        array1[0] = 10;

        for (int i = 0;i < array2.length;i++){
            System.out.println(array2[i]);
        }



        }


}
