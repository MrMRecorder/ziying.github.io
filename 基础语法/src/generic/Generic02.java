package generic;

import java.util.*;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Generic02 {
    public static void main(String[] args) {
        Student jack = new Student("jack", 15);
        Student marry = new Student("marry", 14);
        Student tom = new Student("tom", 11);
        HashSet<Student> students = new HashSet<Student>();
        /*
        public class HashMap<K,V>
         */
        students.add(jack);
        students.add(marry);
        students.add(tom);
        for (Student student : students) {
            System.out.println(student);
        }
        HashMap<String, Student> stuMap = new HashMap<String, Student>();
        stuMap.put("jack",jack);
        stuMap.put("marry",marry);
        stuMap.put("tom",tom);
        Set<String> keySet = stuMap.keySet();
        for (String s : keySet) {
            System.out.println("name:" + s +" "+ "age:" + stuMap.get(s));
        }

        System.out.println("=======迭代器遍历=======");
        Set<Map.Entry<String, Student>> entries = stuMap.entrySet();
        /*
        public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> es;
        return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
    }
         */
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        /*
        public final Iterator<Map.Entry<K,V>> iterator() {
            return new EntryIterator();
        }
         */
        while (iterator.hasNext()) {
            Map.Entry<String, Student> m =  iterator.next();
            System.out.println("name:"+m.getKey()+" "+ "age:" + m.getValue());

        }


    }
}
class Student{
    public String name;
    public int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}