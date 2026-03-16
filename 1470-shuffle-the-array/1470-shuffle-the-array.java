class Solution {
    public int[] shuffle(int[] nums, int n) {
        int length = 2*n;
        int[] ans = new int[length];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k++] = nums[i];
            ans[k++] = nums[i+n];
        }
        return ans;
    }
}