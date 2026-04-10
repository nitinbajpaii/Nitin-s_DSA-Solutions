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
    public ListNode reverse(ListNode head, int k,int total_reverse){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int nodes_count=0;
        while(curr!=null && nodes_count<k){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
            nodes_count++;
        }
        if(next!=null && total_reverse!=0){
            total_reverse--;
            head.next = reverse(next,k,total_reverse);
        }
        else if(next!=null && total_reverse==0){
            head.next = next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int totalNodes=0;
        ListNode curr = head;
        while(curr!=null){
            totalNodes++;
            curr = curr.next;
        }
        int total_reverse = totalNodes/k-1;
        return reverse(head,k,total_reverse);
    }

}