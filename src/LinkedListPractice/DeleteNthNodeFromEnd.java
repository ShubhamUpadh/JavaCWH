//package LinkedListPractice;
//class ListNode1 {
//    int val;
//    Node next;
//
//    ListNode1(){}
//    ListNode1(int val){ this.val = val;}
//    ListNode1(int val, Node next){
//        this.val = val;
//        this.next = next;
//    }
//
//}
//public class DeleteNthNodeFromEnd {
//    public static void main(String[] args) {
//
//    }
//    static ListNode1 sol(ListNode1 head, int n){
//        ListNode1 slow = head, fast = head;
//        ListNode1 dummy = head;
//        while (fast.next != null){
//            if(fast == head){
//                while (n > 0){
//                    if (fast.next == null) return slow.next;
//                    fast = fast.next;
//                    n--;
//                }
//            }
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        if (slow == head) return slow.next;
//
//        slow.next = slow.next.next;
//
//        return dummy;
//
//    }
//}
