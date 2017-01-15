/**
 * Created by YSingh on 15/01/17.
 */
public class ContainsMostwater {
    public static void main(String[] args) {
        int [] heights = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(maxArea(heights));
    }

    private static int maxArea(int[] heights) {
        int low = 0;
        int high = heights.length - 1;
        int maxArea = 0;

        while (high > low) {
            maxArea = Math.max(Math.min(heights[low], heights[high]) * (high - low), maxArea);
            if(heights[low] <= heights[high]) {
                low++;
            }
            else {
                high--;
            }
        }

        return maxArea;
    }
}
