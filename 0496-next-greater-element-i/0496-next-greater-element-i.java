class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums1.length,m=nums2.length;
        for(int i=m-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            int nge = (st.isEmpty()?-1:st.peek());
            map.put(nums2[i],nge);
            st.push(nums2[i]);
        }
        int [] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}