package generic;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Homework01 {
    public static void main(String[] args) {

        Dao<User> userDao = new Dao<>();
        userDao.save("01", new User(1, 20, "jack"));
        System.out.println(userDao.list());
    }

    @Test
    public void test() {
        Dao<User> userDao = new Dao<>();
        userDao.save("01", new User(1, 20, "jack"));
        userDao.save("02", new User(2, 21, "cc"));
        userDao.save("03", new User(3, 210, "bb"));
//        System.out.println("原版：");
//        System.out.println(userDao.list());
        System.out.println("获取01：");
        System.out.println(userDao.get("01"));
        System.out.println("删除01");
        userDao.delete("01");
        userDao.update("03", new User(66, 45, "456"));
        System.out.println("修改后：");
        System.out.println(userDao.list());


    }
}

class Dao<T> {
    Map<String, T> map = new HashMap<>();
    List<T> list = new ArrayList<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            list.add(map.get(s));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}

