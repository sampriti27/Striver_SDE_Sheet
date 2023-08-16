package LinkedList2;
class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

public class LinkedListIntersection {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node temp1 = firstHead;
        Node temp2 = secondHead;

        while (temp1 != temp2) {
            temp1 = temp1 == null ? secondHead : temp1.next;
            temp2 = temp2 == null ? firstHead : temp2.next;
        }
        return temp1.data;
    }
}
