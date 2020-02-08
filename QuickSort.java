public class QuickSort {
  
    public int[] quickSort(int[] array) {
        if (array == null) {
            return array;
        }
        quickSort(array, 0, array.length - 1);
        return array;
    }
    
    public void quickSort(int[] array, int left, int right) {
        // base case
        if (left > right) {
            return;
        }
        
        int pivotIndex = partition(array, left, right);
 
        // pivot is already at its position, when we do the recursive call
        // the two partitions, pivot should not be inlcude in any them
        quickSort(array, left, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, right);
    }
    
    public int partition(int[] array, int left, int right) {
        int pivotIndex = pivotIndex(left, right);
        int pivot = array[pivotIndex];
        // swap pivot to the rightmost pos
        swap(array, pivotIndex, right);
        int lbound = left;
        int rbound = right - 1;
        
        while (lbound <= rbound) {
            if (array[lbound] <= pivot) {
                lbound++;
            } else if (array[right] >= pivot) {
                rbound--;
            } else {
                swap(array, lbound++, rbound--);
            }
        }
        
        // swap pivot back to the correct pos
        swap(array, lbound, right);
        return lbound;
    }
    
    public int pivotIndex(int left, int right) {
        return left + (int) (Math.random() * (right - left + 1));
        // Math.random() return a random number between [0, 1)
    }

    public void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
