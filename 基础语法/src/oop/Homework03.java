package oop;

public class Homework03 {


    public static void main(String[] args) {
//更新价格 大于150的：150 100-150的：100
        Book b1 = new Book("《西游记》",156);
        Book b2 = new Book("《shuihu》",116);
        Book b3 = new Book("《as》",16);
        b1.updatePrice(b1);
        b2.updatePrice(b2);
        b3.updatePrice(b3);

    }

}

class Book{

    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice(Book b){
        if (this.price>150){
            this.price=150;
        }else if (this.price>100){
            this.price =100;
        }
        System.out.println(this.name+"\t"+this.price);
    }
}
