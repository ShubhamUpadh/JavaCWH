package LinkedListPractice;
public class ListNode {
    int val;
    Node next;

    ListNode(){}
    ListNode(int val){ this.val = val;}
    ListNode(int val, Node next){
        this.val = val;
        this.next = next;
    }

}
public class DeleteNthNodeFromEnd {
    public static void main(String[] args) {

    }
    static ListNode sol(ListNode head, int n){
        ListNode slow = head, fast = head;
        ListNode dummy = head;
        while (fast.next != null){
            if(fast == head){
                while (n > 0){
                    if (fast.next == null) return slow.next;
                    fast = fast.next;
                    n--;
                }
            }
            slow = slow.next;
            fast = fast.next;
        }

        if (slow == head) return slow.next;

        slow.next = slow.next.next;

        return dummy;

    }
}
