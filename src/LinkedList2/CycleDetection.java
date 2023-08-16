package LinkedList2;
public class CycleDetection {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        Node fast = head;
        Node slow = head;

        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) return true;
        }

        return false;
    }
}
