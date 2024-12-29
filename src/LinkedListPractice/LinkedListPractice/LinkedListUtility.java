package LinkedListPractice;

import java.util.Arrays;
import java.util.Scanner;

public class LinkedListUtility {
    public Node takeInput(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter elements till -1");
        String ip = sc.nextLine();

        String[] ipArr = ip.split(" ");

        int[] arr = Arrays.stream(ipArr).mapToInt(Integer::parseInt).toArray();
        sc.close();
        return arrToLinkedList(arr);
    }

    public Node arrToLinkedList(int[] arr){
        Node head = null, tail = null;

        for (int i = 0; i < arr.length; i++){
            if (head == null){
                head = new Node(arr[i]);
                tail = head;
            }
            else{
                Node temp = new Node(arr[i]);
                tail.next = temp;
                tail = tail.next;
            }
        }
        return head;
    }

    public void printLL(Node head){
        while (head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    

}
