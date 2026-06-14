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
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x: arr){
            if(map.get(x)==1){
                ans.add(x);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int x: ans){
            curr.next = new ListNode(x);
            curr=curr.next;
        }
        return dummy.next;
    }
}