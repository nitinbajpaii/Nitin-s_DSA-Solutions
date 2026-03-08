/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA=headA;
        ListNode listB=headB;
        while(listA!=listB){
            listA = (listA!=null)? listA.next : headB;
            listB = (listB!=null)? listB.next : headA;
        }
        return listA;
    }
}