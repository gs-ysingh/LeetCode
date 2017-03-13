import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by YSingh on 13/03/17.
 */

public class MicrosoftA {
    public static void main(String[] args) {
        String [] arr = {"c", "b", "b", "a", "a"};
        System.out.println(getValue(arr));
    }

    private static String getValue(String[] arr) {
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(m.get(arr[i]) == null) {
                m.put(arr[i], 1);
            }
            else {
               m.put(arr[i], m.get(arr[i]) + 1);
            }
        }

        final List<String> test = m
                .entrySet()
                .stream()

                .sorted((Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) -> {
                    return o1.getValue().compareTo(o2.getValue()) != 0 ?
                            o2.getValue().compareTo(o1.getValue())
                            : o2.getKey().compareTo(o1.getKey());
                })
                .map(e -> e.getKey())
                .collect(java.util.stream.Collectors.toList());

        return test.get(0);
    }


}

