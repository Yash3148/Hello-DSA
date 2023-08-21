class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListOperations {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                return head; // Invalid case
            }
            fast = fast.next;
        }

        // Move fast to the end, maintaining the gap
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2; // Remove 2nd node from the end

        LinkedListOperations operations = new LinkedListOperations();
        ListNode result = operations.removeNthFromEnd(head, n);

        // Print the resulting linked list
        ListNode current = result;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
// output ----> 1 2 3 5        /// Find the nth node from the end & remove it.
---------------------------------------------------------------------------------------------------------------------
import java.util.Stack;

class  ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // Empty or single-node list is a palindrome
        }

        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // For odd number of nodes, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 2 -> 1 (Palindrome)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        LinkedListPalindrome palindromeChecker = new LinkedListPalindrome();
        boolean isPalindrome = palindromeChecker.isPalindrome(head);

        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
// output ----> Is the linked list a palindrome? true      /// Check if a Linked List is a palindrome
---------------------------------------------------------------------------------------------------------------------
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListLoopDetection {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // Empty or single-node list cannot have a cycle
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move one step
            fast = fast.next.next;  // Move two steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle detected
    }

    public static void main(String[] args) {
        // Create a sample linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 2 (Loop)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creating a loop

        LinkedListLoopDetection loopDetector = new LinkedListLoopDetection();
        boolean hasCycle = loopDetector.hasCycle(head);

        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
// output ----> Does the linked list have a cycle? true     /// Detecting Loop in a Linked List.
---------------------------------------------------------------------------------------------------------------------
