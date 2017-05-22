/**
 * Created by YSingh on 23/05/17.
 */
public class RepeatedElements {
    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 1, 3, 6, 6};
        int arr_size = arr.length;
        //printRepeating(arr, arr_size);
        printDuplicates(arr, arr_size);
    }

    private static void printDuplicates(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] = arr[arr[i] % n] + n;
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] / n > 1) {
                System.out.println(i);
            }
        }
    }

    private static void printRepeating(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if(arr[Math.abs(arr[i])] >=0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else {
                System.out.println(Math.abs(arr[i]));
            }
        }
    }
}
