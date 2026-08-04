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
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int sum=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)!=0){
                sum += arr.get(i);
            }
            else{
                temp.next = new ListNode(sum);
                temp=temp.next;
                sum=0;
            }
        }
        return dummy.next;
    }
}