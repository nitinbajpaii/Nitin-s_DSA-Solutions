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
        ListNode temp=head;
        int total=0;
        while(temp!=null){
            total++;
            temp=temp.next;
        }
        if(n>total){
            return null;
        }
        if(n==total){
            return head.next;
        }
        temp=head;
        int t = total-n-1;
        while(t>0){
            temp=temp.next;
            t--;
        }
        temp.next=temp.next.next;
        return head;
    }
}