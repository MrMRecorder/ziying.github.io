package basic.xunhuan;

public class ControlStreamHomework04 {

    public static void main(String[] args) {

        //每五个一行输出 1-100之间不能被5整除的数
        int count = 0; //用来分行
        for (int i = 0; i < 100; i++) {
            if (i % 5 !=0){
                System.out.print(i+"\t");
                count++;
                if (count % 5 ==0) System.out.println();
            }
        }


    }



}
