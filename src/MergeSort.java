/**
 * Created by YSingh on 22/01/17.
 */
public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {10, 4, 7, 1, 8};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int [] mergeSort(int[] arr, int low, int high) {
        if(low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
        return arr;
    }

    //a[low] to a[mid] is sorted and a[mid + 1] to a[high] are sorted, we need to merge them
    private static void merge(int[] arr, int low, int mid, int high) {
        int len = high - low + 1;
        int [] out = new int[len];

        int left = low;
        int right = mid + 1;

        int count = 0;
        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                out[count] = arr[left];
                left++;
            }
            else {
                out[count] = arr[right];
                right++;
            }
            count++;
        }

        while (left <= mid) {
            out[count] = arr[left];
            count++;
            left++;
        }

        while (right < high) {
            out[count] = arr[right];
            right++;
            count++;
        }

        for (int i = low; i < len; i++) {
            arr[i] = out[i];
        }
    }
}
