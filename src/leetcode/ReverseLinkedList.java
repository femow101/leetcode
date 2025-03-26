package leetcode;

/**
 * 206. Reverse Linked List
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        ListNode before = null;
        ListNode curNode = head;

        while (curNode != null) {
            ListNode next = curNode.next;
            curNode.next = before;
            before = curNode;
            curNode = next;
        }

        return curNode == null ? before : curNode;
    }

    private class ListNode {
        ListNode next;
    }
}
