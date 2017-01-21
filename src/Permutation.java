/**
 * Created by YSingh on 21/01/17.
 */
public class Permutation {
    public static void main(String[] args) {
        permutation("123");

    }

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if(n == 0) {
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < n; i++) {
                String pre = prefix + str.charAt(i);
                String suff = str.substring(0, i) + str.substring(i + 1, n);
                permutation(pre, suff);
            }
        }

    }
}
