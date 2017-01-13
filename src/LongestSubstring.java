import java.util.HashSet;

/**
 * Created by YSingh on 13/01/17.
 */
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(getLongestSubstringLength("abcabcbb"));
        System.out.println(getLongestSubstringLength("bbbbbb"));
        System.out.println(getLongestSubstringLength("pwwkew"));
    }

    private static int getLongestSubstringLength(String str) {
        int len = str.length();
        HashSet<Character> set = new HashSet();
        int max = 0, i = 0, j = 0;
        while (i < len && j < len) {
            if(!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                max = Math.max(max, j - i + 1);
                j++;
            }
            else {
                set.remove(str.charAt(i));
                i++;
            }

        }
        return max;
    }
}
