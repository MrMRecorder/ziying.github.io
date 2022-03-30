package test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Aaa {

    public static void main(String[] args) {

        //String solution = solution("2", "-2");
        //System.out.println(solution);
        System.out.println(solution(2,new int[]{2,1,3,4,1,7,8},1));


    }
    public static String solution(String a, String b) {
        // 在这⾥书写你的代码
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        String res = num1 * num2 + "";
        return res;
    }
    public static int solution(int k, int[] prices, int fee) {
        // 在这⾥书写你的代码
        //int max =prices[0];
        //int min = prices[0];
        Integer profit = 0;
        TreeSet<Integer> proArr = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] - prices[i-1];
            if (temp > 0){
                proArr.add(temp);
            }
           //if (max < prices[i])max = prices[i];
           //if (min > prices[i])min = prices[i];
        }
        Iterator<Integer> iterator = proArr.iterator();
        int flag = 0;
        for (Integer integer : proArr) {
            profit = profit + integer;
            ++flag;
            if (flag==k)break;

        }


        //System.out.println("min = " + min + " max = " + max + " profit=" + profit);
        System.out.println("proArr = " + proArr);
        if (k > 0) {
            return profit - fee;
        }else {
            return 0;
        }

    }

}
