import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by YSingh on 20/01/17.
 */
public class MaxApples {
    public static void main(String[] args) {
        int [][] arr =  {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int N = 3;
        int M = 3;
        System.out.println("maxApple: " + maxApple(arr, N, M));
    }

    private static int maxApple(int[][] arr, int N, int M) {
        int [][] S = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(i == 0 && j == 0) {
                    S[i][j] = arr[i][j];
                }
                else if(i > 0 && j > 0) {
                    S[i][j] = arr[i][j] + Math.max(S[i - 1][j], S[i][j - 1]);
                }
                else if(i == 0) {
                    S[i][j] = arr[i][j] + S[i][j - 1];
                }
                else if(j == 0) {
                    S[i][j] = arr[i][j] + S[i - 1][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(S[i][j] + " ");
            }
            System.out.println();
        }

        return S[N -1][M - 1];
    }
}
