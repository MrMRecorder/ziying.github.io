package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 紫英
 * @version 1.0
 * @discription
 */
public class Col01 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(new Book("《三国演义》", "罗贯中", 56.9));
        coll.add(new Book("《水浒传》", "施耐庵", 46.9));
        coll.add(new Book("《西游记》", "吴承恩", 66.9));
        Iterator iterable = coll.iterator();

        while (iterable.hasNext()) {

            Object next = iterable.next();
            System.out.println(next);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
