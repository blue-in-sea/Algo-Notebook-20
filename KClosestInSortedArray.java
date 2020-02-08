public class KClosestInSortedArray {
    
    public int[] kClosest(int[] array, int target, int k) {
        if (array == null || array.length == 0) {
            return array;
        }
        
        if (k == 0) {
            return new int[0];
        }
        
        int l = helper(array, target);
        int r = l + 1;
        int[] res = new int[k];
        
        for (int i = 0; i < k; i++) {
            // we can advance left pointer, if
            //  1) right pointer is out-of-bound
            //  2) right pointer is not out-of-bound:
            //     2.1 left pointer is not out-of-bound (since we are not assume k < array.length, left might be out-of-bound)
            //  && 2.2 left pointer is closer to target
            if (r > array.length || l >= 0 && target - array[l] <= array[r] - target) {
                res[i] = array[l++];
            } else {
                // else if (r < array.length && (l < 0 || target - array[l] > array[r] - target))
                res[i] = array[r--];
            }
        }
      
        return res;
    }
    
    public int helper(int[] array, int target) {
    
    }
}
