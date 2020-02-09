class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class MiddleNodeOfLinkedList {
    // Time: O(1.5n)
    // Extra Space: O(1)
    public ListNode findMiddle(ListNode head) {
        // corner case
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}
