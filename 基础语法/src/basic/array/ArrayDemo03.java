package array;
//二维数组
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[][]a ={{1,2,3},{4,5,6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
