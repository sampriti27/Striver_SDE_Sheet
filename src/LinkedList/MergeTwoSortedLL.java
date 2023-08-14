package LinkedList;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class MergeTwoSortedLL {
    // T.C -> O(N) S.C -> O(N)
//    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
//        // Write your code here.
//        if(first == null && second == null) return null;
//        if(first == null) return second;
//        if(second == null) return first;
//
//        LinkedListNode<Integer> tempA = first;
//        LinkedListNode<Integer> tempB = second;
//        LinkedListNode<Integer> head = null;
//        LinkedListNode<Integer> temp = head;
//
//        while(tempA != null && tempB != null){
//            if(tempA.data <= tempB.data){
//                LinkedListNode<Integer> node = new LinkedListNode<Integer>(tempA.data);
//                if(head == null){
//                    head = temp = node;
//                }
//                else{
//                    temp.next = node;
//                    temp = temp.next;
//                }
//                tempA = tempA.next;
//            }
//            else{
//                LinkedListNode<Integer> node = new LinkedListNode<Integer>(tempB.data);
//                if(head == null){
//                    head = temp = node;
//                }
//                else{
//                    temp.next = node;
//                    temp = temp.next;
//                }
//                tempB = tempB.next;
//            }
//        }
//
//        while(tempA != null){
//            LinkedListNode<Integer> node = new LinkedListNode<Integer>(tempA.data);
//            temp.next = node;
//            temp = temp.next;
//            tempA = tempA.next;
//        }
//
//        while(tempB != null){
//            LinkedListNode<Integer> node = new LinkedListNode<Integer>(tempB.data);
//            temp.next = node;
//            temp = temp.next;
//            tempB = tempB.next;
//        }
//
//        return head;
//    }
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        // Write your code here.
        if(first == null && second == null) return null;
        if(first == null) return second;
        if(second == null) return first;

        LinkedListNode<Integer> l1 = null;
        LinkedListNode<Integer> l2 =  null;

        if(first.data < second.data){
            l1 = first;
            l2 = second;
        }else{
            l1 = second;
            l2 = first;
        }
        LinkedListNode<Integer> res = l1;
        while(l1 != null && l2 != null){
            LinkedListNode<Integer> temp = null;

            while(l1 != null && l1.data <= l2.data){
                temp = l1;
                l1 = l1.next;
            }

            temp.next = l2;

            //swap
            LinkedListNode<Integer> temp2 = l1;
            l1 = l2;
            l2 = temp2;
        }
        return res;
    }
}
