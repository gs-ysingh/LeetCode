/**
 * Created by YSingh on 22/01/17.
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {10, 4, 7, 1, 8};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static int [] quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int partition = quick(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
        return arr;
    }
    private static int quick(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high]; // Pivot can change to low, high or it can be random
        int pivotIndex = high;
        if(low < high) {
            for (int j = low; j < high; j++) {
                if(arr[j] <= pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
        }
        swap(arr, i + 1, pivotIndex);
        return i + 1;
    }

    private static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
