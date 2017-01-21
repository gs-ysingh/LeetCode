import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by YSingh on 20/01/17.
 */
public class LongestSubsequence {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10, 22, 9, 33, 21, 50, 41, 60));
        System.out.println(longestSubsequence(arr));
    }

    private static Integer longestSubsequence(ArrayList<Integer> arr) {
        int size = arr.size();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            L.add(1);
        }

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    L.set(i, Math.max(L.get(j) + 1, L.get(i)) );
                }
            }
        }
        Integer max = 0;

        for (int i = 0; i < size; i++) {
            max = Math.max(max, L.get(i));
        }

        return max;

    }
}
