/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode doubleIt(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        String ans = "";
        for (int i = 0; i < arr.size(); i++) {
            ans += arr.get(i);
        }

        BigInteger res = new BigInteger(ans);
        res = res.multiply(BigInteger.valueOf(2));

        // Reverse the string
        String s = new StringBuilder(res.toString()).reverse().toString();

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int i = 0; i < s.length(); i++) {
            temp.next = new ListNode(s.charAt(i) - '0');
            temp = temp.next;
        }

        // Reverse the linked list
        ListNode prev = null;
        curr = dummy.next;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}