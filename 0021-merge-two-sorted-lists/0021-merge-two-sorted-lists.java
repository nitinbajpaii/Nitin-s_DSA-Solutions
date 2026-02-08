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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp1=list1;
        while(temp1!=null){
            arr.add(temp1.val);
            temp1=temp1.next;
        }
        ListNode temp2=list2;
        while(temp2!=null){
            arr.add(temp2.val);
            temp2=temp2.next;
        }
        Collections.sort(arr);
        temp1=list1;
        int i=0;
        while(temp1!=null){
            temp1.val=arr.get(i);
            i++;
            temp1=temp1.next;
        }
        temp2=list2;
        while(temp2!=null){
            temp2.val=arr.get(i);
            i++;
            temp2=temp2.next;
        }
        temp1=list1;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=list2;
        return list1; 
    }
}