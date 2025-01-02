package org.DSA.LinkedList;

public class MergeTwoSortedLinkedListTwoPointer {
    public static LinkedListNode mergeTwoLists(LinkedListNode list1, LinkedListNode list2) {
        LinkedListNode dummy = new LinkedListNode(-1);
        LinkedListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else if (list2 != null) {
            temp.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create two sorted linked lists
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        LinkedListNode list1 = LinkedListUtils.createLinkedList(arr1);
        LinkedListNode list2 = LinkedListUtils.createLinkedList(arr2);

        // Merge the two lists
        LinkedListNode mergedList = mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.print("Merged Sorted Linked List: ");
        LinkedListUtils.printLinkedList(mergedList);
    }
}
