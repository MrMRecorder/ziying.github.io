package oop.override;

public class Person {

    private String name;
    private int age;
//    public  char a='a';

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    重写equals方法,判断两对象是否相等（属性完全一致）


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age &&  Objects.equals(name, person.name);
//    }

@Override
public boolean equals(Object obj){

        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return this.age==((Person) obj).getAge()&&this.name.equals(((Person) obj).name);

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){
       return "my name is:"+name + age+" 岁";
    }

}
