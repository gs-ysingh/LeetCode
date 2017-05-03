/**
 * Created by YSingh on 03/05/17.
 */
public class LinklistCyle {
    public static void main(String[] args) {
        LinkedList head = new LinkedList();
        System.out.println(isCycle(head));
        System.out.println(getMiddle(head));
    }

    private static LinkedList getMiddle(LinkedList head) {
        LinkedList fastPtr = head;
        LinkedList slowPtr = head;

        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            if(fastPtr == null) {
                break;
            }
            slowPtr = slowPtr.next;
        }

        return slowPtr;
    }

    private static boolean isCycle(LinkedList head) {
        LinkedList fastPtr = head;
        LinkedList slowPtr = head;

        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if(slowPtr == fastPtr) {
                return true;
            }
        }

        return false;
    }
}
