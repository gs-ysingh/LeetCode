/**
 * Created by YSingh on 13/01/17.
 */
class LinkedList {
    Integer data;
    LinkedList next;
}
public class AddTwoNumbers {
    public LinkedList add(Integer data, LinkedList head) {
        LinkedList node = new LinkedList();
        node.data = data;
        node.next = head;
        head = node;
        return head;
    }
    public static void main(String[] args) {
        LinkedList head1 = null;

        AddTwoNumbers obj = new AddTwoNumbers();
        //Number 1: 649
        head1 = obj.add(6, head1);
        head1 = obj.add(4, head1);
        head1 = obj.add(9, head1);

        //Number 1: 969
        LinkedList head2 = null;
        head2 = obj.add(9, head2);
        head2 = obj.add(6, head2);
        head2 = obj.add(9, head2);

        LinkedList result = getSum(head1, head2);
        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }

    private static LinkedList getSum(LinkedList head1, LinkedList head2) {
        AddTwoNumbers x = new AddTwoNumbers();
        LinkedList head = null;
        Integer i, j, sum, val, carry = 0;
        while (head1 != null && head2 != null) {
            i = head1.data;
            j = head2.data;
            sum = i + j + carry;
            val = sum % 10;
            carry = sum / 10;

            head = x.add(val, head);
            head1 = head1.next;
            head2 = head2.next;
        }

        if(carry > 0) {
            head = x.add(carry, head);
        }
        return head;
    }
}
