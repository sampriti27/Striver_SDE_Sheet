package LinkedList2;

public class ReverseNodeinKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1 || head == null || head.next == null) return head;

        int len = findLength(head); // find the length of the given list;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur, nextNode;

        while((len/k) > 0){
            cur = pre.next; // 1st node
            nextNode = cur.next; //2nd node

            // run the loop for gorup of k elements
            for(int i = 1; i < k; i++){
                cur.next = nextNode.next;
                nextNode.next = pre.next;
                pre.next = nextNode;
                nextNode = cur.next;
            }
            pre = cur;
            len -= k;
        }
        return dummy.next;
    }
    private int findLength(ListNode head){
        ListNode temp = head;
        int cnt = 1;

        while(temp.next != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}
