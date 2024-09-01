import java.util.LinkedList;

class Node<E>{
    E data;
    Node<E> prev;
    Node<E> next;
    Node(Node<E> prev, E element, Node<E> next){
        this.prev = prev;
        this.data = element;
        this.next = next;
    }
}

class LinkedListCustom<E>{
    private Node<E> head;
    private Node<E> tail;
    int size;

    public void addFirst(E element){
        Node<E> newNode = new Node<>(null, element, null);
        if (head == null){
            tail = newNode;
        }
        else {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(E element){
        Node<E> newNode = new Node<>(null,element,null);
        if (size == 0){
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public E removeFirst(){
        if (head == null){
            return null;
        }
        else{
            Node<E> retVal = head;
            head = head.next;
            head.prev = null;
            size--;
            return retVal.data;
        }
    }

    public E removeLast(){
        if (tail == null){
            return null;
        }
        else {
            Node<E> newNode = tail;
            if (head == tail){
                head = null;
                tail = null;
            }
            else{
                tail = tail.prev;
                tail.next = null;
            }
            size--;
            return newNode.data;
        }
    }

    public boolean removeElement(E element){
        if (head == null){
            return true;
        }

        while (head != null){
            if (head.data == element){
                return true;
            }
            head = head.next;
        }
        return false;
    }

}

public class linkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l2.add(15);
        l1.addAll(l2);
        l1.addLast(78);
        for (Integer integer : l1) {
            System.out.println(integer);
        }
        System.out.println(l1);
    }
}
