/**
 * Created by YSingh on 14/01/17.
 */
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagrm("anagram", "nagaram"));
        System.out.println(isAnagrm("rat", "car"));
    }

    private static boolean isAnagrm(String a, String b) {
        int [] count = new int[26];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
