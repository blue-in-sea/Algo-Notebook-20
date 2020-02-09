public class RainbowSort {

    public int[] rainbowSort(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        
        // Three pos to define four intervals: 
        // 1. the left side of (i) is -1, exclusive of i
        // 2. the right side of (k) is 1, exclusive of k
        // 3. bewtween (i) and (j) is 0, exclusive of j
        // 4. between (j) and (k) will be the area to be determined
        int i = 0;
        int j = 0;
        int k = array.length - 1;
        
        while (j <= k) {
            if (array[i] == -1) {
                i++;
            } else if (array[j] == 0) {
                j++;
            } else {
                swap(array, j++, k--);
            }
        }
        return array;
    }
    
    public void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}


// Bucket Sort used in 大量重复的情况
