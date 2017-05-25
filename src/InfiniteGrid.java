import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by YSingh on 25/05/17.
 */
public class InfiniteGrid {
    public static void main(String[] args) {

    }

    private static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int distance = 0;

        int startX = X.get(0);
        int startY = Y.get(0);

        int diff1 = 0;
        int diff2 = 0;
        for(int i = 1; i < X.size(); i++) {
            diff1 = Math.abs(X.get(i) - startX);
            diff2 = Math.abs(Y.get(i) - startY);

            distance += diff1 > diff2 ? diff1 : diff2;
            startX = X.get(i);
            startY = Y.get(i);
        }

        return distance;
    }
}
