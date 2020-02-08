public class KClosestInSortedArray {
    
    public int[] kClosest(int[] array, int target, int k) {
        if (array == null || array.length == 0) {
            return array;
        }
        
        if (k == 0) {
            return new int[0];
        }
        
        int l = helper();
        int r = l + 1;
        int[] res = new int[k];
        
        for (int i = 0; i < k; i++) {
        
        
        }
        
        
        return res;
    }
    
    public int helper(int[] array, int target) {
    
    }
}
