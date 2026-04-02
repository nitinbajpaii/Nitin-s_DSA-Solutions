class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[i] = nums[i];
            }
        }
        int ans =0;
        for(int i=0;i<n;i++){
            ans |= arr[i];
        }
        return ans;
    }
}