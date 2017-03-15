/**
 * Created by YSingh on 16/03/17.
 */
public class TopTwo {
    public static void main(String[] args) {
        int [] arr = {30, 2, 10, 1, 9, 6, 29};
        printTopTwoValues(arr);
    }

    private static void printTopTwoValues(int[] arr) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(a < arr[i]) {
                a = arr[i];
            }

            if(b < arr[i] && a != arr[i]) {
                b = arr[i];
            }
        }

        System.out.println("MAX: " + a + " 2nd Max: " + b);
    }
}
