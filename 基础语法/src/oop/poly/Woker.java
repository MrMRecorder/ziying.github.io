package oop.poly;

public class Woker extends Employee {

    public Woker(String name, double salary) {
        super(name, salary);
    }

    public Woker() {
    }

    public void work(){
        System.out.println("worker:"+getName()+"is working");

    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
