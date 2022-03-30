package sort;

import java.util.Arrays;

/**
 * @author 紫英
 * @version 1.0
 * @discription 八大基本排序
 */
public class Sort01 {

    public static void main(String[] args) {
        int[] nums = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (10000 * Math.random());
        }
        int[] arr = Arrays.copyOf(nums, nums.length);//拷贝原数组
        long start = System.currentTimeMillis();
        //bubbleSort(nums);
        //selecSort(nums);
        //quickSort(arr,0,arr.length-1);
        //insertSort(nums);
        Arrays.sort(nums);
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));



    }


    public static int[] bubbleSort(int[] sourceArr) {
        //冒泡排序
        /**
         * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
         * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会
         * 经由交换慢慢“浮”到数列的顶端。
         */
        /**
         * 算法描述:
         * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
         * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
         * 针对所有的元素重复以上的步骤，除了最后一个；
         * 重复步骤1~3，直到排序完成。
         */
        /**
         * 平均时间复杂度：O(n2)
         * 最好情况：O(n)
         * 最坏情况：O(n2)
         * 空间复杂度：O(1)
         * 稳定性：稳定
         */
        int[] arr = Arrays.copyOf(sourceArr, sourceArr.length);//拷贝原数组
        for (int i = 0; i < arr.length - 1; i++) {

            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp;
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                flag = false;
            }
            if (flag) break;

        }
        traversal(arr);

        return arr;
    }

    public static int[] selecSort(int[] sourceArr) {
        //选择排序
        /**
         * 选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。
         * 所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧。
         */
        /**
         * 算法步骤
         * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
         *
         * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
         *
         * 重复第二步，直到所有元素均排序完毕。
         */
        /**
         * 算法分析
         * 平均时间复杂度：O(n2)
         * 最好情况：O(n2)
         * 最坏情况：O(n2)
         * 空间复杂度：O(1)
         * 稳定性：不稳定
         */
        int[] arr = Arrays.copyOf(sourceArr, sourceArr.length);//拷贝原数组
        for (int i = 0; i < arr.length; i++) {//这里长度不能-1了

            int min = i;//记录最小值下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;//记录当前找到的最小元素下标
            }
            if (i != min) {
                // 将找到的最小值和 i  位置所在的值进行交换
                int temp;
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        traversal(arr);
        return arr;


    }

    public static int[] insertSort(int[] sourceArr) {
        //插排
        /**
         * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
         *
         * 插入排序和冒泡排序一样，也有一种优化算法，叫做拆半插入。
         */
        /**
         * 算法步骤
         * 将排序序列的第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
         * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
         * 如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。
         */
        /**
         * 算法分析
         * 平均时间复杂度：O(n2)
         * 最好情况：O(n)
         * 最坏情况：O(n2)
         * 空间复杂度：O(1)
         * 稳定性：稳定
         */
        int[] arr = Arrays.copyOf(sourceArr, sourceArr.length);//拷贝原数组
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];//记录要插入的数据

            //从已排序序列的右边开始比较，找到比其小的数
            int j = i;//要插入的数的下标
            while (j > 0 && temp < arr[j - 1]) {
                //这个temp就是要插入的排序，从排好的序列右边开始比，
                //如果有比插入的数大的就让temp接着往左走，找到合适的位置（）
                arr[j] = arr[j - 1];
                j--;
            }
            // i、j不相等的话，说明存在比其小的数，插入（替换）到上面找好的位置
            if (j != i) arr[j] = temp;
        }
        //traversal(arr);
        return arr;

    }


    public static int[] shellSort(int[] sourceArr) {
        /**
         * 希尔排序，也称递减增量排序算法，是插入排序的一种更高效的改进版本。但希尔排序是非稳定排序算法。
         *
         * 希尔排序是基于插入排序的以下两点性质而提出改进方法的：
         *
         * 插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率；
         * 但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位；
         * 希尔排序的基本思想是：先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
         * 待整个序列中的记录"基本有序"时，再对全体记录进行依次直接插入排序。
         */
        /**
         * 算法分析
         * 平均时间复杂度：O(n log n)
         * 最好情况：O(n log2 n)
         * 最坏情况：O(n log2 n)
         * 空间复杂度：O(1)
         * 稳定性：不稳定
         */
        int[] arr = Arrays.copyOf(sourceArr, sourceArr.length);//拷贝原数组


        return arr;
    }

    public static void quickSort(int[] arr, int left, int right) {

        /**
         *  算法步骤
         * 1.从数列中挑出一个元素，称为 “基准”（pivot）;
         * 2.重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
         * 3.递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；
         算法分析
         平均时间复杂度：O(n log n)
         最好情况：O(n log n)
         最坏情况：O(n2)
         空间复杂度：O(log n)
         稳定性：不稳定
         */
        if (left > right) return;//左边界<=右边界时继续，否则递归结束·

        int l = left;//左指针
        int r = right;//右指针
        int temp = 0;//中间变量
        int pivot = arr[right];//基准，可以随便取,这里取数组末尾的

        while (l < r) {
            //从左边找到第一个比基准大的
            while (arr[l] <= pivot && l < r) {
                l++;//没找到左指针就往右走
            }
            //从右边找到第一个比基准小的
            while (arr[r] >= pivot && l < r) {
                r--;//没找到右指针就往左走
            }
            //到这里说明找到了，将找到的两个数交换
            if (l < r) {
                temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
            }

        }
        //这时基准两侧已经分别是比基准小的和比基准大的了，交换完毕后将基准放到合适的位置
        //其实这时候应该是l>=r的,也就是基准该在的位置
        arr[right] = arr[l];//把当前左指针指向的数放到最右边，也就是一开始基准的位置
        arr[l] = pivot;//把存着基准值的pivot给到当前左指针的位置
        quickSort(arr,left,l-1);//基准左半边递归
        quickSort(arr,r+1,right);//基准右半边递归



    }


    public static void traversal(int[] arr) {
        //遍历输出
        for (int i : arr) {
            System.out.println(i + "\t");
        }

    }

}
