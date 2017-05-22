import java.util.Arrays;

/**
 * Created by YSingh on 23/05/17.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arr_size = A.length;

        find3Numbers(A, arr_size, sum);
    }

    private static void find3Numbers(int[] a, int n, int sum) {
        Arrays.sort(a);
        int tempSum = 0;

        for (int i = 0; i < n - 2; i++) {
            tempSum = sum - a[i];

            int l = i + 1;
            int h = n - 1;

            while (l < h) {
                if(a[l] + a[h] == tempSum) {
                    System.out.println(a[i] + ", " + a[l] + ", " + a[h]);
                    break;
                }
                else if(a[l] + a[h] > tempSum) {
                    h--;
                }
                else {
                    l++;
                }
            }

        }
    }
}
