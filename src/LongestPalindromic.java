/**
 * Created by YSingh on 15/01/17.
 */
public class LongestPalindromic {
    public static void main(String[] args) {
        String str = "ACGFEDCBCDEFGYT"; //11
        System.out.println(longestPalindrome(str));
    }

    private static int longestPalindrome(String str) {
        int size = str.length();
        int [][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
        }
        int j = 0;
        for (int cl = 2; cl <= size; cl++) {
            //cl is string with length 2 for more details: https://www.youtube.com/watch?v=obBdxeCx_Qs
            for (int i = 0; i < size - cl + 1; i++) {
                j = i + cl - 1;

                if(str.charAt(i) == str.charAt(j) && cl == 2) {
                    arr[i][j] = 2;
                }
                else if(str.charAt(i) == str.charAt(j)) {
                    arr[i][j] = arr[i + 1][j - 1] + 2;
                }
                else {
                    arr[i][j] = Math.max(arr[i][j - 1], arr[i + 1][j]);
                }
            }
        }
        return arr[0][size -1];
    }
}
