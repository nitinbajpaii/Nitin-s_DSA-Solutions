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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(curr!=null){
            arr.add(curr.val);
            curr = curr.next;
        }
        Collections.rotate(arr,k);
        curr=head;
        int n = arr.size();
        for(int i=0;i<n;i++){
            curr.val = arr.get(i);
            curr=curr.next;
        }
        return head;
    }
}