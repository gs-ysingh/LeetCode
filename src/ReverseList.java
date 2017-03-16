/**
 * Created by YSingh on 16/03/17.
 */

class Node {
    int data;
    Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class ReverseList {
    public static void main(String[] args) {
        Node a = new Node();
        a.data = 1;

        Node b = new Node();
        b.data = 2;

        Node c = new Node();
        c.data = 3;

        a.next = b;
        b.next = c;
        c.next = null;

        Node list = a;

        //printReverse(list);
        printRevers2(list);
    }

    private static void printReverse(Node list) {
        if(list == null) {
            return;
        }
        printReverse(list.next);
        System.out.println(list.data);
    }

    private static void printRevers2(Node list) {
        while (list != null) {
            printReverse(list.next);
            System.out.println(list.data);
        }
    }
}
