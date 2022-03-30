package oop.encap;

public class Person {

    public String name;
    private int age;
    private double salary;
    private String job;

    public Person() {
    }

    public Person(String name, int age, double salary, String job) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setJob(job);

    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
        if (name.length()>=2&&name.length()<=6)
        {
            this.name = name;
        }else {
            System.out.println("请输入2-6个汉字");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1&& age <= 120){
            this.age = age;
        }else{
            System.out.println("请输入正确的年龄（1-120）");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String info(){
        return "name:"+name+" age:"+age+" salary:"+salary+" job:"+job;
    }
}
