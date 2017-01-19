import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YSingh on 19/01/17.
 */
public class CoinSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int S = 12;
        int N = 6;
        Integer min = Integer.MAX_VALUE;
        System.out.println(coinSum(arr, S, N, min));
    }

    private static Integer coinSum(ArrayList<Integer> arr, int S, int N, Integer min) {
        Integer sum = getSum(arr);
        if(sum == S) {
            return arr.size();
        }

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> a = new ArrayList<>(arr);
            a.remove(i);
            min = Math.min(coinSum(a, S, N - 1, min), min);
        }

        return min;
    }

    private static Integer getSum(ArrayList<Integer> arr) {
        Integer sum = 0;
        for(Integer val : arr) {
            sum += val;
        }
        return sum;
    }
}
