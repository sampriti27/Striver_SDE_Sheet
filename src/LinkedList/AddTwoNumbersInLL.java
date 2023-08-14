package LinkedList;

public class AddTwoNumbersInLL {
      class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
            ListNode newHead = null;
            ListNode temp = newHead;
            ListNode temp1 = head1;
            ListNode temp2 = head2;
            int c = 0;
            while(temp1 != null && temp2 != null){
                int val = (temp1.val + temp2.val + c);
                ListNode node = new ListNode(val % 10);
                c = getCarry(val);
                if(newHead == null){
                    newHead = temp = node;
                }
                else{
                    temp.next = node;
                    temp = temp.next;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            while(temp1 != null){
                int val = (temp1.val + c);
                ListNode node = new ListNode(val % 10);
                c = getCarry(val);
                if(newHead == null){
                    newHead = temp = node;
                }
                else{
                    temp.next = node;
                    temp = temp.next;
                }
                temp1 = temp1.next;

            }

            while(temp2 != null){
                int val = (temp2.val + c);
                ListNode node = new ListNode(val % 10);
                c = getCarry(val);
                if(newHead == null){
                    newHead = temp = node;
                }
                else{
                    temp.next = node;
                    temp = temp.next;
                }
                temp2 = temp2.next;
            }

            if(c > 0){
                ListNode node = new ListNode(c);
                temp.next = node;
                temp = temp.next;
            }
            return newHead;
        }

        static int getCarry(int a){
            return a/10;
        }

    }
}
