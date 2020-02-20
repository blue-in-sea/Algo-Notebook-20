public class Partition {

    public void partition(int[] array, int pivotIndex) {
        if (array == null || array.length <= 1) {
            return array;
        }
        
        // 1. select the pivot 
        int pivot = array[pivotIndex];
        
        // 2. swap the pivot element to the rightmost position first
        int lastIndex = array.length - 1;
        swap(array, pivotIndex, lastIndex);
             
        // 3. partition
        int left = 0;
        int right = lastIndex - 1;
        while (left <= right) {
            if (array.left <= pivot) {
                left++;
            } else if (array.right >= pivot) { 
                right--;
            } else {
                swap(array, left, right);
            }
        }
             
        // 4. swap back to pivot element to the correct position
        swap(array, left, lastIndex);
    }
    
    private void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
    
    public static void main(String[] args) {
        Partition soln = new Partition();
        
        int[] array = null;
        soln.partition(array, 0);
        System.out.println(Arrays.toString(array));
        
        array = new int[];
        soln.partition(array, 0);
        System.out.println(Arrays.toString(array));
        
        array = new int[] {3, 2, 1};
        soln.partition(array, 0);
        System.out.println(Arrays.toString(array));
        
        array = new int[] {3, 2, 1, 2};
        soln.partition(array, 1);
        System.out.println(Arrays.toString(array));
        
        array = new int[] {4, 8, 5, 6, 3};
        soln.partition(array, 2);
        System.out.println(Arrays.toString(array));
    }
}

/**
 * Output
 * null
 * []
 * [1, 2, 3]
 * [1, 2, 2, 3]
 * [4, 3, 5, 6, 8]
 **/
