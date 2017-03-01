/**
 * Created by YSingh on 02/03/17.
 */
public class LongestPalindromeDP {
    public static void main(String[] args) {
        String str = "ACGFEDCBCDEFGYT";
        System.out.println(longestPalindrome(str));
    }

    private static String longestPalindrome(String str) {
        int size = str.length();
        int [][] table = new int[size][size];

        int max = Integer.MIN_VALUE;
        String res = null;

        for (int i = 0; i < size; i++) {
            table[i][i] = 1;
            res = str.substring(i, i + 1);
        }

        max = 1;

        for (int i = 0; i < size - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = 1;
                max = 2;
                res = str.substring(i, i + 2);
            }
        }

        for (int j = 2; j < size; j++) {
            int r = 0;
            int c = j;
            //logic to go diagonal when we know the starting point of the matrix
            while (c < size) {
                if(str.charAt(r) == str.charAt(c) && table[r + 1][c - 1] == 1) {
                    if(c - r > max) {
                        max = c - r;
                        res = str.substring(r, c + 1);
                    }
                    table[r++][c++] = 1;
                }
                else {
                    table[r++][c++] = 0;
                }
            }
        }

        return res;
    }
}
