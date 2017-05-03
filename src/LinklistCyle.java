/**
 * Created by YSingh on 03/05/17.
 */
public class LinklistCyle {
    public static void main(String[] args) {
        LinkedList head = new LinkedList();
        System.out.println(isCycle(head));
        System.out.println(getMiddle(head));
        System.out.println(reverseList(head));
    }

    private static LinkedList reverseList(LinkedList head) {
        LinkedList prevNode = null;
        LinkedList nextNode = null;

        while (head != null) {
            nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }

        return prevNode;
    }

    private static LinkedList getMiddle(LinkedList head) {
        LinkedList fastPtr = head;
        LinkedList slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
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
