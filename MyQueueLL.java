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
    // single Linked List, insert (offer) from tail, delete (poll) from head
    
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
        if (head == null) {
            return null;
        }
        return head.value;
    }
    
    public void offer(Integer ele) {
        if (head == null) {
            // initial a new queue
            head = new ListNode(ele);
            tail = head;
        } else {
            // insert or offer at the tail of the Linked List
            tail.next = new ListNode(ele);
            tail = tail.next;
        }
    }
    
    public static void main(Strings args) {
        MyQueueLL queue = MyQueueLL();
        
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            System.out.println(queue.poll());
        }
        
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
