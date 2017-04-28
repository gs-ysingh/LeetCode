/**
 * Created by YSingh on 27/04/17.
 */
public class EggBreakingDP {
    public static void main(String[] args) {
        int n = 2;
        int k = 100;
        System.out.println("Minimum number of drops required from " + k + " floor for " + n + " egg: " + getMinFloor(n, k));
    }

    private static int getMinFloor(int n, int k) {
        int [][] count = new int[n + 1][k + 1];
        for (int i = 1; i <= k; i++) {
            count[1][i] = i;
        }
        for (int i = 1; i <= n; i++) {
            count[i][1] = 1;
        }
        int min;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                min =  Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    min = Math.min(Math.max(count[i - 1][x - 1], count[i][j - x]), min) ;
                }
                count[i][j] = 1 + min;
            }
        }
        return count[n][k];
    }
}
