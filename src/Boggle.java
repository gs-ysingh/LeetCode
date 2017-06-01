/**
 * Created by YSingh on 30/05/17.
 */
public class Boggle {
    public static void main(String[] args) {
        String [] dictionary = {"GEEKS", "FOR", "QUIZ", "GO"};
        int row = 3;
        int col = 3;
        char [][] boggle = {
                                    {'G','I','Z'},
                                    {'U','E','K'},
                                    {'Q','S','E'}
                           };
        //findWords(boggle, dictionary, row, col);
        findWordsTrie(boggle, dictionary, row, col);
    }
    private static void findWordsTrie(char[][] boggle, String[] dictionary, int row, int col) {

    }
    private static void findWords(char[][] boggle, String[] dictionary, int row, int col) {
        String str = "";

        for (int i = 0; i < dictionary.length; i++) {
            str = dictionary[i];

            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if(boggle[j][k] == str.charAt(0)) {
                        int [][] visited = new int[row][col];
                        if(isPresent(boggle, j, k, row, col, str, 0, visited)) {
                            System.out.println(str);
                        }
                    }
                }
            }
        }
    }

    private static boolean isPresent(char[][] boggle,
                                     int j,
                                     int k,
                                     int row,
                                     int col,
                                     String str,
                                     int index,
                                     int [][] visited) {
        visited[j][k] = 1;

        if(index == str.length() - 1) {
            return true;
        }

        if(isSafe(j + 1, k, row, col)  && visited[j + 1][k] == 0 && boggle[j + 1][k] == str.charAt(index + 1)) {
            return isPresent(boggle, j + 1, k, row, col, str, index + 1, visited);
        }
        if(isSafe(j + 1, k - 1, row, col) && visited[j + 1][k - 1] == 0 && boggle[j + 1][k - 1] == str.charAt(index + 1)) {
            return isPresent(boggle, j + 1, k - 1, row, col, str, index + 1, visited);
        }
        if(isSafe(j + 1, k + 1, row, col) && visited[j + 1][k + 1] == 0 && boggle[j + 1][k + 1] == str.charAt(index + 1)) {
            return isPresent(boggle, j + 1, k + 1, row, col, str, index + 1, visited);
        }
        if(isSafe(j, k - 1, row, col) && visited[j][k - 1] == 0 && boggle[j][k - 1] == str.charAt(index + 1)) {
            return isPresent(boggle, j, k - 1, row, col, str, index + 1, visited);
        }
        if(isSafe(j, k + 1, row, col) && visited[j][k + 1] == 0 && boggle[j][k + 1] == str.charAt(index + 1)) {
            return isPresent(boggle, j, k + 1, row, col, str, index + 1, visited);
        }
        if(isSafe(j - 1, k - 1, row, col) && visited[j - 1][k - 1] == 0 && boggle[j - 1][k - 1] == str.charAt(index + 1)) {
            return isPresent(boggle, j - 1, k - 1, row, col, str, index + 1, visited);
        }
        if(isSafe(j - 1, k, row, col) && visited[j - 1][k] == 0 && boggle[j - 1][k] == str.charAt(index + 1)) {
            return isPresent(boggle, j - 1, k, row, col, str, index + 1, visited);
        }
        if(isSafe(j - 1, k + 1, row, col) && visited[j - 1][k + 1] == 0 && boggle[j - 1][k + 1] == str.charAt(index + 1)) {
            return isPresent(boggle, j - 1, k + 1, row, col, str, index + 1, visited);
        }

        visited[j][k] = 0;
        return false;

    }

    private static boolean isSafe(int j, int k, int row, int col) {
        if(j >= row || k >= col || j < 0 || k < 0) {
            return false;
        }
        return true;
    }
}
