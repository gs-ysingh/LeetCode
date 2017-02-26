/**
 * Created by YSingh on 26/02/17.
 */
public class NQueen {
    public static void main(String[] args) {
        int N = 8;
        int [][] arr = new int[N][N];

        getNQueen(arr, 0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean getNQueen(int[][] arr, int col, int N) {
        if(col >= N) {
            return true;
        }
        for (int row = 0; row < N; row++) {
            arr[row][col] = 1;
            if(isSafeQueen(arr, row, col, N)) {
                if(getNQueen(arr, col + 1, N)) {
                    return true;
                }
            }
            arr[row][col] = 0;
        }
        return false;
    }

    private static boolean isSafeQueen(int[][] arr, int row, int col, int n) {
        return isRowSafe(arr, row, col, n)
                && isColSafe(arr, row, col, n)
                && isLeftDiagonalSafe(arr, row, col, n)
                && isRightDiagonalSafe(arr, row, col, n);
    }

    private static boolean isRightDiagonalSafe(int[][] arr, int row, int col, int n) {
        int r = 0;
        int c = n - 1;
        int rightDiagonalSum = 0;

        if(row + col < n) {
            c = Math.min(row + col, n - 1);
        }
        else {
            r = (row + col) % (n - 1);
        }

        while (r < n && c >= 0) {
            rightDiagonalSum += arr[r++][c--];
        }

        return rightDiagonalSum == 1;
    }

    private static boolean isLeftDiagonalSafe(int[][] arr, int row, int col, int n) {
        int r = 0;
        int c = 0;
        int leftDiagonalSum = 0;
        if(row > col) {
            r = row - col;
        }
        else {
            c = col - row;
        }
        while (r < n && c < n) {
            leftDiagonalSum += arr[r++][c++];
        }
        return leftDiagonalSum == 1;
    }

    private static boolean isColSafe(int[][] arr, int row, int col, int n) {
        int colSum = 0;
        for (int i = 0; i < n; i++) {
            colSum += arr[i][col];
        }
        return colSum == 1;

        //        for (int i = 0; i < n; i++) {
        //            if(arr[i][col] == 1 && i != row) {
        //                return false;
        //            }
        //        }
        //        return false;
    }

    private static boolean isRowSafe(int[][] arr, int row, int col, int n) {
        int rowSum = 0;
        for (int i = 0; i < n; i++) {
            rowSum += arr[row][i];
        }
        return rowSum == 1;

        //        for (int i = 0; i < n; i++) {
        //            if(arr[row][i] == 1 && i != col) {
        //                return false;
        //            }
        //        }
        //        return true;
    }
}
