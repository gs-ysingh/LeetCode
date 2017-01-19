import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by YSingh on 20/01/17.
 */
public class MinCoinSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 3, 5));
        int S = 11;
        System.out.println(minCoinSum(arr, S));
    }

    private static Integer minCoinSum(ArrayList<Integer> arr, int S) {
        Integer [] M = new Integer[S + 1];
        Arrays.fill(M, Integer.MAX_VALUE);
        M[0] = 0;

        for (int i = 1; i <= S; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(j) <= i) {
                    M[i] = Math.min(M[i - arr.get(j)] + 1, M[i]);
                }

            }
        }
        return M[S];
    }
}
