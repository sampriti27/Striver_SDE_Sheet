package LinkedList;
class Node {
    public int data;
    public Node next;
    public Node prev;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
};
public class DeleteNthNodeFromEnd {
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        if(head == null) return null;
        Node temp = head;
        int length = 0;

        while(temp != null){
            length++;
            temp = temp.next;
        }

        int count = 1;
        temp = head;
        if(K == length){
            head = head.next;
            return head;
        }

        while(count != length - K){
            temp = temp.next;
            count++;
        }

        if(K == 0) temp.next = null;
        else{
            temp.next = temp.next.next;
        }


        return head;
    }
}
