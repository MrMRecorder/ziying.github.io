package collection.list.linkedlist;

/**
 * @author 紫英
 * @version 1.0
 * @discription 模拟一个双向链表
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //先创建三个节点
        Node node01 = new Node("111");
        Node node02 = new Node("222");
        Node node03 = new Node("333");
        //将三个节点连接起来形成双向链表
        // node01 -> node02 -> ndoe03
        node01.next = node02;
        node02.next = node03;
        // node01 <- node02 <- ndoe03
        node02.pre = node01;
        node03.pre = node02;
        //头节点指向第一个
        Node first = node01;
        //尾节点指向最后一个
        Node last = node03;

        //正向遍历双向链表
        System.out.println("===正向遍历双向链表===");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        //逆向遍历双向链表
        System.out.println("===逆向遍历双向链表===");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        //在node01和node02之间添加一个新的node
        // 1.先创建一个新节点
        Node node = new Node("666");
        // 2.将其加入到双向链表中
        node01.next = node;
        node.next = node02;

        node.pre = node01;
        node02.pre = node;

        //重置first后再进行一次正向遍历
        first = node01;
        //添加数据后正向遍历双向链表
        System.out.println("===添加数据后正向遍历双向链表===");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //重置last后再进行一次逆向遍历
        last = node03;
        //添加数据后逆向遍历双向链表
        System.out.println("===添加数据后逆向遍历双向链表===");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}

class Node {
    public Object item;//真正存放的数据
    public Node next;//指向下一个节点
    public Node pre;//指向前一个节点
    //构造器
    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name = " + item;
    }
}
