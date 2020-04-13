public class QueueByTwoStacks {
  private Deque<Integer> s1;  // in
  private Deque<Integer> s2;  // out

  public QueueByTwoStacks() {
    s1 = new ArrayDeque<>();
    s2 = new ArrayDeque<>();
  }
  
  public Integer poll() {
    move();
    return s2.pollFirst();
  }
  
  public void offer(int element) {
    s1.offerFirst(element);
  }
  
  public Integer peek() {
    move();
    return s2.peekFirst();
  }
  
  public int size() {
    return s1.size() + s2.size();
  }
  
  public boolean isEmpty() {
    return s1.isEmpty() && s2.isEmpty();
  }

  private void move() {
    if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        s2.offerFirst(s1.pollFirst());
      }
    }
  }
}

/* *
 * CART
 * APIs: add()    --- Time = O(1), 
 *       remove() --- Time = O(n), Amortized time = O(1)
 *       
 * queue <--  1 2 3 4     5 6 7 8  <-- 
 *
 * stack1 [ 1 2 3 4 (s1.offer())
 * stack2 [ 
 *
 * stack1 [  
 * stack2 [ 4 3 2 1 (s2.peek && s2.pop())
 **/
