package collection.set.hashset;

/**
 * @author 紫英
 * @version 1.0
 * @discription 模拟数组+链表
 */
public class HashsetStructure {
    public static void main(String[] args) {
        //1.创建一个Node型的数组(也成为表)
        Node[] table = new Node[16];
        //2.创建节点
        Node node01 = new Node("111",null);
        Node node02 = new Node("222",null);
        node01.next=node02;//将node02挂载到node01后面
        Node node03 = new Node("333",null);
        node02.next=node03;//将node03挂载到node02后面
        Node node04 = new Node("444",null);
        table[3]=node01;
        table[5]=node04;


    }
}
class Node{
    //节点类，用于存储数据，可以指向下一个节点来形成链表
    Object item; //存放数据
    Node next; //指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
