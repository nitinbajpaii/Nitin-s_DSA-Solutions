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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            int g = gcd(curr.val,curr.next.val);
            ListNode node = new ListNode(g);
            node.next=curr.next;
            curr.next=node;
            
            
            curr=node.next;
        }
        return head;
        
    }
    public int gcd(int i,int j){
        if(j==0){
            return i;
        }
        return gcd(j,i%j);
    }
}