package oop;

public class Varparameter {

    //可变参数
    public static void main(String[] args) {
        Var v1 = new Var();
        v1.score("张三", 88, 98, 78);
    }
}

class Var {

    public void score(String s, int... i) {
//        可变参数的本质是数组，实参也可以是数组
        int sum = 0;
        for (int j = 0; j < i.length; j++) {
            sum += i[j];
        }

        System.out.println(s +i.length+ "门课的总成绩为：" + sum);

    }

}
