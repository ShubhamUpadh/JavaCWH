package LinkedListPractice;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        LinkedListUtility l = new LinkedListUtility();
        Node head = l.takeInput();
        l.printLL(head);
        Node newHead = oddEvenOptimised(head);
        l.printLL(newHead);
    }
    static Node bruteForceSol(Node head){
        return new Node(0);
    }

    static Node oddEvenOptimised(Node head){
        //Two pointer approach, be VERY careful in the end range

        if (head == null || head.next == null || head.next.next ==null) return head;
        
        Node oddHead = head;
        Node evenHead = head.next;
        Node oddPt = head;
        Node evenPt = head.next;

        while (oddPt != null && (evenPt != null)){
            if (oddPt.next.next == null) break;
            oddPt.next = oddPt.next.next;
            if(oddPt.next.next == null) {
                oddPt = oddPt.next;
                break;
            }
            evenPt.next = oddPt.next.next;
            oddPt = oddPt.next;
            evenPt = evenPt.next;
        }
        oddPt.next = evenHead;
        evenPt.next = null;
        return oddHead;
    }
}
