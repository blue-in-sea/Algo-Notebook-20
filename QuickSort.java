public class QuickSort {
  
    public int[] quickSort() {
    
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
    
    }
    
    public int pivotIndex() {
    
    }

    public void swap() {
    
    }
}
