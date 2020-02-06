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
