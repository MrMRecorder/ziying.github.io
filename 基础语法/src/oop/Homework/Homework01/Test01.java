package oop.Homework.Homework01;

public class Test01 {
    public static void main(String[] args) {


        Person [] arr = new Person[3];
        arr[0]= new Person("tom", "Java工程师", 36);
        arr[1]= new Person("tomcat", "Javaee工程师", 21);
        arr[2]= new Person("along", "av工程师", 56);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                Person temp ;
                if(arr[j].getAge()<arr[j+1].getAge()){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }



    }
}
