import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by YSingh on 20/01/17.
 */
public class MinCoinSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3, 5, 11));
        int S = 8;
        System.out.println(minCoinSum(arr, S));
    }

    private static Integer minCoinSum(ArrayList<Integer> arr, int S) {
        Integer [] M = new Integer[S + 1];
        Arrays.fill(M, Integer.MAX_VALUE);
        M[0] = 0;

        for (int s = 1; s <= S; s++) {
            int flag = 1;
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(j) <= s) {
                    M[s] = Math.min(M[s - arr.get(j)] + 1, M[s]);
                    flag =0;
                }

            }
            if(flag == 1) {
                M[s] = 0;
            }
        }
        return M[S];
    }
}
