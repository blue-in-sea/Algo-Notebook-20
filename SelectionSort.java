/* *
 * Given an array of integers, sort the elements in the array in ascending order. The selection sort algorithm should be used to solve this problem.
 * 
 * Examples
 *
 * {1} is sorted to {1}
 * {1, 2, 3} is sorted to {1, 2, 3}
 * {3, 2, 1} is sorted to {1, 2, 3}
 * {4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
*/

public class Solution {
    public int[] select(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
        
        return array;
    }
    
    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}



/* *
 * 1) fib number
 * 2) a to the power of b
 * 3) selection sort
 *    3.1 sort with 3 stacks 
 * 4) Merge sort
 *    4.1 Merge sort ABCD1234 --> A1B2C3D4
 *    4.2 Merge sort A1B2C3D4 --> ABCD1234
 *    4.3 Quick sort (partition)
 * 5) Quick sort
 *    5.1 Array shuffling (与 quick sort 物理意义一致)
 *    5.2 Rainbow sort (与 quick sort 物理意义一致) 两个指针 & 三个挡板
 */
