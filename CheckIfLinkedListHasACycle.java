class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
    }
}

public class CheckIfLinkedListHasACycle {
    
    public boolean checkCircle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (sloww == fast) {
                return true;
            }
        }
        
        return false;
    }
}

// follow-up: how to find the beginning node 
// 前部分一样。在第一次相遇后，把其中一个 node 移到开头，让两个以同步的速度来走。
// slow 和 fast 差的是环长的整数倍
