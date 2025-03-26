package designgurus.linkedList.typesof;

/**
 * Doubly Linked List (DLL)
 * 
 * - Each node contains data, a pointer to the next node, and a pointer to the previous node.
 * - This allows movement both forward and backward.
 */
public class DoublyLinkedList {
    
    class ListNode {
        int val;
        ListNode prev, next; // Pointers to previous and next nodes
    
        ListNode(int val) {
            this.val = val;
            this.prev = this.next = null;
        }
    }
}
