package scanner;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if (sc.hasNext()){
            String str=sc.nextLine();
            System.out.println("you wrote:"+str+" just now");
        }
        sc.close();
    }

}
