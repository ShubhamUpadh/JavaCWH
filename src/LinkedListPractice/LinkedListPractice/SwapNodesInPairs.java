package LinkedListPractice;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        LinkedListUtility l = new LinkedListUtility();
        Node head = l.takeInput();
        l.printLL(head);

        Node swappedHead = swapNodesInPairs(head);
        l.printLL(swappedHead);
    }

    static Node swapNodesInPairs(Node head){
        
        if (head.next == null) return head;

        Node dummy = head.next;
        int i = 0;
        Node prev = null;

        while (head != null && head.next != null){
            // if (i++ > 10) break;
            System.out.println(head.val);
            
            Node temp = head.next;
            head.next = head.next.next;
            temp.next = head;
            
            if (prev != null) prev.next = temp; 
            prev = head;
            head = head.next;
            
        }

        return dummy;
    }
}
