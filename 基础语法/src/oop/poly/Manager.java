package oop.poly;

public class Manager extends Employee {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("manager:"+getName()+" is managing");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}
