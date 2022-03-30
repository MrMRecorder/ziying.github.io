package array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5};
        for (int array : arrays) {
            System.out.print(array);
        }
        //printArray(arrays);
        System.out.println("=====================");
        int[] reverse = reverse(arrays);
        printArray(reverse);
    }

    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
    }

    public static int[] reverse(int[] arrays) {
        //反转数组
        int[] result = new int[arrays.length];
        for (int i = 0, j = result.length - 1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }
        return result;
    }
}

