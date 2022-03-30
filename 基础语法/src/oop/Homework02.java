package oop;

public class Homework02 {

    public static void main(String[] args) {
        String [] s = {"456","sha","458"};
        A02 a02 = new A02();
        a02.find("555",s);
    }

}

class A02{

    public void find(String s1,String [] s){
        int index=0;
        boolean flag = false;
        for (int i = 0;i<s.length;i++){
            if (s1.equals(s[i])){
                index = i;
                flag=true;
                System.out.println("yes"+"\t"+index);
            }
        }
        if (flag == false){
            System.out.println("no");
        }

    }

}
