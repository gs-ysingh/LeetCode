import java.util.Stack;

/**
 * Created by YSingh on 15/01/17.
 */
public class LargestRectangle {
    public static void main(String[] args) {
        int [] arr = {2,1,5,6,2,3};
        System.out.println(largestArea(arr));
        int [] a = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(largestArea(a));
    }

    private static int largestArea(int[] arr) {
        int size = arr.length;
        int maxArea = 0;
        int top = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < size) {
            if(stack.isEmpty() || arr[i] >= arr[stack.peek()]) {
                stack.push(i++);
            }
            else {
                top = stack.peek();
                stack.pop();
                maxArea = Math.max(maxArea, arr[top]
                        * (stack.isEmpty() ? i : i - stack.peek() - 1) );
            }
        }

        while (!stack.isEmpty()) {
            top = stack.peek();
            stack.pop();
            maxArea = Math.max(maxArea, arr[top]
                    * (stack.isEmpty() ? i : i - stack.peek() - 1) );
        }

        return maxArea;
    }
}
