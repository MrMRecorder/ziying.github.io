package basic.array;

public class TwoArray {
//二维数组
    public static void main(String[] args) {




        int [][] array = new int[2][3] ;
        array[1][1] = 1;
        for (int i = 0; i<array.length;i++){//外循环次数为二维数组的行数 即array.length-1次
            for (int j =0;j<array[i].length;j++){//内循环次数为一维数组的长度 即array[i].length-1次
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
