import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinCoinSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3, 5, 11));
        int S = 8;
        System.out.println("Minimum number of coins needed to get the sum: " + minCoinSum(arr, S));
    }

    private static Integer minCoinSum(ArrayList<Integer> arr, int S) {
        Integer [] M = new Integer[S + 1];
        Integer [] C = new Integer[S + 1];
        Arrays.fill(M, Integer.MAX_VALUE);
        M[0] = 0;
        C[0] = 0;

        for (int s = 1; s <= S; s++) {
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(j) <= s) {
                    M[s] = Math.min(M[s - arr.get(j)] + 1, M[s]);
                    C[s] = arr.get(j);
                }
            }
            if(M[s] == Integer.MAX_VALUE) {
                M[s] = 0;
                C[s] = C[s - 1];
            }
        }

        //printing the coins that lead to sum S

        System.out.println("Coins used to get the sum: ");

        int k = S;
        while (C[k] > 0) {
            System.out.println(C[k]);
            k = k - C[k];
        }

        return M[S];
    }
}
