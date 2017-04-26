/**
 * Created by YSingh on 26/04/17.
 */
public class EggBreakingA {
    public static void main(String[] args) {
        int size = 100;
        int res = 100; //floor at which egg breaks
        for (int i = 1; i <= 16; i++) {
            System.out.println(i + ": " + getTotalDrops(size, i, res));
        }
    }

    private static int getTotalDrops(int size, int k, int res) {
        int currentFloor = k;
        int count = 0;
        while (currentFloor <= size) {
            if(currentFloor == res) {
                count++;
                return count;
            }
            else if(currentFloor > res) {
                for (int i = currentFloor - k + 1; i < currentFloor; i++) {
                    count++;
                    if(i == res) {
                        return count;
                    }
                }
            }
            else {
                currentFloor = currentFloor + k;
                count++;
            }
        }
        return count;
    }
}
