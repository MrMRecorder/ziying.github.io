package oop.override;

public class Student extends Person {

    private String id;
    private int score;
    public  char a='b';
    public Student() {
    }

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
       return super.say()+"id: "+id+"score:"+score;
    }
}
