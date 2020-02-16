class ListNode {
    int value;
    ListNode next;
    public ListNode(int value) {
        this.value = value;
        next = null;
}

public class MyQueueLL {
    private ListNode head;
    private ListNode tail;
    // single linked-list, insert (offer) from tail, delete (poll) from head
    
    public MyQueueLL() {
        head = tail = null;
    }
    
    public boolean isEmpty() {
        return head == null && tail == null;
    }
    
    public Integer poll() {
        if (head == null) {
            return null;
        }
        
        ListNode node = head;
        head = head.next;
        
        if (head == null) {
            tail == null;
        }
        head.next = null;
        return node.value;  
    }
    
    public Integer peek() {
        
    }
    
    public void offer() {
        
    }
    
    public static void main(Strings args) {
        
    }
}
