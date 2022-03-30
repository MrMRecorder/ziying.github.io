package method;
//可变参数
public class Demo03 {
    public static void main(String[] args) {
        printMax(1.2,56.9,88.56,85);
        printMax(new double[]{123,569,999.56,456});

    }
    public  static void printMax(double... numbers){
        if (numbers.length ==0){
            System.out.println("啥也没");
            return;
        }
        double result =numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>result){
                result=numbers[i];

            }
        }
        System.out.println("最大的是："+result);

    }

}

