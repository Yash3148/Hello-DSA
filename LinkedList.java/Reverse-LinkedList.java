----------------------------------------------------- Iterative Method -------------------------------------------------
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OOPS {
    public static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prevNode = null;
        Node currNode = head;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printList(head);

        Node reversedHead = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }
}
// output ---> Original Linked List:
//             1 -> 2 -> 3 -> 4 -> NULL
//             Reversed Linked List:
//             4 -> 3 -> 2 -> 1 -> NULL
---------------------------------------------------------------------------------------------------------------------------
import java.util.LinkedList;

public class OOPS {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original Linked List:");
        System.out.println(list);

        LinkedList<Integer> reversedList = reverseList(list);

        System.out.println("Reversed Linked List:");
        System.out.println(reversedList);
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<Integer>();
        for (Integer item : list) {
            reversedList.addFirst(item);
        }
        return reversedList;
    }
}
// output ---> Original Linked List:
//            [1, 2, 3, 4]
//            Reversed Linked List:
//            [4, 3, 2, 1]
---------------------------------------------------------------------------------------------------------------------------
