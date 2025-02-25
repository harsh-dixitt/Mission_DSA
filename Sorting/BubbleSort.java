import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag;
        
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            
            // Compare adjacent elements and swap if needed
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; // Mark as swapped
                }
            }
            
            // If no swaps were made, the array is already sorted
            if (!flag) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        bubbleSort(arr);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

/*
 * Time Complexity
   Best case (Already sorted): O(n)
   Worst case (Reverse sorted): O(n²)
   Average case: O(n²)
 */