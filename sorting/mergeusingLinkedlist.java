package sorting;

public class mergeusingLinkedlist {

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode right = slow.next;
        slow.next = null;

        ListNode left = mergeSort(head);
        right = mergeSort(right);

        return merge(left, right);
    }

    static ListNode merge(ListNode first, ListNode second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }

        ListNode result;
        if (first.data <= second.data) {
            result = first;
            result.next = merge(first.next, second);
        } else {
            result = second;
            result.next = merge(first, second.next);
        }
        return result;
    }

    static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(10);
        head.next = new ListNode(30);
        head.next.next = new ListNode(20);
        head.next.next.next = new ListNode(50);
        head.next.next.next.next = new ListNode(40);

        head = mergeSort(head);
        printList(head);
    }
}
    

