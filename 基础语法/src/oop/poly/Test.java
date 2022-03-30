package oop.poly;

public class Test {

    public static void main(String[] args) {
//
//        int a = 10;
//        double b=10.0;
//        String s = "12";
//
//        int [] daa = {1,3,5,6,7};
//        Arrays.stream(daa).sorted();

        Woker marry = new Woker("marry", 5000);
        Test test = new Test();
        System.out.println(test.showE(marry));
        test.testWork(marry);

        Manager tom = new Manager("tom", 15000, 20000);
        System.out.println(test.showE(tom));
        test.testWork(tom);


    }

    public double showE(Employee e){
        return e.getAnnual();
    }

    public void testWork(Employee e){
        if (e instanceof Woker){
            ((Woker) e).work();
        }else if (e instanceof Manager){
            ((Manager) e).manage();
        }else{
            System.out.println("error");
        }

    }





}

