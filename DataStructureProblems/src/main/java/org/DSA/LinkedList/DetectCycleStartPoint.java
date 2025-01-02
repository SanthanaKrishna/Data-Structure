package org.DSA.LinkedList;

/**
 * Floyd's Cycle Detection Algorithm (Tortoise and Hare approach)
 */
public class DetectCycleStartPoint {
    public static LinkedListNode findCycleStart(LinkedListNode head) {
        if (head == null || head.next == null) return null;

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Cycle detected
                break;
            }
        }
        // If no cycle is detected, return null
        if (fast == null || fast.next == null) return null;

        // Step 2: Find the starting point of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next; // Move slow one step
            fast = fast.next; // Move fast one step
        }
        //or
//        LinkedListNode i = head, j= slow;
//        while (i != j){
//            i = i.next;
//            j=j.next;
//        }
//        return i;

        return slow;// The point where slow and fast meet is the start of the cycle
    }


    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);

        // Create a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        // Detect the start of the cycle
        LinkedListNode cycleStart = findCycleStart(head);
        if (cycleStart != null) {
            System.out.println("The cycle starts at node with value: " + cycleStart.data);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}
