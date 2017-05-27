import java.util.ArrayList;

/**
 * Created by YSingh on 25/05/17.
 */
public class AddOneNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(9);
        ArrayList<Integer> result = addOne(arrayList);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        //System.out.println(getCountString("AAABBBCCC"));
        System.out.println(totalPossible("2112"));
        System.out.println(totalPossible("2101"));
    }

    private static long totalPossible(String input) {
        int len = input.length();
        int [] M = new int[len + 1];
        M[0] = 1;
        M[1] = 1;

        for (int i = 2; i <= len; i++) {
            M[i] = 0;
            if(Character.getNumericValue(input.charAt(i - 1)) > 0) {
                M[i] = M[i - 1];
            }

            if(Character.getNumericValue(input.charAt(i - 2)) == 1 ||
                    (Character.getNumericValue(input.charAt(i - 2)) == 2
                            && Character.getNumericValue(input.charAt(i - 1)) < 7)) {
                M[i] += M[i - 2];
            }
        }
        return M[len];
    }



    private static ArrayList<Integer> addOne(ArrayList<Integer> arr) {
        int carry = 0;
        int sum = 0;
        int val = 0;

        ArrayList<Integer> temp = new ArrayList<Integer>();

        //Adding extra zero is trick
        temp.add(0);

        for(int i = 0; i < arr.size(); i++) {
            temp.add(arr.get(i));
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            if(i == temp.size() - 1) {
                sum = temp.get(i) + 1;
            }
            else {
                sum = temp.get(i) + carry;
            }
            carry = sum / 10;
            val = sum % 10;

            temp.set(i, val);
        }

        int count = 0;
        for (int i = 0; i < temp.size(); i++) {
            if(temp.get(i) == 0) {
                count++;
            }
            else {
                break;
            }
        }

        ArrayList<Integer> temp2 = new ArrayList<>();
        for (int i = count; i < temp.size(); i++) {
            temp2.add(temp.get(i));
        }
        return temp2;
    }


}
