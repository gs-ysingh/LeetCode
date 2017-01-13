import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by YSingh on 13/01/17.
 */
public class TwoSum {
    public static void main(String[] args) {
        //Assuming duplicates are not there
        int [] a = {123, 437, 2, 7, 121, 433, 123};
        System.out.println(getTwoSum(a, 9));
    }

    public static ArrayList<Integer> getTwoSum(int [] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
            if(map.containsKey(sum - arr[i])) {
                a.add(map.get(arr[i]));
                a.add(map.get(sum - arr[i]));
                break;
            }
        }
        return a;
    }
}
