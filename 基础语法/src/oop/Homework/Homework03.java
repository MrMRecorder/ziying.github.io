package oop.Homework;

public class Homework03 {

    public static void main(String[] args) {

        Student student = new Student("jack",'男',21,"123456");
        System.out.println(student.play());


        Person[] people = new Person[4];
        people[0]=new Student("along",'1',25,"180950107");
        people[1]=new Student("alongk",'1',23,"180950108");
        people[2]=new Teacher("ab",'1',29,8);
        people[3]=new Teacher("ac",'1',26,2);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println("=========================================");
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 0; j < people.length-1-i; j++) {
                Person temp = people[0];
                if (people[j].getAge()<people[j+1].getAge()){
                    temp = people[j+1];
                    people[j+1]=people[j];
                    people[j]=temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }


        System.out.println("=========================================");

        for (int i = 0; i < people.length; i++) {
            new Homework03().info(people[i]);
        }

        

    }

    private static void test() {
    }

    public void info(Person person){
        if (person instanceof Student){
            ((Student)person).study();
        }else if (person instanceof Teacher){
            ((Teacher)person).teach();
        }
    }

}

class Person{

    private String name;
    private char sex;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public String play(){
        return name+"爱玩";
    }



    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person{

  private String stu_id;


    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "stu_id='" + stu_id + '\'' +
                '}';
    }

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("学习");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }
}

class Teacher extends Person{

    private int work_age;


    @Override
    public String toString() {
        return super.toString()+"Teacher{" +
                "work_age=" + work_age +
                '}';
    }

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("教书");
    }
    @Override
    public String play() {
        return super.play()+"象棋";
    }
}
