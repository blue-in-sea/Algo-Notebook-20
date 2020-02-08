/**
 * Given a target integer T and an integer array A sorted in ascending order, 
 * find the index i such that A[i] == T or return -1 if there is no such index. 
 *
 * Assumption: There can be duplicate elements in the array, 
 * and you can return any of the indices i such that A[i] == T.
 */
public class ClassicalBinarySearch {

    public int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }
        
        int l = 0;
        int r = array.length - 1;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {  // target 在 mid 的右区间
                l = mid + 1;   
            } else {
                r = mid - 1;
            }
        }
        
        return -1;
    }
    
    public int binarySearch(
}
        
/**
 * Unit Test
 * 1. array is null
 * 2. array is empty
 * 3. array contains duplications
 * 4. target not found
 * . . .
 */
