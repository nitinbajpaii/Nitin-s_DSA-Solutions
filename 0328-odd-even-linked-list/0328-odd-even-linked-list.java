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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp=head;
        int i=1;
        while(temp!=null){
            if(i%2!=0){
                 arr.add(temp.val);
            }
            temp=temp.next;
            i++;
        }
        temp=head;
        i=1;
        while(temp!=null){
            if(i%2==0){
                 arr.add(temp.val);
            }
            temp=temp.next;
            i++;
        }
        temp=head;
        i=0;
        while(temp!=null){
            temp.val=arr.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
}