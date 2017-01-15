/**
 * Created by YSingh on 15/01/17.
 */
public class CommonPrefix {
    public static void main(String[] args) {
        String [] arr = {"leets", "leetcode", "leet", "leeds"};
        System.out.println(commonPrefix(arr));

        String [] a = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(commonPrefix(a));
    }

    private static String commonPrefix(String[] arr) {
        if(arr.length > 0) {
            return commonPrefix(arr, 0, arr.length - 1);
        }
        return "";
    }

    private static String commonPrefix(String[] arr, int low, int high) {
        if(low == high) {
            return arr[low];
        }
        int mid = (low + high) / 2;
        String left = commonPrefix(arr, low, mid);
        String right = commonPrefix(arr, mid + 1, high);
        return combineString(left, right);
    }

    private static String combineString(String left, String right) {
        String min = left.length() > right.length() ? right : left;
        for (int i = 0; i < min.length(); i++) {
            if(min.charAt(i) != right.charAt(i)) {
                return min.substring(0, i);
            }
        }
        return min;
    }
}
