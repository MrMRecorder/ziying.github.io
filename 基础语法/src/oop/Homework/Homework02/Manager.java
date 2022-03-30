package oop.Homework.Homework02;

public class Manager extends Employee {

    private double bonus;
    private double grade;

    public Manager(String name, int day, double salary, double bonus) {
        super(name, day, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double sum() {
        return super.sum()*grade+bonus;
    }
}
