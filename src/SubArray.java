/**
 * Created by YSingh on 03/03/17.
 */
public class SubArray {
    public static void main(String[] args) {
        int size = 4;
        int [] arr = new int[size];
        for (int i = 1; i <= size; i++) {
            arr[i - 1] = i;
        }
        System.out.println("Sub arrays: ");
        printSubArray(arr, size);
        System.out.println("Subsequence: ");
        printSubsequence(arr, size);
    }

    private static void printSubsequence(int[] arr, int size) {
        int power = (int)Math.pow(2, size);
        for (int i = 0; i < power; i++) {
            for (int j = 0; j < size; j++) {
                if((i & (1 << j)) > 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void printSubArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
