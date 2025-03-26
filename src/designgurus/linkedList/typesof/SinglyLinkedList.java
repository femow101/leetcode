package designgurus.linkedList.typesof;

/**
 * Singly Linked List (SLL)
 * 
 * - Each node contains data and a pointer to the next node.
 * - Traversal is one-directional, meaning we can only move forward through the list.
 * - The last node’s pointer is NULL, indicating the end of the list.
 */
public class SinglyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
