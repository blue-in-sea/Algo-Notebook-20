class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class ReverseLinkedList {
    // Time: O(n)
    // Extra Space: O(1)
    public ListNode reverseIterative(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;     // record the next node
            head.next = prev;              // reverse happens here 
            prev = head;                   // prev moves 1 step
            head = next;                   // head moves 1 step 
        }
        return prev;
    }
    
    // Time: O(n)
    // Extra Space: O(1)
    public ListNode reverse(ListNode head) {
        // base case 
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;          // newHead 一层层网上返回的时候其实是不变的：L32 只会 return 但是不会改值，每层独一只有 head 
    }
}
    
    
