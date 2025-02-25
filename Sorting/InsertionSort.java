import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int temp = arr[i];  // Current element to be inserted
            int j = i;
            
            // Move elements of arr[0..i-1] that are greater than temp one position ahead
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            
            arr[j] = temp; // Insert temp into the correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        insertionSort(arr);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
/*
 *  Time Complexity
    Best case (Already sorted): O(n)
    Worst case (Reverse sorted): O(n²)
    Average case: O(n²)
 */