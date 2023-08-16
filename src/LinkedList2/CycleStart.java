package LinkedList2;

public class CycleStart {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                while(slow != temp){
                    temp = temp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;

    }
}
