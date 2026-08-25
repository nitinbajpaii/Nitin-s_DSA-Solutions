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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        int max = arr.get(arr.size()-1);
        for(int i=arr.size()-2;i>=0;i--){
            if(arr.get(i)<max){
                arr.remove(i);
            }
            else{
                max=arr.get(i);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        
        for(int i=0;i<arr.size();i++){
            temp.next = new ListNode(arr.get(i));
            temp=temp.next;
        }
        return dummy.next;
    }
}