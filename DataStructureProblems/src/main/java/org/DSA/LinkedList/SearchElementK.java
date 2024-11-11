package org.DSA.LinkedList;

public class SearchElementK {
    static boolean findValue(LinkedListNode head, int K) {
        LinkedListNode current = head;
        while (current != null) {
            if (current.val == K) return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);
        head.next.next.next.next.next = new LinkedListNode(6);
        head.next.next.next.next.next.next = new LinkedListNode(7);
        head.next.next.next.next.next.next.next = new LinkedListNode(8);
        head.next.next.next.next.next.next.next.next = new LinkedListNode(9);
        head.next.next.next.next.next.next.next.next.next = new LinkedListNode(10);
        boolean result = findValue(head, 5);
        System.out.println(result);
        System.out.println(findValue(head, 11));
    }
}
