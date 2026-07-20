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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        int size = arr.size();
        arr.remove(size-n);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for(int x: arr){
            temp.next=new ListNode(x);
            temp=temp.next;
        }
        return dummy.next;
    }
}